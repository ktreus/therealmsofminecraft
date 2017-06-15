package com.ktreus.minecraftrealms.registers;

import net.minecraft.item.Item;

import com.ktreus.minecraftrealms.tools.AxeBase;
import com.ktreus.minecraftrealms.tools.HoeBase;
import com.ktreus.minecraftrealms.tools.PickaxeBase;
import com.ktreus.minecraftrealms.tools.ShovelBase;
import com.ktreus.minecraftrealms.tools.SwordBase;

import cpw.mods.fml.common.registry.GameRegistry;

public class MRToolsRegister {
	public static Item swordBase;
	public static Item pickaxeBase;
	public static Item axeBase;
	public static Item shovelBase;
	public static Item hoeBase;
	
	public static Item swordCobalt;
	public static Item pickaxeCobalt;
	public static Item axeCobalt;
	public static Item shovelCobalt;
	public static Item hoeCobalt;
	
	public static Item swordEnderCristal;
	public static Item pickaxeEnderCristal;
	public static Item axeEnderCristal;
	public static Item shovelEnderCristal;
	public static Item hoeEnderCristal;
	
	public static Item swordEndernite;
	public static Item pickaxeEndernite;
	public static Item axeEndernite;
	public static Item shovelEndernite;
	public static Item hoeEndernite;

	public static Item swordMagnetite;
	public static Item pickaxeMagnetite;
	public static Item axeMagnetite;
	public static Item shovelMagnetite;
	public static Item hoeMagnetite;

	public static Item swordNethiron;
	public static Item pickaxeNethiron;
	public static Item axeNethiron;
	public static Item shovelNethiron;
	public static Item hoeNethiron;
	
	public static Item swordRagnarite;
	public static Item pickaxeRagnarite;
	public static Item axeRagnarite;
	public static Item shovelRagnarite;
	public static Item hoeRagnarite;
	
	public static void mainRegistry(){
		MRToolsRegister.init();
		MRToolsRegister.register();
	}
	public static void init(){
		swordBase = new SwordBase(MRMaterialsRegister.obsidianMaterial)/*.setCreativeTab(MRItemsRegister.tabMRItems)*/.setUnlocalizedName("swordBase").setTextureName("minecraftrealms:tools/swordBase");
		pickaxeBase = new PickaxeBase(MRMaterialsRegister.obsidianMaterial)/*.setCreativeTab(MRItemsRegister.tabMRItems)*/.setUnlocalizedName("pickaxeBase").setTextureName("minecraftrealms:tools/pickaxeBase");
		axeBase = new AxeBase(MRMaterialsRegister.obsidianMaterial)./*setCreativeTab(MRItemsRegister.tabMRItems).*/setUnlocalizedName("axeBase").setTextureName("minecraftrealms:tools/axeBase");
		shovelBase = new ShovelBase(MRMaterialsRegister.obsidianMaterial)./*setCreativeTab(MRItemsRegister.tabMRItems).*/setUnlocalizedName("shovelBase").setTextureName("minecraftrealms:tools/shovelBase");
		hoeBase = new HoeBase(MRMaterialsRegister.obsidianMaterial)./*setCreativeTab(MRItemsRegister.tabMRItems).*/setUnlocalizedName("hoeBase").setTextureName("minecraftrealms:tools/hoeBase");
	
		swordCobalt = new SwordBase.SwordCobalt(MRMaterialsRegister.cobaltMaterial).setCreativeTab(MRItemsRegister.tabMRItems).setUnlocalizedName("swordCobalt").setTextureName("minecraftrealms:tools/swordCobalt");
		pickaxeCobalt = new PickaxeBase.PickaxeCobalt(MRMaterialsRegister.cobaltMaterial).setCreativeTab(MRItemsRegister.tabMRItems).setUnlocalizedName("pickaxeCobalt").setTextureName("minecraftrealms:tools/pickaxeCobalt");
		axeCobalt = new AxeBase.AxeCobalt(MRMaterialsRegister.cobaltMaterial).setCreativeTab(MRItemsRegister.tabMRItems).setUnlocalizedName("axeCobalt").setTextureName("minecraftrealms:tools/axeCobalt");
		shovelCobalt = new ShovelBase.ShovelCobalt(MRMaterialsRegister.cobaltMaterial).setCreativeTab(MRItemsRegister.tabMRItems).setUnlocalizedName("shovelCobalt").setTextureName("minecraftrealms:tools/shovelCobalt");
		hoeCobalt = new HoeBase.HoeCobalt(MRMaterialsRegister.cobaltMaterial).setCreativeTab(MRItemsRegister.tabMRItems).setUnlocalizedName("hoeCobalt").setTextureName("minecraftrealms:tools/hoeCobalt");
	
		swordEnderCristal = new SwordBase.SwordEnderCristal(MRMaterialsRegister.endercristalMaterial).setCreativeTab(MRItemsRegister.tabMRItems).setUnlocalizedName("swordEnderCristal").setTextureName("minecraftrealms:tools/swordEnderCristal");
		pickaxeEnderCristal = new PickaxeBase.PickaxeEnderCristal(MRMaterialsRegister.endercristalMaterial).setCreativeTab(MRItemsRegister.tabMRItems).setUnlocalizedName("pickaxeEnderCristal").setTextureName("minecraftrealms:tools/pickaxeEnderCristal");
		axeEnderCristal = new AxeBase.AxeEnderCristal(MRMaterialsRegister.endercristalMaterial).setCreativeTab(MRItemsRegister.tabMRItems).setUnlocalizedName("axeEnderCristal").setTextureName("minecraftrealms:tools/axeEnderCristal");
		shovelEnderCristal = new ShovelBase.ShovelEnderCristal(MRMaterialsRegister.endercristalMaterial).setCreativeTab(MRItemsRegister.tabMRItems).setUnlocalizedName("shovelEnderCristal").setTextureName("minecraftrealms:tools/shovelEnderCristal");
		hoeEnderCristal = new HoeBase.HoeEnderCristal(MRMaterialsRegister.endercristalMaterial).setCreativeTab(MRItemsRegister.tabMRItems).setUnlocalizedName("hoeEnderCristal").setTextureName("minecraftrealms:tools/hoeEnderCristal");
		
		swordEndernite = new SwordBase.SwordEndernite(MRMaterialsRegister.enderniteMaterial).setCreativeTab(MRItemsRegister.tabMRItems).setUnlocalizedName("swordEndernite").setTextureName("minecraftrealms:tools/swordEndernite");
		pickaxeEndernite = new PickaxeBase.PickaxeEndernite(MRMaterialsRegister.enderniteMaterial).setCreativeTab(MRItemsRegister.tabMRItems).setUnlocalizedName("pickaxeEndernite").setTextureName("minecraftrealms:tools/pickaxeEndernite");
		axeEndernite = new AxeBase.AxeEndernite(MRMaterialsRegister.enderniteMaterial).setCreativeTab(MRItemsRegister.tabMRItems).setUnlocalizedName("axeEndernite").setTextureName("minecraftrealms:tools/axeEndernite");
		shovelEndernite = new ShovelBase.ShovelEndernite(MRMaterialsRegister.enderniteMaterial).setCreativeTab(MRItemsRegister.tabMRItems).setUnlocalizedName("shovelEndernite").setTextureName("minecraftrealms:tools/shovelEndernite");
		hoeEndernite = new HoeBase.HoeEndernite(MRMaterialsRegister.enderniteMaterial).setCreativeTab(MRItemsRegister.tabMRItems).setUnlocalizedName("hoeEndernite").setTextureName("minecraftrealms:tools/hoeEndernite");
		
		swordMagnetite = new SwordBase.SwordMagnetite(MRMaterialsRegister.magnetiteMaterial).setCreativeTab(MRItemsRegister.tabMRItems).setUnlocalizedName("swordMagnetite").setTextureName("minecraftrealms:tools/swordMagnetite");
		pickaxeMagnetite = new PickaxeBase.PickaxeMagnetite(MRMaterialsRegister.magnetiteMaterial).setCreativeTab(MRItemsRegister.tabMRItems).setUnlocalizedName("pickaxeMagnetite").setTextureName("minecraftrealms:tools/pickaxeMagnetite");
		axeMagnetite = new AxeBase.AxeMagnetite(MRMaterialsRegister.magnetiteMaterial).setCreativeTab(MRItemsRegister.tabMRItems).setUnlocalizedName("axeMagnetite").setTextureName("minecraftrealms:tools/axeMagnetite");
		shovelMagnetite = new ShovelBase.ShovelMagnetite(MRMaterialsRegister.magnetiteMaterial).setCreativeTab(MRItemsRegister.tabMRItems).setUnlocalizedName("shovelMagnetite").setTextureName("minecraftrealms:tools/shovelMagnetite");
		hoeMagnetite = new HoeBase.HoeMagnetite(MRMaterialsRegister.magnetiteMaterial).setCreativeTab(MRItemsRegister.tabMRItems).setUnlocalizedName("hoeMagnetite").setTextureName("minecraftrealms:tools/hoeMagnetite");
		
		swordNethiron = new SwordBase.SwordNethiron(MRMaterialsRegister.nethironMaterial).setCreativeTab(MRItemsRegister.tabMRItems).setUnlocalizedName("swordNethiron").setTextureName("minecraftrealms:tools/swordNethiron");
		pickaxeNethiron = new PickaxeBase.PickaxeNethiron(MRMaterialsRegister.nethironMaterial).setCreativeTab(MRItemsRegister.tabMRItems).setUnlocalizedName("pickaxeNethiron").setTextureName("minecraftrealms:tools/pickaxeNethiron");
		axeNethiron = new AxeBase.AxeNethiron(MRMaterialsRegister.nethironMaterial).setCreativeTab(MRItemsRegister.tabMRItems).setUnlocalizedName("axeNethiron").setTextureName("minecraftrealms:tools/axeNethiron");
		shovelNethiron = new ShovelBase.ShovelNethiron(MRMaterialsRegister.nethironMaterial).setCreativeTab(MRItemsRegister.tabMRItems).setUnlocalizedName("shovelNethiron").setTextureName("minecraftrealms:tools/shovelNethiron");
		hoeNethiron = new HoeBase.HoeNethiron(MRMaterialsRegister.nethironMaterial).setCreativeTab(MRItemsRegister.tabMRItems).setUnlocalizedName("hoeNethiron").setTextureName("minecraftrealms:tools/hoeNethiron");

		swordRagnarite = new SwordBase.SwordRagnarite(MRMaterialsRegister.ragnariteMaterial).setCreativeTab(MRItemsRegister.tabMRItems).setUnlocalizedName("swordRagnarite").setTextureName("minecraftrealms:tools/swordRagnarite");
		pickaxeRagnarite = new PickaxeBase.PickaxeRagnarite(MRMaterialsRegister.ragnariteMaterial).setCreativeTab(MRItemsRegister.tabMRItems).setUnlocalizedName("pickaxeRagnarite").setTextureName("minecraftrealms:tools/pickaxeRagnarite");
		axeRagnarite = new AxeBase.AxeRagnarite(MRMaterialsRegister.ragnariteMaterial).setCreativeTab(MRItemsRegister.tabMRItems).setUnlocalizedName("axeRagnarite").setTextureName("minecraftrealms:tools/axeRagnarite");
		shovelRagnarite = new ShovelBase.ShovelRagnarite(MRMaterialsRegister.ragnariteMaterial).setCreativeTab(MRItemsRegister.tabMRItems).setUnlocalizedName("shovelRagnarite").setTextureName("minecraftrealms:tools/shovelRagnarite");
		hoeRagnarite = new HoeBase.HoeRagnarite(MRMaterialsRegister.ragnariteMaterial).setCreativeTab(MRItemsRegister.tabMRItems).setUnlocalizedName("hoeRagnarite").setTextureName("minecraftrealms:tools/hoeRagnarite");
	
	
	
	}
	public static void register(){
		GameRegistry.registerItem(swordBase, swordBase.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(pickaxeBase, pickaxeBase.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(axeBase, axeBase.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(shovelBase, shovelBase.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(hoeBase, hoeBase.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(swordCobalt, swordCobalt.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(pickaxeCobalt, pickaxeCobalt.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(axeCobalt, axeCobalt.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(shovelCobalt, shovelCobalt.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(hoeCobalt, hoeCobalt.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(swordEnderCristal, swordEnderCristal.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(pickaxeEnderCristal, pickaxeEnderCristal.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(axeEnderCristal, axeEnderCristal.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(shovelEnderCristal, shovelEnderCristal.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(hoeEnderCristal, hoeEnderCristal.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(swordEndernite, swordEndernite.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(pickaxeEndernite, pickaxeEndernite.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(axeEndernite, axeEndernite.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(shovelEndernite, shovelEndernite.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(hoeEndernite, hoeEndernite.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(swordMagnetite, swordMagnetite.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(pickaxeMagnetite, pickaxeMagnetite.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(axeMagnetite, axeMagnetite.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(shovelMagnetite, shovelMagnetite.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(hoeMagnetite, hoeMagnetite.getUnlocalizedName().substring(5));

		GameRegistry.registerItem(swordNethiron, swordNethiron.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(pickaxeNethiron, pickaxeNethiron.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(axeNethiron, axeNethiron.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(shovelNethiron, shovelNethiron.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(hoeNethiron, hoeNethiron.getUnlocalizedName().substring(5));
		

		GameRegistry.registerItem(swordRagnarite, swordRagnarite.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(pickaxeRagnarite, pickaxeRagnarite.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(axeRagnarite, axeRagnarite.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(shovelRagnarite, shovelRagnarite.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(hoeRagnarite, hoeRagnarite.getUnlocalizedName().substring(5));
		
		
	}
}
