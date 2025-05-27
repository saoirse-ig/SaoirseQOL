package net.saoirse.saoirsemod.datagen;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.saoirse.saoirsemod.block.ModBlocks;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    protected ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.RIDDLE_BOX.get());



        //ore implementation
        /*
        this.add(ModBlocks.TEMP_ORE.get(),
         block -> createRedstoneOreDrops(ModBlocks.TEMP_ORE.get(),
         ModItems.RAW_TEMP_ORE.get()));
        */
    }


    protected Iterable<Block> getKnowBlocks(){
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
