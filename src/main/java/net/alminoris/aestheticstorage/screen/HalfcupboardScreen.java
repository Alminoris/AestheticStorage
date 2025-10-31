package net.alminoris.aestheticstorage.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.alminoris.aestheticstorage.AestheticStorage;
import net.alminoris.aestheticstorage.block.ModBlocks;
import net.alminoris.aestheticstorage.util.helper.BlockSetsHelper;
import net.minecraft.block.Block;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;

import static net.alminoris.aestheticstorage.util.helper.BlockSetsHelper.WOOD_COLORS;

public class HalfcupboardScreen extends HandledScreen<HalfcupboardScreenHandler>
{
    private final String NAME = Registries.BLOCK.getId(Objects.requireNonNull(handler.blockEntity.getWorld())
            .getBlockState(handler.blockEntity.getPos()).getBlock()).getPath();

    private final Identifier TEXTURE = Identifier.of(AestheticStorage.MOD_ID, "textures/gui/"+ getWoodName() + "_half.png");

    public HalfcupboardScreen(HalfcupboardScreenHandler handler, PlayerInventory inventory, Text title)
    {
        super(handler, inventory, title);

    }

    private String getWoodName()
    {
        Block block = Objects.requireNonNull(handler.blockEntity.getWorld()).getBlockState(handler.blockEntity.getPos()).getBlock();

        if (getKeyByValue((Hashtable<String, Block>) ModBlocks.HALFCUPBOARDS, block) != null)
            return getKeyByValue((Hashtable<String, Block>)ModBlocks.HALFCUPBOARDS, block);

        return "";
    }

    public static String getKeyByValue(Hashtable<String, Block> table, Block value)
    {
        for (Map.Entry<String, Block> entry : table.entrySet())
        {
            if (entry.getValue().equals(value))
            {
                return entry.getKey();
            }
        }
        return null;
    }

    @Override
    protected void init()
    {
        super.init();
        titleY = 10;
        titleX = 10;
        playerInventoryTitleX = 10;
        playerInventoryTitleY = 68;
    }

    @Override
    protected void drawForeground(DrawContext context, int mouseX, int mouseY)
    {
        Integer result = 0xFFFFFF;

        for (String name : BlockSetsHelper.getWoods())
            if (NAME.endsWith("_" + name))
                result = WOOD_COLORS.get(name);

        context.drawText(this.textRenderer, this.title, this.titleX, this.titleY, result, false);
        context.drawText(this.textRenderer, this.playerInventoryTitle, this.playerInventoryTitleX, this.playerInventoryTitleY, result, false);
    }

    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY)
    {
        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderColor(1f, 1f, 1f, 1f);
        RenderSystem.setShaderTexture(0, TEXTURE);

        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;

        context.drawTexture(TEXTURE, x, y, 0, 0, backgroundWidth, backgroundHeight);
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta)
    {
        renderBackground(context);
        super.render(context, mouseX, mouseY, delta);
        drawMouseoverTooltip(context, mouseX, mouseY);
    }
}