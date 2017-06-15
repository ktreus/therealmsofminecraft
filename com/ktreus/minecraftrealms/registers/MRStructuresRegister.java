package com.ktreus.minecraftrealms.registers;

import net.minecraft.block.Block;

import com.ktreus.minecraftrealms.blocks.MonsterSpawnBlock;
import com.ktreus.minecraftrealms.blocks.MonsterSpawnBlockTileEntity;
import com.ktreus.minecraftrealms.structures.MRStructureSpawner;
import com.ktreus.minecraftrealms.worldgen.MROreGen;

import cpw.mods.fml.common.registry.GameRegistry;

public class MRStructuresRegister {
public static Block monsterSpawnBlock;
public static Block monsterSpawnBlazer;
public static Block monsterSpawnCurse;
public static Block monsterSpawnDoomed;
public static Block monsterSpawnSpecter;
public static void mainRegistry(){
	MRStructuresRegister.init();
	MRStructuresRegister.register();
}
public static void init(){
monsterSpawnBlock = new MonsterSpawnBlock().setBlockName("BlockMonsterSpawn");	
monsterSpawnCurse = new MonsterSpawnBlock().setBlockName("BlockMonsterCurse");	
monsterSpawnDoomed = new MonsterSpawnBlock().setBlockName("BlockMonsterDoomed");	
monsterSpawnSpecter = new MonsterSpawnBlock().setBlockName("BlockMonsterSpecter");	
monsterSpawnBlazer = new MonsterSpawnBlock.MonsterSpawnBlazer().setBlockName("BlockSpawnBlazer");
}
public static void register(){
	GameRegistry.registerWorldGenerator(new MRStructureSpawner(), 0);
	GameRegistry.registerWorldGenerator(new MROreGen(), 0);
	// registro dos block de spawn
	GameRegistry.registerBlock(monsterSpawnBlock, monsterSpawnBlock.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(monsterSpawnBlazer, monsterSpawnBlazer.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(monsterSpawnCurse, monsterSpawnCurse.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(monsterSpawnDoomed, monsterSpawnDoomed.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(monsterSpawnSpecter, monsterSpawnSpecter.getUnlocalizedName().substring(5));
	// register dos tile entity, basicamente os block que faz os mob aparecerem
	GameRegistry.registerTileEntity(MonsterSpawnBlockTileEntity.class, "spwBLCK");
	GameRegistry.registerTileEntity(MonsterSpawnBlockTileEntity.MonsterSpawnBlazerTileEntity.class, "spwBLCKblz");
	GameRegistry.registerTileEntity(MonsterSpawnBlockTileEntity.MonsterSpawnCurseTileEntity.class, "spwBLCKcrs");
	GameRegistry.registerTileEntity(MonsterSpawnBlockTileEntity.MonsterSpawnDoomedTileEntity.class, "spwBLCKdmd");
	GameRegistry.registerTileEntity(MonsterSpawnBlockTileEntity.MonsterSpawnSpecterTileEntity.class, "spwBLCKspc");
}
}
