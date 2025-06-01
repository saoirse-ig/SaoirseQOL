package net.saoirse.saoirsemod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.saoirse.saoirsemod.TheDarkCarnival;
import net.saoirse.saoirsemod.block.custom.GrowthTotemBlock;
import net.saoirse.saoirsemod.block.custom.ModFlammableRotatedPillarBlock;
import net.saoirse.saoirsemod.block.custom.PaganCropBlock;
import net.saoirse.saoirsemod.item.ModItems;
import net.saoirse.saoirsemod.worldgen.tree.*;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS,
                    TheDarkCarnival.MOD_ID);


    //holds properties of IRON_BLOCK except for sound,
    // which is copying COPPER_BLOCK
    public static final RegistryObject<Block> RIDDLE_BOX = registerBlock
            ("riddlebox", () -> new
                    Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .sound(SoundType.COPPER)));



    // INGOT BLOCKS

    public static final RegistryObject<Block> PAGAN_T1_BLOCK = registerBlock
            ("pagan_t1_block", () -> new
                    Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> PAGAN_T2_BLOCK = registerBlock
            ("pagan_t2_block", () -> new
                    Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> PAGAN_T3_BLOCK = registerBlock
            ("pagan_t3_block", () -> new
                    Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> PAGAN_T4_BLOCK = registerBlock
            ("pagan_t4_block", () -> new
                    Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> PAGAN_T5_BLOCK = registerBlock
            ("pagan_t5_block", () -> new
                    Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)
                    .sound(SoundType.METAL)));


    // CROPS

    public static final RegistryObject<Block> PAGAN_CROP = BLOCKS.register("pagan_crop",
            () -> new PaganCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));


    // SAPLINGS

    public static final RegistryObject<Block> PAGAN_T1_SAPLING = registerBlock(
            "pagan_t1_sapling",
            () -> new SaplingBlock(
                    new PaganT1TreeGrower(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)
                            .sound(SoundType.GRASS)
            ));

    public static final RegistryObject<Block> PAGAN_T2_SAPLING = registerBlock(
            "pagan_t2_sapling",
            () -> new SaplingBlock(
                    new PaganT2TreeGrower(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)
                            .sound(SoundType.GRASS)
            ));

    public static final RegistryObject<Block> PAGAN_T3_SAPLING = registerBlock(
            "pagan_t3_sapling",
            () -> new SaplingBlock(
                    new PaganT3TreeGrower(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)
                            .sound(SoundType.GRASS)
            ));

    public static final RegistryObject<Block> PAGAN_T4_SAPLING = registerBlock(
            "pagan_t4_sapling",
            () -> new SaplingBlock(
                    new PaganT4TreeGrower(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)
                            .sound(SoundType.GRASS)
            ));

    public static final RegistryObject<Block> PAGAN_T5_SAPLING = registerBlock(
            "pagan_t5_sapling",
            () -> new SaplingBlock(
                    new PaganT5TreeGrower(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)
                            .sound(SoundType.GRASS)
            ));
    
    
    // T1

    public static final RegistryObject<Block> PAGAN_T1_LOG = registerBlock
            ("pagan_t1_log", () -> new
                    ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                    .strength(2f, 3.0f)));
    public static final RegistryObject<Block> PAGAN_T1_WOOD = registerBlock
            ("pagan_t1_wood", () -> new
                    ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
                    .strength(2f, 3.0f)));
    public static final RegistryObject<Block> STRIPPED_PAGAN_T1_LOG = registerBlock
            ("stripped_pagan_t1_log", () -> new
                    ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)
                    .strength(2f, 3.0f)));
    public static final RegistryObject<Block> STRIPPED_PAGAN_T1_WOOD = registerBlock
            ("stripped_pagan_t1_wood", () -> new
                    ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)
                    .strength(2f, 3.0f)));

    public static final RegistryObject<Block> PAGAN_T1_LEAVES = registerBlock
            ("pagan_t1_leaves", () -> new
                    LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)){
                        @Override
                        public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                            return true;
                        }

                        @Override
                        public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                            return 20;
                        }

                        @Override
                        public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                            return 5;
                        }
                    });

    public static final RegistryObject<Block> PAGAN_T1_PLANKS = registerBlock
            ("pagan_t1_planks", () -> new
                    Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)){
                        @Override
                        public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                            return true;
                        }

                        @Override
                        public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                            return 60;
                        }

                        @Override
                        public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                            return 30;
                        }
                    });


    // T2
    
    public static final RegistryObject<Block> PAGAN_T2_LOG = registerBlock
            ("pagan_t2_log", () -> new
                    ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                    .strength(2f, 3.0f)));
    public static final RegistryObject<Block> PAGAN_T2_WOOD = registerBlock
            ("pagan_t2_wood", () -> new
                    ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
                    .strength(2f, 3.0f)));
    public static final RegistryObject<Block> STRIPPED_PAGAN_T2_LOG = registerBlock
            ("stripped_pagan_t2_log", () -> new
                    ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)
                    .strength(2f, 3.0f)));
    public static final RegistryObject<Block> STRIPPED_PAGAN_T2_WOOD = registerBlock
            ("stripped_pagan_t2_wood", () -> new
                    ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)
                    .strength(2f, 3.0f)));

    public static final RegistryObject<Block> PAGAN_T2_LEAVES = registerBlock
            ("pagan_t2_leaves", () -> new
                    LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)){
                        @Override
                        public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                            return true;
                        }

                        @Override
                        public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                            return 20;
                        }

                        @Override
                        public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                            return 5;
                        }
                    });

    public static final RegistryObject<Block> PAGAN_T2_PLANKS = registerBlock
            ("pagan_t2_planks", () -> new
                    Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)){
                        @Override
                        public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                            return true;
                        }

                        @Override
                        public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                            return 60;
                        }

                        @Override
                        public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                            return 30;
                        }
                    });


    // T3

    public static final RegistryObject<Block> PAGAN_T3_LOG = registerBlock
            ("pagan_t3_log", () -> new
                    ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                    .strength(2f, 3.0f)));
    public static final RegistryObject<Block> PAGAN_T3_WOOD = registerBlock
            ("pagan_t3_wood", () -> new
                    ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
                    .strength(2f, 3.0f)));
    public static final RegistryObject<Block> STRIPPED_PAGAN_T3_LOG = registerBlock
            ("stripped_pagan_t3_log", () -> new
                    ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)
                    .strength(2f, 3.0f)));
    public static final RegistryObject<Block> STRIPPED_PAGAN_T3_WOOD = registerBlock
            ("stripped_pagan_t3_wood", () -> new
                    ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)
                    .strength(2f, 3.0f)));

    public static final RegistryObject<Block> PAGAN_T3_LEAVES = registerBlock
            ("pagan_t3_leaves", () -> new
                    LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)){
                        @Override
                        public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                            return true;
                        }

                        @Override
                        public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                            return 20;
                        }

                        @Override
                        public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                            return 5;
                        }
                    });

    public static final RegistryObject<Block> PAGAN_T3_PLANKS = registerBlock
            ("pagan_t3_planks", () -> new
                    Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)){
                        @Override
                        public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                            return true;
                        }

                        @Override
                        public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                            return 60;
                        }

                        @Override
                        public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                            return 30;
                        }
                    });
    
    
    // T4

    public static final RegistryObject<Block> PAGAN_T4_LOG = registerBlock
            ("pagan_t4_log", () -> new
                    ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                    .strength(2f, 3.0f)));
    public static final RegistryObject<Block> PAGAN_T4_WOOD = registerBlock
            ("pagan_t4_wood", () -> new
                    ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
                    .strength(2f, 3.0f)));
    public static final RegistryObject<Block> STRIPPED_PAGAN_T4_LOG = registerBlock
            ("stripped_pagan_t4_log", () -> new
                    ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)
                    .strength(2f, 3.0f)));
    public static final RegistryObject<Block> STRIPPED_PAGAN_T4_WOOD = registerBlock
            ("stripped_pagan_t4_wood", () -> new
                    ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)
                    .strength(2f, 3.0f)));

    public static final RegistryObject<Block> PAGAN_T4_LEAVES = registerBlock
            ("pagan_t4_leaves", () -> new
                    LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)){
                        @Override
                        public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                            return true;
                        }

                        @Override
                        public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                            return 20;
                        }

                        @Override
                        public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                            return 5;
                        }
                    });

    public static final RegistryObject<Block> PAGAN_T4_PLANKS = registerBlock
            ("pagan_t4_planks", () -> new
                    Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)){
                        @Override
                        public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                            return true;
                        }

                        @Override
                        public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                            return 60;
                        }

                        @Override
                        public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                            return 30;
                        }
                    });
    
    
    // T5

    public static final RegistryObject<Block> PAGAN_T5_LOG = registerBlock
            ("pagan_t5_log", () -> new
                    ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                    .strength(2f, 3.0f)));
    public static final RegistryObject<Block> PAGAN_T5_WOOD = registerBlock
            ("pagan_t5_wood", () -> new
                    ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
                    .strength(2f, 3.0f)));
    public static final RegistryObject<Block> STRIPPED_PAGAN_T5_LOG = registerBlock
            ("stripped_pagan_t5_log", () -> new
                    ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)
                    .strength(2f, 3.0f)));
    public static final RegistryObject<Block> STRIPPED_PAGAN_T5_WOOD = registerBlock
            ("stripped_pagan_t5_wood", () -> new
                    ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)
                    .strength(2f, 3.0f)));

    public static final RegistryObject<Block> PAGAN_T5_LEAVES = registerBlock
            ("pagan_t5_leaves", () -> new
                    LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)){
                        @Override
                        public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                            return true;
                        }

                        @Override
                        public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                            return 20;
                        }

                        @Override
                        public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                            return 5;
                        }
                    });

    public static final RegistryObject<Block> PAGAN_T5_PLANKS = registerBlock
            ("pagan_t5_planks", () -> new
                    Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)){
                        @Override
                        public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                            return true;
                        }

                        @Override
                        public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                            return 60;
                        }

                        @Override
                        public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                            return 30;
                        }
                    });



    // TOTEM BLOCKS

    public static final RegistryObject<Block> GROWTH_TOTEM_BLOCK = registerBlock
            ("growth_totem_block", () -> new
                    GrowthTotemBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOD)
                    .strength(3f, 3f)));



    private static <T extends Block> RegistryObject<T> registerBlock
            (String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }


private static <T extends Block>RegistryObject<Item> registerBlockItem
        (String name, RegistryObject<T> block){
    return ModItems.ITEMS.register(name, () -> new BlockItem(block.get()
            , new Item.Properties()));
}

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
