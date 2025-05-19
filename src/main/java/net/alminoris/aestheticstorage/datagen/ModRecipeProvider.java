package net.alminoris.aestheticstorage.datagen;

import net.alminoris.aestheticstorage.block.ModBlocks;
import net.alminoris.aestheticstorage.item.ModItems;
import net.alminoris.aestheticstorage.util.helper.BlockSetsHelper;
import net.alminoris.aestheticstorage.util.helper.ModJsonHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider
{
    public ModRecipeProvider(FabricDataOutput output)
    {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> recipeExporter)
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
            Block block = Registries.BLOCK.get(Identifier.of("minecraft","stripped_"+name+"_"+blockName));
            Block block1 = Registries.BLOCK.get(Identifier.of("minecraft",name+"_"+blockName));
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

            ModJsonHelper.createShapedRecipe("cabinet_flipdown_" + name, "4", "wildfields:" + name + "_log", "arborealnature:stripped_" + name + "_log",
                    "\"##\",", "\"//\"", "");

            ModJsonHelper.createShapedRecipe("cabinet_flipup_" + name, "4", "wildfields:" + name + "_log", "arborealnature:stripped_" + name + "_log",
                    "\"//\",", "\"##\"", "");

            ModJsonHelper.createShapedRecipe("cupboard_" + name, "4", "wildfields:" + name + "_log", "wildfields:stripped_" + name + "_log",
                    "\"/#\",", "\"/#\",", "\"/#\"");
        }
    }

    private void registerCabinet(Consumer<RecipeJsonProvider> recipeExporter, Block output, Block ing1, Block ing2)
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

    private void registerCabinetFlipup(Consumer<RecipeJsonProvider> recipeExporter, Block output, Block ing1, Block ing2)
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

    private void registerCabinetFlipdown(Consumer<RecipeJsonProvider> recipeExporter, Block output, Block ing1, Block ing2)
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

    private void registerCupboard(Consumer<RecipeJsonProvider> recipeExporter, Block output, Block ing1, Block ing2)
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