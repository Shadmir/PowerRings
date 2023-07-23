package com.shadmir.powerrings.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Narya extends Item {

    @Override
    public void onUpdate(ItemStack stack, World world, Entity entity, int par4, boolean par5) {
        EntityPlayer player = (EntityPlayer) entity;// potion effect, duration, strength
        player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 40, 1));
        player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 40, 0));
        player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 40, 0));
    }
}
