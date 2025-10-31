package net.alminoris.aestheticstorage.screen;

import net.alminoris.aestheticstorage.block.custom.HalfcabinetBlock;
import net.alminoris.aestheticstorage.block.entity.HalfcabinetBlockEntity;
import net.alminoris.aestheticstorage.network.BlockPosPayload;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;

public class HalfcabinetScreenHandler extends ScreenHandler
{
    private final Inventory INVENTORY;
    public final HalfcabinetBlockEntity blockEntity;

    //Client
    public HalfcabinetScreenHandler(int syncId, PlayerInventory inventory, BlockPosPayload payload)
    {
        this(syncId, inventory, (HalfcabinetBlockEntity) inventory.player.getWorld().getBlockEntity(payload.pos()));
    }

    //Server
    public HalfcabinetScreenHandler(int syncId, PlayerInventory playerInventory,
                                    HalfcabinetBlockEntity blockEntity)
    {
        super(ModScreenHandlers.HALFCABINET_SCREEN_HANDLER, syncId);
        checkSize(blockEntity, 8);
        this.INVENTORY = blockEntity;
        INVENTORY.onOpen(playerInventory.player);
        this.blockEntity = blockEntity;

        for(int i = 1; i < 3; i++)
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
    public void onClosed(PlayerEntity player)
    {
        super.onClosed(player);

        if (!player.getWorld().isClient)
        {
            BlockState state = player.getWorld().getBlockState(blockEntity.getPos());
            if (state.contains(HalfcabinetBlock.OPEN)) {
                player.getWorld().setBlockState(blockEntity.getPos(), state.with(HalfcabinetBlock.OPEN, false));
            }
        }
    }

    @Override
    public ItemStack quickMove(PlayerEntity player, int invSlot)
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