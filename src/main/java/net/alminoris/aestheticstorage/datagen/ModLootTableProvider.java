package net.alminoris.aestheticstorage.datagen;

import net.alminoris.aestheticstorage.block.ModBlocks;
import net.alminoris.aestheticstorage.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider
{
    public ModLootTableProvider(FabricDataGenerator dataGenerator)
    {
        super(dataGenerator);
    }

    @Override
    public void generateBlockLootTables()
    {
        for(String name : BlockSetsHelper.getWoods())
        {
            addDrop(ModBlocks.CABINETS.get(name));
            addDrop(ModBlocks.FLIPUP_CABINETS.get(name));
            addDrop(ModBlocks.FLIPDOWN_CABINETS.get(name));
            addDrop(ModBlocks.CUPBOARDS.get(name));
            addDrop(ModBlocks.HALFCABINETS.get(name));
            addDrop(ModBlocks.FLIPUP_HALFCABINETS.get(name));
            addDrop(ModBlocks.FLIPDOWN_HALFCABINETS.get(name));
            addDrop(ModBlocks.HALFCUPBOARDS.get(name));
        }
    }
}