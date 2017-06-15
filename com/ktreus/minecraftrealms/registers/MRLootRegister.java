package com.ktreus.minecraftrealms.registers;

import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

public class MRLootRegister {
public static void mainRegistry(){
	MRLootRegister.init();
	MRLootRegister.register();
}
public static void init(){}
public static void register(){
	ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(MRMiscRegister.tpDevice),1,1,30));
	ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(MRMiscRegister.tpDevice),1,1,30));
}
}
