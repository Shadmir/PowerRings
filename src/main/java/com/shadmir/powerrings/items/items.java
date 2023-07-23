package com.shadmir.powerrings.items;

import com.shadmir.powerrings.MyMod;
import com.shadmir.powerrings.Tags;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class items {
    public static OneRing oneRing;
    public static OpposingRing oppRing;
    public static Narya narya;
    public static Nenya nenya;
    public static Vilya vilya;
    public static DwarfRing dwarfRing;
    public static ManRing manRing;
    public static RingBarahir barahir;
    public static final void init() {
        oneRing = (OneRing) new OneRing().setUnlocalizedName("oneRing").setCreativeTab(MyMod.ringTab);
        oneRing.setTextureName(Tags.MODID + ":" + oneRing.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(oneRing, oneRing.getUnlocalizedName());

        oppRing = (OpposingRing) new OpposingRing().setUnlocalizedName("opposingRing").setCreativeTab(MyMod.ringTab);
        oppRing.setTextureName(Tags.MODID + ":" + oppRing.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(oppRing, oppRing.getUnlocalizedName());

        narya = (Narya) new Narya().setUnlocalizedName("ringNarya").setCreativeTab(MyMod.ringTab);
        narya.setTextureName(Tags.MODID + ":" + narya.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(narya, narya.getUnlocalizedName());

        nenya = (Nenya) new Nenya().setUnlocalizedName("ringNenya").setCreativeTab(MyMod.ringTab);
        nenya.setTextureName(Tags.MODID + ":" + nenya.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(nenya, nenya.getUnlocalizedName());

        vilya = (Vilya) new Vilya().setUnlocalizedName("ringVilya").setCreativeTab(MyMod.ringTab);
        vilya.setTextureName(Tags.MODID + ":" + vilya.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(vilya, vilya.getUnlocalizedName());

        dwarfRing = (DwarfRing) new DwarfRing().setUnlocalizedName("ringDwarf").setCreativeTab(MyMod.ringTab);
        dwarfRing.setTextureName(Tags.MODID + ":" + dwarfRing.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(dwarfRing, dwarfRing.getUnlocalizedName());

        manRing = (ManRing) new ManRing().setUnlocalizedName("ringMen").setCreativeTab(MyMod.ringTab);
        manRing.setTextureName(Tags.MODID + ":" + manRing.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(manRing, manRing.getUnlocalizedName());

        barahir = (RingBarahir) new RingBarahir().setUnlocalizedName("ringBarahir").setCreativeTab(MyMod.ringTab);
        barahir.setTextureName(Tags.MODID + ":" + barahir.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(barahir, barahir.getUnlocalizedName());


    }

}
