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
    public static final Tier DRUID = TierSortingRegistry.registerTier(
            new ForgeTier(0, 73, 2f,
                    0, 15,
                    ModTags.Blocks.NEEDS_DRUID_TOOL, () ->
                    Ingredient.of(ModItems.PAGAN_SEEDS.get())),
            ResourceLocation.fromNamespaceAndPath(TheDarkCarnival.MOD_ID, "pagan_seeds"),
            List.of(Tiers.WOOD),
            List.of());

}
