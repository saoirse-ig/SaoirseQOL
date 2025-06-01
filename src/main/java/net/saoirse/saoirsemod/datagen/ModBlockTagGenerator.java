package net.saoirse.saoirsemod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.saoirse.saoirsemod.TheDarkCarnival;
import net.saoirse.saoirsemod.block.ModBlocks;
import net.saoirse.saoirsemod.item.ModToolTiers;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {


    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider
            , @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TheDarkCarnival.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {



        this.tag(BlockTags.NEEDS_STONE_TOOL)

                .add(ModBlocks.PAGAN_T1_LOG.get())
                .add(ModBlocks.PAGAN_T2_LOG.get())

                .add(ModBlocks.PAGAN_T1_WOOD.get())
                .add(ModBlocks.PAGAN_T2_WOOD.get())

                .add(ModBlocks.PAGAN_T1_PLANKS.get())
                .add(ModBlocks.PAGAN_T2_PLANKS.get())

                .add(ModBlocks.STRIPPED_PAGAN_T1_LOG.get())
                .add(ModBlocks.STRIPPED_PAGAN_T2_LOG.get())

                .add(ModBlocks.STRIPPED_PAGAN_T1_WOOD.get())
                .add(ModBlocks.STRIPPED_PAGAN_T2_WOOD.get())

                ;

        this.tag(BlockTags.NEEDS_IRON_TOOL)

                .add(ModBlocks.PAGAN_T3_LOG.get())
                .add(ModBlocks.PAGAN_T4_LOG.get())

                .add(ModBlocks.PAGAN_T3_WOOD.get())
                .add(ModBlocks.PAGAN_T4_WOOD.get())

                .add(ModBlocks.PAGAN_T3_PLANKS.get())
                .add(ModBlocks.PAGAN_T4_PLANKS.get())

                .add(ModBlocks.STRIPPED_PAGAN_T3_LOG.get())
                .add(ModBlocks.STRIPPED_PAGAN_T4_LOG.get())

                .add(ModBlocks.STRIPPED_PAGAN_T3_WOOD.get())
                .add(ModBlocks.STRIPPED_PAGAN_T4_WOOD.get())

                ;

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)

                .add(ModBlocks.PAGAN_T5_LOG.get())
                .add(ModBlocks.PAGAN_T5_WOOD.get())
                .add(ModBlocks.PAGAN_T5_PLANKS.get())
                .add(ModBlocks.STRIPPED_PAGAN_T5_LOG.get())
                .add(ModBlocks.STRIPPED_PAGAN_T5_WOOD.get())

                ;



        this.tag(BlockTags.MINEABLE_WITH_AXE)

                .add(ModBlocks.GROWTH_TOTEM_BLOCK.get())

                .add(ModBlocks.PAGAN_T1_LOG.get())
                .add(ModBlocks.PAGAN_T2_LOG.get())
                .add(ModBlocks.PAGAN_T3_LOG.get())
                .add(ModBlocks.PAGAN_T4_LOG.get())
                .add(ModBlocks.PAGAN_T5_LOG.get())

                .add(ModBlocks.PAGAN_T1_WOOD.get())
                .add(ModBlocks.PAGAN_T2_WOOD.get())
                .add(ModBlocks.PAGAN_T3_WOOD.get())
                .add(ModBlocks.PAGAN_T4_WOOD.get())
                .add(ModBlocks.PAGAN_T5_WOOD.get())

                .add(ModBlocks.PAGAN_T1_PLANKS.get())
                .add(ModBlocks.PAGAN_T2_PLANKS.get())
                .add(ModBlocks.PAGAN_T3_PLANKS.get())
                .add(ModBlocks.PAGAN_T4_PLANKS.get())
                .add(ModBlocks.PAGAN_T5_PLANKS.get())

                .add(ModBlocks.STRIPPED_PAGAN_T1_LOG.get())
                .add(ModBlocks.STRIPPED_PAGAN_T2_LOG.get())
                .add(ModBlocks.STRIPPED_PAGAN_T3_LOG.get())
                .add(ModBlocks.STRIPPED_PAGAN_T4_LOG.get())
                .add(ModBlocks.STRIPPED_PAGAN_T5_LOG.get())


                .add(ModBlocks.STRIPPED_PAGAN_T1_WOOD.get())
                .add(ModBlocks.STRIPPED_PAGAN_T2_WOOD.get())
                .add(ModBlocks.STRIPPED_PAGAN_T3_WOOD.get())
                .add(ModBlocks.STRIPPED_PAGAN_T4_WOOD.get())
                .add(ModBlocks.STRIPPED_PAGAN_T5_WOOD.get())
        ;



        this.tag(BlockTags.LOGS)
                .add(ModBlocks.PAGAN_T1_LOG.get())
                .add(ModBlocks.PAGAN_T2_LOG.get())
                .add(ModBlocks.PAGAN_T3_LOG.get())
                .add(ModBlocks.PAGAN_T4_LOG.get())
                .add(ModBlocks.PAGAN_T5_LOG.get())

                .add(ModBlocks.PAGAN_T1_WOOD.get())
                .add(ModBlocks.PAGAN_T2_WOOD.get())
                .add(ModBlocks.PAGAN_T3_WOOD.get())
                .add(ModBlocks.PAGAN_T4_WOOD.get())
                .add(ModBlocks.PAGAN_T5_WOOD.get())

                .add(ModBlocks.STRIPPED_PAGAN_T1_LOG.get())
                .add(ModBlocks.STRIPPED_PAGAN_T2_LOG.get())
                .add(ModBlocks.STRIPPED_PAGAN_T3_LOG.get())
                .add(ModBlocks.STRIPPED_PAGAN_T4_LOG.get())
                .add(ModBlocks.STRIPPED_PAGAN_T5_LOG.get())

                .add(ModBlocks.STRIPPED_PAGAN_T1_WOOD.get())
                .add(ModBlocks.STRIPPED_PAGAN_T2_WOOD.get())
                .add(ModBlocks.STRIPPED_PAGAN_T3_WOOD.get())
                .add(ModBlocks.STRIPPED_PAGAN_T4_WOOD.get())
                .add(ModBlocks.STRIPPED_PAGAN_T5_WOOD.get())
        ;

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.PAGAN_T1_LOG.get())
                .add(ModBlocks.PAGAN_T2_LOG.get())
                .add(ModBlocks.PAGAN_T3_LOG.get())
                .add(ModBlocks.PAGAN_T4_LOG.get())
                .add(ModBlocks.PAGAN_T5_LOG.get())

                .add(ModBlocks.PAGAN_T1_WOOD.get())
                .add(ModBlocks.PAGAN_T2_WOOD.get())
                .add(ModBlocks.PAGAN_T3_WOOD.get())
                .add(ModBlocks.PAGAN_T4_WOOD.get())
                .add(ModBlocks.PAGAN_T5_WOOD.get())


                .add(ModBlocks.STRIPPED_PAGAN_T1_LOG.get())
                .add(ModBlocks.STRIPPED_PAGAN_T2_LOG.get())
                .add(ModBlocks.STRIPPED_PAGAN_T3_LOG.get())
                .add(ModBlocks.STRIPPED_PAGAN_T4_LOG.get())
                .add(ModBlocks.STRIPPED_PAGAN_T5_LOG.get())

                .add(ModBlocks.STRIPPED_PAGAN_T1_WOOD.get())
                .add(ModBlocks.STRIPPED_PAGAN_T2_WOOD.get())
                .add(ModBlocks.STRIPPED_PAGAN_T3_WOOD.get())
                .add(ModBlocks.STRIPPED_PAGAN_T4_WOOD.get())
                .add(ModBlocks.STRIPPED_PAGAN_T5_WOOD.get())
        ;

        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.PAGAN_T1_PLANKS.get())
                .add(ModBlocks.PAGAN_T2_PLANKS.get())
                .add(ModBlocks.PAGAN_T3_PLANKS.get())
                .add(ModBlocks.PAGAN_T4_PLANKS.get())
                .add(ModBlocks.PAGAN_T5_PLANKS.get())
        ;

    }
}
