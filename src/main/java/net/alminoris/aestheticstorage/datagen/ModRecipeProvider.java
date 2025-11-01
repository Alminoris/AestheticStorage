package net.alminoris.aestheticstorage.datagen;

import net.alminoris.aestheticstorage.block.ModBlocks;
import net.alminoris.aestheticstorage.item.ModItemGroups;
import net.alminoris.aestheticstorage.item.ModItems;
import net.alminoris.aestheticstorage.util.helper.BlockSetsHelper;
import net.alminoris.aestheticstorage.util.helper.ModJsonHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider
{
    public ModRecipeProvider(FabricDataGenerator dataGenerator) 
    {
        super(dataGenerator);
    }

    @Override
    public void generateRecipes(Consumer<RecipeJsonProvider> recipeExporter)
    {
        ShapedRecipeJsonBuilder.create(ModItems.WRENCH, 1)
                .pattern(" # ")
                .pattern(" ##")
                .pattern("/  ")
                .input('#', Items.IRON_INGOT)
                .input('/', Items.STICK)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter);

        for(String name : BlockSetsHelper.WOODS)
        {
            String blockName = (name.equals("crimson") || name.equals("warped")) ? "stem" : (name.equals("bamboo") ? "block" : "log");
            Block block = Registry.BLOCK.get(Identifier.of("minecraft","stripped_"+name+"_"+blockName));
            Block block1 = Registry.BLOCK.get(Identifier.of("minecraft",name+"_"+blockName));
            registerCabinet(recipeExporter, ModBlocks.CABINETS.get(name), block1, block);
            registerCabinetFlipdown(recipeExporter, ModBlocks.FLIPDOWN_CABINETS.get(name), block1, block);
            registerCabinetFlipup(recipeExporter, ModBlocks.FLIPUP_CABINETS.get(name), block1, block);
            registerCupboard(recipeExporter, ModBlocks.CUPBOARDS.get(name), block1, block);

            registerHalfCabinet(recipeExporter, ModBlocks.HALFCABINETS.get(name), block1, block);
            registerHalfCabinetFlipdown(recipeExporter, ModBlocks.FLIPDOWN_HALFCABINETS.get(name), block1, block);
            registerHalfCabinetFlipup(recipeExporter, ModBlocks.FLIPUP_HALFCABINETS.get(name), block1, block);
            registerHalfCupboard(recipeExporter, ModBlocks.HALFCUPBOARDS.get(name), block1, block);
        }

        for(String name : ModItemGroups.AN_WOOD_NAMES)
        {
            ModJsonHelper.createShapedRecipe("cabinet_" + name, "4", "arborealnature:" + name + "_log", "arborealnature:stripped_" + name + "_log",
                    "\"/#\",", "\"/#\"", "");

            ModJsonHelper.createShapedRecipe("cabinet_flipdown_" + name, "4", "arborealnature:" + name + "_log", "arborealnature:stripped_" + name + "_log",
                    "\"##\",", "\"//\"", "");

            ModJsonHelper.createShapedRecipe("cabinet_flipup_" + name, "4", "arborealnature:" + name + "_log", "arborealnature:stripped_" + name + "_log",
                    "\"//\",", "\"##\"", "");

            ModJsonHelper.createShapedRecipe("cupboard_" + name, "4", "arborealnature:" + name + "_log", "arborealnature:stripped_" + name + "_log",
                    "\"/#\",", "\"/#\",", "\"/#\"");

            ModJsonHelper.createShapedRecipe("halfcabinet_" + name, "4", "arborealnature:" + name + "_log", "arborealnature:stripped_" + name + "_log",
                    "\"/ \",", "\" #\"", "");

            ModJsonHelper.createShapedRecipe("halfcabinet_flipdown_" + name, "4", "arborealnature:" + name + "_log", "arborealnature:stripped_" + name + "_log",
                    "\"#\",", "\"/\"", "");

            ModJsonHelper.createShapedRecipe("halfcabinet_flipup_" + name, "4", "arborealnature:" + name + "_log", "arborealnature:stripped_" + name + "_log",
                    "\"/\",", "\"#\"", "");

            ModJsonHelper.createShapedRecipe("halfcupboard_" + name, "4", "arborealnature:" + name + "_log", "arborealnature:stripped_" + name + "_log",
                    "\"#\",", "\"/\",", "\"#\"");
        }

        for(String name : ModItemGroups.WF_WOOD_NAMES)
        {
            ModJsonHelper.createShapedRecipe("cabinet_" + name, "4", "wildfields:" + name + "_log", "wildfields:stripped_" + name + "_log",
                    "\"/#\",", "\"/#\"", "");

            ModJsonHelper.createShapedRecipe("cabinet_flipdown_" + name, "4", "wildfields:" + name + "_log", "wildfields:stripped_" + name + "_log",
                    "\"##\",", "\"//\"", "");

            ModJsonHelper.createShapedRecipe("cabinet_flipup_" + name, "4", "wildfields:" + name + "_log", "wildfields:stripped_" + name + "_log",
                    "\"//\",", "\"##\"", "");

            ModJsonHelper.createShapedRecipe("cupboard_" + name, "4", "wildfields:" + name + "_log", "wildfields:stripped_" + name + "_log",
                    "\"/#\",", "\"/#\",", "\"/#\"");

            ModJsonHelper.createShapedRecipe("halfcabinet_" + name, "4", "wildfields:" + name + "_log", "wildfields:stripped_" + name + "_log",
                    "\"/ \",", "\" #\"", "");

            ModJsonHelper.createShapedRecipe("halfcabinet_flipdown_" + name, "4", "wildfields:" + name + "_log", "wildfields:stripped_" + name + "_log",
                    "\"#\",", "\"/\"", "");

            ModJsonHelper.createShapedRecipe("halfcabinet_flipup_" + name, "4", "wildfields:" + name + "_log", "wildfields:stripped_" + name + "_log",
                    "\"/\",", "\"#\"", "");

            ModJsonHelper.createShapedRecipe("halfcupboard_" + name, "4", "wildfields:" + name + "_log", "wildfields:stripped_" + name + "_log",
                    "\"#\",", "\"/\",", "\"#\"");
        }

        for(String name : ModItemGroups.WT_WOOD_NAMES)
        {
            ModJsonHelper.createShapedRecipe("cabinet_" + name, "4", "whisperleaftrees:" + name + "_log", "whisperleaftrees:stripped_" + name + "_log",
                    "\"/#\",", "\"/#\"", "");

            ModJsonHelper.createShapedRecipe("cabinet_flipdown_" + name, "4", "whisperleaftrees:" + name + "_log", "whisperleaftrees:stripped_" + name + "_log",
                    "\"##\",", "\"//\"", "");

            ModJsonHelper.createShapedRecipe("cabinet_flipup_" + name, "4", "whisperleaftrees:" + name + "_log", "whisperleaftrees:stripped_" + name + "_log",
                    "\"//\",", "\"##\"", "");

            ModJsonHelper.createShapedRecipe("cupboard_" + name, "4", "whisperleaftrees:" + name + "_log", "whisperleaftrees:stripped_" + name + "_log",
                    "\"/#\",", "\"/#\",", "\"/#\"");

            ModJsonHelper.createShapedRecipe("halfcabinet_" + name, "4", "whisperleaftrees:" + name + "_log", "whisperleaftrees:stripped_" + name + "_log",
                    "\"/ \",", "\" #\"", "");

            ModJsonHelper.createShapedRecipe("halfcabinet_flipdown_" + name, "4", "whisperleaftrees:" + name + "_log", "whisperleaftrees:stripped_" + name + "_log",
                    "\"#\",", "\"/\"", "");

            ModJsonHelper.createShapedRecipe("halfcabinet_flipup_" + name, "4", "whisperleaftrees:" + name + "_log", "whisperleaftrees:stripped_" + name + "_log",
                    "\"/\",", "\"#\"", "");

            ModJsonHelper.createShapedRecipe("halfcupboard_" + name, "4", "whisperleaftrees:" + name + "_log", "whisperleaftrees:stripped_" + name + "_log",
                    "\"#\",", "\"/\",", "\"#\"");
        }

        for(String name : ModItemGroups.ST_WOOD_NAMES)
        {
            ModJsonHelper.createShapedRecipe("cabinet_" + name, "4", "silverwoodtrees:" + name + "_log", "silverwoodtrees:stripped_" + name + "_log",
                    "\"/#\",", "\"/#\"", "");

            ModJsonHelper.createShapedRecipe("cabinet_flipdown_" + name, "4", "silverwoodtrees:" + name + "_log", "silverwoodtrees:stripped_" + name + "_log",
                    "\"##\",", "\"//\"", "");

            ModJsonHelper.createShapedRecipe("cabinet_flipup_" + name, "4", "silverwoodtrees:" + name + "_log", "silverwoodtrees:stripped_" + name + "_log",
                    "\"//\",", "\"##\"", "");

            ModJsonHelper.createShapedRecipe("cupboard_" + name, "4", "silverwoodtrees:" + name + "_log", "silverwoodtrees:stripped_" + name + "_log",
                    "\"/#\",", "\"/#\",", "\"/#\"");

            ModJsonHelper.createShapedRecipe("halfcabinet_" + name, "4", "silverwoodtrees:" + name + "_log", "silverwoodtrees:stripped_" + name + "_log",
                    "\"/ \",", "\" #\"", "");

            ModJsonHelper.createShapedRecipe("halfcabinet_flipdown_" + name, "4", "silverwoodtrees:" + name + "_log", "silverwoodtrees:stripped_" + name + "_log",
                    "\"#\",", "\"/\"", "");

            ModJsonHelper.createShapedRecipe("halfcabinet_flipup_" + name, "4", "silverwoodtrees:" + name + "_log", "silverwoodtrees:stripped_" + name + "_log",
                    "\"/\",", "\"#\"", "");

            ModJsonHelper.createShapedRecipe("halfcupboard_" + name, "4", "silverwoodtrees:" + name + "_log", "silverwoodtrees:stripped_" + name + "_log",
                    "\"#\",", "\"/\",", "\"#\"");
        }

        for(String name : ModItemGroups.MT_WOOD_NAMES)
        {
            ModJsonHelper.createShapedRecipe("cabinet_" + name, "4", "missingtrees:" + name + "_log", "missingtrees:stripped_" + name + "_log",
                    "\"/#\",", "\"/#\"", "");

            ModJsonHelper.createShapedRecipe("cabinet_flipdown_" + name, "4", "missingtrees:" + name + "_log", "missingtrees:stripped_" + name + "_log",
                    "\"##\",", "\"//\"", "");

            ModJsonHelper.createShapedRecipe("cabinet_flipup_" + name, "4", "missingtrees:" + name + "_log", "missingtrees:stripped_" + name + "_log",
                    "\"//\",", "\"##\"", "");

            ModJsonHelper.createShapedRecipe("cupboard_" + name, "4", "missingtrees:" + name + "_log", "missingtrees:stripped_" + name + "_log",
                    "\"/#\",", "\"/#\",", "\"/#\"");

            ModJsonHelper.createShapedRecipe("halfcabinet_" + name, "4", "missingtrees:" + name + "_log", "missingtrees:stripped_" + name + "_log",
                    "\"/ \",", "\" #\"", "");

            ModJsonHelper.createShapedRecipe("halfcabinet_flipdown_" + name, "4", "missingtrees:" + name + "_log", "missingtrees:stripped_" + name + "_log",
                    "\"#\",", "\"/\"", "");

            ModJsonHelper.createShapedRecipe("halfcabinet_flipup_" + name, "4", "missingtrees:" + name + "_log", "missingtrees:stripped_" + name + "_log",
                    "\"/\",", "\"#\"", "");

            ModJsonHelper.createShapedRecipe("halfcupboard_" + name, "4", "missingtrees:" + name + "_log", "missingtrees:stripped_" + name + "_log",
                    "\"#\",", "\"/\",", "\"#\"");
        }

        for(String name : ModItemGroups.NSS_WOOD_NAMES)
        {
            ModJsonHelper.createShapedRecipe("cabinet_" + name, "4", "natures_spirit:" + name.replace("_nss", "")
                            + "_log", "natures_spirit:stripped_" + name.replace("_nss", "") + "_log",
                    "\"/#\",", "\"/#\"", "");

            ModJsonHelper.createShapedRecipe("cabinet_flipdown_" + name, "4", "natures_spirit:" + name.replace("_nss", "")
                            + "_log", "natures_spirit:stripped_" + name.replace("_nss", "") + "_log",
                    "\"##\",", "\"//\"", "");

            ModJsonHelper.createShapedRecipe("cabinet_flipup_" + name, "4", "natures_spirit:" + name.replace("_nss", "")
                            + "_log", "natures_spirit:stripped_" + name.replace("_nss", "") + "_log",
                    "\"//\",", "\"##\"", "");

            ModJsonHelper.createShapedRecipe("cupboard_" + name, "4", "natures_spirit:" + name.replace("_nss", "")
                            + "_log", "natures_spirit:stripped_" + name.replace("_nss", "") + "_log",
                    "\"/#\",", "\"/#\",", "\"/#\"");

            ModJsonHelper.createShapedRecipe("halfcabinet_" + name, "4", "natures_spirit:" + name.replace("_nss", "")
                            + "_log", "natures_spirit:stripped_" + name.replace("_nss", "") + "_log",
                    "\"/ \",", "\" #\"", "");

            ModJsonHelper.createShapedRecipe("halfcabinet_flipdown_" + name, "4", "natures_spirit:" + name.replace("_nss", "")
                            + "_log", "natures_spirit:stripped_" + name.replace("_nss", "") + "_log",
                    "\"#\",", "\"/\"", "");

            ModJsonHelper.createShapedRecipe("halfcabinet_flipup_" + name, "4", "natures_spirit:" + name.replace("_nss", "")
                            + "_log", "natures_spirit:stripped_" + name.replace("_nss", "") + "_log",
                    "\"/\",", "\"#\"", "");

            ModJsonHelper.createShapedRecipe("halfcupboard_" + name, "4", "natures_spirit:" + name.replace("_nss", "")
                            + "_log", "natures_spirit:stripped_" + name.replace("_nss", "") + "_log",
                    "\"#\",", "\"/\",", "\"#\"");
        }
    }

    private void registerHalfCabinet(Consumer<RecipeJsonProvider> recipeExporter, Block output, Block ing1, Block ing2)
    {
        ShapedRecipeJsonBuilder.create(output, 3)
                .pattern("/ ")
                .pattern(" #")
                .input('#', ing1)
                .input('/', ing2)
                .criterion(hasItem(ing1), conditionsFromItem(ing1))
                .criterion(hasItem(ing2), conditionsFromItem(ing2))
                .offerTo(recipeExporter);
    }

    private void registerHalfCabinetFlipup(Consumer<RecipeJsonProvider> recipeExporter, Block output, Block ing1, Block ing2)
    {
        ShapedRecipeJsonBuilder.create(output, 3)
                .pattern("/")
                .pattern("#")
                .input('#', ing1)
                .input('/', ing2)
                .criterion(hasItem(ing1), conditionsFromItem(ing1))
                .criterion(hasItem(ing2), conditionsFromItem(ing2))
                .offerTo(recipeExporter);
    }

    private void registerHalfCabinetFlipdown(Consumer<RecipeJsonProvider> recipeExporter, Block output, Block ing1, Block ing2)
    {
        ShapedRecipeJsonBuilder.create(output, 3)
                .pattern("#")
                .pattern("/")
                .input('#', ing1)
                .input('/', ing2)
                .criterion(hasItem(ing1), conditionsFromItem(ing1))
                .criterion(hasItem(ing2), conditionsFromItem(ing2))
                .offerTo(recipeExporter);
    }

    private void registerHalfCupboard(Consumer<RecipeJsonProvider> recipeExporter, Block output, Block ing1, Block ing2)
    {
        ShapedRecipeJsonBuilder.create(output, 3)
                .pattern("#")
                .pattern("/")
                .pattern("#")
                .input('#', ing1)
                .input('/', ing2)
                .criterion(hasItem(ing1), conditionsFromItem(ing1))
                .criterion(hasItem(ing2), conditionsFromItem(ing2))
                .offerTo(recipeExporter);
    }

    private void registerCabinet(Consumer<RecipeJsonProvider> recipeExporter, Block output, Block ing1, Block ing2)
    {
        ShapedRecipeJsonBuilder.create(output, 4)
                .pattern("/#")
                .pattern("/#")
                .input('#', ing1)
                .input('/', ing2)
                .criterion(hasItem(ing1), conditionsFromItem(ing1))
                .criterion(hasItem(ing2), conditionsFromItem(ing2))
                .offerTo(recipeExporter);
    }

    private void registerCabinetFlipup(Consumer<RecipeJsonProvider> recipeExporter, Block output, Block ing1, Block ing2)
    {
        ShapedRecipeJsonBuilder.create(output, 4)
                .pattern("//")
                .pattern("##")
                .input('#', ing1)
                .input('/', ing2)
                .criterion(hasItem(ing1), conditionsFromItem(ing1))
                .criterion(hasItem(ing2), conditionsFromItem(ing2))
                .offerTo(recipeExporter);
    }

    private void registerCabinetFlipdown(Consumer<RecipeJsonProvider> recipeExporter, Block output, Block ing1, Block ing2)
    {
        ShapedRecipeJsonBuilder.create(output, 4)
                .pattern("##")
                .pattern("//")
                .input('#', ing1)
                .input('/', ing2)
                .criterion(hasItem(ing1), conditionsFromItem(ing1))
                .criterion(hasItem(ing2), conditionsFromItem(ing2))
                .offerTo(recipeExporter);
    }

    private void registerCupboard(Consumer<RecipeJsonProvider> recipeExporter, Block output, Block ing1, Block ing2)
    {
        ShapedRecipeJsonBuilder.create(output, 4)
                .pattern("/#")
                .pattern("/#")
                .pattern("/#")
                .input('#', ing1)
                .input('/', ing2)
                .criterion(hasItem(ing1), conditionsFromItem(ing1))
                .criterion(hasItem(ing2), conditionsFromItem(ing2))
                .offerTo(recipeExporter);
    }
}