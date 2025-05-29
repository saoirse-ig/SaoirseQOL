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

        this.dropSelf(ModBlocks.PAGAN_SAPLING.get());
        this.dropSelf(ModBlocks.PAGAN_LOG.get());
        this.dropSelf(ModBlocks.PAGAN_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_PAGAN_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_PAGAN_LOG.get());
        this.dropSelf(ModBlocks.PAGAN_PLANKS.get());

        this.add(ModBlocks.PAGAN_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.PAGAN_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES)); //change riddlebox to sapling


        this.dropSelf(ModBlocks.PAGAN_T2_SAPLING.get());
        this.dropSelf(ModBlocks.PAGAN_T2_LOG.get());
        this.dropSelf(ModBlocks.PAGAN_T2_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_PAGAN_T2_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_PAGAN_T2_LOG.get());
        this.dropSelf(ModBlocks.PAGAN_T2_PLANKS.get());

        this.add(ModBlocks.PAGAN_T2_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.PAGAN_T2_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES)); //change riddlebox to sapling


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
