package com.ktreus.minecraftrealms.registers;

import net.minecraft.block.Block;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

import com.ktreus.minecraftrealms.tools.greatswords.BaseGreatSword;
import com.ktreus.minecraftrealms.tools.greatswords.DiamondGreatsword;

import cpw.mods.fml.common.registry.GameRegistry;

public class MRGreatSwordsRegister {
	public static ItemSword baseGreatsword;
	public static BaseGreatSword diamondGreatsword;
public static void mainRegistry(){
	MRGreatSwordsRegister.init();
	MRGreatSwordsRegister.register();
}
public static void init(){
	baseGreatsword = (ItemSword) new BaseGreatSword(MRMaterialsRegister.obsidianMaterial).setUnlocalizedName("obsidianGreatsword").setTextureName("minecraftrealms:tools/uniques/obsidianGreatsword");
	diamondGreatsword = (BaseGreatSword) new DiamondGreatsword(ToolMaterial.EMERALD).setUnlocalizedName("diamondGreatsword").setTextureName("minecraftrealms:tools/uniques/diamondGreatsword");
}

public static void register(){
	//ITEMS
	GameRegistry.registerItem(baseGreatsword, baseGreatsword.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(diamondGreatsword, diamondGreatsword.getUnlocalizedName().substring(5));
	
}
}
