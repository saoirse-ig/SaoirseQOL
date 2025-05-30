package net.saoirse.saoirsemod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.saoirse.saoirsemod.TheDarkCarnival;
import net.saoirse.saoirsemod.block.ModBlocks;
import net.saoirse.saoirsemod.block.custom.GrowthTotemBlock;
import net.saoirse.saoirsemod.block.custom.PaganCropBlock;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper){
        super(output, TheDarkCarnival.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels(){
        blockWithItem(ModBlocks.RIDDLE_BOX);

//T1 PAGAN

        logBlock(((RotatedPillarBlock) ModBlocks.PAGAN_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.PAGAN_WOOD.get()),
                blockTexture(ModBlocks.PAGAN_LOG.get()),
                blockTexture(ModBlocks.PAGAN_LOG.get()));

        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_PAGAN_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_PAGAN_LOG.get()),
                ResourceLocation.fromNamespaceAndPath(TheDarkCarnival.MOD_ID,
                        "block/stripped_pagan_log_top"));

        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_PAGAN_WOOD.get()),
                blockTexture(ModBlocks.STRIPPED_PAGAN_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_PAGAN_LOG.get()));


        blockItem(ModBlocks.PAGAN_LOG);
        blockItem(ModBlocks.PAGAN_WOOD);
        blockItem(ModBlocks.STRIPPED_PAGAN_LOG);
        blockItem(ModBlocks.STRIPPED_PAGAN_WOOD);

        blockWithItem(ModBlocks.PAGAN_PLANKS);
        leavesBlock(ModBlocks.PAGAN_LEAVES);
        saplingBlock(ModBlocks.PAGAN_SAPLING);

        makePaganCrop((CropBlock)ModBlocks.PAGAN_CROP.get(),
                "pagan_stage", "pagan_stage");

//T2 PAGAN

        logBlock(((RotatedPillarBlock) ModBlocks.PAGAN_T2_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.PAGAN_T2_WOOD.get()),
                blockTexture(ModBlocks.PAGAN_T2_LOG.get()),
                blockTexture(ModBlocks.PAGAN_T2_LOG.get()));

        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_PAGAN_T2_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_PAGAN_T2_LOG.get()),
                ResourceLocation.fromNamespaceAndPath(TheDarkCarnival.MOD_ID,
                        "block/stripped_pagan_t2_log_top"));

        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_PAGAN_T2_WOOD.get()),
                blockTexture(ModBlocks.STRIPPED_PAGAN_T2_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_PAGAN_T2_LOG.get()));


        blockItem(ModBlocks.PAGAN_T2_LOG);
        blockItem(ModBlocks.PAGAN_T2_WOOD);
        blockItem(ModBlocks.STRIPPED_PAGAN_T2_LOG);
        blockItem(ModBlocks.STRIPPED_PAGAN_T2_WOOD);

        blockWithItem(ModBlocks.PAGAN_T2_PLANKS);
        leavesBlock(ModBlocks.PAGAN_T2_LEAVES);
        saplingBlock(ModBlocks.PAGAN_T2_SAPLING);



        blockWithItem(ModBlocks.GROWTH_TOTEM_BLOCK);

    }

    public void makePaganCrop(CropBlock block, String modelName, String textureName){
        Function<BlockState, ConfiguredModel[]> function = state -> paganStates(
                state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] paganStates(BlockState state, CropBlock block, String modelName, String textureName){
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models()
                .crop(modelName +
                                state.getValue(((PaganCropBlock) block)
                                .getAgeProperty()),

                ResourceLocation.fromNamespaceAndPath(TheDarkCarnival.MOD_ID,
                        "block/" + textureName + state.getValue(((PaganCropBlock) block)
                                .getAgeProperty())))
                                .renderType("cutout"));

        return models;
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(),
                cubeAll(blockRegistryObject.get()));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(TheDarkCarnival.MOD_ID +
            ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject){
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(),
                        blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(),
                        ResourceLocation.fromNamespaceAndPath("minecraft","block/leaves"), "all",
                        blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }
}
