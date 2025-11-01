package net.alminoris.aestheticstorage.block.entity;

import net.alminoris.aestheticstorage.screen.CabinetScreenHandler;
import net.alminoris.aestheticstorage.screen.HalfcabinetScreenHandler;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class HalfcabinetBlockEntity extends BlockEntity implements ExtendedScreenHandlerFactory, ImplementedInventory
{
    private final DefaultedList<ItemStack> INVENTORY = DefaultedList.ofSize(4, ItemStack.EMPTY);
    private String name;

    public HalfcabinetBlockEntity(BlockPos pos, BlockState state)
    {
        super(ModBlockEntities.HALFCABINET_BLOCK_ENTITY, pos, state);
    }

    public void tick(World world, BlockPos pos, BlockState state)
    {
        if (world.isClient)
            return;

        name = Registry.BLOCK.getId(state.getBlock()).getPath();
    }

    public List<ItemStack> getRenderStack()
    {
        List<ItemStack> result = new ArrayList<>();
        for(int i = 0; i < INVENTORY.size(); i++)
        {
            if (!this.getStack(i).isEmpty())
                result.add(this.getStack(i));

        }

        return result;
    }

    @Override
    public void markDirty()
    {
        world.updateListeners(pos, getCachedState(), getCachedState(), 4);
        super.markDirty();
    }

    @Override
    public DefaultedList<ItemStack> getItems()
    {
        return INVENTORY;
    }

    @Override
    protected void writeNbt(NbtCompound nbt)
    {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, INVENTORY);
    }

    @Override
    public void readNbt(NbtCompound nbt)
    {
        super.readNbt(nbt);
        Inventories.readNbt(nbt, INVENTORY);
    }

    @Override
    public Text getDisplayName()
    {
        return Text.translatable("block.aestheticstorage." + name);
    }

    @Override
    public @Nullable ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player)
    {
        return new HalfcabinetScreenHandler(syncId, playerInventory, this);
    }

    @Override
    public @Nullable Packet<ClientPlayPacketListener> toUpdatePacket()
    {
        return BlockEntityUpdateS2CPacket.create(this);
    }

    @Override
    public NbtCompound toInitialChunkDataNbt()
    {
        return createNbt();
    }

    @Override
    public void writeScreenOpeningData(ServerPlayerEntity serverPlayerEntity, PacketByteBuf packetByteBuf)
    {
        packetByteBuf.writeBlockPos(this.pos);
    }
}