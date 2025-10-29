package net.alminoris.aestheticstorage.datagen;

import net.alminoris.aestheticstorage.block.ModBlocks;
import net.alminoris.aestheticstorage.item.ModItems;
import net.alminoris.aestheticstorage.util.helper.BlockSetsHelper;
import net.alminoris.aestheticstorage.util.helper.ModJsonHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider
{
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
    {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WRENCH, 1)
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
            Block block = Registries.BLOCK.get(Identifier.ofVanilla("stripped_"+name+"_"+blockName));
            Block block1 = Registries.BLOCK.get(Identifier.ofVanilla(name+"_"+blockName));
            registerCabinet(recipeExporter, ModBlocks.CABINETS.get(name), block1, block);
            registerCabinetFlipdown(recipeExporter, ModBlocks.FLIPDOWN_CABINETS.get(name), block1, block);
            registerCabinetFlipup(recipeExporter, ModBlocks.FLIPUP_CABINETS.get(name), block1, block);
            registerCupboard(recipeExporter, ModBlocks.CUPBOARDS.get(name), block1, block);
        }

        for(String name : BlockSetsHelper.EXTRA_WOODS_AN)
        {
            ModJsonHelper.createShapedRecipe("cabinet_" + name, "4", "arborealnature:" + name + "_log", "arborealnature:stripped_" + name + "_log",
                    "\"/#\",", "\"/#\"", "");

            ModJsonHelper.createShapedRecipe("cabinet_flipdown_" + name, "4", "arborealnature:" + name + "_log", "arborealnature:stripped_" + name + "_log",
                    "\"##\",", "\"//\"", "");

            ModJsonHelper.createShapedRecipe("cabinet_flipup_" + name, "4", "arborealnature:" + name + "_log", "arborealnature:stripped_" + name + "_log",
                    "\"//\",", "\"##\"", "");

            ModJsonHelper.createShapedRecipe("cupboard_" + name, "4", "arborealnature:" + name + "_log", "arborealnature:stripped_" + name + "_log",
                    "\"/#\",", "\"/#\",", "\"/#\"");
        }

        for(String name : BlockSetsHelper.EXTRA_WOODS_WF)
        {
            ModJsonHelper.createShapedRecipe("cabinet_" + name, "4", "wildfields:" + name + "_log", "wildfields:stripped_" + name + "_log",
                    "\"/#\",", "\"/#\"", "");

            ModJsonHelper.createShapedRecipe("cabinet_flipdown_" + name, "4", "wildfields:" + name + "_log", "wildfields:stripped_" + name + "_log",
                    "\"##\",", "\"//\"", "");

            ModJsonHelper.createShapedRecipe("cabinet_flipup_" + name, "4", "wildfields:" + name + "_log", "wildfields:stripped_" + name + "_log",
                    "\"//\",", "\"##\"", "");

            ModJsonHelper.createShapedRecipe("cupboard_" + name, "4", "wildfields:" + name + "_log", "wildfields:stripped_" + name + "_log",
                    "\"/#\",", "\"/#\",", "\"/#\"");
        }

        for(String name : BlockSetsHelper.WT_WOOD_NAMES)
        {
            ModJsonHelper.createShapedRecipe("cabinet_" + name, "4", "whisperleaftrees:" + name + "_log", "whisperleaftrees:stripped_" + name + "_log",
                    "\"/#\",", "\"/#\"", "");

            ModJsonHelper.createShapedRecipe("cabinet_flipdown_" + name, "4", "whisperleaftrees:" + name + "_log", "whisperleaftrees:stripped_" + name + "_log",
                    "\"##\",", "\"//\"", "");

            ModJsonHelper.createShapedRecipe("cabinet_flipup_" + name, "4", "whisperleaftrees:" + name + "_log", "whisperleaftrees:stripped_" + name + "_log",
                    "\"//\",", "\"##\"", "");

            ModJsonHelper.createShapedRecipe("cupboard_" + name, "4", "whisperleaftrees:" + name + "_log", "whisperleaftrees:stripped_" + name + "_log",
                    "\"/#\",", "\"/#\",", "\"/#\"");
        }

        for(String name : BlockSetsHelper.ST_WOOD_NAMES)
        {
            ModJsonHelper.createShapedRecipe("cabinet_" + name, "4", "silverwoodtrees:" + name + "_log", "silverwoodtrees:stripped_" + name + "_log",
                    "\"/#\",", "\"/#\"", "");

            ModJsonHelper.createShapedRecipe("cabinet_flipdown_" + name, "4", "silverwoodtrees:" + name + "_log", "silverwoodtrees:stripped_" + name + "_log",
                    "\"##\",", "\"//\"", "");

            ModJsonHelper.createShapedRecipe("cabinet_flipup_" + name, "4", "silverwoodtrees:" + name + "_log", "silverwoodtrees:stripped_" + name + "_log",
                    "\"//\",", "\"##\"", "");

            ModJsonHelper.createShapedRecipe("cupboard_" + name, "4", "silverwoodtrees:" + name + "_log", "silverwoodtrees:stripped_" + name + "_log",
                    "\"/#\",", "\"/#\",", "\"/#\"");
        }

        for(String name : BlockSetsHelper.MT_WOOD_NAMES)
        {
            ModJsonHelper.createShapedRecipe("cabinet_" + name, "4", "missingtrees:" + name + "_log", "missingtrees:stripped_" + name + "_log",
                    "\"/#\",", "\"/#\"", "");

            ModJsonHelper.createShapedRecipe("cabinet_flipdown_" + name, "4", "missingtrees:" + name + "_log", "missingtrees:stripped_" + name + "_log",
                    "\"##\",", "\"//\"", "");

            ModJsonHelper.createShapedRecipe("cabinet_flipup_" + name, "4", "missingtrees:" + name + "_log", "missingtrees:stripped_" + name + "_log",
                    "\"//\",", "\"##\"", "");

            ModJsonHelper.createShapedRecipe("cupboard_" + name, "4", "missingtrees:" + name + "_log", "missingtrees:stripped_" + name + "_log",
                    "\"/#\",", "\"/#\",", "\"/#\"");
        }

        for(String name : BlockSetsHelper.NSS_WOOD_NAMES)
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
        }
    }

    private void registerCabinet(RecipeExporter recipeExporter, Block output, Block ing1, Block ing2)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output, 4)
                .pattern("/#")
                .pattern("/#")
                .input('#', ing1)
                .input('/', ing2)
                .criterion(hasItem(ing1), conditionsFromItem(ing1))
                .criterion(hasItem(ing2), conditionsFromItem(ing2))
                .offerTo(recipeExporter);
    }

    private void registerCabinetFlipup(RecipeExporter recipeExporter, Block output, Block ing1, Block ing2)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output, 4)
                .pattern("//")
                .pattern("##")
                .input('#', ing1)
                .input('/', ing2)
                .criterion(hasItem(ing1), conditionsFromItem(ing1))
                .criterion(hasItem(ing2), conditionsFromItem(ing2))
                .offerTo(recipeExporter);
    }

    private void registerCabinetFlipdown(RecipeExporter recipeExporter, Block output, Block ing1, Block ing2)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output, 4)
                .pattern("##")
                .pattern("//")
                .input('#', ing1)
                .input('/', ing2)
                .criterion(hasItem(ing1), conditionsFromItem(ing1))
                .criterion(hasItem(ing2), conditionsFromItem(ing2))
                .offerTo(recipeExporter);
    }

    private void registerCupboard(RecipeExporter recipeExporter, Block output, Block ing1, Block ing2)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output, 4)
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