package net.saoirse.saoirsemod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.saoirse.saoirsemod.TheDarkCarnival;
import net.saoirse.saoirsemod.block.ModBlocks;
import net.saoirse.saoirsemod.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output,
                                ExistingFileHelper existingFileHelper) {
        super(output, TheDarkCarnival.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        simpleItem(ModItems.JOKER_EYE);
        simpleItem(ModItems.PAGAN_SEEDS);
        simpleItem(ModItems.PAGAN_CROP_YIELD);
        simpleItem(ModItems.PAGAN_DUST);
        simpleItem(ModItems.PAGAN_ORB);

        simpleItem(ModItems.PAGAN_T1_INGOT);
        simpleItem(ModItems.PAGAN_T2_INGOT);
        simpleItem(ModItems.PAGAN_T3_INGOT);
        simpleItem(ModItems.PAGAN_T4_INGOT);
        simpleItem(ModItems.PAGAN_T5_INGOT);

        saplingItem(ModBlocks.PAGAN_T1_SAPLING);
        saplingItem(ModBlocks.PAGAN_T2_SAPLING);
        saplingItem(ModBlocks.PAGAN_T3_SAPLING);
        saplingItem(ModBlocks.PAGAN_T4_SAPLING);
        saplingItem(ModBlocks.PAGAN_T5_SAPLING);

        
        handheldItem(ModItems.PAGAN_T1_PICKAXE);
        handheldItem(ModItems.PAGAN_T1_AXE);
        handheldItem(ModItems.PAGAN_T1_SWORD);
        handheldItem(ModItems.PAGAN_T1_SHOVEL);
        handheldItem(ModItems.PAGAN_T1_HOE);

        handheldItem(ModItems.PAGAN_T2_PICKAXE);
        handheldItem(ModItems.PAGAN_T2_AXE);
        handheldItem(ModItems.PAGAN_T2_SWORD);
        handheldItem(ModItems.PAGAN_T2_SHOVEL);
        handheldItem(ModItems.PAGAN_T2_HOE);

        handheldItem(ModItems.PAGAN_T3_PICKAXE);
        handheldItem(ModItems.PAGAN_T3_AXE);
        handheldItem(ModItems.PAGAN_T3_SWORD);
        handheldItem(ModItems.PAGAN_T3_SHOVEL);
        handheldItem(ModItems.PAGAN_T3_HOE);

        handheldItem(ModItems.PAGAN_T4_PICKAXE);
        handheldItem(ModItems.PAGAN_T4_AXE);
        handheldItem(ModItems.PAGAN_T4_SWORD);
        handheldItem(ModItems.PAGAN_T4_SHOVEL);
        handheldItem(ModItems.PAGAN_T4_HOE);

        handheldItem(ModItems.PAGAN_T5_PICKAXE);
        handheldItem(ModItems.PAGAN_T5_AXE);
        handheldItem(ModItems.PAGAN_T5_SWORD);
        handheldItem(ModItems.PAGAN_T5_SHOVEL);
        handheldItem(ModItems.PAGAN_T5_HOE);
        

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.tryParse("item/generated")).texture("layer0",
                ResourceLocation.tryBuild(TheDarkCarnival.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.tryParse("item/handheld")).texture("layer0",
                ResourceLocation.tryBuild(TheDarkCarnival.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> item){
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.tryParse("item/generated")).texture("layer0",
                ResourceLocation.tryBuild(TheDarkCarnival.MOD_ID, "block/" + item.getId().getPath()));
    }
}
