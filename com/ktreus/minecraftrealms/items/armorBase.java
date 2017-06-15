package com.ktreus.minecraftrealms.items;

import net.minecraft.entity.Entity;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class armorBase extends ItemArmor {

	public armorBase(ArmorMaterial material, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getArmorTexture(ItemStack item, Entity entity, int slot, String type){
		
	if (this.armorType == 2){
		return "minecraftrealms:textures/models/armor/base_2.png";
	}	
	return "minecraftrealms:textures/models/armor/base_1.png";
	}
	/////// novas armaduras a partir daqui ////
	public static class armorCobalt extends armorBase {

		public armorCobalt(ArmorMaterial material, int renderIndex, int armorType) {
			super(material, renderIndex, armorType);
			// TODO Auto-generated constructor stub
		}
		@Override
		public String getArmorTexture(ItemStack item, Entity entity, int slot, String type){
			
		if (this.armorType == 2){
			return "minecraftrealms:textures/models/armor/cobalt_2.png";
		}	
		return "minecraftrealms:textures/models/armor/cobalt_1.png";
		}
	}
///////////////
	public static class armorEnderCristal extends armorBase {

		public armorEnderCristal(ArmorMaterial material, int renderIndex, int armorType) {
			super(material, renderIndex, armorType);
			// TODO Auto-generated constructor stub
		}
		@Override
		public String getArmorTexture(ItemStack item, Entity entity, int slot, String type){
			
		if (this.armorType == 2){
			return "minecraftrealms:textures/models/armor/endercristal_2.png";
		}	
		return "minecraftrealms:textures/models/armor/endercristal_1.png";
		}
	}
//////////////
	public static class armorEndernite extends armorBase {

		public armorEndernite(ArmorMaterial material, int renderIndex, int armorType) {
			super(material, renderIndex, armorType);
			// TODO Auto-generated constructor stub
		}
		@Override
		public String getArmorTexture(ItemStack item, Entity entity, int slot, String type){
			
		if (this.armorType == 2){
			return "minecraftrealms:textures/models/armor/endernite_2.png";
		}	
		return "minecraftrealms:textures/models/armor/endernite_1.png";
		}
	}
///////////////
	public static class armorMagnetite extends armorBase {

		public armorMagnetite(ArmorMaterial material, int renderIndex, int armorType) {
			super(material, renderIndex, armorType);
			// TODO Auto-generated constructor stub
		}
		@Override
		public String getArmorTexture(ItemStack item, Entity entity, int slot, String type){
			
		if (this.armorType == 2){
			return "minecraftrealms:textures/models/armor/magnetite_2.png";
		}	
		return "minecraftrealms:textures/models/armor/magnetite_1.png";
		}
	}
/////////////////
	public static class armorNethiron extends armorBase {

		public armorNethiron(ArmorMaterial material, int renderIndex, int armorType) {
			super(material, renderIndex, armorType);
			// TODO Auto-generated constructor stub
		}
		@Override
		public String getArmorTexture(ItemStack item, Entity entity, int slot, String type){
			
		if (this.armorType == 2){
			return "minecraftrealms:textures/models/armor/nethiron_2.png";
		}	
		return "minecraftrealms:textures/models/armor/nethiron_1.png";
		}
	}
////////////////
	public static class armorRagnarite extends armorBase {

		public armorRagnarite(ArmorMaterial material, int renderIndex, int armorType) {
			super(material, renderIndex, armorType);
			// TODO Auto-generated constructor stub
		}
		@Override
		public String getArmorTexture(ItemStack item, Entity entity, int slot, String type){
			
		if (this.armorType == 2){
			return "minecraftrealms:textures/models/armor/ragnarite_2.png";
		}	
		return "minecraftrealms:textures/models/armor/ragnarite_1.png";
		}
	}
}
