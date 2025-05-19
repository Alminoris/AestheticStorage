package net.alminoris.aestheticstorage.screen;

import net.alminoris.aestheticstorage.AestheticStorage;
import net.alminoris.aestheticstorage.network.BlockPosPayload;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers
{
    public static final ScreenHandlerType<CabinetScreenHandler> CABINET_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(AestheticStorage.MOD_ID, "cabinet"),
                    new ExtendedScreenHandlerType<>(CabinetScreenHandler::new, BlockPosPayload.PACKET_CODEC));

    public static final ScreenHandlerType<CupboardScreenHandler> CUPBOARD_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(AestheticStorage.MOD_ID, "cupboard"),
                    new ExtendedScreenHandlerType<>(CupboardScreenHandler::new, BlockPosPayload.PACKET_CODEC));

    public static void registerScreenHandlers()
    {

    }
}
