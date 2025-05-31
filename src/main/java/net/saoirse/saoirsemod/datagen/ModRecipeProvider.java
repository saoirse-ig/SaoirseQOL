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

        // t1 logs to t1 wood
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PAGAN_T1_WOOD.get())
                .pattern("##")
                .pattern("##")
                .define('#', ModBlocks.PAGAN_T1_LOG.get())
                .unlockedBy(getHasName(ModBlocks.PAGAN_T1_LOG.get()), has(ModBlocks.PAGAN_T1_LOG.get()))
                .save(pWriter);

        // Dust to t1 sapling
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PAGAN_T1_SAPLING.get())
                .pattern("#$")
                .define('$', ModItems.PAGAN_DUST.get())
                .define('#', Ingredient.of(ItemTags.SAPLINGS))
                .unlockedBy(getHasName(ModItems.PAGAN_DUST.get()), has(ModItems.PAGAN_DUST.get()))
                .save(pWriter);


        //SHAPELESS CRAFTING

        // t1 log to t1 planks
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PAGAN_T1_PLANKS.get(), 4)
                .requires(ModBlocks.PAGAN_T1_LOG.get())
                .unlockedBy(getHasName(ModBlocks.PAGAN_T1_LOG.get()), has(ModBlocks.PAGAN_T1_LOG.get()))
                .save(pWriter);

        // t2 log to t2 planks
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PAGAN_T2_PLANKS.get(), 4)
                .requires(ModBlocks.PAGAN_T2_LOG.get())
                .unlockedBy(getHasName(ModBlocks.PAGAN_T2_LOG.get()), has(ModBlocks.PAGAN_T2_LOG.get()))
                .save(pWriter);

        // panicle to dust
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PAGAN_DUST.get(), 1)
                .requires(ModItems.PAGAN_CROP_YIELD.get())
                .unlockedBy(getHasName(ModItems.PAGAN_CROP_YIELD.get()), has(ModItems.PAGAN_CROP_YIELD.get()))
                .save(pWriter);

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
