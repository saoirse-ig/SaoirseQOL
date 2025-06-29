package net.saoirse.saoirseqol.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.saoirse.saoirseqol.SaoirseQOL;
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

    private static final List<ItemLike> SAOIRSE_QOL_SMELTABLES_DIAMOND = List.of(

            Items.DIAMOND_AXE,
            Items.DIAMOND_HOE,
            Items.DIAMOND_PICKAXE,
            Items.DIAMOND_SHOVEL,
            Items.DIAMOND_SWORD,

            Items.DIAMOND_HELMET,
            Items.DIAMOND_CHESTPLATE,
            Items.DIAMOND_LEGGINGS,
            Items.DIAMOND_BOOTS

    );

    private static final List<ItemLike> SAOIRSE_QOL_SMELTABLES_LEATHER = List.of(

            Items.ROTTEN_FLESH

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


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.DIAMOND)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.DIAMOND_NUGGET.get())
                .unlockedBy(getHasName(ModItems.DIAMOND_NUGGET.get()), has(ModItems.DIAMOND_NUGGET.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.CHAINMAIL_HELMET)
                .pattern("###")
                .pattern("# #")
                .define('#', Items.IRON_NUGGET)
                .unlockedBy(getHasName(Items.IRON_NUGGET), has(Items.IRON_NUGGET))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.CHAINMAIL_CHESTPLATE)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .define('#', Items.IRON_NUGGET)
                .unlockedBy(getHasName(Items.IRON_NUGGET), has(Items.IRON_NUGGET))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.CHAINMAIL_LEGGINGS)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .define('#', Items.IRON_NUGGET)
                .unlockedBy(getHasName(Items.IRON_NUGGET), has(Items.IRON_NUGGET))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.CHAINMAIL_BOOTS)
                .pattern("# #")
                .pattern("# #")
                .define('#', Items.IRON_NUGGET)
                .unlockedBy(getHasName(Items.IRON_NUGGET), has(Items.IRON_NUGGET))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WOOD_TO_STONE_SMITHING_TEMPLATE.get())
                .pattern("#$#")
                .pattern("###")
                .pattern("###")
                .define('$', ItemTags.LOGS)
                .define('#', Items.STONE)
                .unlockedBy(
                        getHasName(ModItems.WOOD_TO_STONE_SMITHING_TEMPLATE.get()),
                        has(ModItems.WOOD_TO_STONE_SMITHING_TEMPLATE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LEATHER_TO_CHAINMAIL_SMITHING_TEMPLATE.get())
                .pattern("#$#")
                .pattern("###")
                .pattern("###")
                .define('$', Items.LEATHER)
                .define('#', Items.IRON_NUGGET)
                .unlockedBy(
                        getHasName(Items.LEATHER),
                        has(Items.LEATHER))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STONE_GOLD_CHAINMAIL_TO_IRON_SMITHING_TEMPLATE.get())
                .pattern("#$#")
                .pattern("###")
                .pattern("###")
                .define('$', Items.GOLD_INGOT)
                .define('#', Items.IRON_INGOT)
                .unlockedBy(
                        getHasName(ModItems.STONE_GOLD_CHAINMAIL_TO_IRON_SMITHING_TEMPLATE.get()),
                        has(ModItems.STONE_GOLD_CHAINMAIL_TO_IRON_SMITHING_TEMPLATE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.IRON_TO_DIAMOND_SMITHING_TEMPLATE.get())
                .pattern("#$#")
                .pattern("###")
                .pattern("###")
                .define('$', Items.IRON_INGOT)
                .define('#', ModItems.DIAMOND_NUGGET.get())
                .unlockedBy(
                        getHasName(ModItems.IRON_TO_DIAMOND_SMITHING_TEMPLATE.get()),
                        has(ModItems.IRON_TO_DIAMOND_SMITHING_TEMPLATE.get()))
                .save(pWriter);

        //SHAPELESS CRAFTING

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.LEAD, 1)
                .requires(Items.STRING)
                .requires(Items.SLIME_BALL)
                .unlockedBy(getHasName(Items.SLIME_BALL), has(Items.SLIME_BALL))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.DIAMOND_NUGGET.get(), 9)
                .requires(Items.DIAMOND)
                .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.NAME_TAG, 1)
                .requires(Items.STRING)
                .requires(Items.PAPER)
                .requires(Items.INK_SAC)
                .unlockedBy(getHasName(Items.INK_SAC), has(Items.INK_SAC))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.STRING, 4)
                .requires(ItemTags.WOOL)
                .unlockedBy(getHasName(Blocks.WHITE_WOOL), has(Blocks.WHITE_WOOL))
                .save(pWriter);

        // SMITHING TEMPLATES
        // WEAPONS / TOOLS

        // Wood to Stone
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.WOOD_TO_STONE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.WOODEN_AXE),
                        Ingredient.of(Items.STONE),
                        RecipeCategory.COMBAT,
                        Items.STONE_AXE)
                .unlocks("has_stone", has(Items.STONE))
                .save(pWriter, ResourceLocation.fromNamespaceAndPath(SaoirseQOL.MOD_ID, "wooden_axe_to_stone_axe_upgrade"));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.WOOD_TO_STONE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.WOODEN_HOE),
                        Ingredient.of(Items.STONE),
                        RecipeCategory.COMBAT,
                        Items.STONE_HOE)
                .unlocks("has_stone", has(Items.STONE))
                .save(pWriter, ResourceLocation.fromNamespaceAndPath(SaoirseQOL.MOD_ID, "wooden_hoe_to_stone_hoe_upgrade"));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.WOOD_TO_STONE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.WOODEN_PICKAXE),
                        Ingredient.of(Items.STONE),
                        RecipeCategory.COMBAT,
                        Items.STONE_PICKAXE)
                .unlocks("has_stone", has(Items.STONE))
                .save(pWriter, ResourceLocation.fromNamespaceAndPath(SaoirseQOL.MOD_ID, "wooden_pickaxe_to_stone_pickaxe_upgrade"));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.WOOD_TO_STONE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.WOODEN_SHOVEL),
                        Ingredient.of(Items.STONE),
                        RecipeCategory.COMBAT,
                        Items.STONE_SHOVEL)
                .unlocks("has_stone", has(Items.STONE))
                .save(pWriter, ResourceLocation.fromNamespaceAndPath(SaoirseQOL.MOD_ID, "wooden_shovel_to_stone_shovel_upgrade"));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.WOOD_TO_STONE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.WOODEN_SWORD),
                        Ingredient.of(Items.STONE),
                        RecipeCategory.COMBAT,
                        Items.STONE_SWORD)
                .unlocks("has_stone", has(Items.STONE))
                .save(pWriter, ResourceLocation.fromNamespaceAndPath(SaoirseQOL.MOD_ID, "wooden_sword_to_stone_sword_upgrade"));


        //Stone to Iron
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.STONE_GOLD_CHAINMAIL_TO_IRON_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.STONE_AXE),
                        Ingredient.of(Items.IRON_INGOT),
                        RecipeCategory.COMBAT,
                        Items.IRON_AXE)
                .unlocks("has_iron", has(Items.IRON_INGOT))
                .save(pWriter, ResourceLocation.fromNamespaceAndPath(SaoirseQOL.MOD_ID, "stone_axe_to_iron_axe_upgrade"));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.STONE_GOLD_CHAINMAIL_TO_IRON_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.STONE_HOE),
                        Ingredient.of(Items.IRON_INGOT),
                        RecipeCategory.COMBAT,
                        Items.IRON_HOE)
                .unlocks("has_iron", has(Items.IRON_INGOT))
                .save(pWriter, ResourceLocation.fromNamespaceAndPath(SaoirseQOL.MOD_ID, "stone_hoe_to_iron_hoe_upgrade"));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.STONE_GOLD_CHAINMAIL_TO_IRON_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.STONE_PICKAXE),
                        Ingredient.of(Items.IRON_INGOT),
                        RecipeCategory.COMBAT,
                        Items.IRON_PICKAXE)
                .unlocks("has_iron", has(Items.IRON_INGOT))
                .save(pWriter, ResourceLocation.fromNamespaceAndPath(SaoirseQOL.MOD_ID, "stone_pickaxe_to_iron_pickaxe_upgrade"));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.STONE_GOLD_CHAINMAIL_TO_IRON_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.STONE_SHOVEL),
                        Ingredient.of(Items.IRON_INGOT),
                        RecipeCategory.COMBAT,
                        Items.IRON_SHOVEL)
                .unlocks("has_iron", has(Items.IRON_INGOT))
                .save(pWriter, ResourceLocation.fromNamespaceAndPath(SaoirseQOL.MOD_ID, "stone_shovel_to_iron_shovel_upgrade"));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.STONE_GOLD_CHAINMAIL_TO_IRON_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.STONE_SWORD),
                        Ingredient.of(Items.IRON_INGOT),
                        RecipeCategory.COMBAT,
                        Items.IRON_SWORD)
                .unlocks("has_iron", has(Items.IRON_INGOT))
                .save(pWriter, ResourceLocation.fromNamespaceAndPath(SaoirseQOL.MOD_ID, "stone_sword_to_iron_sword_upgrade"));

        // Gold to Iron

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.STONE_GOLD_CHAINMAIL_TO_IRON_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.GOLDEN_AXE),
                        Ingredient.of(Items.IRON_INGOT),
                        RecipeCategory.COMBAT,
                        Items.IRON_AXE)
                .unlocks("has_iron", has(Items.IRON_INGOT))
                .save(pWriter, ResourceLocation.fromNamespaceAndPath(SaoirseQOL.MOD_ID, "golden_axe_to_iron_axe_upgrade"));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.STONE_GOLD_CHAINMAIL_TO_IRON_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.GOLDEN_HOE),
                        Ingredient.of(Items.IRON_INGOT),
                        RecipeCategory.COMBAT,
                        Items.IRON_HOE)
                .unlocks("has_iron", has(Items.IRON_INGOT))
                .save(pWriter, ResourceLocation.fromNamespaceAndPath(SaoirseQOL.MOD_ID, "golden_hoe_to_iron_hoe_upgrade"));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.STONE_GOLD_CHAINMAIL_TO_IRON_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.GOLDEN_PICKAXE),
                        Ingredient.of(Items.IRON_INGOT),
                        RecipeCategory.COMBAT,
                        Items.IRON_PICKAXE)
                .unlocks("has_iron", has(Items.IRON_INGOT))
                .save(pWriter, ResourceLocation.fromNamespaceAndPath(SaoirseQOL.MOD_ID, "golden_pickaxe_to_iron_pickaxe_upgrade"));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.STONE_GOLD_CHAINMAIL_TO_IRON_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.GOLDEN_SHOVEL),
                        Ingredient.of(Items.IRON_INGOT),
                        RecipeCategory.COMBAT,
                        Items.IRON_SHOVEL)
                .unlocks("has_iron", has(Items.IRON_INGOT))
                .save(pWriter, ResourceLocation.fromNamespaceAndPath(SaoirseQOL.MOD_ID, "golden_shovel_to_iron_shovel_upgrade"));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.STONE_GOLD_CHAINMAIL_TO_IRON_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.GOLDEN_SWORD),
                        Ingredient.of(Items.IRON_INGOT),
                        RecipeCategory.COMBAT,
                        Items.IRON_SWORD)
                .unlocks("has_iron", has(Items.IRON_INGOT))
                .save(pWriter, ResourceLocation.fromNamespaceAndPath(SaoirseQOL.MOD_ID, "golden_sword_to_iron_shovel_upgrade"));

        // Iron to Diamond

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.IRON_TO_DIAMOND_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.IRON_AXE),
                        Ingredient.of(Items.DIAMOND),
                        RecipeCategory.COMBAT,
                        Items.DIAMOND_AXE)
                .unlocks("has_diamond", has(Items.DIAMOND))
                .save(pWriter, ResourceLocation.fromNamespaceAndPath(SaoirseQOL.MOD_ID, "iron_axe_to_diamond_axe_upgrade"));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.IRON_TO_DIAMOND_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.IRON_HOE),
                        Ingredient.of(Items.DIAMOND),
                        RecipeCategory.COMBAT,
                        Items.DIAMOND_HOE)
                .unlocks("has_diamond", has(Items.DIAMOND))
                .save(pWriter, ResourceLocation.fromNamespaceAndPath(SaoirseQOL.MOD_ID, "iron_hoe_to_diamond_hoe_upgrade"));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.IRON_TO_DIAMOND_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.IRON_PICKAXE),
                        Ingredient.of(Items.DIAMOND),
                        RecipeCategory.COMBAT,
                        Items.DIAMOND_PICKAXE)
                .unlocks("has_diamond", has(Items.DIAMOND))
                .save(pWriter, ResourceLocation.fromNamespaceAndPath(SaoirseQOL.MOD_ID, "iron_pickaxe_to_diamond_pickaxe_upgrade"));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.IRON_TO_DIAMOND_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.IRON_SHOVEL),
                        Ingredient.of(Items.DIAMOND),
                        RecipeCategory.COMBAT,
                        Items.DIAMOND_SHOVEL)
                .unlocks("has_diamond", has(Items.DIAMOND))
                .save(pWriter, ResourceLocation.fromNamespaceAndPath(SaoirseQOL.MOD_ID, "iron_shovel_to_diamond_shovel_upgrade"));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.IRON_TO_DIAMOND_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.IRON_SWORD),
                        Ingredient.of(Items.DIAMOND),
                        RecipeCategory.COMBAT,
                        Items.DIAMOND_SWORD)
                .unlocks("has_diamond", has(Items.DIAMOND))
                .save(pWriter, ResourceLocation.fromNamespaceAndPath(SaoirseQOL.MOD_ID, "iron_sword_to_diamond_sword_upgrade"));




        // ARMOR

        // Leather to Chainmail

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.LEATHER_TO_CHAINMAIL_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.LEATHER_HELMET),
                        Ingredient.of(Items.IRON_NUGGET),
                        RecipeCategory.COMBAT,
                        Items.CHAINMAIL_HELMET)
                .unlocks("has_iron_nugget", has(Items.IRON_NUGGET))
                .save(pWriter, ResourceLocation.fromNamespaceAndPath(SaoirseQOL.MOD_ID, "leather_helmet_to_chainmail_helmet_upgrade"));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.LEATHER_TO_CHAINMAIL_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.LEATHER_CHESTPLATE),
                        Ingredient.of(Items.IRON_NUGGET),
                        RecipeCategory.COMBAT,
                        Items.CHAINMAIL_CHESTPLATE)
                .unlocks("has_iron_nugget", has(Items.IRON_NUGGET))
                .save(pWriter, ResourceLocation.fromNamespaceAndPath(SaoirseQOL.MOD_ID, "leather_chestplate_to_chainmail_chestplate_upgrade"));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.LEATHER_TO_CHAINMAIL_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.LEATHER_LEGGINGS),
                        Ingredient.of(Items.IRON_NUGGET),
                        RecipeCategory.COMBAT,
                        Items.CHAINMAIL_LEGGINGS)
                .unlocks("has_iron_nugget", has(Items.IRON_NUGGET))
                .save(pWriter, ResourceLocation.fromNamespaceAndPath(SaoirseQOL.MOD_ID, "leather_leggings_to_chainmail_leggings_upgrade"));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.LEATHER_TO_CHAINMAIL_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.LEATHER_BOOTS),
                        Ingredient.of(Items.IRON_NUGGET),
                        RecipeCategory.COMBAT,
                        Items.CHAINMAIL_BOOTS)
                .unlocks("has_iron_nugget", has(Items.IRON_NUGGET))
                .save(pWriter, ResourceLocation.fromNamespaceAndPath(SaoirseQOL.MOD_ID, "leather_boots_to_chainmail_boots_upgrade"));


        // Chainmail to Iron

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.STONE_GOLD_CHAINMAIL_TO_IRON_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.CHAINMAIL_HELMET),
                        Ingredient.of(Items.IRON_INGOT),
                        RecipeCategory.COMBAT,
                        Items.IRON_HELMET)
                .unlocks("has_iron", has(Items.IRON_INGOT))
                .save(pWriter, ResourceLocation.fromNamespaceAndPath(SaoirseQOL.MOD_ID, "chainmail_helmet_to_iron_helmet_upgrade"));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.STONE_GOLD_CHAINMAIL_TO_IRON_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.CHAINMAIL_CHESTPLATE),
                        Ingredient.of(Items.IRON_INGOT),
                        RecipeCategory.COMBAT,
                        Items.IRON_CHESTPLATE)
                .unlocks("has_iron", has(Items.IRON_INGOT))
                .save(pWriter, ResourceLocation.fromNamespaceAndPath(SaoirseQOL.MOD_ID, "chainmail_chestplate_to_iron_chestplate_upgrade"));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.STONE_GOLD_CHAINMAIL_TO_IRON_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.CHAINMAIL_LEGGINGS),
                        Ingredient.of(Items.IRON_INGOT),
                        RecipeCategory.COMBAT,
                        Items.IRON_LEGGINGS)
                .unlocks("has_iron", has(Items.IRON_INGOT))
                .save(pWriter, ResourceLocation.fromNamespaceAndPath(SaoirseQOL.MOD_ID, "chainmail_leggings_to_iron_leggings_upgrade"));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.STONE_GOLD_CHAINMAIL_TO_IRON_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.CHAINMAIL_BOOTS),
                        Ingredient.of(Items.IRON_INGOT),
                        RecipeCategory.COMBAT,
                        Items.IRON_BOOTS)
                .unlocks("has_iron", has(Items.IRON_INGOT))
                .save(pWriter, ResourceLocation.fromNamespaceAndPath(SaoirseQOL.MOD_ID, "chainmail_boots_to_iron_boots_upgrade"));

        // Iron to Diamond

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.IRON_TO_DIAMOND_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.IRON_HELMET),
                        Ingredient.of(Items.DIAMOND),
                        RecipeCategory.COMBAT,
                        Items.DIAMOND_HELMET)
                .unlocks("has_diamond", has(Items.DIAMOND))
                .save(pWriter, ResourceLocation.fromNamespaceAndPath(SaoirseQOL.MOD_ID, "iron_helmet_to_diamond_helmet_upgrade"));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.IRON_TO_DIAMOND_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.IRON_CHESTPLATE),
                        Ingredient.of(Items.DIAMOND),
                        RecipeCategory.COMBAT,
                        Items.DIAMOND_CHESTPLATE)
                .unlocks("has_diamond", has(Items.DIAMOND))
                .save(pWriter, ResourceLocation.fromNamespaceAndPath(SaoirseQOL.MOD_ID, "iron_chestplate_to_diamond_chestplate_upgrade"));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.IRON_TO_DIAMOND_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.IRON_LEGGINGS),
                        Ingredient.of(Items.DIAMOND),
                        RecipeCategory.COMBAT,
                        Items.DIAMOND_LEGGINGS)
                .unlocks("has_diamond", has(Items.DIAMOND))
                .save(pWriter, ResourceLocation.fromNamespaceAndPath(SaoirseQOL.MOD_ID, "iron_leggings_to_diamond_leggings_upgrade"));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.IRON_TO_DIAMOND_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.IRON_BOOTS),
                        Ingredient.of(Items.DIAMOND),
                        RecipeCategory.COMBAT,
                        Items.DIAMOND_BOOTS)
                .unlocks("has_diamond", has(Items.DIAMOND))
                .save(pWriter, ResourceLocation.fromNamespaceAndPath(SaoirseQOL.MOD_ID, "iron_boots_to_diamond_boots_upgrade"));



        // SMELTING

        oreSmelting(pWriter, SAOIRSE_QOL_SMELTABLES_DIAMOND,
                RecipeCategory.MISC, ModItems.DIAMOND_NUGGET.get(),
                0.15f,
                400,
                "diamond_to_diamond_nuggets");

        oreSmelting(pWriter,SAOIRSE_QOL_SMELTABLES_LEATHER,
                RecipeCategory.MISC,
                Items.LEATHER,
                0.15f,
                400,
                "rotten_flesh_to_leather");

        oreSmoking(pWriter, SAOIRSE_QOL_SMELTABLES_LEATHER,
                RecipeCategory.MISC,
                Items.LEATHER,
                0.15f,
                200,
                "rotten_flesh_to_leather");
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreSmoking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup){
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMOKING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_smoking");
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
