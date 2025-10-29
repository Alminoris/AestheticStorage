package net.alminoris.aestheticstorage.item;

import net.alminoris.aestheticstorage.AestheticStorage;
import net.alminoris.aestheticstorage.block.ModBlocks;
import net.alminoris.aestheticstorage.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups
{
    public static final ItemGroup ASTRG_TAB = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AestheticStorage.MOD_ID, "astrgtab"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.astrgtab"))
                    .icon(() -> new ItemStack(ModBlocks.CABINETS.get("oak"))).entries((displayContext, entries) ->
                    {
                        if (!FabricLoader.getInstance().isModLoaded("aestheticseating"))
                        {
                            entries.add(ModItems.WRENCH);
                        }

                        for(String name : BlockSetsHelper.WOODS)
                        {
                            entries.add(ModBlocks.CABINETS.get(name));
                            entries.add(ModBlocks.FLIPDOWN_CABINETS.get(name));
                            entries.add(ModBlocks.FLIPUP_CABINETS.get(name));
                            entries.add(ModBlocks.CUPBOARDS.get(name));
                        }

                        if (FabricLoader.getInstance().isModLoaded("arborealnature"))
                        {
                            for(String name : BlockSetsHelper.EXTRA_WOODS_AN)
                            {
                                entries.add(ModBlocks.CABINETS.get(name));
                                entries.add(ModBlocks.FLIPDOWN_CABINETS.get(name));
                                entries.add(ModBlocks.FLIPUP_CABINETS.get(name));
                                entries.add(ModBlocks.CUPBOARDS.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("wildfields"))
                        {
                            for(String name : BlockSetsHelper.EXTRA_WOODS_WF)
                            {
                                entries.add(ModBlocks.CABINETS.get(name));
                                entries.add(ModBlocks.FLIPDOWN_CABINETS.get(name));
                                entries.add(ModBlocks.FLIPUP_CABINETS.get(name));
                                entries.add(ModBlocks.CUPBOARDS.get(name));
                            }
                        }
                    }).build());

    public static void registerItemGroups()
    {

    }
}