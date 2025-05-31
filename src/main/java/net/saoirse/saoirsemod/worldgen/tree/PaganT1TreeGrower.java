package net.saoirse.saoirsemod.worldgen.tree;

import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.saoirse.saoirsemod.worldgen.ModConfiguredFeatures;

import javax.annotation.Nullable;

public class PaganT1TreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource pRandom, boolean pHasFlowers){
        return ModConfiguredFeatures.PAGAN_T1_KEY;
    }
}
