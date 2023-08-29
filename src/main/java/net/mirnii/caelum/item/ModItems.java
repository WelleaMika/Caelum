package net.mirnii.caelum.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mirnii.caelum.Caelum;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Caelum.MODID);

    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CAELUM_TAB)));
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CAELUM_TAB)));
    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CAELUM_TAB)));
    public static final RegistryObject<Item> RAW_PLATINUM = ITEMS.register("raw_platinum", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CAELUM_TAB)));
    public static final RegistryObject<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CAELUM_TAB)));
    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CAELUM_TAB)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}
