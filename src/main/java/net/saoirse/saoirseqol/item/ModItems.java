package net.saoirse.saoirseqol.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.saoirse.saoirseqol.SaoirseQOL;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SaoirseQOL.MOD_ID);


    // ITEMS

    public static final RegistryObject<Item> DIAMOND_NUGGET =
            ITEMS.register("diamond_nugget",
                    () -> new Item(new Item.Properties()));

    // SMITHING TEMPLATES

    public static final RegistryObject<Item> WOOD_TO_STONE_SMITHING_TEMPLATE =
            ITEMS.register("wood_to_stone_smithing_template",
                    () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LEATHER_TO_CHAINMAIL_SMITHING_TEMPLATE =
            ITEMS.register("leather_to_chainmail_smithing_template",
                    () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STONE_GOLD_CHAINMAIL_TO_IRON_SMITHING_TEMPLATE =
            ITEMS.register("stone_gold_chainmail_to_iron_smithing_template",
                    () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> IRON_TO_DIAMOND_SMITHING_TEMPLATE =
            ITEMS.register("iron_to_diamond_smithing_template",
                    () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
