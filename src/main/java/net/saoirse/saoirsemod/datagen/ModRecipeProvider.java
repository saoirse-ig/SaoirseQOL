package net.saoirse.saoirsemod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.ShapedRecipe;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.saoirse.saoirsemod.TheDarkCarnival;
import net.saoirse.saoirsemod.block.ModBlocks;
import net.saoirse.saoirsemod.item.ModItems;
import net.saoirse.saoirsemod.util.ModTags;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
/*
    private static final List<ItemLike> TEMP_SMELTABLES = List.of(ModItems.RAW_TEMP_ORE.get(),
    ModBlocks.TEMP_ORE.get());
*/

    public ModRecipeProvider(PackOutput pOutput){
        super(pOutput);
    }

    private static final List<ItemLike> PAGAN_T1_SMELTABLES = List.of(
            ModItems.PAGAN_T1_RAW_ORE.get()
    );

    private static final List<ItemLike> PAGAN_T2_SMELTABLES = List.of(
            ModItems.PAGAN_T2_RAW_ORE.get()
    );

    private static final List<ItemLike> PAGAN_T3_SMELTABLES = List.of(
            ModItems.PAGAN_T3_RAW_ORE.get()
    );

    private static final List<ItemLike> PAGAN_T4_SMELTABLES = List.of(
            ModItems.PAGAN_T4_RAW_ORE.get()
    );

    private static final List<ItemLike> PAGAN_T5_SMELTABLES = List.of(
            ModItems.PAGAN_T5_RAW_ORE.get()
    );


    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {



        //TEMPLATE
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RIDDLE_BOX.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.JOKER_EYE.get())
                .unlockedBy(getHasName(ModItems.JOKER_EYE.get()), has(ModItems.JOKER_EYE.get()))
                .save(pWriter);

        //TEMPLATE
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.JOKER_EYE.get(), 9)
                .requires(ModBlocks.RIDDLE_BOX.get())
                .unlockedBy(getHasName(ModBlocks.RIDDLE_BOX.get()), has(ModBlocks.RIDDLE_BOX.get()))
                .save(pWriter);



        //SHAPED CRAFTING

        // T3 Sapling Crafting Item
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PAGAN_T3_CRAFTING_ITEM.get())
                .pattern("OSB")
                .pattern("J$A")
                .pattern("DMC")
                .define('$', ModItems.PAGAN_DUST.get())
                .define('O', Blocks.OAK_SAPLING)
                .define('S', Blocks.SPRUCE_SAPLING)
                .define('B', Blocks.BIRCH_SAPLING)
                .define('J', Blocks.JUNGLE_SAPLING)
                .define('D', Blocks.DARK_OAK_SAPLING)
                .define('M', Blocks.BAMBOO)
                .define('A', Blocks.ACACIA_SAPLING)
                .define('C', Blocks.CHERRY_SAPLING)
                .unlockedBy(getHasName(ModBlocks.PAGAN_T2_SAPLING.get()), has(ModBlocks.PAGAN_T2_SAPLING.get()))
                .save(pWriter);


        // T1 Sapling
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PAGAN_T1_SAPLING.get())
                .pattern("#$")
                .define('$', ModItems.PAGAN_DUST.get())
                .define('#', Ingredient.of(ItemTags.SAPLINGS))
                .unlockedBy(getHasName(ModItems.PAGAN_DUST.get()), has(ModItems.PAGAN_DUST.get()))
                .save(pWriter);

        // T2 Sapling
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PAGAN_T2_SAPLING.get())
                .pattern(" R ")
                .pattern("S1B")
                .pattern(" $ ")
                .define('$', ModItems.PAGAN_DUST.get())
                .define('1', ModBlocks.PAGAN_T1_SAPLING.get())
                .define('R', Items.ROTTEN_FLESH)
                .define('S', Items.SPIDER_EYE)
                .define('B', Items.BONE_BLOCK)
                .unlockedBy(getHasName(ModBlocks.PAGAN_T1_SAPLING.get()), has(ModBlocks.PAGAN_T1_SAPLING.get()))
                .save(pWriter);

        // T3 Sapling
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PAGAN_T3_SAPLING.get())
                .pattern(" $ ")
                .pattern("$2$")
                .pattern(" $ ")
                .define('$', ModItems.PAGAN_T3_CRAFTING_ITEM.get())
                .define('2', ModBlocks.PAGAN_T2_SAPLING.get())
                .unlockedBy(getHasName(ModBlocks.PAGAN_T2_SAPLING.get()), has(ModBlocks.PAGAN_T2_SAPLING.get()))
                .save(pWriter);

        // T4 Sapling
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PAGAN_T4_SAPLING.get())
                .pattern("$$$")
                .pattern("$3$")
                .pattern("$$$")
                .define('$', ModBlocks.PAGAN_T4_BLOCK_COMPRESSED.get())
                .define('3', ModBlocks.PAGAN_T3_SAPLING.get())
                .unlockedBy(getHasName(ModBlocks.PAGAN_T3_SAPLING.get()), has(ModBlocks.PAGAN_T3_SAPLING.get()))
                .save(pWriter);

        // T5 Sapling
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PAGAN_T5_SAPLING.get())
                .pattern("CRN")
                .pattern("R4R")
                .pattern("NRC")
                .define('C', ModBlocks.PAGAN_T4_BLOCK_COMPRESSED.get())
                .define('4', ModBlocks.PAGAN_T4_SAPLING.get())
                .define('N', Blocks.NETHERITE_BLOCK)
                .define('R', Blocks.RED_MUSHROOM)
                .unlockedBy(getHasName(ModBlocks.PAGAN_T4_SAPLING.get()), has(ModBlocks.PAGAN_T4_SAPLING.get()))
                .save(pWriter);


        // Compress T4 Block
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PAGAN_T4_BLOCK_COMPRESSED.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModBlocks.PAGAN_T4_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.PAGAN_T4_BLOCK.get()), has(ModBlocks.PAGAN_T4_BLOCK.get()))
                .save(pWriter);



        // Pagan Pickaxe T1-T5

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PAGAN_T1_PICKAXE.get())
                .pattern("###")
                .pattern(" $ ")
                .pattern(" $ ")
                .define('#', ModItems.PAGAN_T1_INGOT.get())
                .define('$', Items.STICK)
                .unlockedBy(getHasName(ModItems.PAGAN_T1_INGOT.get()), has(ModItems.PAGAN_T1_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PAGAN_T2_PICKAXE.get())
                .pattern("###")
                .pattern(" $ ")
                .pattern(" $ ")
                .define('#', ModItems.PAGAN_T2_INGOT.get())
                .define('$', Items.STICK)
                .unlockedBy(getHasName(ModItems.PAGAN_T2_INGOT.get()), has(ModItems.PAGAN_T2_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PAGAN_T3_PICKAXE.get())
                .pattern("###")
                .pattern(" $ ")
                .pattern(" $ ")
                .define('#', ModItems.PAGAN_T3_INGOT.get())
                .define('$', Items.STICK)
                .unlockedBy(getHasName(ModItems.PAGAN_T3_INGOT.get()), has(ModItems.PAGAN_T3_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PAGAN_T4_PICKAXE.get())
                .pattern("###")
                .pattern(" $ ")
                .pattern(" $ ")
                .define('#', ModItems.PAGAN_T4_INGOT.get())
                .define('$', Items.STICK)
                .unlockedBy(getHasName(ModItems.PAGAN_T4_INGOT.get()), has(ModItems.PAGAN_T4_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PAGAN_T5_PICKAXE.get())
                .pattern("###")
                .pattern(" $ ")
                .pattern(" $ ")
                .define('#', ModItems.PAGAN_T5_INGOT.get())
                .define('$', Items.STICK)
                .unlockedBy(getHasName(ModItems.PAGAN_T5_INGOT.get()), has(ModItems.PAGAN_T5_INGOT.get()))
                .save(pWriter);

        
        // Pagan Sword T1-T5

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PAGAN_T1_SWORD.get())
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" $ ")
                .define('#', ModItems.PAGAN_T1_INGOT.get())
                .define('$', Items.STICK)
                .unlockedBy(getHasName(ModItems.PAGAN_T1_INGOT.get()), has(ModItems.PAGAN_T1_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PAGAN_T2_SWORD.get())
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" $ ")
                .define('#', ModItems.PAGAN_T2_INGOT.get())
                .define('$', Items.STICK)
                .unlockedBy(getHasName(ModItems.PAGAN_T2_INGOT.get()), has(ModItems.PAGAN_T2_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PAGAN_T3_SWORD.get())
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" $ ")
                .define('#', ModItems.PAGAN_T3_INGOT.get())
                .define('$', Items.STICK)
                .unlockedBy(getHasName(ModItems.PAGAN_T3_INGOT.get()), has(ModItems.PAGAN_T3_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PAGAN_T4_SWORD.get())
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" $ ")
                .define('#', ModItems.PAGAN_T4_INGOT.get())
                .define('$', Items.STICK)
                .unlockedBy(getHasName(ModItems.PAGAN_T4_INGOT.get()), has(ModItems.PAGAN_T4_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PAGAN_T5_SWORD.get())
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" $ ")
                .define('#', ModItems.PAGAN_T5_INGOT.get())
                .define('$', Items.STICK)
                .unlockedBy(getHasName(ModItems.PAGAN_T5_INGOT.get()), has(ModItems.PAGAN_T5_INGOT.get()))
                .save(pWriter);


        // Pagan Shovel T1-T5

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PAGAN_T1_SHOVEL.get())
                .pattern(" # ")
                .pattern(" $ ")
                .pattern(" $ ")
                .define('#', ModItems.PAGAN_T1_INGOT.get())
                .define('$', Items.STICK)
                .unlockedBy(getHasName(ModItems.PAGAN_T1_INGOT.get()), has(ModItems.PAGAN_T1_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PAGAN_T2_SHOVEL.get())
                .pattern(" # ")
                .pattern(" $ ")
                .pattern(" $ ")
                .define('#', ModItems.PAGAN_T2_INGOT.get())
                .define('$', Items.STICK)
                .unlockedBy(getHasName(ModItems.PAGAN_T2_INGOT.get()), has(ModItems.PAGAN_T2_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PAGAN_T3_SHOVEL.get())
                .pattern(" # ")
                .pattern(" $ ")
                .pattern(" $ ")
                .define('#', ModItems.PAGAN_T3_INGOT.get())
                .define('$', Items.STICK)
                .unlockedBy(getHasName(ModItems.PAGAN_T3_INGOT.get()), has(ModItems.PAGAN_T3_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PAGAN_T4_SHOVEL.get())
                .pattern(" # ")
                .pattern(" $ ")
                .pattern(" $ ")
                .define('#', ModItems.PAGAN_T4_INGOT.get())
                .define('$', Items.STICK)
                .unlockedBy(getHasName(ModItems.PAGAN_T4_INGOT.get()), has(ModItems.PAGAN_T4_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PAGAN_T5_SHOVEL.get())
                .pattern(" # ")
                .pattern(" $ ")
                .pattern(" $ ")
                .define('#', ModItems.PAGAN_T5_INGOT.get())
                .define('$', Items.STICK)
                .unlockedBy(getHasName(ModItems.PAGAN_T5_INGOT.get()), has(ModItems.PAGAN_T5_INGOT.get()))
                .save(pWriter);


        // Pagan Axe T1-T5

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PAGAN_T1_AXE.get())
                .pattern("## ")
                .pattern("#$ ")
                .pattern(" $ ")
                .define('#', ModItems.PAGAN_T1_INGOT.get())
                .define('$', Items.STICK)
                .unlockedBy(getHasName(ModItems.PAGAN_T1_INGOT.get()), has(ModItems.PAGAN_T1_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PAGAN_T2_AXE.get())
                .pattern("## ")
                .pattern("#$ ")
                .pattern(" $ ")
                .define('#', ModItems.PAGAN_T2_INGOT.get())
                .define('$', Items.STICK)
                .unlockedBy(getHasName(ModItems.PAGAN_T2_INGOT.get()), has(ModItems.PAGAN_T2_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PAGAN_T3_AXE.get())
                .pattern("## ")
                .pattern("#$ ")
                .pattern(" $ ")
                .define('#', ModItems.PAGAN_T3_INGOT.get())
                .define('$', Items.STICK)
                .unlockedBy(getHasName(ModItems.PAGAN_T3_INGOT.get()), has(ModItems.PAGAN_T3_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PAGAN_T4_AXE.get())
                .pattern("## ")
                .pattern("#$ ")
                .pattern(" $ ")
                .define('#', ModItems.PAGAN_T4_INGOT.get())
                .define('$', Items.STICK)
                .unlockedBy(getHasName(ModItems.PAGAN_T4_INGOT.get()), has(ModItems.PAGAN_T4_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PAGAN_T5_AXE.get())
                .pattern("## ")
                .pattern("#$ ")
                .pattern(" $ ")
                .define('#', ModItems.PAGAN_T5_INGOT.get())
                .define('$', Items.STICK)
                .unlockedBy(getHasName(ModItems.PAGAN_T5_INGOT.get()), has(ModItems.PAGAN_T5_INGOT.get()))
                .save(pWriter);


        // Pagan Hoe T1-T5

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PAGAN_T1_HOE.get())
                .pattern("## ")
                .pattern(" $ ")
                .pattern(" $ ")
                .define('#', ModItems.PAGAN_T1_INGOT.get())
                .define('$', Items.STICK)
                .unlockedBy(getHasName(ModItems.PAGAN_T1_INGOT.get()), has(ModItems.PAGAN_T1_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PAGAN_T2_HOE.get())
                .pattern("## ")
                .pattern(" $ ")
                .pattern(" $ ")
                .define('#', ModItems.PAGAN_T2_INGOT.get())
                .define('$', Items.STICK)
                .unlockedBy(getHasName(ModItems.PAGAN_T2_INGOT.get()), has(ModItems.PAGAN_T2_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PAGAN_T3_HOE.get())
                .pattern("## ")
                .pattern(" $ ")
                .pattern(" $ ")
                .define('#', ModItems.PAGAN_T3_INGOT.get())
                .define('$', Items.STICK)
                .unlockedBy(getHasName(ModItems.PAGAN_T3_INGOT.get()), has(ModItems.PAGAN_T3_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PAGAN_T4_HOE.get())
                .pattern("## ")
                .pattern(" $ ")
                .pattern(" $ ")
                .define('#', ModItems.PAGAN_T4_INGOT.get())
                .define('$', Items.STICK)
                .unlockedBy(getHasName(ModItems.PAGAN_T4_INGOT.get()), has(ModItems.PAGAN_T4_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PAGAN_T5_HOE.get())
                .pattern("## ")
                .pattern(" $ ")
                .pattern(" $ ")
                .define('#', ModItems.PAGAN_T5_INGOT.get())
                .define('$', Items.STICK)
                .unlockedBy(getHasName(ModItems.PAGAN_T5_INGOT.get()), has(ModItems.PAGAN_T5_INGOT.get()))
                .save(pWriter);
        

        // Ingots to blocks T1-T5

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PAGAN_T1_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.PAGAN_T1_INGOT.get())
                .unlockedBy(getHasName(ModItems.PAGAN_T1_INGOT.get()), has(ModItems.PAGAN_T1_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PAGAN_T2_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.PAGAN_T2_INGOT.get())
                .unlockedBy(getHasName(ModItems.PAGAN_T2_INGOT.get()), has(ModItems.PAGAN_T2_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PAGAN_T3_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.PAGAN_T3_INGOT.get())
                .unlockedBy(getHasName(ModItems.PAGAN_T3_INGOT.get()), has(ModItems.PAGAN_T3_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PAGAN_T4_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.PAGAN_T4_INGOT.get())
                .unlockedBy(getHasName(ModItems.PAGAN_T4_INGOT.get()), has(ModItems.PAGAN_T4_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PAGAN_T5_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.PAGAN_T5_INGOT.get())
                .unlockedBy(getHasName(ModItems.PAGAN_T5_INGOT.get()), has(ModItems.PAGAN_T5_INGOT.get()))
                .save(pWriter);


        // Logs to wood T1-T5
        
        
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PAGAN_T1_WOOD.get())
                .pattern("##")
                .pattern("##")
                .define('#', ModBlocks.PAGAN_T1_LOG.get())
                .unlockedBy(getHasName(ModBlocks.PAGAN_T1_LOG.get()), has(ModBlocks.PAGAN_T1_LOG.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PAGAN_T2_WOOD.get())
                .pattern("##")
                .pattern("##")
                .define('#', ModBlocks.PAGAN_T2_LOG.get())
                .unlockedBy(getHasName(ModBlocks.PAGAN_T2_LOG.get()), has(ModBlocks.PAGAN_T2_LOG.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PAGAN_T3_WOOD.get())
                .pattern("##")
                .pattern("##")
                .define('#', ModBlocks.PAGAN_T3_LOG.get())
                .unlockedBy(getHasName(ModBlocks.PAGAN_T3_LOG.get()), has(ModBlocks.PAGAN_T3_LOG.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PAGAN_T4_WOOD.get())
                .pattern("##")
                .pattern("##")
                .define('#', ModBlocks.PAGAN_T4_LOG.get())
                .unlockedBy(getHasName(ModBlocks.PAGAN_T4_LOG.get()), has(ModBlocks.PAGAN_T4_LOG.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PAGAN_T5_WOOD.get())
                .pattern("##")
                .pattern("##")
                .define('#', ModBlocks.PAGAN_T5_LOG.get())
                .unlockedBy(getHasName(ModBlocks.PAGAN_T5_LOG.get()), has(ModBlocks.PAGAN_T5_LOG.get()))
                .save(pWriter);


        // Logs to ore T1-T5
        
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PAGAN_T1_RAW_ORE.get())
                .pattern(" # ")
                .pattern("#$#")
                .pattern(" # ")
                .define('#', ModBlocks.PAGAN_T1_LOG.get())
                .define('$', ModItems.PAGAN_DUST.get())
                .unlockedBy(getHasName(ModBlocks.PAGAN_T1_LOG.get()), has(ModBlocks.PAGAN_T1_LOG.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PAGAN_T2_RAW_ORE.get())
                .pattern(" # ")
                .pattern("#$#")
                .pattern(" # ")
                .define('#', ModBlocks.PAGAN_T2_LOG.get())
                .define('$', ModItems.PAGAN_DUST.get())
                .unlockedBy(getHasName(ModBlocks.PAGAN_T2_LOG.get()), has(ModBlocks.PAGAN_T2_LOG.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PAGAN_T3_RAW_ORE.get())
                .pattern(" # ")
                .pattern("#$#")
                .pattern(" # ")
                .define('#', ModBlocks.PAGAN_T3_LOG.get())
                .define('$', ModItems.PAGAN_DUST.get())
                .unlockedBy(getHasName(ModBlocks.PAGAN_T3_LOG.get()), has(ModBlocks.PAGAN_T3_LOG.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PAGAN_T4_RAW_ORE.get())
                .pattern(" # ")
                .pattern("#$#")
                .pattern(" # ")
                .define('#', ModBlocks.PAGAN_T4_LOG.get())
                .define('$', ModItems.PAGAN_DUST.get())
                .unlockedBy(getHasName(ModBlocks.PAGAN_T4_LOG.get()), has(ModBlocks.PAGAN_T4_LOG.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PAGAN_T5_RAW_ORE.get())
                .pattern(" # ")
                .pattern("#$#")
                .pattern(" # ")
                .define('#', ModBlocks.PAGAN_T5_LOG.get())
                .define('$', ModItems.PAGAN_DUST.get())
                .unlockedBy(getHasName(ModBlocks.PAGAN_T5_LOG.get()), has(ModBlocks.PAGAN_T5_LOG.get()))
                .save(pWriter);


        // T5 Scrap to Ingot

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PAGAN_T5_INGOT.get())
                .pattern("###")
                .pattern("#$$")
                .pattern("$$ ")
                .define('#', ModItems.PAGAN_T5_SCRAP.get())
                .define('$', Items.NETHERITE_INGOT)
                .unlockedBy(getHasName(ModItems.PAGAN_T5_SCRAP.get()), has(ModItems.PAGAN_T5_SCRAP.get()))
                .save(pWriter);

        //SHAPELESS CRAFTING



        // LOGS TO PLANKS T1-T5

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PAGAN_T1_PLANKS.get(), 4)
                .requires(ModBlocks.PAGAN_T1_LOG.get())
                .unlockedBy(getHasName(ModBlocks.PAGAN_T1_LOG.get()), has(ModBlocks.PAGAN_T1_LOG.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PAGAN_T2_PLANKS.get(), 4)
                .requires(ModBlocks.PAGAN_T2_LOG.get())
                .unlockedBy(getHasName(ModBlocks.PAGAN_T2_LOG.get()), has(ModBlocks.PAGAN_T2_LOG.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PAGAN_T3_PLANKS.get(), 4)
                .requires(ModBlocks.PAGAN_T3_LOG.get())
                .unlockedBy(getHasName(ModBlocks.PAGAN_T3_LOG.get()), has(ModBlocks.PAGAN_T3_LOG.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PAGAN_T4_PLANKS.get(), 4)
                .requires(ModBlocks.PAGAN_T4_LOG.get())
                .unlockedBy(getHasName(ModBlocks.PAGAN_T4_LOG.get()), has(ModBlocks.PAGAN_T4_LOG.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PAGAN_T5_PLANKS.get(), 4)
                .requires(ModBlocks.PAGAN_T5_LOG.get())
                .unlockedBy(getHasName(ModBlocks.PAGAN_T5_LOG.get()), has(ModBlocks.PAGAN_T5_LOG.get()))
                .save(pWriter);

        // panicle to dust
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PAGAN_DUST.get(), 1)
                .requires(ModItems.PAGAN_CROP_YIELD.get())
                .unlockedBy(getHasName(ModItems.PAGAN_CROP_YIELD.get()), has(ModItems.PAGAN_CROP_YIELD.get()))
                .save(pWriter);

        // SMELTING

        oreSmelting(pWriter, PAGAN_T1_SMELTABLES, RecipeCategory.MISC, ModItems.PAGAN_T1_INGOT.get(), 0.15f, 400, "t1");
        oreSmelting(pWriter, PAGAN_T2_SMELTABLES, RecipeCategory.MISC, ModItems.PAGAN_T2_INGOT.get(), 0.25f, 512, "t2");
        oreSmelting(pWriter, PAGAN_T3_SMELTABLES, RecipeCategory.MISC, ModItems.PAGAN_T3_INGOT.get(), 0.30f, 1024, "t3");
        oreSmelting(pWriter, PAGAN_T4_SMELTABLES, RecipeCategory.MISC, ModItems.PAGAN_T4_INGOT.get(), 0.45f, 1536, "t4");
        oreSmelting(pWriter, PAGAN_T5_SMELTABLES, RecipeCategory.MISC, ModItems.PAGAN_T5_SCRAP.get(), 0.50f, 2048, "t5");

        oreBlasting(pWriter, PAGAN_T1_SMELTABLES, RecipeCategory.MISC, ModItems.PAGAN_T1_INGOT.get(), 0.15f, 400, "t1");
        oreBlasting(pWriter, PAGAN_T2_SMELTABLES, RecipeCategory.MISC, ModItems.PAGAN_T2_INGOT.get(), 0.25f, 512, "t2");
        oreBlasting(pWriter, PAGAN_T3_SMELTABLES, RecipeCategory.MISC, ModItems.PAGAN_T3_INGOT.get(), 0.30f, 1024, "t3");
        oreBlasting(pWriter, PAGAN_T4_SMELTABLES, RecipeCategory.MISC, ModItems.PAGAN_T4_INGOT.get(), 0.45f, 1536, "t4");
        oreBlasting(pWriter, PAGAN_T5_SMELTABLES, RecipeCategory.MISC, ModItems.PAGAN_T5_SCRAP.get(), 0.50f, 2048, "t5");
        
        

    }



    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for (ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience,
                    pCookingTime, pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike),
                    has(itemlike)).save(pFinishedRecipeConsumer, TheDarkCarnival.MOD_ID + ":" +
                    getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }

}
