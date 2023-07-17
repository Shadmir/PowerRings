package com.shadmir.powerrings.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class items {
    public static Item basicRing;
    public static final void init() {
        basicRing = new Item().setUnlocalizedName("basicRing").setCreativeTab(CreativeTabs.tabCombat);
        GameRegistry.registerItem(basicRing, basicRing.getUnlocalizedName());
    }

}
