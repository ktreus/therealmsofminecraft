package com.ktreus.minecraftrealms.registers;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.ktreus.minecraftrealms.blocks.BaseBrick;
import com.ktreus.minecraftrealms.blocks.BaseCrate;
import com.ktreus.minecraftrealms.blocks.BlockStackBase;
import com.ktreus.minecraftrealms.blocks.ores.OreBase;

import cpw.mods.fml.common.registry.GameRegistry;

public class MRBlocksRegister {
	public static Block baseBrick;
	public static Block brick1;
	public static Block brick2;
	public static Block brick3;
	public static Block floor1;
	public static Block floor2;
	public static Block floor3;
	public static Block floor4;
	public static Block crate01;
	public static Block cratePoor;
	public static Block crateNormal;
	public static Block crateGood;
	public static Block crateExcelent;
	public static Block crateSuperb;
	public static Block crateNether;
	public static Block crateEnd;
	public static Block oreBase;
	public static Block oreCobalt;	
	public static Block oreEnderCristal;
	public static Block oreEndernite;
	public static Block oreMagnetite;
	public static Block oreNethiron;
	public static Block oreRagnarite;
	public static Block blockStackBase;
	public static Block blockStackCobalt;
	public static Block blockStackEnderCristal;
	public static Block blockStackEndernite;
	public static Block blockStackMagnetite;
	public static Block blockStackNethiron;
	public static Block blockStackRagnarite;
	
public static void mainRegistry(){
		MRBlocksRegister.init();
		MRBlocksRegister.register();
	}

private static void init(){
	// BLOCO DOS LOOT
	crate01 = new BaseCrate(Material.wood).setBlockName("Crate01").setBlockTextureName("minecraftrealms:crate").setCreativeTab(tabMRBlocks);
	cratePoor = new BaseCrate.CratePoor(Material.wood).setBlockName("CratePoor").setBlockTextureName("minecraftrealms:crate").setCreativeTab(tabMRBlocks);
	crateNormal = new BaseCrate.CrateNormal(Material.wood).setBlockName("CrateNormal").setBlockTextureName("minecraftrealms:crate").setCreativeTab(tabMRBlocks);
	crateGood = new BaseCrate.CrateGood(Material.wood).setBlockName("CrateGood").setBlockTextureName("minecraftrealms:crate").setCreativeTab(tabMRBlocks);
	crateExcelent = new BaseCrate.CrateExcelent(Material.wood).setBlockName("CrateExcelent").setBlockTextureName("minecraftrealms:crate").setCreativeTab(tabMRBlocks);
	crateSuperb = new BaseCrate.CrateSuperb(Material.wood).setBlockName("CrateSuperb").setBlockTextureName("minecraftrealms:crate").setCreativeTab(tabMRBlocks);
	crateNether = new BaseCrate.CrateNether(Material.wood).setBlockName("CrateNether").setBlockTextureName("minecraftrealms:crate").setCreativeTab(tabMRBlocks);
	crateEnd = new BaseCrate.CrateEnd(Material.wood).setBlockName("CrateEnd").setBlockTextureName("minecraftrealms:crate").setCreativeTab(tabMRBlocks);
	// TIJOLO DAS DUNGEON
	baseBrick = new BaseBrick(Material.ground).setBlockName("BaseBrick").setBlockTextureName("minecraftrealms:none");
	brick1 = new BaseBrick.RedBrick(Material.ground).setBlockName("RedBrick").setBlockTextureName("minecraftrealms:bricks/stonebricksred").setCreativeTab(tabMRBlocks);
	brick2 = new BaseBrick.BlackBrick(Material.ground).setBlockName("BlackBrick").setBlockTextureName("minecraftrealms:bricks/stonebricksblack").setCreativeTab(tabMRBlocks);
	brick3 = new BaseBrick.YellowBrick(Material.ground).setBlockName("YellowBrick").setBlockTextureName("minecraftrealms:bricks/stonebricksyellow").setCreativeTab(tabMRBlocks);
	floor1 = new BaseBrick.BlackWhiteFloor(Material.ground).setBlockName("BlackWhiteFloor").setBlockTextureName("minecraftrealms:bricks/stonebricksmooth").setCreativeTab(tabMRBlocks);
	floor2 = new BaseBrick.WhiteFloor(Material.ground).setBlockName("WhiteFloor").setBlockTextureName("minecraftrealms:bricks/dungeonfloor1").setCreativeTab(tabMRBlocks);
	floor3 = new BaseBrick.BlueFloor(Material.ground).setBlockName("BlueFloor").setBlockTextureName("minecraftrealms:bricks/dungeonfloor3").setCreativeTab(tabMRBlocks);
	floor4 = new BaseBrick.RedFloor(Material.ground).setBlockName("RedFloor").setBlockTextureName("minecraftrealms:bricks/dungeonfloor2").setCreativeTab(tabMRBlocks);
	// MINÉRIOS
	oreBase = new OreBase(Material.rock).setBlockName("oreBase").setBlockTextureName("minecraftrealms:none");
	oreCobalt = new OreBase.OreCobalt(Material.rock).setBlockName("OreCobalt").setBlockTextureName("minecraftrealms:/ores/oreCobalt").setCreativeTab(tabMROres);
	oreEnderCristal = new OreBase.OreEnderCristal(Material.rock).setBlockName("OreEnderCristal").setBlockTextureName("minecraftrealms:/ores/oreEnderCristal").setCreativeTab(tabMROres);
	oreEndernite = new OreBase.OreEndernite(Material.rock).setBlockName("OreEndernite").setBlockTextureName("minecraftrealms:/ores/oreEndernite").setCreativeTab(tabMROres);
	oreMagnetite = new OreBase.OreMagnetite(Material.rock).setBlockName("OreMagnetite").setBlockTextureName("minecraftrealms:/ores/oreMagnetite").setCreativeTab(tabMROres);
	oreNethiron = new OreBase.OreNethiron(Material.rock).setBlockName("OreNethiron").setBlockTextureName("minecraftrealms:/ores/oreNethiron").setCreativeTab(tabMROres);
	oreRagnarite = new OreBase.OreRagnarite(Material.rock).setBlockName("OreRagnarite").setBlockTextureName("minecraftrealms:/ores/oreRagnarite").setCreativeTab(tabMROres);
	//BLOCO DOS MINÉRIOS
	blockStackBase = new BlockStackBase(Material.iron).setBlockName("BlockStackBase").setBlockTextureName("minecraftrealms:/stackblocks/blockBase");//.setCreativeTab(tabMRBlocks);
	blockStackCobalt = new BlockStackBase.BlockCobalt(Material.iron).setBlockName("BlockStackCobalt").setBlockTextureName("minecraftrealms:/stackblocks/blockCobalt").setCreativeTab(tabMRBlocks);
	blockStackEnderCristal = new BlockStackBase.BlockEnderCristal(Material.iron).setBlockName("BlockStackEnderCristal").setBlockTextureName("minecraftrealms:/stackblocks/blockEnderCristal").setCreativeTab(tabMRBlocks);
	blockStackEndernite = new BlockStackBase.BlockEndernite(Material.iron).setBlockName("BlockStackEndernite").setBlockTextureName("minecraftrealms:/stackblocks/blockEndernite").setCreativeTab(tabMRBlocks);
	blockStackMagnetite = new BlockStackBase.BlockMagnetite(Material.iron).setBlockName("BlockStackMagnetite").setBlockTextureName("minecraftrealms:/stackblocks/blockMagnetite").setCreativeTab(tabMRBlocks);
	blockStackNethiron = new BlockStackBase.BlockNethiron(Material.iron).setBlockName("BlockStackNethiron").setBlockTextureName("minecraftrealms:/stackblocks/blockNethiron").setCreativeTab(tabMRBlocks);
	blockStackRagnarite = new BlockStackBase.BlockRagnarite(Material.iron).setBlockName("BlockStackRagnarite").setBlockTextureName("minecraftrealms:/stackblocks/blockRagnarite").setCreativeTab(tabMRBlocks);
}	
private static void register() {
	GameRegistry.registerBlock(baseBrick, baseBrick.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(brick1, brick1.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(brick2, brick2.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(brick3, brick3.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(floor1, floor1.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(floor2, floor2.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(floor3, floor3.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(floor4, floor4.getUnlocalizedName().substring(5));	
	GameRegistry.registerBlock(crate01, crate01.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(cratePoor, cratePoor.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(crateNormal, crateNormal.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(crateGood, crateGood.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(crateExcelent, crateExcelent.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(crateSuperb, crateSuperb.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(crateNether, crateNether.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(crateEnd, crateEnd.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(oreBase, oreBase.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(oreCobalt, oreCobalt.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(oreEnderCristal, oreEnderCristal.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(oreEndernite, oreEndernite.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(oreMagnetite, oreMagnetite.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(oreNethiron, oreNethiron.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(oreRagnarite, oreRagnarite.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(blockStackBase, blockStackBase.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(blockStackCobalt, blockStackCobalt.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(blockStackEnderCristal, blockStackEnderCristal.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(blockStackEndernite, blockStackEndernite.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(blockStackMagnetite, blockStackMagnetite.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(blockStackNethiron, blockStackNethiron.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(blockStackRagnarite, blockStackRagnarite.getUnlocalizedName().substring(5));
}
public static CreativeTabs tabMRBlocks = new CreativeTabs("tabMRBlocks"){
	@Override
	public Item getTabIconItem() {
		return new ItemStack(baseBrick).getItem();
		
	}
};
public static CreativeTabs tabMROres = new CreativeTabs("tabMROres"){
	@Override
	public Item getTabIconItem() {
		return new ItemStack(oreCobalt).getItem();
		
	}
};}




