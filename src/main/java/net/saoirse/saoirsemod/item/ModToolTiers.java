package net.saoirse.saoirsemod.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.saoirse.saoirsemod.TheDarkCarnival;
import net.saoirse.saoirsemod.util.ModTags;

import java.util.List;

public class ModToolTiers {

    // T1 / STONE
    public static final Tier T1 = TierSortingRegistry.registerTier(
            new ForgeTier(1, 174, 4.0f,
                    1.0f, 17,
                    ModTags.Blocks.NEEDS_T1_TOOL, () ->
                    Ingredient.of(ModItems.PAGAN_T1_INGOT.get())),
            ResourceLocation.fromNamespaceAndPath(TheDarkCarnival.MOD_ID, "pagan_t1_ingot"),
            List.of(Tiers.STONE),
            List.of());

    // T2 / IRON
    public static final Tier T2 = TierSortingRegistry.registerTier(
            new ForgeTier(2, 333, 6.0f,
                    2.0f, 15,
                    ModTags.Blocks.NEEDS_T2_TOOL, () ->
                    Ingredient.of(ModItems.PAGAN_T2_INGOT.get())),
            ResourceLocation.fromNamespaceAndPath(TheDarkCarnival.MOD_ID, "pagan_t2_ingot"),
            List.of(Tiers.IRON),
            List.of());

    // T3 / DIAMOND
    public static final Tier T3 = TierSortingRegistry.registerTier(
            new ForgeTier(3, 2081, 8.0f,
                    3.0f, 19,
                    ModTags.Blocks.NEEDS_T3_TOOL, () ->
                    Ingredient.of(ModItems.PAGAN_T3_INGOT.get())),
            ResourceLocation.fromNamespaceAndPath(TheDarkCarnival.MOD_ID, "pagan_t3_ingot"),
            List.of(Tiers.DIAMOND),
            List.of());

    // T4 / GOLD
    public static final Tier T4 = TierSortingRegistry.registerTier(
            new ForgeTier(0, 42, 12.0f,
                    0.0f, 25,
                    ModTags.Blocks.NEEDS_T4_TOOL, () ->
                    Ingredient.of(ModItems.PAGAN_T4_INGOT.get())),
            ResourceLocation.fromNamespaceAndPath(TheDarkCarnival.MOD_ID, "pagan_t4_ingot"),
            List.of(Tiers.GOLD),
            List.of());

    // T5 / NETHERITE
    public static final Tier T5 = TierSortingRegistry.registerTier(
            new ForgeTier(4, 2708, 9.0f,
                    4.0f, 19,
                    ModTags.Blocks.NEEDS_T5_TOOL, () ->
                    Ingredient.of(ModItems.PAGAN_T5_INGOT.get())),
            ResourceLocation.fromNamespaceAndPath(TheDarkCarnival.MOD_ID, "pagan_t5_ingot"),
            List.of(Tiers.NETHERITE),
            List.of());
}
