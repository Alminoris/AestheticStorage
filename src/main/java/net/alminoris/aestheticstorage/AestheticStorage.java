package net.alminoris.aestheticstorage;

import net.alminoris.aestheticstorage.block.ModBlocks;
import net.alminoris.aestheticstorage.block.entity.ModBlockEntities;
import net.alminoris.aestheticstorage.item.ModItemGroups;
import net.alminoris.aestheticstorage.item.ModItems;
import net.alminoris.aestheticstorage.screen.ModScreenHandlers;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AestheticStorage implements ModInitializer
{
	public static final String MOD_ID = "aestheticstorage";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		ModItems.registerItems();
		ModBlocks.registerBlocks();
		ModItemGroups.registerItemGroups();
		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandlers();
	}
}