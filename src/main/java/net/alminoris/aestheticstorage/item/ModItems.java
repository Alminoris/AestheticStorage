package net.alminoris.aestheticstorage.item;

import net.alminoris.aestheticstorage.AestheticStorage;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems
{
    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, Identifier.of(AestheticStorage.MOD_ID, name), item);
    }

    public static void registerItems()
    {

    }
}
