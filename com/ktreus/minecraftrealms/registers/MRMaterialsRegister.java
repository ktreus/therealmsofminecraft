package com.ktreus.minecraftrealms.registers;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class MRMaterialsRegister {
	public static final Item.ToolMaterial obsidianMaterial = EnumHelper.addToolMaterial("obsidianMaterial", 4, 1300, 7, 3.5F, 12) ;
	public static final Item.ToolMaterial cobaltMaterial = EnumHelper.addToolMaterial("cobaltMaterial", 5, 1300, 6, 4F, 15) ;
	public static final Item.ToolMaterial nethironMaterial = EnumHelper.addToolMaterial("nethironMaterial", 5, 1400, 5, 4.25F, 15) ;
	public static final Item.ToolMaterial magnetiteMaterial = EnumHelper.addToolMaterial("magnetiteMaterial", 5, 800, 6, 4.45F, 19) ;
	public static final Item.ToolMaterial endercristalMaterial = EnumHelper.addToolMaterial("endercristalMaterial", 6, 1300, 7, 4.8F, 15) ;
	public static final Item.ToolMaterial enderniteMaterial = EnumHelper.addToolMaterial("enderniteMaterial", 6, 1300, 8, 5.15F, 15) ;
	public static final Item.ToolMaterial ragnariteMaterial = EnumHelper.addToolMaterial("ragnariteMaterial", 6, 2300, 7, 4.95F, 15) ;
	
	public static final ItemArmor.ArmorMaterial baseArmorMaterial = EnumHelper.addArmorMaterial("baseArmorMaterial", 1300, new int[]{ 3, 7, 5, 3 }, 12);
	public static final ItemArmor.ArmorMaterial cobaltArmorMaterial = EnumHelper.addArmorMaterial("cobaltArmorMaterial", 1300, new int[]{ 3, 8, 5, 3 }, 12);
	public static final ItemArmor.ArmorMaterial enderCristalArmorMaterial = EnumHelper.addArmorMaterial("enderCristalArmorMaterial", 1300, new int[]{ 4, 8, 5, 3 }, 25);
	public static final ItemArmor.ArmorMaterial enderniteArmorMaterial = EnumHelper.addArmorMaterial("enderniteArmorMaterial", 600, new int[]{ 4, 8, 6, 4 }, 26);
	public static final ItemArmor.ArmorMaterial magnetiteArmorMaterial = EnumHelper.addArmorMaterial("magnetiteArmorMaterial", 300, new int[]{ 3, 8, 5, 4 }, 14);
	public static final ItemArmor.ArmorMaterial nethironArmorMaterial = EnumHelper.addArmorMaterial("nethironArmorMaterial", 800, new int[]{ 4, 8, 5, 4 }, 17);
	public static final ItemArmor.ArmorMaterial ragnariteArmorMaterial = EnumHelper.addArmorMaterial("ragnariteArmorMaterial", 2300, new int[]{ 4, 9, 7, 4 }, 30);
	public static void mainRegistry(){
	}
}

