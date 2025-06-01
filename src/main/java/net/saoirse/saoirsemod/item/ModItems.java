package net.saoirse.saoirsemod.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.saoirse.saoirsemod.TheDarkCarnival;
import net.saoirse.saoirsemod.block.ModBlocks;

// DO NOT INCLUDE _ IN THE name: SECTION

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TheDarkCarnival.MOD_ID);

    public static final RegistryObject<Item> JOKER_EYE =
            ITEMS.register("jokereye",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PAGAN_CROP_YIELD =
            ITEMS.register("pagan_crop_yield",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PAGAN_SEEDS =
            ITEMS.register("pagan_seeds",
                    () -> new ItemNameBlockItem(ModBlocks.PAGAN_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> PAGAN_DUST =
            ITEMS.register("pagan_dust",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PAGAN_ORB =
            ITEMS.register("pagan_orb",
                    () -> new Item(new Item.Properties()));


    // INGOTS / RAW

    public static final RegistryObject<Item> PAGAN_T1_INGOT =
            ITEMS.register("pagan_t1_ingot",
                    () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PAGAN_T2_INGOT =
            ITEMS.register("pagan_t2_ingot",
                    () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PAGAN_T3_INGOT =
            ITEMS.register("pagan_t3_ingot",
                    () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PAGAN_T4_INGOT =
            ITEMS.register("pagan_t4_ingot",
                    () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PAGAN_T5_INGOT =
            ITEMS.register("pagan_t5_ingot",
                    () -> new Item(new Item.Properties()));



    public static final RegistryObject<Item> PAGAN_T1_RAW_ORE =
            ITEMS.register("pagan_t1_raw_ore",
                    () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PAGAN_T2_RAW_ORE =
            ITEMS.register("pagan_t2_raw_ore",
                    () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PAGAN_T3_RAW_ORE =
            ITEMS.register("pagan_t3_raw_ore",
                    () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PAGAN_T4_RAW_ORE =
            ITEMS.register("pagan_t4_raw_ore",
                    () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PAGAN_T5_RAW_ORE =
            ITEMS.register("pagan_t5_raw_ore",
                    () -> new Item(new Item.Properties()));



    public static final RegistryObject<Item> PAGAN_T5_SCRAP =
            ITEMS.register("pagan_t5_scrap",
                    () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PAGAN_T3_CRAFTING_ITEM =
            ITEMS.register("pagan_t3_crafting_item",
                    () -> new Item(new Item.Properties()));


    //T1 TOOLS STONE

    public static final RegistryObject<Item> PAGAN_T1_SWORD =
            ITEMS.register("pagan_t1_sword",
                    () -> new SwordItem(ModToolTiers.T1, 3, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> PAGAN_T1_PICKAXE =
            ITEMS.register("pagan_t1_pickaxe",
                    () -> new PickaxeItem(ModToolTiers.T1, 1, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> PAGAN_T1_AXE =
            ITEMS.register("pagan_t1_axe",
                    () -> new AxeItem(ModToolTiers.T1, 7, -3.2f, new Item.Properties()));
    public static final RegistryObject<Item> PAGAN_T1_SHOVEL =
            ITEMS.register("pagan_t1_shovel",
                    () -> new ShovelItem(ModToolTiers.T1, 1.5f, -3.0f, new Item.Properties()));
    public static final RegistryObject<Item> PAGAN_T1_HOE =
            ITEMS.register("pagan_t1_hoe",
                    () -> new HoeItem(ModToolTiers.T1, -1, -2.0f, new Item.Properties()));
    
    //T2 TOOLS IRON

    public static final RegistryObject<Item> PAGAN_T2_SWORD =
            ITEMS.register("pagan_t2_sword",
                    () -> new SwordItem(ModToolTiers.T2, 3, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> PAGAN_T2_PICKAXE =
            ITEMS.register("pagan_t2_pickaxe",
                    () -> new PickaxeItem(ModToolTiers.T2, 1, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> PAGAN_T2_AXE =
            ITEMS.register("pagan_t2_axe",
                    () -> new AxeItem(ModToolTiers.T2, 6.0f, -3.1f, new Item.Properties()));
    public static final RegistryObject<Item> PAGAN_T2_SHOVEL =
            ITEMS.register("pagan_t2_shovel",
                    () -> new ShovelItem(ModToolTiers.T2, 1.5f, -3.0f, new Item.Properties()));
    public static final RegistryObject<Item> PAGAN_T2_HOE =
            ITEMS.register("pagan_t2_hoe",
                    () -> new HoeItem(ModToolTiers.T2, -2, -1.0f, new Item.Properties()));


    //T3 TOOLS DIAMOND

    public static final RegistryObject<Item> PAGAN_T3_SWORD =
            ITEMS.register("pagan_t3_sword",
                    () -> new SwordItem(ModToolTiers.T3, 3, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> PAGAN_T3_PICKAXE =
            ITEMS.register("pagan_t3_pickaxe",
                    () -> new PickaxeItem(ModToolTiers.T3, 1, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> PAGAN_T3_AXE =
            ITEMS.register("pagan_t3_axe",
                    () -> new AxeItem(ModToolTiers.T3, 5, -3.0f, new Item.Properties()));
    public static final RegistryObject<Item> PAGAN_T3_SHOVEL =
            ITEMS.register("pagan_t3_shovel",
                    () -> new ShovelItem(ModToolTiers.T3, 1.5f, -3.0f, new Item.Properties()));
    public static final RegistryObject<Item> PAGAN_T3_HOE =
            ITEMS.register("pagan_t3_hoe",
                    () -> new HoeItem(ModToolTiers.T3, -3, 0f, new Item.Properties()));


    //T4 TOOLS GOLD

    public static final RegistryObject<Item> PAGAN_T4_SWORD =
            ITEMS.register("pagan_t4_sword",
                    () -> new SwordItem(ModToolTiers.T4, 3, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> PAGAN_T4_PICKAXE =
            ITEMS.register("pagan_t4_pickaxe",
                    () -> new PickaxeItem(ModToolTiers.T4, 1, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> PAGAN_T4_AXE =
            ITEMS.register("pagan_t4_axe",
                    () -> new AxeItem(ModToolTiers.T4, 6, -3.0f, new Item.Properties()));
    public static final RegistryObject<Item> PAGAN_T4_SHOVEL =
            ITEMS.register("pagan_t4_shovel",
                    () -> new ShovelItem(ModToolTiers.T4, 1.5f, -3.0f, new Item.Properties()));
    public static final RegistryObject<Item> PAGAN_T4_HOE =
            ITEMS.register("pagan_t4_hoe",
                    () -> new HoeItem(ModToolTiers.T4, 0, -3.0f, new Item.Properties()));


    //T5 TOOLS NETHERITE

    public static final RegistryObject<Item> PAGAN_T5_SWORD =
            ITEMS.register("pagan_t5_sword",
                    () -> new SwordItem(ModToolTiers.T5, 3, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> PAGAN_T5_PICKAXE =
            ITEMS.register("pagan_t5_pickaxe",
                    () -> new PickaxeItem(ModToolTiers.T5, 1, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> PAGAN_T5_AXE =
            ITEMS.register("pagan_t5_axe",
                    () -> new AxeItem(ModToolTiers.T5, 5, -3.0f, new Item.Properties()));
    public static final RegistryObject<Item> PAGAN_T5_SHOVEL =
            ITEMS.register("pagan_t5_shovel",
                    () -> new ShovelItem(ModToolTiers.T5, 1.5f, -3.0f, new Item.Properties()));
    public static final RegistryObject<Item> PAGAN_T5_HOE =
            ITEMS.register("pagan_t5_hoe",
                    () -> new HoeItem(ModToolTiers.T5, -4, 0f, new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
