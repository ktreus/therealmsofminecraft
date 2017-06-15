package com.ktreus.minecraftrealms.guns;

import java.util.Timer;
import java.util.TimerTask;

import javafx.concurrent.Task;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import com.ktreus.minecraftrealms.registers.MRGunsRegister;

public class BaseGun extends Item{
public static int cooldown = 1;
	 public BaseGun()
	    {
	        setCreativeTab(CreativeTabs.tabCombat);
	        setMaxStackSize(1);
	        setMaxDamage(0);
	    }	 
	    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player)
	    {

	        if (player.capabilities.isCreativeMode || player.inventory.consumeInventoryItem(MRGunsRegister.baseAmmo))
	        {        
	        	//   if (cooldown == 1)
	        	{
	        		    player.swingItem();
	    	            world.playSoundAtEntity(player, "random.bow", 0.5F, 1.0F);
	    	            if (!world.isRemote)
	    	            {
	    	                world.spawnEntityInWorld(new BaseBullet(world, player));
	    	            }
	    	            //player.isBlocking();
	    	            //cooldown -= 1;
	     	        } 
	        //	   if (cooldown > 1){cooldown = 1;}
	        //	   if (cooldown == 0){cooldown = 1;}
	     	//     essa merda acima é inútil
	        	   
	     	        
	     	    }
	        return itemStack;
	       
	        }
	    
	   
 //THE RENDERING PART
 public void registerIcons(IIconRegister iconRegister) {
     this.itemIcon = iconRegister.registerIcon("minecraftrealms:tools/uniques/elegard_47");
 }
;}