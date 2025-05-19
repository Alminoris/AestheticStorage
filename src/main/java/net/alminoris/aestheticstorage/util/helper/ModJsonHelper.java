package net.alminoris.aestheticstorage.util.helper;

import net.alminoris.aestheticstorage.AestheticStorage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ModJsonHelper
{
    public static void registerCabinetBlockModel(String jsonContent, String name, String textureBase, String textureLeg, String variant, boolean isOpen)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("build\\datagen", "src\\main\\resources") + "/assets/"+ AestheticStorage.MOD_ID+"/models/block/";

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = name + (variant.equals("normal") ? "" : ("_" + variant)) + (isOpen ? "_open" : "") + ".json";
        File modelFile = new File(directory, fileName);

        jsonContent = jsonContent.replace("BASE_NAME", textureBase).replace("LEG_NAME", textureLeg);

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void registerCupboardBlockModel(String jsonContent, String name, String textureBase, String textureLeg, String variant, boolean isOpen, boolean isFlipped)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("build\\datagen", "src\\main\\resources") + "/assets/"+ AestheticStorage.MOD_ID+"/models/block/";

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = name + (variant.equals("normal") ? "" : ("_" + variant)) + (isOpen ? "_open" : "") + (isFlipped ? "_flipped" : "") + ".json";
        File modelFile = new File(directory, fileName);

        jsonContent = jsonContent.replace("BASE_NAME", textureBase).replace("LEG_NAME", textureLeg);

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void createBlockstate(String jsonContent, String name)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("build\\datagen", "src\\main\\resources") + "/assets/"+ AestheticStorage.MOD_ID+"/blockstates";

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = name + ".json";
        File modelFile = new File(directory, fileName);

        jsonContent = jsonContent.replace("NAME", name);

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void createShapedRecipe(String outputName, String count, String ingredient1Name, String ingredient2Name, String pattern1, String pattern2, String pattern3)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("build\\datagen", "src\\main\\resources") + "/data/"+ AestheticStorage.MOD_ID+"/recipe/";

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = outputName + ".json";
        File modelFile = new File(directory, fileName);

        String jsonContent = ModJsonTemplates.SHAPED_RECIPE.replace("COUNT", count)
                .replace("INGREDIENT1_NAME", ingredient1Name).replace("INGREDIENT2_NAME", ingredient2Name).replace("OUTPUT_NAME", outputName)
                .replace("PATTERN1", pattern1).replace("PATTERN2", pattern2).replace("PATTERN3", pattern3);

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}