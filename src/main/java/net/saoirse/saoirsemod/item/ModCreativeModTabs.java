package net.saoirse.saoirsemod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.saoirse.saoirsemod.TheDarkCarnival;
import net.saoirse.saoirsemod.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheDarkCarnival.MOD_ID);


    public static final RegistryObject<CreativeModeTab> TDC_HERESY_TAB = CREATIVE_MODE_TABS.register("tdc_heresy_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.HERESY_FLESH_BLOCK.get()))
                    .title(Component.translatable("creativetab.tdc_tools_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModBlocks.HERESY_FLESH_BLOCK.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> TDC_TOOLS_TAB = CREATIVE_MODE_TABS.register("tdc_tools_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PAGAN_T5_SWORD.get()))
                    .title(Component.translatable("creativetab.tdc_tools_tab"))
                    .displayItems((pParameters, pOutput) -> {


                        pOutput.accept(ModItems.PAGAN_T1_PICKAXE.get());
                        pOutput.accept(ModItems.PAGAN_T2_PICKAXE.get());
                        pOutput.accept(ModItems.PAGAN_T3_PICKAXE.get());
                        pOutput.accept(ModItems.PAGAN_T4_PICKAXE.get());
                        pOutput.accept(ModItems.PAGAN_T5_PICKAXE.get());

                        pOutput.accept(ModItems.PAGAN_T1_SWORD.get());
                        pOutput.accept(ModItems.PAGAN_T2_SWORD.get());
                        pOutput.accept(ModItems.PAGAN_T3_SWORD.get());
                        pOutput.accept(ModItems.PAGAN_T4_SWORD.get());
                        pOutput.accept(ModItems.PAGAN_T5_SWORD.get());

                        pOutput.accept(ModItems.PAGAN_T1_AXE.get());
                        pOutput.accept(ModItems.PAGAN_T2_AXE.get());
                        pOutput.accept(ModItems.PAGAN_T3_AXE.get());
                        pOutput.accept(ModItems.PAGAN_T4_AXE.get());
                        pOutput.accept(ModItems.PAGAN_T5_AXE.get());

                        pOutput.accept(ModItems.PAGAN_T1_SHOVEL.get());
                        pOutput.accept(ModItems.PAGAN_T2_SHOVEL.get());
                        pOutput.accept(ModItems.PAGAN_T3_SHOVEL.get());
                        pOutput.accept(ModItems.PAGAN_T4_SHOVEL.get());
                        pOutput.accept(ModItems.PAGAN_T5_SHOVEL.get());

                        pOutput.accept(ModItems.PAGAN_T1_HOE.get());
                        pOutput.accept(ModItems.PAGAN_T2_HOE.get());
                        pOutput.accept(ModItems.PAGAN_T3_HOE.get());
                        pOutput.accept(ModItems.PAGAN_T4_HOE.get());
                        pOutput.accept(ModItems.PAGAN_T5_HOE.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> TDC_TAB = CREATIVE_MODE_TABS.register("tdc_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PAGAN_DUST.get()))
                    .title(Component.translatable("creativetab.tdc_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        //ITEMS
                        //pOutput.accept(ModItems.JOKER_EYE.get());


                        pOutput.accept(ModItems.PAGAN_SEEDS.get());
                        pOutput.accept(ModItems.PAGAN_DUST.get());
                        pOutput.accept(ModItems.PAGAN_CROP_YIELD.get());
                        pOutput.accept(ModItems.PAGAN_T3_CRAFTING_ITEM.get());
                        //pOutput.accept(ModItems.PAGAN_ORB.get());

                        pOutput.accept(ModItems.PAGAN_T1_INGOT.get());
                        pOutput.accept(ModItems.PAGAN_T2_INGOT.get());
                        pOutput.accept(ModItems.PAGAN_T3_INGOT.get());
                        pOutput.accept(ModItems.PAGAN_T4_INGOT.get());
                        pOutput.accept(ModItems.PAGAN_T5_INGOT.get());

                        pOutput.accept(ModItems.PAGAN_T1_RAW_ORE.get());
                        pOutput.accept(ModItems.PAGAN_T2_RAW_ORE.get());
                        pOutput.accept(ModItems.PAGAN_T3_RAW_ORE.get());
                        pOutput.accept(ModItems.PAGAN_T4_RAW_ORE.get());
                        pOutput.accept(ModItems.PAGAN_T5_RAW_ORE.get());
                        pOutput.accept(ModItems.PAGAN_T5_SCRAP.get());


                        //BLOCKS
                        //pOutput.accept(ModBlocks.RIDDLE_BOX.get());

                        pOutput.accept(ModBlocks.PAGAN_DUST_BLOCK.get());

                        pOutput.accept(ModBlocks.PAGAN_T1_LOG.get());
                        pOutput.accept(ModBlocks.PAGAN_T2_LOG.get());
                        pOutput.accept(ModBlocks.PAGAN_T3_LOG.get());
                        pOutput.accept(ModBlocks.PAGAN_T4_LOG.get());
                        pOutput.accept(ModBlocks.PAGAN_T5_LOG.get());

                        pOutput.accept(ModBlocks.STRIPPED_PAGAN_T1_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_PAGAN_T2_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_PAGAN_T3_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_PAGAN_T4_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_PAGAN_T5_LOG.get());

                        pOutput.accept(ModBlocks.STRIPPED_PAGAN_T1_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_PAGAN_T2_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_PAGAN_T3_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_PAGAN_T4_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_PAGAN_T5_WOOD.get());

                        pOutput.accept(ModBlocks.PAGAN_T1_WOOD.get());
                        pOutput.accept(ModBlocks.PAGAN_T2_WOOD.get());
                        pOutput.accept(ModBlocks.PAGAN_T3_WOOD.get());
                        pOutput.accept(ModBlocks.PAGAN_T4_WOOD.get());
                        pOutput.accept(ModBlocks.PAGAN_T5_WOOD.get());

                        pOutput.accept(ModBlocks.PAGAN_T1_PLANKS.get());
                        pOutput.accept(ModBlocks.PAGAN_T2_PLANKS.get());
                        pOutput.accept(ModBlocks.PAGAN_T3_PLANKS.get());
                        pOutput.accept(ModBlocks.PAGAN_T4_PLANKS.get());
                        pOutput.accept(ModBlocks.PAGAN_T5_PLANKS.get());

                        pOutput.accept(ModBlocks.PAGAN_T1_LEAVES.get());
                        pOutput.accept(ModBlocks.PAGAN_T2_LEAVES.get());
                        pOutput.accept(ModBlocks.PAGAN_T3_LEAVES.get());
                        pOutput.accept(ModBlocks.PAGAN_T4_LEAVES.get());
                        pOutput.accept(ModBlocks.PAGAN_T5_LEAVES.get());

                        pOutput.accept(ModBlocks.PAGAN_T1_SAPLING.get());
                        pOutput.accept(ModBlocks.PAGAN_T2_SAPLING.get());
                        pOutput.accept(ModBlocks.PAGAN_T3_SAPLING.get());
                        pOutput.accept(ModBlocks.PAGAN_T4_SAPLING.get());
                        pOutput.accept(ModBlocks.PAGAN_T5_SAPLING.get());

                        pOutput.accept(ModBlocks.PAGAN_T1_BLOCK.get());
                        pOutput.accept(ModBlocks.PAGAN_T2_BLOCK.get());
                        pOutput.accept(ModBlocks.PAGAN_T3_BLOCK.get());
                        pOutput.accept(ModBlocks.PAGAN_T4_BLOCK.get());
                        pOutput.accept(ModBlocks.PAGAN_T5_BLOCK.get());

                        pOutput.accept(ModBlocks.PAGAN_T4_BLOCK_COMPRESSED.get());

                        pOutput.accept(ModBlocks.GROWTH_TOTEM_BLOCK.get());


                    }).build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
