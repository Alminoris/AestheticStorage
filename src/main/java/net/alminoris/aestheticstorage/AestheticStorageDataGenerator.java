package net.alminoris.aestheticstorage;

import net.alminoris.aestheticstorage.datagen.ModLootTableProvider;
import net.alminoris.aestheticstorage.datagen.ModModelProvider;
import net.alminoris.aestheticstorage.datagen.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class AestheticStorageDataGenerator implements DataGeneratorEntrypoint
{
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator)
	{
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModLootTableProvider::new);
	}
}