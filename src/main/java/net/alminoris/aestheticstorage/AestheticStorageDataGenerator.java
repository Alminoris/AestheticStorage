package net.alminoris.aestheticstorage;

import net.alminoris.aestheticstorage.datagen.*;
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
		pack.addProvider(ModLanguageProviderEnUs::new);
		pack.addProvider(ModLanguageProviderDeDe::new);
		pack.addProvider(ModLanguageProviderEsEs::new);
		pack.addProvider(ModLanguageProviderFrFr::new);
		pack.addProvider(ModLanguageProviderRuRu::new);
		pack.addProvider(ModLanguageProviderUkUa::new);
	}
}