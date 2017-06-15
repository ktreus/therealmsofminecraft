package com.ktreus.minecraftrealms.registers;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

import com.ktreus.minecraftrealms.tools.uniques.MagestrySword;

import cpw.mods.fml.common.registry.GameRegistry;

public class MRUniquesRegister {
	public static ItemSword majestrySword;
public static void mainRegistry(){
	MRUniquesRegister.init();
	MRUniquesRegister.register();
}
public static void init(){
	majestrySword = (ItemSword) new MagestrySword(ToolMaterial.EMERALD).setUnlocalizedName("MajesticSword").setTextureName("minecraftrealms:tools/uniques/sword02");
}
public static void register(){
	GameRegistry.registerItem(majestrySword, majestrySword.getUnlocalizedName().substring(5));
}
}
																																	