package net.alminoris.aestheticstorage.item;

import net.alminoris.aestheticstorage.AestheticStorage;
import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems
{
    public static final Item WRENCH = registerItem("wrench", new ToolItem(ToolMaterials.IRON, new Item.Settings().group(ModItemGroups.ASTRG_TAB).maxCount(1)));

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registry.ITEM, new Identifier(AestheticStorage.MOD_ID, name), item);
    }

    public static void registerItems()
    {

    }
}