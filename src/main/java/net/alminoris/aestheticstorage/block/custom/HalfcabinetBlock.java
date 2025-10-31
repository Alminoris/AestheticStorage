package net.alminoris.aestheticstorage.block.custom;

import net.alminoris.aestheticstorage.block.entity.HalfcabinetBlockEntity;
import net.alminoris.aestheticstorage.block.entity.ModBlockEntities;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
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
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

public class HalfcabinetBlock extends BlockWithEntity implements BlockEntityProvider
{
    public final boolean HAS_FLIP;

    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    public enum Variant implements StringIdentifiable
    {
        NORMAL("normal"),
        LEFT("left"),
        RIGHT("right");

        private final String name;

        Variant(String name) { this.name = name; }

        @Override
        public String asString() { return this.name; }
    }

    public static final BooleanProperty OPEN = BooleanProperty.of("open");

    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    public static final EnumProperty<Variant> VARIANT = EnumProperty.of("variant", Variant.class);

    public HalfcabinetBlock(Settings settings, boolean hasFlip)
    {
        super(settings.nonOpaque());
        HAS_FLIP = hasFlip;
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH).with(VARIANT, Variant.NORMAL).with(OPEN, false).with(WATERLOGGED, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder)
    {
        builder.add(FACING, VARIANT, OPEN, WATERLOGGED);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state)
    {
        return BlockRenderType.MODEL;
    }

    @Override
    public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state)
    {
        return new HalfcabinetBlockEntity(pos, state);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx)
    {
        boolean waterlogged = ctx.getWorld().getFluidState(ctx.getBlockPos()).getFluid() == Fluids.WATER;
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing()).with(WATERLOGGED, waterlogged);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState,
                                                WorldAccess world, BlockPos pos, BlockPos neighborPos)
    {
        if (state.get(WATERLOGGED))
        {
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }

        return updateCabinetVariant(state, world, pos);
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
            if (blockEntity instanceof HalfcabinetBlockEntity)
            {
                ItemScatterer.spawn(world, pos, (HalfcabinetBlockEntity)blockEntity);
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
                Variant currentVariant = state.get(VARIANT);

                if (HAS_FLIP)
                {
                    world.setBlockState(pos, state.with(VARIANT, Variant.NORMAL), Block.NOTIFY_ALL);
                }
                else
                {
                    if (currentVariant == Variant.LEFT)
                    {
                        world.setBlockState(pos, state.with(VARIANT, Variant.RIGHT), Block.NOTIFY_ALL);
                    }
                    else
                    {
                        world.setBlockState(pos, state.with(VARIANT, Variant.LEFT), Block.NOTIFY_ALL);
                    }
                }

                return ActionResult.SUCCESS;
            }

            return ActionResult.PASS;
        }

        if (!world.isClient)
        {
            Variant currentVariant = state.get(VARIANT);
            boolean currentOpen = state.get(OPEN);
            Direction currentFacing = state.get(FACING);

            NamedScreenHandlerFactory screenHandlerFactory = ((HalfcabinetBlockEntity) world.getBlockEntity(pos));

            if (screenHandlerFactory != null && currentOpen)
                player.openHandledScreen(screenHandlerFactory);

            currentOpen = !currentOpen;

            if (HAS_FLIP)
            {
                boolean isRight = currentVariant == Variant.RIGHT;
                boolean isLeft = currentVariant == Variant.LEFT;

                BlockPos otherPos = isRight
                        ? pos.offset(currentFacing.rotateYCounterclockwise())
                        : isLeft
                        ? pos.offset(currentFacing.rotateYClockwise())
                        : pos;

                BlockState otherState = world.getBlockState(otherPos);

                if (otherState.getBlock() == this &&
                        otherState.get(FACING) == currentFacing &&
                        otherState.get(VARIANT) != currentVariant)
                {

                    world.setBlockState(otherPos, otherState.with(OPEN, currentOpen));
                }

                world.setBlockState(pos, state.with(OPEN, currentOpen));
            }
            else
            {
                world.setBlockState(pos, state.with(OPEN, currentOpen));
            }

            return ActionResult.SUCCESS;
        }

        return ActionResult.SUCCESS;
    }

    @Override
    public @Nullable <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type)
    {
        return type == ModBlockEntities.HALFCABINET_BLOCK_ENTITY ? (world1, pos, state1, blockEntity) ->
        {
            if (blockEntity instanceof HalfcabinetBlockEntity cabinetBlockEntity)
            {
                cabinetBlockEntity.tick(world1, pos, state1);
            }
        } : null;
    }

    @Override
    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify)
    {
        super.onBlockAdded(state, world, pos, oldState, notify);
        updateSurroundingCabinets(world, pos);
    }

    private void updateSurroundingCabinets(World world, BlockPos pos)
    {
        for (Direction direction : Direction.Type.HORIZONTAL)
        {
            BlockPos neighborPos = pos.offset(direction);
            BlockState neighborState = world.getBlockState(neighborPos);

            if (neighborState.getBlock() == this)
                world.setBlockState(neighborPos, updateCabinetVariant(neighborState, world, neighborPos));
        }
    }

    private BlockState updateCabinetVariant(BlockState state, WorldAccess world, BlockPos pos)
    {
        Direction facing = state.get(FACING);

        BlockPos leftPos = pos.offset(facing.rotateYCounterclockwise());
        BlockPos rightPos = pos.offset(facing.rotateYClockwise());

        boolean leftConnected = isCabinet(world, leftPos, facing);
        boolean rightConnected = isCabinet(world, rightPos, facing);

        if (leftConnected)
            return state.with(VARIANT, Variant.RIGHT);
        else if (rightConnected)
            return state.with(VARIANT, Variant.LEFT);
        else
            return state.with(VARIANT, Variant.NORMAL);
    }

    private boolean isCabinet(WorldAccess world, BlockPos pos, Direction facing)
    {
        BlockState state = world.getBlockState(pos);
        return state.getBlock() == this && state.get(FACING) == facing;
    }
}