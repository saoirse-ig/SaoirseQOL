package net.saoirse.saoirsemod.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.tags.ItemTags;
import net.saoirse.saoirsemod.TheDarkCarnival;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_T1_TOOL = tag("needs_t1_tool");
        public static final TagKey<Block> NEEDS_T2_TOOL = tag("needs_t2_tool");
        public static final TagKey<Block> NEEDS_T3_TOOL = tag("needs_t3_tool");
        public static final TagKey<Block> NEEDS_T4_TOOL = tag("needs_t4_tool");
        public static final TagKey<Block> NEEDS_T5_TOOL = tag("needs_t5_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(TheDarkCarnival.MOD_ID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(TheDarkCarnival.MOD_ID, name));
        }
    }
}
