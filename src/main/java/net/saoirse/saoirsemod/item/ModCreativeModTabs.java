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


    public static final RegistryObject<CreativeModeTab> TDC_TAB = CREATIVE_MODE_TABS.register("tdc_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PAGAN_DUST.get()))
                    .title(Component.translatable("creativetab.tdc_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        //ITEMS
                        pOutput.accept(ModItems.JOKER_EYE.get());
                        pOutput.accept(ModItems.PAGAN_SEEDS.get());
                        pOutput.accept(ModItems.PAGAN_DUST.get());



                        //BLOCKS
                        pOutput.accept(ModBlocks.RIDDLE_BOX.get());

                        pOutput.accept(ModBlocks.PAGAN_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_PAGAN_LOG.get());
                        pOutput.accept(ModBlocks.PAGAN_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_PAGAN_WOOD.get());
                        pOutput.accept(ModBlocks.PAGAN_PLANKS.get());
                        pOutput.accept(ModBlocks.PAGAN_LEAVES.get());

                        pOutput.accept(ModBlocks.PAGAN_T2_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_PAGAN_T2_LOG.get());
                        pOutput.accept(ModBlocks.PAGAN_T2_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_PAGAN_T2_WOOD.get());
                        pOutput.accept(ModBlocks.PAGAN_T2_PLANKS.get());
                        pOutput.accept(ModBlocks.PAGAN_T2_LEAVES.get());


                    }).build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
