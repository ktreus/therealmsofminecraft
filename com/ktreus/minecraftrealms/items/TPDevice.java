package com.ktreus.minecraftrealms.items;

import java.awt.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.event.terraingen.TerrainGen;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TPDevice extends Item  {
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player ){
		
		 if (!world.isRemote)
         {
	       MinecraftServer.getServer().getCommandManager().executeCommand(player, "tp @p");
           world.playSoundAtEntity(player, "minecraftrealms.baseGun", 0.5F, 1.0F);
           player.addPotionEffect(new PotionEffect(Potion.resistance.id, 50, 0, true));
           player.setItemInUse(item, this.getMaxItemUseDuration(item));
         }
		 else
		 {
		   MinecraftServer.getServer().getCommandManager().executeCommand(player, "say 'I am not found any player arround..'"); 
		 }
	return item;
	}
	 public EnumAction getItemUseAction(ItemStack item)
	    {
	        return EnumAction.drink;
	    }
	 public TPDevice(){
		 this.setMaxStackSize(1);
	 }
}
