package net.saoirse.saoirsemod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.saoirse.saoirsemod.TheDarkCarnival;
import net.saoirse.saoirsemod.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {


    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider
            , @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TheDarkCarnival.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.PAGAN_LOG.get())
                .add(ModBlocks.PAGAN_WOOD.get())
                .add(ModBlocks.STRIPPED_PAGAN_LOG.get())
                .add(ModBlocks.STRIPPED_PAGAN_WOOD.get());

        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.PAGAN_LOG.get());


    }
}
