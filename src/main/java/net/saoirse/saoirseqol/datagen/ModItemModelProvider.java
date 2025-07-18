package net.saoirse.saoirseqol.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.saoirse.saoirseqol.SaoirseQOL;
import net.saoirse.saoirseqol.block.ModBlocks;
import net.saoirse.saoirseqol.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output,
                                ExistingFileHelper existingFileHelper) {
        super(output, SaoirseQOL.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        simpleItem(ModItems.DIAMOND_NUGGET);

        simpleItem(ModItems.WOOD_TO_STONE_SMITHING_TEMPLATE);
        simpleItem(ModItems.LEATHER_TO_CHAINMAIL_SMITHING_TEMPLATE);
        simpleItem(ModItems.STONE_GOLD_CHAINMAIL_TO_IRON_SMITHING_TEMPLATE);
        simpleItem(ModItems.IRON_TO_DIAMOND_SMITHING_TEMPLATE);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.tryParse("item/generated")).texture("layer0",
                ResourceLocation.tryBuild(SaoirseQOL.MOD_ID, "item/" + item.getId().getPath()));
    }

    private void TemplateItem(RegistryObject<Item> template){
        String path = template.getId().getPath();
        withExistingParent(path, mcLoc("item/template_smithing_template"))
                .texture("layer0", modLoc("item/template/" + path));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.tryParse("item/handheld")).texture("layer0",
                ResourceLocation.tryBuild(SaoirseQOL.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> item){
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.tryParse("item/generated")).texture("layer0",
                ResourceLocation.tryBuild(SaoirseQOL.MOD_ID, "block/" + item.getId().getPath()));
    }

}
