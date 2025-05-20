package net.alminoris.aestheticstorage.screen;

import net.alminoris.aestheticstorage.block.custom.CupboardBlock;
import net.alminoris.aestheticstorage.block.entity.CupboardBlockEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CupboardScreenHandler extends ScreenHandler
{
    private final Inventory INVENTORY;
    public final CupboardBlockEntity blockEntity;

    //Client
    public CupboardScreenHandler(int syncId, PlayerInventory inventory, PacketByteBuf buf)
    {
        this(syncId, inventory, (CupboardBlockEntity) inventory.player.getWorld().getBlockEntity(buf.readBlockPos()));
    }

    //Server
    public CupboardScreenHandler(int syncId, PlayerInventory playerInventory,
                                 CupboardBlockEntity blockEntity)
    {
        super(ModScreenHandlers.CUPBOARD_SCREEN_HANDLER, syncId);
        checkSize(blockEntity, 8);
        this.INVENTORY = blockEntity;
        INVENTORY.onOpen(playerInventory.player);
        this.blockEntity = blockEntity;

        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                this.addSlot(new Slot(INVENTORY, j * 4 + i, 53 + i * 18, 27 + j * 18));
            }
        }

        addPlayerInventory(playerInventory);
        addPlayerHotbar(playerInventory);
    }

    @Override
    public void close(PlayerEntity player)
    {
        super.close(player);

        if (player.getWorld().isClient) return;

        World world = player.getWorld();
        BlockPos startPos = blockEntity.getPos();
        BlockState startState = world.getBlockState(startPos);

        if (!(startState.getBlock() instanceof CupboardBlock)) return;

        Direction facing = startState.get(CupboardBlock.FACING);

        List<BlockPos> stack = new ArrayList<>();
        Set<BlockPos> visited = new HashSet<>();
        stack.add(startPos);

        while (!stack.isEmpty())
        {
            BlockPos currentPos = stack.remove(stack.size()-1);
            if (!visited.add(currentPos)) continue;

            BlockState currentState = world.getBlockState(currentPos);

            if (currentState.getBlock() instanceof CupboardBlock &&
                    currentState.get(CupboardBlock.FACING) == facing)
            {

                CupboardBlock.Variant currentVariant = currentState.get(CupboardBlock.VARIANT);

                if (currentVariant == CupboardBlock.Variant.UP || currentVariant == CupboardBlock.Variant.DOWN || currentVariant == CupboardBlock.Variant.CENTER)
                {
                    if (currentState.get(CupboardBlock.OPEN))
                    {
                        world.setBlockState(currentPos, currentState.with(CupboardBlock.OPEN, false), Block.NOTIFY_ALL);
                    }
                    stack.add(currentPos.up());
                    stack.add(currentPos.down());
                }
                else if (currentVariant == CupboardBlock.Variant.NORMAL)
                {
                    if (currentState.get(CupboardBlock.OPEN))
                    {
                        world.setBlockState(currentPos, currentState.with(CupboardBlock.OPEN, false), Block.NOTIFY_ALL);
                    }
                }
            }
        }
    }

    @Override
    public ItemStack transferSlot(PlayerEntity player, int invSlot)
    {
        ItemStack newStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(invSlot);

        if (slot != null && slot.hasStack())
        {
            ItemStack originalStack = slot.getStack();
            newStack = originalStack.copy();

            int containerSize = this.INVENTORY.size();
            int totalSlots = this.slots.size();

            if (invSlot < containerSize)
            {
                if (!this.insertItem(originalStack, containerSize, totalSlots, true))
                {
                    return ItemStack.EMPTY;
                }
            }
            else
            {
                if (!this.insertItem(originalStack, 0, containerSize, false))
                {
                    return ItemStack.EMPTY;
                }
            }

            if (originalStack.isEmpty())
            {
                slot.setStack(ItemStack.EMPTY);
            }
            else
            {
                slot.markDirty();
            }
        }
        return newStack;
    }

    @Override
    public boolean canUse(PlayerEntity player)
    {
        return this.INVENTORY.canPlayerUse(player);
    }

    private void addPlayerInventory(PlayerInventory playerInventory)
    {
        for (int i = 0; i < 3; ++i)
        {
            for (int l = 0; l < 9; ++l)
            {
                this.addSlot(new Slot(playerInventory, l + i * 9 + 9, 8 + l * 18, 84 + i * 18));
            }
        }
    }

    private void addPlayerHotbar(PlayerInventory playerInventory)
    {
        for (int i = 0; i < 9; ++i)
        {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 142));
        }
    }
}