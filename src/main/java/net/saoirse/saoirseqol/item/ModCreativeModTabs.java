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
import net.saoirse.saoirseqol.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SaoirseQOL.MOD_ID);


    public static final RegistryObject<CreativeModeTab> TDC_HERESY_TAB = CREATIVE_MODE_TABS.register("saoirseqol",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.IRON_BLOCK))
                    .title(Component.translatable("creativetab.saoirseqol_tab"))
                    .displayItems((pParameters, pOutput) -> {



                    }).build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
