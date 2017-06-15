package com.ktreus.minecraftrealms.registers;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class MRRecipesRegister {
 public static void registerRecipes(){
	 //// armaduras e blocos
		GameRegistry.addRecipe(new ItemStack(MRBlocksRegister.blockStackCobalt), new Object[]{"PPP","PPP","PPP",'P', MRItemsRegister.ingotCobalt});
		GameRegistry.addShapelessRecipe(new ItemStack(MRItemsRegister.ingotCobalt, 9), MRBlocksRegister.blockStackCobalt);
		GameRegistry.addRecipe(new ItemStack(MRArmorsRegister.armorCobaltHelmet), new Object[]{"PPP","P P","   ",'P', MRItemsRegister.ingotCobalt});
		GameRegistry.addRecipe(new ItemStack(MRArmorsRegister.armorCobaltChest), new Object[]{"P P","PPP","PPP",'P', MRItemsRegister.ingotCobalt});
		GameRegistry.addRecipe(new ItemStack(MRArmorsRegister.armorCobaltLegs), new Object[]{"PPP","P P","P P",'P', MRItemsRegister.ingotCobalt});
		GameRegistry.addRecipe(new ItemStack(MRArmorsRegister.armorCobaltBoots), new Object[]{"P P","P P","   ",'P', MRItemsRegister.ingotCobalt});
		
		GameRegistry.addRecipe(new ItemStack(MRBlocksRegister.blockStackEnderCristal), new Object[]{"PPP","PPP","PPP",'P', MRItemsRegister.gemsEnderCristal});
		GameRegistry.addShapelessRecipe(new ItemStack(MRItemsRegister.gemsEnderCristal, 9), MRBlocksRegister.blockStackEnderCristal);
		GameRegistry.addRecipe(new ItemStack(MRArmorsRegister.armorEnderCristalHelmet), new Object[]{"PPP","P P","   ",'P', MRItemsRegister.gemsEnderCristal});
		GameRegistry.addRecipe(new ItemStack(MRArmorsRegister.armorEnderCristalChest), new Object[]{"P P","PPP","PPP",'P', MRItemsRegister.gemsEnderCristal});
		GameRegistry.addRecipe(new ItemStack(MRArmorsRegister.armorEnderCristalLegs), new Object[]{"PPP","P P","P P",'P', MRItemsRegister.gemsEnderCristal});
		GameRegistry.addRecipe(new ItemStack(MRArmorsRegister.armorEnderCristalBoots), new Object[]{"P P","P P","   ",'P', MRItemsRegister.gemsEnderCristal});
		
		GameRegistry.addRecipe(new ItemStack(MRBlocksRegister.blockStackEndernite), new Object[]{"PPP","PPP","PPP",'P', MRItemsRegister.ingotEndernite});
		GameRegistry.addShapelessRecipe(new ItemStack(MRItemsRegister.ingotEndernite, 9), MRBlocksRegister.blockStackEndernite);
		GameRegistry.addRecipe(new ItemStack(MRArmorsRegister.armorEnderniteHelmet), new Object[]{"PPP","P P","   ",'P', MRItemsRegister.ingotEndernite});
		GameRegistry.addRecipe(new ItemStack(MRArmorsRegister.armorEnderniteChest), new Object[]{"P P","PPP","PPP",'P', MRItemsRegister.ingotEndernite});
		GameRegistry.addRecipe(new ItemStack(MRArmorsRegister.armorEnderniteLegs), new Object[]{"PPP","P P","P P",'P', MRItemsRegister.ingotEndernite});
		GameRegistry.addRecipe(new ItemStack(MRArmorsRegister.armorEnderniteBoots), new Object[]{"P P","P P","   ",'P', MRItemsRegister.ingotEndernite});
		
		GameRegistry.addRecipe(new ItemStack(MRBlocksRegister.blockStackMagnetite), new Object[]{"PPP","PPP","PPP",'P', MRItemsRegister.ingotMagnetite});
		GameRegistry.addShapelessRecipe(new ItemStack(MRItemsRegister.ingotMagnetite, 9), MRBlocksRegister.blockStackMagnetite);
		GameRegistry.addRecipe(new ItemStack(MRArmorsRegister.armorMagnetiteHelmet), new Object[]{"PPP","P P","   ",'P', MRItemsRegister.ingotMagnetite});
		GameRegistry.addRecipe(new ItemStack(MRArmorsRegister.armorMagnetiteChest), new Object[]{"P P","PPP","PPP",'P', MRItemsRegister.ingotMagnetite});
		GameRegistry.addRecipe(new ItemStack(MRArmorsRegister.armorMagnetiteLegs), new Object[]{"PPP","P P","P P",'P', MRItemsRegister.ingotMagnetite});
		GameRegistry.addRecipe(new ItemStack(MRArmorsRegister.armorMagnetiteBoots), new Object[]{"P P","P P","   ",'P', MRItemsRegister.ingotMagnetite});
		
		GameRegistry.addRecipe(new ItemStack(MRBlocksRegister.blockStackNethiron), new Object[]{"PPP","PPP","PPP",'P', MRItemsRegister.ingotNethiron});
		GameRegistry.addShapelessRecipe(new ItemStack(MRItemsRegister.ingotNethiron, 9), MRBlocksRegister.blockStackNethiron);
		GameRegistry.addRecipe(new ItemStack(MRArmorsRegister.armorNethironHelmet), new Object[]{"PPP","P P","   ",'P', MRItemsRegister.ingotNethiron});
		GameRegistry.addRecipe(new ItemStack(MRArmorsRegister.armorNethironChest), new Object[]{"P P","PPP","PPP",'P', MRItemsRegister.ingotNethiron});
		GameRegistry.addRecipe(new ItemStack(MRArmorsRegister.armorNethironLegs), new Object[]{"PPP","P P","P P",'P', MRItemsRegister.ingotNethiron});
		GameRegistry.addRecipe(new ItemStack(MRArmorsRegister.armorNethironBoots), new Object[]{"P P","P P","   ",'P', MRItemsRegister.ingotNethiron});
		
		GameRegistry.addRecipe(new ItemStack(MRBlocksRegister.blockStackRagnarite), new Object[]{"PPP","PPP","PPP",'P', MRItemsRegister.ingotRagnarite});
		GameRegistry.addShapelessRecipe(new ItemStack(MRItemsRegister.ingotRagnarite, 9), MRBlocksRegister.blockStackRagnarite);
		GameRegistry.addRecipe(new ItemStack(MRArmorsRegister.armorRagnariteHelmet), new Object[]{"PPP","P P","   ",'P', MRItemsRegister.ingotRagnarite});
		GameRegistry.addRecipe(new ItemStack(MRArmorsRegister.armorRagnariteChest), new Object[]{"P P","PPP","PPP",'P', MRItemsRegister.ingotRagnarite});
		GameRegistry.addRecipe(new ItemStack(MRArmorsRegister.armorRagnariteLegs), new Object[]{"PPP","P P","P P",'P', MRItemsRegister.ingotRagnarite});
		GameRegistry.addRecipe(new ItemStack(MRArmorsRegister.armorRagnariteBoots), new Object[]{"P P","P P","   ",'P', MRItemsRegister.ingotRagnarite});
		///// ferramentas e combate
		GameRegistry.addRecipe(new ItemStack(MRToolsRegister.pickaxeCobalt), new Object[]{"PPP"," s "," s ",'P', MRItemsRegister.ingotCobalt, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MRToolsRegister.axeCobalt), new Object[]{"PP ","Ps "," s ",'P', MRItemsRegister.ingotCobalt, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MRToolsRegister.swordCobalt), new Object[]{" P "," P "," s ",'P', MRItemsRegister.ingotCobalt, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MRToolsRegister.shovelCobalt), new Object[]{" P "," s "," s ",'P', MRItemsRegister.ingotCobalt, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MRToolsRegister.hoeCobalt), new Object[]{"PP "," s "," s ",'P', MRItemsRegister.ingotCobalt, 's', Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(MRToolsRegister.pickaxeEnderCristal), new Object[]{"PPP"," s "," s ",'P', MRItemsRegister.gemsEnderCristal, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MRToolsRegister.axeEnderCristal), new Object[]{"PP ","Ps "," s ",'P', MRItemsRegister.gemsEnderCristal, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MRToolsRegister.swordEnderCristal), new Object[]{" P "," P "," s ",'P', MRItemsRegister.gemsEnderCristal, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MRToolsRegister.shovelEnderCristal), new Object[]{" P "," s "," s ",'P', MRItemsRegister.gemsEnderCristal, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MRToolsRegister.hoeEnderCristal), new Object[]{"PP "," s "," s ",'P', MRItemsRegister.gemsEnderCristal, 's', Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(MRToolsRegister.pickaxeEndernite), new Object[]{"PPP"," s "," s ",'P', MRItemsRegister.ingotEndernite, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MRToolsRegister.axeEndernite), new Object[]{"PP ","Ps "," s ",'P', MRItemsRegister.ingotEndernite, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MRToolsRegister.swordEndernite), new Object[]{" P "," P "," s ",'P', MRItemsRegister.ingotEndernite, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MRToolsRegister.shovelEndernite), new Object[]{" P "," s "," s ",'P', MRItemsRegister.ingotEndernite, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MRToolsRegister.hoeEndernite), new Object[]{"PP "," s "," s ",'P', MRItemsRegister.ingotEndernite, 's', Items.stick});
 
		GameRegistry.addRecipe(new ItemStack(MRToolsRegister.pickaxeMagnetite), new Object[]{"PPP"," s "," s ",'P', MRItemsRegister.ingotMagnetite, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MRToolsRegister.axeMagnetite), new Object[]{"PP ","Ps "," s ",'P', MRItemsRegister.ingotMagnetite, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MRToolsRegister.swordMagnetite), new Object[]{" P "," P "," s ",'P', MRItemsRegister.ingotMagnetite, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MRToolsRegister.shovelMagnetite), new Object[]{" P "," s "," s ",'P', MRItemsRegister.ingotMagnetite, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MRToolsRegister.hoeMagnetite), new Object[]{"PP "," s "," s ",'P', MRItemsRegister.ingotMagnetite, 's', Items.stick});
 
		GameRegistry.addRecipe(new ItemStack(MRToolsRegister.pickaxeNethiron), new Object[]{"PPP"," s "," s ",'P', MRItemsRegister.ingotNethiron, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MRToolsRegister.axeNethiron), new Object[]{"PP ","Ps "," s ",'P', MRItemsRegister.ingotNethiron, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MRToolsRegister.swordNethiron), new Object[]{" P "," P "," s ",'P', MRItemsRegister.ingotNethiron, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MRToolsRegister.shovelNethiron), new Object[]{" P "," s "," s ",'P', MRItemsRegister.ingotNethiron, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MRToolsRegister.hoeNethiron), new Object[]{"PP "," s "," s ",'P', MRItemsRegister.ingotNethiron, 's', Items.stick});
 
		GameRegistry.addRecipe(new ItemStack(MRToolsRegister.pickaxeRagnarite), new Object[]{"PPP"," s "," s ",'P', MRItemsRegister.ingotRagnarite, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MRToolsRegister.axeRagnarite), new Object[]{"PP ","Ps "," s ",'P', MRItemsRegister.ingotRagnarite, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MRToolsRegister.swordRagnarite), new Object[]{" P "," P "," s ",'P', MRItemsRegister.ingotRagnarite, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MRToolsRegister.shovelRagnarite), new Object[]{" P "," s "," s ",'P', MRItemsRegister.ingotRagnarite, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MRToolsRegister.hoeRagnarite), new Object[]{"PP "," s "," s ",'P', MRItemsRegister.ingotRagnarite, 's', Items.stick});
  
 }
}
