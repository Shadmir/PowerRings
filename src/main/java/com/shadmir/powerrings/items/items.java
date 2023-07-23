package com.shadmir.powerrings.items;

import com.shadmir.powerrings.Tags;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class items {
    public static Item basicRing;
    public static final void init() {
        basicRing = new Item().setUnlocalizedName("basicRing").setCreativeTab(CreativeTabs.tabCombat);
        basicRing.setTextureName(Tags.MODID + ":" + basicRing.getUnlocalizedName());
        GameRegistry.registerItem(basicRing, basicRing.getUnlocalizedName());
    }

}
