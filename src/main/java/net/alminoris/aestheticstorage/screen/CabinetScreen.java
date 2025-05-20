package net.alminoris.aestheticstorage.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.alminoris.aestheticstorage.AestheticStorage;
import net.alminoris.aestheticstorage.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;

public class CabinetScreen extends HandledScreen<CabinetScreenHandler>
{
    private final String NAME = Registry.BLOCK.getId(Objects.requireNonNull(handler.blockEntity.getWorld())
            .getBlockState(handler.blockEntity.getPos()).getBlock()).getPath();

    private final Identifier TEXTURE = new Identifier(AestheticStorage.MOD_ID, "textures/gui/"+ getWoodName() +".png");

    private final Dictionary<String, Integer> WOOD_COLORS = new Hashtable<>()
    {{
        put("cabinet_oak", 0x836b3f);
        put("cabinet_birch", 0xbdab77);
        put("cabinet_spruce", 0x694f30);
        put("cabinet_jungle", 0x937143);
        put("cabinet_acacia", 0x954727);
        put("cabinet_dark_oak", 0x40321f);
        put("cabinet_crimson", 0x712f4a);
        put("cabinet_warped", 0x408d8b);
        put("cabinet_mangrove", 0x662b2b);
        put("cabinet_cherry", 0xcb7075);
        put("cabinet_bamboo", 0xccb038);
        put("cabinet_hazelnut", 0x856b42);
        put("cabinet_hawthorn", 0x81421f);
        put("cabinet_hornbeam", 0xb7b59a);
        put("cabinet_quince", 0xc78955);
        put("cabinet_plum", 0x8e656c);
        put("cabinet_mango", 0xb4733c);
        put("cabinet_fig", 0xbc9e80);
        put("cabinet_viburnum", 0x895943);
        put("cabinet_white_mulberry", 0xc1a630);
        put("cabinet_wild_cherry", 0xd49549);
        put("cabinet_bauhinia", 0x53412f);
        put("cabinet_pine", 0xa88e65);
        put("cabinet_olive", 0x605842);
        put("cabinet_tamarisk", 0x553430);
        put("cabinet_fir", 0x825a38);
        put("cabinet_cedar", 0x875e4a);
        put("cabinet_araucaria", 0x855e1c);
        put("cabinet_juniper", 0xa75d38);

        put("cabinet_flipup_oak", 0x836b3f);
        put("cabinet_flipup_birch", 0xbdab77);
        put("cabinet_flipup_spruce", 0x694f30);
        put("cabinet_flipup_jungle", 0x937143);
        put("cabinet_flipup_acacia", 0x954727);
        put("cabinet_flipup_dark_oak", 0x40321f);
        put("cabinet_flipup_crimson", 0x712f4a);
        put("cabinet_flipup_warped", 0x408d8b);
        put("cabinet_flipup_mangrove", 0x662b2b);
        put("cabinet_flipup_cherry", 0xcb7075);
        put("cabinet_flipup_bamboo", 0xccb038);
        put("cabinet_flipup_hazelnut", 0x856b42);
        put("cabinet_flipup_hawthorn", 0x81421f);
        put("cabinet_flipup_hornbeam", 0xb7b59a);
        put("cabinet_flipup_quince", 0xc78955);
        put("cabinet_flipup_plum", 0x8e656c);
        put("cabinet_flipup_mango", 0xb4733c);
        put("cabinet_flipup_fig", 0xbc9e80);
        put("cabinet_flipup_viburnum", 0x895943);
        put("cabinet_flipup_white_mulberry", 0xc1a630);
        put("cabinet_flipup_wild_cherry", 0xd49549);
        put("cabinet_flipup_bauhinia", 0x53412f);
        put("cabinet_flipup_pine", 0xa88e65);
        put("cabinet_flipup_olive", 0x605842);
        put("cabinet_flipup_tamarisk", 0x553430);
        put("cabinet_flipup_fir", 0x825a38);
        put("cabinet_flipup_cedar", 0x875e4a);
        put("cabinet_flipup_araucaria", 0x855e1c);
        put("cabinet_flipup_juniper", 0xa75d38);

        put("cabinet_flipdown_oak", 0x836b3f);
        put("cabinet_flipdown_birch", 0xbdab77);
        put("cabinet_flipdown_spruce", 0x694f30);
        put("cabinet_flipdown_jungle", 0x937143);
        put("cabinet_flipdown_acacia", 0x954727);
        put("cabinet_flipdown_dark_oak", 0x40321f);
        put("cabinet_flipdown_crimson", 0x712f4a);
        put("cabinet_flipdown_warped", 0x408d8b);
        put("cabinet_flipdown_mangrove", 0x662b2b);
        put("cabinet_flipdown_cherry", 0xcb7075);
        put("cabinet_flipdown_bamboo", 0xccb038);
        put("cabinet_flipdown_hazelnut", 0x856b42);
        put("cabinet_flipdown_hawthorn", 0x81421f);
        put("cabinet_flipdown_hornbeam", 0xb7b59a);
        put("cabinet_flipdown_quince", 0xc78955);
        put("cabinet_flipdown_plum", 0x8e656c);
        put("cabinet_flipdown_mango", 0xb4733c);
        put("cabinet_flipdown_fig", 0xbc9e80);
        put("cabinet_flipdown_viburnum", 0x895943);
        put("cabinet_flipdown_white_mulberry", 0xc1a630);
        put("cabinet_flipdown_wild_cherry", 0xd49549);
        put("cabinet_flipdown_bauhinia", 0x53412f);
        put("cabinet_flipdown_pine", 0xa88e65);
        put("cabinet_flipdown_olive", 0x605842);
        put("cabinet_flipdown_tamarisk", 0x553430);
        put("cabinet_flipdown_fir", 0x825a38);
        put("cabinet_flipdown_cedar", 0x875e4a);
        put("cabinet_flipdown_araucaria", 0x855e1c);
        put("cabinet_flipdown_juniper", 0xa75d38);
    }};

    public CabinetScreen(CabinetScreenHandler handler, PlayerInventory inventory, Text title)
    {
        super(handler, inventory, title);

    }

    private String getWoodName()
    {
        Block block = Objects.requireNonNull(handler.blockEntity.getWorld()).getBlockState(handler.blockEntity.getPos()).getBlock();

        if (getKeyByValue((Hashtable<String, Block>)ModBlocks.CABINETS, block) != null)
            return getKeyByValue((Hashtable<String, Block>)ModBlocks.CABINETS, block);

        if (getKeyByValue((Hashtable<String, Block>)ModBlocks.FLIPDOWN_CABINETS, block) != null)
            return getKeyByValue((Hashtable<String, Block>)ModBlocks.FLIPDOWN_CABINETS, block);

        if (getKeyByValue((Hashtable<String, Block>)ModBlocks.FLIPUP_CABINETS, block) != null)
            return getKeyByValue((Hashtable<String, Block>)ModBlocks.FLIPUP_CABINETS, block);

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
    protected void drawForeground(MatrixStack matrices, int mouseX, int mouseY)
    {
        textRenderer.draw(matrices, this.title.asOrderedText(), this.titleX, this.titleY, WOOD_COLORS.get(NAME));
        textRenderer.draw(matrices, this.playerInventoryTitle.asOrderedText(), this.playerInventoryTitleX, this.playerInventoryTitleY, WOOD_COLORS.get(NAME));
    }

    @Override
    protected void drawBackground(MatrixStack matrices, float delta, int mouseX, int mouseY)
    {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1f, 1f, 1f, 1f);
        RenderSystem.setShaderTexture(0, TEXTURE);

        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;

        // Draw background texture
        drawTexture(matrices, x, y, 0, 0, backgroundWidth, backgroundHeight);
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta)
    {
        renderBackground(matrices);
        super.render(matrices, mouseX, mouseY, delta);
        drawMouseoverTooltip(matrices, mouseX, mouseY);
    }
}