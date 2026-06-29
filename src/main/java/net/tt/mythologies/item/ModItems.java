package net.tt.mythologies.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tt.mythologies.MythologiesMod;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MythologiesMod.MOD_ID);
    /*
    Molde para Registro de Item:
    	public static final DeferredItem<Item> NOME_DO_ITEM = ITEMS.register("nome_do_item",
            () -> new Item(new Item.Properties());
     */
    public static final DeferredItem<Item> MAKI = ITEMS.register("maki",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> TEMAKI = ITEMS.register("temaki",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> NIGIRI = ITEMS.register("nigiri",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SASHIMI = ITEMS.register("sashimi",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ONIGIRI = ITEMS.register("onigiri",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> NIKUMAN = ITEMS.register("nikuman",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> GUIOZA = ITEMS.register("guioza",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> JADE = ITEMS.register("jade",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> JADE_COIN = ITEMS.register("jade_coin",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
