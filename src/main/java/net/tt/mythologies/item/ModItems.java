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

    public static final DeferredItem<Item> NETHER_BRICKS_STICK = ITEMS.register("nether_bricks_stick",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> GONG_STICK = ITEMS.register("gong_stick",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> WITHERED_BONE = ITEMS.register("withered_bone",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_MAGMA_CREAM = ITEMS.register("raw_magma_cream",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> BONE_CARVER = ITEMS.register("bone_carver",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> FRIED_CHAYOTE = ITEMS.register("fried_chayote",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> BOLED_EGG = ITEMS.register("boiled_egg",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> FRIED_EGG = ITEMS.register("fried_egg",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> POT = ITEMS.register("pot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> FLOUR = ITEMS.register("flour",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> POT_WITH_FLOUR = ITEMS.register("pot_with_flour",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> FLESH = ITEMS.register("flesh",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> PIPE_WRENCH = ITEMS.register("pipe_wrench",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MACABRE_SCYTHE = ITEMS.register("macabre_scythe",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MONSTROSITY_EYE = ITEMS.register("monstrosity_eye",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MMA_EYE = ITEMS.register("mma_eye",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
