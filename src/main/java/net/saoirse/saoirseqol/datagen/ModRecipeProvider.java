package net.saoirse.saoirseqol.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.saoirse.saoirseqol.SaoirseQOL;
import net.saoirse.saoirseqol.block.ModBlocks;
import net.saoirse.saoirseqol.item.ModItems;

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

    private static final List<ItemLike> SAOIRSE_QOL_SMELTABLES = List.of(

    );


    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

/*

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

*/

        //SHAPED CRAFTING

        //SHAPELESS CRAFTING

        // SMELTING



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
                    has(itemlike)).save(pFinishedRecipeConsumer, SaoirseQOL.MOD_ID + ":" +
                    getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }

}
