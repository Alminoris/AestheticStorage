package net.alminoris.aestheticstorage;

import net.alminoris.aestheticstorage.block.entity.ModBlockEntities;
import net.alminoris.aestheticstorage.block.entity.renderer.*;
import net.alminoris.aestheticstorage.screen.CabinetScreen;
import net.alminoris.aestheticstorage.screen.CupboardScreen;
import net.alminoris.aestheticstorage.screen.HalfcabinetScreen;
import net.alminoris.aestheticstorage.screen.HalfcupboardScreen;
import net.alminoris.aestheticstorage.screen.ModScreenHandlers;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

public class AestheticStorageClient implements ClientModInitializer
{
    @Override
    public void onInitializeClient()
    {
        HandledScreens.register(ModScreenHandlers.CABINET_SCREEN_HANDLER, CabinetScreen::new);
        HandledScreens.register(ModScreenHandlers.CUPBOARD_SCREEN_HANDLER, CupboardScreen::new);
        HandledScreens.register(ModScreenHandlers.HALFCABINET_SCREEN_HANDLER, HalfcabinetScreen::new);
        HandledScreens.register(ModScreenHandlers.HALFCUPBOARD_SCREEN_HANDLER, HalfcupboardScreen::new);

        BlockEntityRendererFactories.register(ModBlockEntities.CABINET_BLOCK_ENTITY, CabinetBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.CUPBOARD_BLOCK_ENTITY, CupboardBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.HALFCABINET_BLOCK_ENTITY, HalfcabinetBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.HALFCUPBOARD_BLOCK_ENTITY, HalfcupboardBlockEntityRenderer::new);
    }
}