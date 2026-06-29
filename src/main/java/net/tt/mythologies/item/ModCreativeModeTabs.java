package net.tt.mythologies.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tt.mythologies.MythologiesMod;
import net.tt.mythologies.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MythologiesMod.MOD_ID);

    public static final Supplier<CreativeModeTab> JAPAN_ITEMS_TAB = CREATIVE_MODE_TAB.register("jp_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MAKI.get()))
                    .title(Component.translatable("creativetab.mythologies.jp_items"))
                    .displayItems((itemDiplayParameters, output) -> {
                        output.accept(ModItems.MAKI.get());
                        output.accept(ModItems.JADE.get());
                        output.accept(ModItems.JADE_COIN.get());
                    })

                    .build()
    );

    public static final Supplier<CreativeModeTab> JAPAN_BLOCKS_TAB = CREATIVE_MODE_TAB.register("jp_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.TEST_BLOCK.get()))
                    .title(Component.translatable("creativetab.mythologies.jp_blocks"))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(MythologiesMod.MOD_ID, "jp_items_tab"))
                    .displayItems((itemDiplayParameters, output) -> {
                        output.accept(ModBlocks.TEST_BLOCK.get());
                        output.accept(ModBlocks.JADE_BLOCK.get());
                    })

                    .build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}