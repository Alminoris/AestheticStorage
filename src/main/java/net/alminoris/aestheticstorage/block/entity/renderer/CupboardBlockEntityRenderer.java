package net.alminoris.aestheticstorage.block.entity.renderer;

import net.alminoris.aestheticstorage.block.custom.CabinetBlock;
import net.alminoris.aestheticstorage.block.entity.CabinetBlockEntity;
import net.alminoris.aestheticstorage.block.entity.CupboardBlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.LightmapTextureManager;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.world.LightType;
import net.minecraft.world.World;

import java.util.List;

public class CupboardBlockEntityRenderer implements BlockEntityRenderer<CupboardBlockEntity>
{
    public CupboardBlockEntityRenderer(BlockEntityRendererFactory.Context context)
    {

    }

    @Override
    public void render(CupboardBlockEntity entity, float tickDelta, MatrixStack matrices,
                       VertexConsumerProvider vertexConsumers, int light, int overlay)
    {
        ItemRenderer itemRenderer = MinecraftClient.getInstance().getItemRenderer();
        List<ItemStack> stacks = entity.getRenderStack();

        Direction facing = entity.getCachedState().get(CabinetBlock.FACING);

        matrices.push();

        matrices.translate(0.5, 0.5, 0.5);
        switch (facing) {
            case Direction.NORTH -> matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(0));
            case Direction.SOUTH -> matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180));
            case Direction.WEST  -> matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(90));
            case Direction.EAST  -> matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-90));
        }
        matrices.translate(-0.5, -0.5, -0.5);

        int counter = 0;
        for (ItemStack stack : stacks)
        {
            matrices.push();
            switch (counter)
            {
                case 0:
                    matrices.translate(0.25f, 0.65f, 0.25f);
                    break;
                case 1:
                    matrices.translate(0.75f, 0.65f, 0.25f);
                    break;
                case 2:
                    matrices.translate(0.25f, 0.65f, 0.75f);
                    break;
                case 3:
                    matrices.translate(0.75f, 0.65f, 0.75f);
                    break;
                case 4:
                    matrices.translate(0.25f, 0.2f, 0.25f);
                    break;
                case 5:
                    matrices.translate(0.75f, 0.2f, 0.25f);
                    break;
                case 6:
                    matrices.translate(0.25f, 0.2f, 0.75f);
                    break;
                case 7:
                    matrices.translate(0.75f, 0.2f, 0.75f);
                    break;
            }

            matrices.scale(0.25f, 0.25f, 0.25f);

            itemRenderer.renderItem(stack, ModelTransformationMode.GUI,
                    getLightLevel(entity.getWorld(), entity.getPos()), OverlayTexture.DEFAULT_UV,
                    matrices, vertexConsumers, entity.getWorld(), 1);

            matrices.pop();
            counter++;
        }

        matrices.pop();
    }

    private int getLightLevel(World world, BlockPos pos)
    {
        int bLight = world.getLightLevel(LightType.BLOCK, pos);
        int sLight = world.getLightLevel(LightType.SKY, pos);
        return LightmapTextureManager.pack(bLight, sLight);
    }
}