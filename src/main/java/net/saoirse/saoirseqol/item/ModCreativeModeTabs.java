package net.saoirse.saoirseqol.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.saoirse.saoirseqol.SaoirseQOL;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SaoirseQOL.MOD_ID);


    public static final RegistryObject<CreativeModeTab> TDC_HERESY_TAB = CREATIVE_MODE_TABS.register("saoirseqol",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STONE_GOLD_CHAINMAIL_TO_IRON_SMITHING_TEMPLATE.get()))
                    .title(Component.translatable("creativetab.saoirseqol_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.LEATHER_TO_CHAINMAIL_SMITHING_TEMPLATE.get());
                        pOutput.accept(ModItems.WOOD_TO_STONE_SMITHING_TEMPLATE.get());
                        pOutput.accept(ModItems.STONE_GOLD_CHAINMAIL_TO_IRON_SMITHING_TEMPLATE.get());
                        pOutput.accept(ModItems.IRON_TO_DIAMOND_SMITHING_TEMPLATE.get());
                        pOutput.accept(ModItems.DIAMOND_NUGGET.get());


                    }).build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
