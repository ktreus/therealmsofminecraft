package com.ktreus.minecraftrealms.registers;


import net.minecraft.item.Item;

import com.ktreus.minecraftrealms.items.armorBase;

import cpw.mods.fml.common.registry.GameRegistry;

public class MRArmorsRegister {
	public static Item armorBaseHelmet;
	public static Item armorBaseChest;
	public static Item armorBaseLegs;
	public static Item armorBaseBoots;
	public static Item armorCobaltHelmet;	
	public static Item armorCobaltChest;	
	public static Item armorCobaltLegs;	
	public static Item armorCobaltBoots;	
	public static Item armorEnderCristalHelmet;
	public static Item armorEnderCristalChest;
	public static Item armorEnderCristalBoots;
	public static Item armorEnderCristalLegs;
	public static Item armorEnderniteHelmet;
	public static Item armorEnderniteChest;
	public static Item armorEnderniteBoots;
	public static Item armorEnderniteLegs;
	public static Item armorMagnetiteHelmet;
	public static Item armorMagnetiteChest;
	public static Item armorMagnetiteBoots;
	public static Item armorMagnetiteLegs;
	public static Item armorNethironHelmet;
	public static Item armorNethironChest;
	public static Item armorNethironBoots;
	public static Item armorNethironLegs;
	public static Item armorRagnariteHelmet;
	public static Item armorRagnariteChest;
	public static Item armorRagnariteBoots;
	public static Item armorRagnariteLegs;
	
	public static void mainRegistry(){
		MRArmorsRegister.init();
		MRArmorsRegister.register();
	}
	public static void init(){
		armorBaseHelmet = new armorBase(MRMaterialsRegister.baseArmorMaterial, 0, 0).setUnlocalizedName("armorBase1").setTextureName("minecraftrealms:armors/helmetBase");
		armorBaseChest = new armorBase(MRMaterialsRegister.baseArmorMaterial, 0, 1).setUnlocalizedName("armorBase2").setTextureName("minecraftrealms:armors/chestplateBase");
		armorBaseLegs = new armorBase(MRMaterialsRegister.baseArmorMaterial, 0, 2).setUnlocalizedName("armorBase3").setTextureName("minecraftrealms:armors/leggingsBase");
		armorBaseBoots = new armorBase(MRMaterialsRegister.baseArmorMaterial, 0, 3).setUnlocalizedName("armorBase4").setTextureName("minecraftrealms:/armors/bootsBase");
		/// cobalt armor ///
		armorCobaltHelmet = new armorBase.armorCobalt(MRMaterialsRegister.cobaltArmorMaterial, 0 , 0).setUnlocalizedName("helmetCobalt").setTextureName("minecraftrealms:armors/helmetCobalt").setCreativeTab(MRItemsRegister.tabMRItems);
		armorCobaltChest = new armorBase.armorCobalt(MRMaterialsRegister.cobaltArmorMaterial, 0 , 1).setUnlocalizedName("chestplateCobalt").setTextureName("minecraftrealms:armors/chestplateCobalt").setCreativeTab(MRItemsRegister.tabMRItems);
		armorCobaltLegs = new armorBase.armorCobalt(MRMaterialsRegister.cobaltArmorMaterial, 0 , 2).setUnlocalizedName("leggingsCobalt").setTextureName("minecraftrealms:armors/leggingsCobalt").setCreativeTab(MRItemsRegister.tabMRItems);
		armorCobaltBoots = new armorBase.armorCobalt(MRMaterialsRegister.cobaltArmorMaterial, 0 , 3).setUnlocalizedName("bootsCobalt").setTextureName("minecraftrealms:armors/bootsCobalt").setCreativeTab(MRItemsRegister.tabMRItems);
		/// ender cristal armor ///
		armorEnderCristalHelmet = new armorBase.armorEnderCristal(MRMaterialsRegister.enderCristalArmorMaterial, 0 , 0).setUnlocalizedName("helmetEnderCristal").setTextureName("minecraftrealms:armors/helmetEnderCristal").setCreativeTab(MRItemsRegister.tabMRItems);
		armorEnderCristalChest = new armorBase.armorEnderCristal(MRMaterialsRegister.enderCristalArmorMaterial, 0 , 1).setUnlocalizedName("chestplateEnderCristal").setTextureName("minecraftrealms:armors/chestplateEnderCristal").setCreativeTab(MRItemsRegister.tabMRItems);
		armorEnderCristalLegs = new armorBase.armorEnderCristal(MRMaterialsRegister.enderCristalArmorMaterial, 0 , 2).setUnlocalizedName("leggingsEnderCristal").setTextureName("minecraftrealms:armors/leggingsEnderCristal").setCreativeTab(MRItemsRegister.tabMRItems);
		armorEnderCristalBoots = new armorBase.armorEnderCristal(MRMaterialsRegister.enderCristalArmorMaterial, 0 , 3).setUnlocalizedName("bootsEnderCristal").setTextureName("minecraftrealms:armors/bootsEnderCristal").setCreativeTab(MRItemsRegister.tabMRItems);
		/// endernite ///
		armorEnderniteHelmet = new armorBase.armorEndernite(MRMaterialsRegister.enderniteArmorMaterial, 0 , 0).setUnlocalizedName("helmetEndernite").setTextureName("minecraftrealms:armors/helmetEndernite").setCreativeTab(MRItemsRegister.tabMRItems);
		armorEnderniteChest = new armorBase.armorEndernite(MRMaterialsRegister.enderniteArmorMaterial, 0 , 1).setUnlocalizedName("chestplateEndernite").setTextureName("minecraftrealms:armors/chestplateEndernite").setCreativeTab(MRItemsRegister.tabMRItems);
		armorEnderniteLegs = new armorBase.armorEndernite(MRMaterialsRegister.enderniteArmorMaterial, 0 , 2).setUnlocalizedName("leggingsEndernite").setTextureName("minecraftrealms:armors/leggingsEndernite").setCreativeTab(MRItemsRegister.tabMRItems);
		armorEnderniteBoots = new armorBase.armorEndernite(MRMaterialsRegister.enderniteArmorMaterial, 0 , 3).setUnlocalizedName("bootsEndernite").setTextureName("minecraftrealms:armors/bootsEndernite").setCreativeTab(MRItemsRegister.tabMRItems);
		/// magnetite ///
		armorMagnetiteHelmet = new armorBase.armorMagnetite(MRMaterialsRegister.magnetiteArmorMaterial, 0 , 0).setUnlocalizedName("helmetMagnetite").setTextureName("minecraftrealms:armors/helmetMagnetite").setCreativeTab(MRItemsRegister.tabMRItems);
		armorMagnetiteChest = new armorBase.armorMagnetite(MRMaterialsRegister.magnetiteArmorMaterial, 0 , 1).setUnlocalizedName("chestplateMagnetite").setTextureName("minecraftrealms:armors/chestplateMagnetite").setCreativeTab(MRItemsRegister.tabMRItems);
		armorMagnetiteLegs = new armorBase.armorMagnetite(MRMaterialsRegister.magnetiteArmorMaterial, 0 , 2).setUnlocalizedName("leggingsMagnetite").setTextureName("minecraftrealms:armors/leggingsMagnetite").setCreativeTab(MRItemsRegister.tabMRItems);
		armorMagnetiteBoots = new armorBase.armorMagnetite(MRMaterialsRegister.magnetiteArmorMaterial, 0 , 3).setUnlocalizedName("bootsMagnetite").setTextureName("minecraftrealms:armors/bootsMagnetite").setCreativeTab(MRItemsRegister.tabMRItems);
		/// nethiron ///
		armorNethironHelmet = new armorBase.armorNethiron(MRMaterialsRegister.nethironArmorMaterial, 0 , 0).setUnlocalizedName("helmetNethiron").setTextureName("minecraftrealms:armors/helmetNethiron").setCreativeTab(MRItemsRegister.tabMRItems);
		armorNethironChest = new armorBase.armorNethiron(MRMaterialsRegister.nethironArmorMaterial, 0 , 1).setUnlocalizedName("chestplateNethiron").setTextureName("minecraftrealms:armors/chestplateNethiron").setCreativeTab(MRItemsRegister.tabMRItems);
		armorNethironLegs = new armorBase.armorNethiron(MRMaterialsRegister.nethironArmorMaterial, 0 , 2).setUnlocalizedName("leggingsNethiron").setTextureName("minecraftrealms:armors/leggingsNethiron").setCreativeTab(MRItemsRegister.tabMRItems);
		armorNethironBoots = new armorBase.armorNethiron(MRMaterialsRegister.nethironArmorMaterial, 0 , 3).setUnlocalizedName("bootsNethiron").setTextureName("minecraftrealms:armors/bootsNethiron").setCreativeTab(MRItemsRegister.tabMRItems);
		/// ragnarite ///
		armorRagnariteHelmet = new armorBase.armorRagnarite(MRMaterialsRegister.ragnariteArmorMaterial, 0 , 0).setUnlocalizedName("helmetRagnarite").setTextureName("minecraftrealms:armors/helmetRagnarite").setCreativeTab(MRItemsRegister.tabMRItems);
		armorRagnariteChest = new armorBase.armorRagnarite(MRMaterialsRegister.ragnariteArmorMaterial, 0 , 1).setUnlocalizedName("chestplateRagnarite").setTextureName("minecraftrealms:armors/chestplateRagnarite").setCreativeTab(MRItemsRegister.tabMRItems);
		armorRagnariteLegs = new armorBase.armorRagnarite(MRMaterialsRegister.ragnariteArmorMaterial, 0 , 2).setUnlocalizedName("leggingsRagnarite").setTextureName("minecraftrealms:armors/leggingsRagnarite").setCreativeTab(MRItemsRegister.tabMRItems);
		armorRagnariteBoots = new armorBase.armorRagnarite(MRMaterialsRegister.ragnariteArmorMaterial, 0 , 3).setUnlocalizedName("bootsRagnarite").setTextureName("minecraftrealms:armors/bootsRagnarite").setCreativeTab(MRItemsRegister.tabMRItems);
	}
	public static void register(){
		/// implementação do vanilla
		GameRegistry.registerItem(armorBaseHelmet, armorBaseHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(armorBaseChest, armorBaseChest.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(armorBaseLegs, armorBaseLegs.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(armorBaseBoots, armorBaseBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(armorCobaltHelmet, armorCobaltHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(armorCobaltChest, armorCobaltChest.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(armorCobaltLegs, armorCobaltLegs.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(armorCobaltBoots, armorCobaltBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(armorEnderCristalHelmet, armorEnderCristalHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(armorEnderCristalChest, armorEnderCristalChest.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(armorEnderCristalLegs, armorEnderCristalLegs.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(armorEnderCristalBoots, armorEnderCristalBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(armorEnderniteHelmet, armorEnderniteHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(armorEnderniteChest, armorEnderniteChest.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(armorEnderniteLegs, armorEnderniteLegs.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(armorEnderniteBoots, armorEnderniteBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(armorMagnetiteHelmet, armorMagnetiteHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(armorMagnetiteChest, armorMagnetiteChest.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(armorMagnetiteLegs, armorMagnetiteLegs.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(armorMagnetiteBoots, armorMagnetiteBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(armorNethironHelmet, armorNethironHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(armorNethironChest, armorNethironChest.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(armorNethironLegs, armorNethironLegs.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(armorNethironBoots, armorNethironBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(armorRagnariteHelmet, armorRagnariteHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(armorRagnariteChest, armorRagnariteChest.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(armorRagnariteLegs, armorRagnariteLegs.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(armorRagnariteBoots, armorRagnariteBoots.getUnlocalizedName().substring(5));
	}
}
