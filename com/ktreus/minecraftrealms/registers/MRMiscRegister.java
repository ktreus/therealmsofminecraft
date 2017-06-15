package com.ktreus.minecraftrealms.registers;

import net.minecraft.item.Item;

import com.ktreus.minecraftrealms.items.TPDevice;

import cpw.mods.fml.common.registry.GameRegistry;

public class MRMiscRegister {
	//DECLARAÇÃO DOS ITEMS
	public static Item tpDevice;
	//REGSITERS
	public static void mainRegistry(){
	MRMiscRegister.init();
	MRMiscRegister.register();
}
	public static void init(){
		tpDevice = new TPDevice().setUnlocalizedName("tpDevice").setTextureName("minecraftrealms:tpDevice");
	
}
	public static void register(){
		GameRegistry.registerItem(tpDevice, tpDevice.getUnlocalizedName().substring(5));
	}
}
