package net.mirnii.caelum.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab CAELUM_TAB = new CreativeModeTab("caelumtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.PLATINUM_INGOT.get());
        }
    };
}
