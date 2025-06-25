package net.saoirse.saoirseqol.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.saoirse.saoirseqol.SaoirseQOL;
import net.saoirse.saoirseqol.block.ModBlocks;

// DO NOT INCLUDE _ IN THE name: SECTION

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SaoirseQOL.MOD_ID);



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
