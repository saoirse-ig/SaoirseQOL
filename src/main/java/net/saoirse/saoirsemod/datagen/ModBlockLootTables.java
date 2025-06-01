package net.saoirse.saoirsemod.datagen;

import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.registries.RegistryObject;
import net.saoirse.saoirsemod.block.ModBlocks;
import net.saoirse.saoirsemod.block.custom.PaganCropBlock;
import net.saoirse.saoirsemod.item.ModItems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    protected ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

        this.dropSelf(ModBlocks.RIDDLE_BOX.get());



        this.dropSelf(ModBlocks.PAGAN_T1_SAPLING.get());
        this.dropSelf(ModBlocks.PAGAN_T2_SAPLING.get());
        this.dropSelf(ModBlocks.PAGAN_T3_SAPLING.get());
        this.dropSelf(ModBlocks.PAGAN_T4_SAPLING.get());
        this.dropSelf(ModBlocks.PAGAN_T5_SAPLING.get());

        this.dropSelf(ModBlocks.PAGAN_T1_LOG.get());
        this.dropSelf(ModBlocks.PAGAN_T2_LOG.get());
        this.dropSelf(ModBlocks.PAGAN_T3_LOG.get());
        this.dropSelf(ModBlocks.PAGAN_T4_LOG.get());
        this.dropSelf(ModBlocks.PAGAN_T5_LOG.get());

        this.dropSelf(ModBlocks.PAGAN_T1_WOOD.get());
        this.dropSelf(ModBlocks.PAGAN_T2_WOOD.get());
        this.dropSelf(ModBlocks.PAGAN_T3_WOOD.get());
        this.dropSelf(ModBlocks.PAGAN_T4_WOOD.get());
        this.dropSelf(ModBlocks.PAGAN_T5_WOOD.get());

        this.dropSelf(ModBlocks.STRIPPED_PAGAN_T1_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_PAGAN_T2_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_PAGAN_T3_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_PAGAN_T4_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_PAGAN_T5_WOOD.get());

        this.dropSelf(ModBlocks.STRIPPED_PAGAN_T1_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_PAGAN_T2_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_PAGAN_T3_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_PAGAN_T4_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_PAGAN_T5_LOG.get());

        this.dropSelf(ModBlocks.PAGAN_T1_PLANKS.get());
        this.dropSelf(ModBlocks.PAGAN_T2_PLANKS.get());
        this.dropSelf(ModBlocks.PAGAN_T3_PLANKS.get());
        this.dropSelf(ModBlocks.PAGAN_T4_PLANKS.get());
        this.dropSelf(ModBlocks.PAGAN_T5_PLANKS.get());

        this.dropSelf(ModBlocks.PAGAN_T1_BLOCK.get());
        this.dropSelf(ModBlocks.PAGAN_T2_BLOCK.get());
        this.dropSelf(ModBlocks.PAGAN_T3_BLOCK.get());
        this.dropSelf(ModBlocks.PAGAN_T4_BLOCK.get());
        this.dropSelf(ModBlocks.PAGAN_T5_BLOCK.get());




        this.add(ModBlocks.PAGAN_T1_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.PAGAN_T1_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(ModBlocks.PAGAN_T2_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.PAGAN_T2_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(ModBlocks.PAGAN_T3_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.PAGAN_T3_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(ModBlocks.PAGAN_T4_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.PAGAN_T4_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(ModBlocks.PAGAN_T5_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.PAGAN_T5_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));


        this.dropOther(ModBlocks.GROWTH_TOTEM_BLOCK.get(), ModItems.PAGAN_DUST.get());



        LootItemCondition.Builder lootitemcondition$builder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.PAGAN_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(PaganCropBlock.AGE, 7));

        this.add(ModBlocks.PAGAN_CROP.get(), createCropDrops(ModBlocks.PAGAN_CROP.get(),
                ModItems.PAGAN_CROP_YIELD.get(),
                ModItems.PAGAN_SEEDS.get(), lootitemcondition$builder));

        //ore implementation
        /*
        this.add(ModBlocks.TEMP_ORE.get(),
         block -> createRedstoneOreDrops(ModBlocks.TEMP_ORE.get(),
         ModItems.RAW_TEMP_ORE.get()));
        */
    }

    @Override
    protected Iterable<Block> getKnownBlocks(){
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
