package net.saoirse.saoirsemod.worldgen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.saoirse.saoirsemod.TheDarkCarnival;

import java.util.List;

public class ModPlacedFeatures {

    public static final ResourceKey<PlacedFeature> PAGAN_PLACED_KEY = registerKey("pagan_placed");
    public static final ResourceKey<PlacedFeature> PAGAN_T2_PLACED_KEY = registerKey("pagan_t2_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        // Register both tree variants
        register(context, PAGAN_PLACED_KEY,
                configuredFeatures.getOrThrow(ModConfiguredFeatures.PAGAN_KEY),
                VegetationPlacements.treePlacement(
                        PlacementUtils.countExtra(1, 0.1f, 1)));

        register(context, PAGAN_T2_PLACED_KEY,
                configuredFeatures.getOrThrow(ModConfiguredFeatures.PAGAN_T2_KEY),
                VegetationPlacements.treePlacement(
                        PlacementUtils.countExtra(1, 0.05f, 1))); // Slightly rarer than regular pagan
    }


    private static ResourceKey<PlacedFeature> registerKey(String name){
        return ResourceKey.create(Registries.PLACED_FEATURE,
                ResourceLocation.fromNamespaceAndPath(TheDarkCarnival.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key,
                                 Holder<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers){
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
