package net.saoirse.saoirseqol.block;

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
import net.saoirse.saoirseqol.SaoirseQOL;
import net.saoirse.saoirseqol.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS,
                    SaoirseQOL.MOD_ID);


    //holds properties of IRON_BLOCK except for sound,
    // which is copying COPPER_BLOCK

    /*
    public static final RegistryObject<Block> RIDDLE_BOX = registerBlock
            ("riddlebox", () -> new
                    Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .sound(SoundType.COPPER)));
    */





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
