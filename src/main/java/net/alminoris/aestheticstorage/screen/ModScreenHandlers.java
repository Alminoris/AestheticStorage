package net.alminoris.aestheticstorage.screen;

import net.alminoris.aestheticstorage.AestheticStorage;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModScreenHandlers
{
    public static final ScreenHandlerType<CabinetScreenHandler> CABINET_SCREEN_HANDLER =
            Registry.register(Registry.SCREEN_HANDLER, Identifier.of(AestheticStorage.MOD_ID, "cabinet"),
                    new ExtendedScreenHandlerType<>(CabinetScreenHandler::new));

    public static final ScreenHandlerType<CupboardScreenHandler> CUPBOARD_SCREEN_HANDLER =
            Registry.register(Registry.SCREEN_HANDLER, Identifier.of(AestheticStorage.MOD_ID, "cupboard"),
                    new ExtendedScreenHandlerType<>(CupboardScreenHandler::new));

    public static final ScreenHandlerType<HalfcabinetScreenHandler> HALFCABINET_SCREEN_HANDLER =
            Registry.register(Registry.SCREEN_HANDLER, Identifier.of(AestheticStorage.MOD_ID, "halfcabinet"),
                    new ExtendedScreenHandlerType<>(HalfcabinetScreenHandler::new));

    public static final ScreenHandlerType<HalfcupboardScreenHandler> HALFCUPBOARD_SCREEN_HANDLER =
            Registry.register(Registry.SCREEN_HANDLER, Identifier.of(AestheticStorage.MOD_ID, "halfcupboard"),
                    new ExtendedScreenHandlerType<>(HalfcupboardScreenHandler::new));

    public static void registerScreenHandlers()
    {

    }
}
