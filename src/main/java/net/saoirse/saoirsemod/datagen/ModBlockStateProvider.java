package net.saoirse.saoirsemod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.saoirse.saoirsemod.TheDarkCarnival;
import net.saoirse.saoirsemod.block.ModBlocks;

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
