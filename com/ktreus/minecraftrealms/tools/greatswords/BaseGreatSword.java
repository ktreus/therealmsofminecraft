package com.ktreus.minecraftrealms.tools.greatswords;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BaseGreatSword extends ItemSword {
	protected AttributeModifier attackDamage= new AttributeModifier("GreatswordPlusDamage", 9.0, 0);
	protected AttributeModifier decreaseSpeed= new AttributeModifier("GreatswordPlusDamage", -0.2, 1);
	public static int cooldown = 3;
	public BaseGreatSword(ToolMaterial material) {
		super(material);
		setFull3D();
	}
	 public Multimap getItemAttributeModifiers() {
	        HashMultimap multimap = HashMultimap.create();
	        multimap.put((Object)SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), (Object)this.attackDamage);
	        multimap.put((Object)SharedMonsterAttributes.movementSpeed.getAttributeUnlocalizedName(), (Object)this.decreaseSpeed);
	        return multimap;
	    }
	@SideOnly(Side.CLIENT)
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player ){
		
		 if (cooldown == 3)
          {
            world.playSoundAtEntity(player, "minecraftrealms.baseGun", 0.5F, 1.0F);
            player.addPotionEffect(new PotionEffect(Potion.resistance.id, 50, 0, true));
            player.setItemInUse(item, this.getMaxItemUseDuration(item));
           this.getDamageReduction(this, DamageSource.causeMobDamage(player));
         cooldown -= 3;
        } else {
      	cooldown += 1;
        }
	   if (cooldown > 3){cooldown = 3;}
	   if (cooldown == 0){cooldown = 1;}
	//   if (cooldown == 1){cooldown = 2;} só talvez sirva nas armas
	//   if (cooldown == 2){cooldown = 3;}
	return item;
	}
	@SideOnly(Side.CLIENT)
	 public EnumAction getItemUseAction(ItemStack item)
	    {
	        return EnumAction.block;
	    }
	public float getDamageReduction(BaseGreatSword baseGreatSword, DamageSource source) {
       return 0.0f;
    }
	
	//// RENDER PARTE
	
	  public void registerIcons(IIconRegister iconRegister) {
	        this.itemIcon = iconRegister.registerIcon("minecraftrealms:tools/uniques/obsidianGreatsword");
	    }

}
