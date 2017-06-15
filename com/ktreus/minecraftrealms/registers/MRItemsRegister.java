package com.ktreus.minecraftrealms.registers;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.ktreus.minecraftrealms.items.GemsBase;
import com.ktreus.minecraftrealms.items.IngotBase;

import cpw.mods.fml.common.registry.GameRegistry;

public class MRItemsRegister {
// lingotes e gemas - declarações
	public static Item ingotBase;
	public static Item ingotCobalt;
	public static Item ingotEndernite;
	public static Item ingotMagnetite;
	public static Item ingotNethiron;
	public static Item ingotRagnarite;
	public static Item gemsBase;
	public static Item gemsEnderCristal;
	public static void mainRegistry(){
	MRItemsRegister.init();
	MRItemsRegister.register();
}
	public static void init(){
		// lingotes a partir daqui
		ingotBase = new IngotBase().setUnlocalizedName("BaseIngot").setTextureName("minecraftrealms:none");//.setCreativeTab(tabMRItems);
		ingotCobalt = new IngotBase.IngotCobalt().setUnlocalizedName("CobaltIngot").setTextureName("minecraftrealms:ingotCobalt").setCreativeTab(tabMRItems);
		ingotEndernite = new IngotBase.IngotEndernite().setUnlocalizedName("EnderniteIngot").setTextureName("minecraftrealms:ingotEndernite").setCreativeTab(tabMRItems);
		ingotMagnetite = new IngotBase.IngotMagnetite().setUnlocalizedName("MagnetiteIngot").setTextureName("minecraftrealms:ingotMagnetite").setCreativeTab(tabMRItems);
		ingotNethiron = new IngotBase.IngotNethiron().setUnlocalizedName("NethironIngot").setTextureName("minecraftrealms:ingotNethiron").setCreativeTab(tabMRItems);
		ingotRagnarite = new IngotBase.IngotRagnarite().setUnlocalizedName("RagnariteIngot").setTextureName("minecraftrealms:ingotRagnarite").setCreativeTab(tabMRItems);
		// gemas a partir daqui
		gemsBase = new GemsBase().setUnlocalizedName("GemsBase").setTextureName("minecraftrealms:none");//.setCreativeTab(tabMRItems);
		gemsEnderCristal = new GemsBase.GemsEnderCristal().setUnlocalizedName("GemsEnderCristal").setTextureName("minecraftrealms:enderCristal").setCreativeTab(tabMRItems);
		// comidas a partir daqui
		// drops de monstros a partir daqui
	}
	public static void register(){
		GameRegistry.registerItem(ingotBase, ingotBase.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ingotCobalt, ingotCobalt.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ingotEndernite, ingotEndernite.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ingotMagnetite, ingotMagnetite.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ingotNethiron, ingotNethiron.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ingotRagnarite, ingotRagnarite.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(gemsBase, gemsBase.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(gemsEnderCristal, gemsEnderCristal.getUnlocalizedName().substring(5));
	}
	public static CreativeTabs tabMRItems = new CreativeTabs("tabMRItems"){
		@Override
		public Item getTabIconItem() {
			return new ItemStack(ingotCobalt).getItem();
			
		}
	};
}
