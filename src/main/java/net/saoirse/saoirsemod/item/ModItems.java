package net.saoirse.saoirsemod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.saoirse.saoirsemod.TheDarkCarnival;

// DO NOT INCLUDE _ IN THE name: SECTION

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TheDarkCarnival.MOD_ID);

    public static final RegistryObject<Item> JOKER_EYE =
            ITEMS.register("jokereye",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PAGAN_SEEDS =
            ITEMS.register("pagan_seeds",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PAGAN_DUST =
            ITEMS.register("pagan_dust",
                    () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
