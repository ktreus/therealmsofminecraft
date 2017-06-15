package com.ktreus.minecraftrealms.guns;

import java.util.Random;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;

import com.ktreus.minecraftrealms.guns.BaseBullet;
import com.ktreus.minecraftrealms.guns.BaseGun;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ArrowLauncher extends BaseGun {
public ArrowLauncher(){
	this.setMaxDamage(750);
}
@Override
public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player)
{
	if (player.capabilities.isCreativeMode || player.inventory.hasItem(Items.arrow))
{
    player.setItemInUse(itemStack, this.getMaxItemUseDuration(itemStack));
}
	return itemStack;
}

public EnumAction getItemUseAction(ItemStack p_77661_1_)
{
    return EnumAction.bow;
}
public void onPlayerStoppedUsing(ItemStack itemStack, World world, EntityPlayer player, int cd){
	int j = this.getMaxItemUseDuration(itemStack) - cd;
	float f = (float)j / 20.0F;
    f = (f * f + f * 2.0F) / 3.0F;

    if ((double)f < 0.1D)
    {
        return;
    }

    if (f > 1.0F)
    {
        f = 1.0F;
    }

    ArrowLooseEvent event = new ArrowLooseEvent(player, itemStack, j);
    MinecraftForge.EVENT_BUS.post(event);
    if (event.isCanceled())
    {
        return;
    }
    j = event.charge;
	
	world.playSoundAtEntity(player, "random.bow", 0.5F, 1.0F);
	player.inventory.consumeInventoryItem(Items.arrow);
    if (!world.isRemote)
    {
        world.spawnEntityInWorld(new EntityArrow(world, player, f * 17.0F));
    }
  
}
public int getMaxItemUseDuration(ItemStack itemStack)
{
    return 54000;
}
public ItemStack onEaten(ItemStack itemStack, World world, EntityPlayer player)
{
    return itemStack;
}
@Override
public void registerIcons(IIconRegister iconRegister) {
    this.itemIcon = iconRegister.registerIcon("minecraftrealms:tools/uniques/ArrowGunBase");
}
}