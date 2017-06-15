package com.ktreus.minecraftrealms.tools.greatswords;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;

public class DiamondGreatsword extends BaseGreatSword {
	protected AttributeModifier attackDamage= new AttributeModifier("GreatswordPlusDamage", 8.0, 0);
	protected AttributeModifier decreaseSpeed= new AttributeModifier("GreatswordPlusSpeed", -0.2, 1);
	public DiamondGreatsword(ToolMaterial material) {
		super(material);
	}
	  public void registerIcons(IIconRegister iconRegister) {
	        this.itemIcon = iconRegister.registerIcon("minecraftrealms:tools/greatswordDiamond");
	 }
	  public Multimap getItemAttributeModifiers() {
	        HashMultimap multimap = HashMultimap.create();
	        multimap.put((Object)SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), (Object)this.attackDamage);
	        multimap.put((Object)SharedMonsterAttributes.movementSpeed.getAttributeUnlocalizedName(), (Object)this.decreaseSpeed);
	    	
	        return multimap;
	}
	  public class IronGreatsword extends BaseGreatSword {
		  protected AttributeModifier attackDamage= new AttributeModifier("GreatswordPlusDamage", 7.0, 0);
			protected AttributeModifier decreaseSpeed= new AttributeModifier("GreatswordPlusSpeed", -0.2, 1);
			public IronGreatsword(ToolMaterial material) {
				super(material);
			} 
			@Override
			  public void registerIcons(IIconRegister iconRegister) {
			        this.itemIcon = iconRegister.registerIcon("minecraftrealms:tools/greatswordIron");
			 }
			@Override
			  public Multimap getItemAttributeModifiers() {
			        HashMultimap multimap = HashMultimap.create();
			        multimap.put((Object)SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), (Object)this.attackDamage);
			        return multimap;
			}
}
	  public class StoneGreatsword extends BaseGreatSword {
		  protected AttributeModifier attackDamage= new AttributeModifier("GreatswordPlusDamage", 6.0, 0);
			protected AttributeModifier decreaseSpeed= new AttributeModifier("GreatswordPlusSpeed", -0.7, 1);
			public StoneGreatsword(ToolMaterial material) {
				super(material);
			} 
			@Override
			  public void registerIcons(IIconRegister iconRegister) {
			        this.itemIcon = iconRegister.registerIcon("minecraftrealms:tools/greatswordStone");
			 }
			@Override
			  public Multimap getItemAttributeModifiers() {
			        HashMultimap multimap = HashMultimap.create();
			        multimap.put((Object)SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), (Object)this.attackDamage);
			        return multimap;
			}
}
	  public class WoodenGreatsword extends BaseGreatSword {
		  protected AttributeModifier attackDamage= new AttributeModifier("GreatswordPlusDamage", 5.0, 0);
			protected AttributeModifier decreaseSpeed= new AttributeModifier("GreatswordPlusSpeed", -0.3, 1);
			public WoodenGreatsword(ToolMaterial material) {
				super(material);
			} 
			@Override
			  public void registerIcons(IIconRegister iconRegister) {
			        this.itemIcon = iconRegister.registerIcon("minecraftrealms:tools/greatswordWood");
			 }
			@Override
			  public Multimap getItemAttributeModifiers() {
			        HashMultimap multimap = HashMultimap.create();
			        multimap.put((Object)SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), (Object)this.attackDamage);
			        return multimap;
			}
}
	  public class GoldenGreatsword extends BaseGreatSword {
		  protected AttributeModifier attackDamage= new AttributeModifier("GreatswordPlusDamage", 5.5, 0);
			protected AttributeModifier decreaseSpeed= new AttributeModifier("GreatswordPlusSpeed", -0.05, 1);
			public GoldenGreatsword(ToolMaterial material) {
				super(material);
			} 
			@Override
			  public void registerIcons(IIconRegister iconRegister) {
			        this.itemIcon = iconRegister.registerIcon("minecraftrealms:tools/greatswordGold");
			 }
			@Override
			  public Multimap getItemAttributeModifiers() {
			        HashMultimap multimap = HashMultimap.create();
			        multimap.put((Object)SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), (Object)this.attackDamage);
			        return multimap;
			}
}
}
