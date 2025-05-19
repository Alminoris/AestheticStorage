package net.alminoris.aestheticstorage.block.custom;

import com.mojang.serialization.MapCodec;
import net.alminoris.aestheticstorage.AestheticStorage;
import net.alminoris.aestheticstorage.block.entity.CupboardBlockEntity;
import net.alminoris.aestheticstorage.block.entity.ModBlockEntities;
import net.alminoris.aestheticstorage.item.ModItems;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.*;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CupboardBlock extends BlockWithEntity implements BlockEntityProvider
{
    public static final int MAX_STACK_HEIGHT = 4;

    private static final VoxelShape SHAPE = Block.createCuboidShape(0, 0, 0, 16, 16, 16);

    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    public enum Variant implements StringIdentifiable
    {
        NORMAL("normal"),
        CENTER("center"),
        UP("up"),
        DOWN("down");

        private final String name;

        Variant(String name) { this.name = name; }

        @Override
        public String asString() { return this.name; }
    }

    public static final BooleanProperty OPEN = BooleanProperty.of("open");

    public static final BooleanProperty FLIPPED = BooleanProperty.of("flipped");

    public static final BooleanProperty MANUAL_FLIPPED = BooleanProperty.of("manual_flipped");

    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    public static final EnumProperty<CupboardBlock.Variant> VARIANT = EnumProperty.of("variant", CupboardBlock.Variant.class);

    public CupboardBlock(Settings settings)
    {
        super(settings.nonOpaque());
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH).with(VARIANT, Variant.NORMAL)
                .with(OPEN, false).with(FLIPPED, false).with(MANUAL_FLIPPED, false).with(WATERLOGGED, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder)
    {
        builder.add(FACING, WATERLOGGED, VARIANT, OPEN, FLIPPED, MANUAL_FLIPPED);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context)
    {
        return SHAPE;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context)
    {
        return SHAPE;
    }

    @Override
    public VoxelShape getCameraCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context)
    {
        return SHAPE;
    }

    @Override
    public BlockRenderType getRenderType(BlockState state)
    {
        return BlockRenderType.MODEL;
    }

    @Override
    public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state)
    {
        return new CupboardBlockEntity(pos, state);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx)
    {
        World world = ctx.getWorld();
        BlockPos pos = ctx.getBlockPos();
        Direction facing = ctx.getHorizontalPlayerFacing();
        boolean waterlogged = world.getFluidState(pos).getFluid() == Fluids.WATER;

        // Лічильники вверх і вниз
        int countUp = countConnectedCupboards(world, pos.up(), facing, Direction.UP);
        int countDown = countConnectedCupboards(world, pos.down(), facing, Direction.DOWN);

        int totalHeight = countUp + countDown + 1;

        if (totalHeight > MAX_STACK_HEIGHT)
        {
            return null; // блок не ставиться
        }

        return this.getDefaultState()
                .with(FACING, facing)
                .with(WATERLOGGED, waterlogged);
    }

    private int countConnectedCupboards(World world, BlockPos pos, Direction facing, Direction direction)
    {
        int count = 0;
        while (count < MAX_STACK_HEIGHT)
        {
            BlockState state = world.getBlockState(pos);
            if (state.getBlock() == this && state.get(FACING) == facing)
            {
                count++;
                pos = pos.offset(direction);
            }
            else
            {
                break;
            }
        }
        return count;
    }


    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState,
                                                WorldAccess world, BlockPos pos, BlockPos neighborPos)
    {
        if (state.get(WATERLOGGED))
        {
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }

        return updateCupboardVariant(state, world, pos);
    }


    @Override
    public FluidState getFluidState(BlockState state)
    {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved)
    {
        if (state.getBlock() != newState.getBlock())
        {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof CupboardBlockEntity)
            {
                ItemScatterer.spawn(world, pos, (CupboardBlockEntity)blockEntity);
                world.updateComparators(pos,this);
            }
            super.onStateReplaced(state, world, pos, newState, moved);
        }
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit)
    {
        if (!player.getMainHandStack().isEmpty())
        {
            if (player.getMainHandStack().isIn(TagKey.of(RegistryKeys.ITEM, Identifier.of("aestheticseating", "wrench"))))
            {
                boolean newFlipped = !state.get(FLIPPED);
                Direction facing = state.get(FACING);

                List<BlockPos> stack = new ArrayList<>();
                Set<BlockPos> visited = new HashSet<>();
                stack.add(pos);

                while (!stack.isEmpty())
                {
                    BlockPos currentPos = stack.remove(stack.size()-1);
                    if (!visited.add(currentPos)) continue;

                    BlockState currentState = world.getBlockState(currentPos);

                    if (currentState.getBlock() == this && currentState.get(FACING) == facing)
                    {
                        BlockState newState = currentState
                                .with(FLIPPED, newFlipped)
                                .with(MANUAL_FLIPPED, true);

                        world.setBlockState(currentPos, newState, Block.NOTIFY_ALL);

                        BlockPos up = currentPos.up();
                        BlockPos down = currentPos.down();
                        if (!visited.contains(up)) stack.add(up);
                        if (!visited.contains(down)) stack.add(down);
                    }
                }

                return ActionResult.SUCCESS;
            }

            return ActionResult.PASS;
        }

        if (world.isClient) return ActionResult.SUCCESS;

        boolean currentOpen = state.get(OPEN);

        NamedScreenHandlerFactory screenHandlerFactory = ((CupboardBlockEntity) world.getBlockEntity(pos));

        if (screenHandlerFactory != null && currentOpen)
            player.openHandledScreen(screenHandlerFactory);

        currentOpen = true;
        Direction facing = state.get(FACING);

        List<BlockPos> stack = new ArrayList<>();
        Set<BlockPos> visited = new HashSet<>();
        stack.add(pos);

        while (!stack.isEmpty())
        {
            BlockPos currentPos = stack.remove(stack.size()-1);
            if (!visited.add(currentPos)) continue;

            BlockState currentState = world.getBlockState(currentPos);

            if (currentState.getBlock() == this &&
                    currentState.get(FACING) == facing)
            {

                Variant currentVariant = currentState.get(CupboardBlock.VARIANT);

                if (currentVariant == Variant.UP || currentVariant == Variant.DOWN || currentVariant == Variant.CENTER)
                {
                    world.setBlockState(currentPos, currentState.with(OPEN, currentOpen), Block.NOTIFY_ALL);

                    stack.add(currentPos.up());
                    stack.add(currentPos.down());
                }
                else if (currentVariant == Variant.NORMAL)
                {
                    world.setBlockState(currentPos, currentState.with(OPEN, currentOpen), Block.NOTIFY_ALL);
                }
            }
        }

        return ActionResult.SUCCESS;
    }

    @Override
    public @Nullable <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type)
    {
        return type == ModBlockEntities.CUPBOARD_BLOCK_ENTITY ? (world1, pos, state1, blockEntity) ->
        {
            if (blockEntity instanceof CupboardBlockEntity cupboardBlockEntity)
            {
                cupboardBlockEntity.tick(world1, pos, state1);
            }
        } : null;
    }

    @Override
    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify)
    {
        super.onBlockAdded(state, world, pos, oldState, notify);
        updateSurroundingVerticalCupboards(world, pos);
    }

    private void updateSurroundingVerticalCupboards(World world, BlockPos pos)
    {
        for (Direction direction : new Direction[]{Direction.UP, Direction.DOWN})
        {
            BlockPos neighborPos = pos.offset(direction);
            BlockState neighborState = world.getBlockState(neighborPos);

            if (neighborState.getBlock() == this)
                world.setBlockState(neighborPos, updateCupboardVariant(neighborState, world, neighborPos));
        }
    }

    private BlockState updateCupboardVariant(BlockState state, WorldAccess world, BlockPos pos)
    {
        Direction facing = state.get(FACING);
        BlockPos upPos = pos.up();
        BlockPos downPos = pos.down();

        boolean upConnected = isCupboard(world, upPos, facing);
        boolean downConnected = isCupboard(world, downPos, facing);

        Variant variant = Variant.NORMAL;
        if (upConnected && downConnected)
            variant = Variant.CENTER;
        else if (upConnected)
            variant = Variant.DOWN;
        else if (downConnected)
            variant = Variant.UP;

        BlockPos leftPos = pos.offset(facing.rotateYClockwise());
        boolean autoFlipped = isCupboard(world, leftPos, facing);

        boolean manual = state.get(MANUAL_FLIPPED);
        boolean flipped = manual ? state.get(FLIPPED) : autoFlipped;

        return state.with(VARIANT, variant)
                .with(FLIPPED, flipped)
                .with(MANUAL_FLIPPED, manual);
    }

    private boolean isCupboard(WorldAccess world, BlockPos pos, Direction facing)
    {
        BlockState state = world.getBlockState(pos);
        return state.getBlock() == this && state.get(FACING) == facing;
    }
}