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
import net.saoirse.saoirsemod.block.custom.ModFlammableRotatedPillarBlock;
import net.saoirse.saoirsemod.item.ModItems;
import net.saoirse.saoirsemod.worldgen.tree.PaganT2TreeGrower;
import net.saoirse.saoirsemod.worldgen.tree.PaganTreeGrower;
import org.lwjgl.system.SharedLibrary;

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


    public static final RegistryObject<Block> PAGAN_SAPLING = registerBlock(
            "pagan_sapling",
            () -> new SaplingBlock(
                    new PaganTreeGrower(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)
                            .sound(SoundType.GRASS)
            ));

    public static final RegistryObject<Block> PAGAN_LOG = registerBlock
            ("pagan_log", () -> new
                    ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                    .strength(3f)));
    public static final RegistryObject<Block> PAGAN_WOOD = registerBlock
            ("pagan_wood", () -> new
                    ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
                    .strength(3f)));
    public static final RegistryObject<Block> STRIPPED_PAGAN_LOG = registerBlock
            ("stripped_pagan_log", () -> new
                    ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)
                    .strength(3f)));
    public static final RegistryObject<Block> STRIPPED_PAGAN_WOOD = registerBlock
            ("stripped_pagan_wood", () -> new
                    ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)
                    .strength(3f)));

    public static final RegistryObject<Block> PAGAN_LEAVES = registerBlock
            ("pagan_leaves", () -> new
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

    public static final RegistryObject<Block> PAGAN_PLANKS = registerBlock
            ("pagan_planks", () -> new
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


    public static final RegistryObject<Block> PAGAN_T2_SAPLING = registerBlock(
            "pagan_t2_sapling",
            () -> new SaplingBlock(
                    new PaganT2TreeGrower(), // DIFFERENT GROWER NEEDED ?
                    BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)
                            .sound(SoundType.GRASS)
            ));

    public static final RegistryObject<Block> PAGAN_T2_LOG = registerBlock
            ("pagan_t2_log", () -> new
                    ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                    .strength(3f)));
    public static final RegistryObject<Block> PAGAN_T2_WOOD = registerBlock
            ("pagan_t2_wood", () -> new
                    ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
                    .strength(3f)));
    public static final RegistryObject<Block> STRIPPED_PAGAN_T2_LOG = registerBlock
            ("stripped_pagan_t2_log", () -> new
                    ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)
                    .strength(3f)));
    public static final RegistryObject<Block> STRIPPED_PAGAN_T2_WOOD = registerBlock
            ("stripped_pagan_t2_wood", () -> new
                    ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)
                    .strength(3f)));

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
