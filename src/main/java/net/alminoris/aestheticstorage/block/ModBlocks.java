package net.alminoris.aestheticstorage.block;

import net.alminoris.aestheticstorage.AestheticStorage;
import net.alminoris.aestheticstorage.block.custom.CabinetBlock;
import net.alminoris.aestheticstorage.block.custom.CupboardBlock;
import net.alminoris.aestheticstorage.block.custom.HalfcabinetBlock;
import net.alminoris.aestheticstorage.block.custom.HalfcupboardBlock;
import net.alminoris.aestheticstorage.item.ModItemGroups;
import net.alminoris.aestheticstorage.util.helper.BlockSetsHelper;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.Dictionary;
import java.util.Hashtable;

public class ModBlocks
{
    public static final Dictionary<String, Block> CABINETS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock("cabinet_"+name, new CabinetBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS), false)));
        }
    }};

    public static final Dictionary<String, Block> FLIPUP_CABINETS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock("cabinet_flipup_"+name, new CabinetBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS), true)));
        }
    }};

    public static final Dictionary<String, Block> FLIPDOWN_CABINETS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock("cabinet_flipdown_"+name, new CabinetBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS), true)));
        }
    }};

    public static final Dictionary<String, Block> CUPBOARDS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock("cupboard_"+name, new CupboardBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS))));
        }
    }};

    public static final Dictionary<String, Block> HALFCABINETS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock("halfcabinet_"+name, new HalfcabinetBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS), false)));
        }
    }};

    public static final Dictionary<String, Block> FLIPUP_HALFCABINETS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock("halfcabinet_flipup_"+name, new HalfcabinetBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS), true)));
        }
    }};

    public static final Dictionary<String, Block> FLIPDOWN_HALFCABINETS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock("halfcabinet_flipdown_"+name, new HalfcabinetBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS), true)));
        }
    }};

    public static final Dictionary<String, Block> HALFCUPBOARDS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock("halfcupboard_"+name, new HalfcupboardBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS))));
        }
    }};

    public static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, Identifier.of(AestheticStorage.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block)
    {
        Registry.register(Registry.ITEM, Identifier.of(AestheticStorage.MOD_ID, name),
                new BlockItem(block, new Item.Settings().group(ModItemGroups.ASTRG_TAB)));
    }

    public static void registerBlocks()
    {

    }
}