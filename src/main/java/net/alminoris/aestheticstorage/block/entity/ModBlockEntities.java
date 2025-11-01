package net.alminoris.aestheticstorage.block.entity;

import net.alminoris.aestheticstorage.AestheticStorage;
import net.alminoris.aestheticstorage.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class ModBlockEntities
{
    public static final BlockEntityType<CabinetBlockEntity> CABINET_BLOCK_ENTITY =
            Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(AestheticStorage.MOD_ID, "cabinet_be"),
                    FabricBlockEntityTypeBuilder.create(CabinetBlockEntity::new,
                            toBlockArray(ModBlocks.CABINETS.elements(),
                                    ModBlocks.FLIPUP_CABINETS.elements(),
                                    ModBlocks.FLIPDOWN_CABINETS.elements())).build());

    public static final BlockEntityType<CupboardBlockEntity> CUPBOARD_BLOCK_ENTITY =
            Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(AestheticStorage.MOD_ID, "cupboard_be"),
                    FabricBlockEntityTypeBuilder.create(CupboardBlockEntity::new,
                            toBlockArray(ModBlocks.CUPBOARDS.elements())).build());

    public static final BlockEntityType<HalfcabinetBlockEntity> HALFCABINET_BLOCK_ENTITY =
            Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(AestheticStorage.MOD_ID, "halfcabinet_be"),
                    FabricBlockEntityTypeBuilder.create(HalfcabinetBlockEntity::new,
                            toBlockArray(ModBlocks.HALFCABINETS.elements(),
                                    ModBlocks.FLIPUP_HALFCABINETS.elements(),
                                    ModBlocks.FLIPDOWN_HALFCABINETS.elements())).build());

    public static final BlockEntityType<HalfcupboardBlockEntity> HALFCUPBOARD_BLOCK_ENTITY =
            Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(AestheticStorage.MOD_ID, "halfcupboard_be"),
                    FabricBlockEntityTypeBuilder.create(HalfcupboardBlockEntity::new,
                            toBlockArray(ModBlocks.HALFCUPBOARDS.elements())).build());

    public static void registerBlockEntities()
    {

    }

    private static Block[] toBlockArray(Enumeration<Block>... enumerations)
    {
        List<Block> blocks = new ArrayList<>();
        for(var enumeration : enumerations)
        {
            while (enumeration.hasMoreElements())
            {
                blocks.add(enumeration.nextElement());
            }
        }

        return blocks.toArray(new Block[0]);
    }
}
