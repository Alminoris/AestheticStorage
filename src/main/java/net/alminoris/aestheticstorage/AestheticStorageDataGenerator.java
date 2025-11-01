package net.alminoris.aestheticstorage;

import net.alminoris.aestheticstorage.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class AestheticStorageDataGenerator implements DataGeneratorEntrypoint
{
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator)
	{
		fabricDataGenerator.addProvider(ModModelProvider::new);
		fabricDataGenerator.addProvider(ModRecipeProvider::new);
		fabricDataGenerator.addProvider(ModLootTableProvider::new);
		fabricDataGenerator.addProvider(ModLanguageProviderEnUs::new);
		fabricDataGenerator.addProvider(ModLanguageProviderDeDe::new);
		fabricDataGenerator.addProvider(ModLanguageProviderEsEs::new);
		fabricDataGenerator.addProvider(ModLanguageProviderFrFr::new);
		fabricDataGenerator.addProvider(ModLanguageProviderRuRu::new);
		fabricDataGenerator.addProvider(ModLanguageProviderUkUa::new);
	}
}