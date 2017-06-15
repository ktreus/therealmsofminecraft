package com.ktreus.minecraftrealms.worldgen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import com.ktreus.minecraftrealms.registers.MRBlocksRegister;

import cpw.mods.fml.common.IWorldGenerator;

public class MROreGen implements IWorldGenerator {
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
	IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
	/* runs 'generateNether' or 'generateSurface' depending on which dimension you're loading */
	switch(world.provider.dimensionId) {
	case -1: generateNether(world, random, chunkX*16, chunkZ*16);
	break;
	case 0: generateSurface(world, random, chunkX*16, chunkZ*16);
	break;
	case 1: generateEnd(world, random, chunkX*16, chunkZ*16);
	}
	}
	private void generateEnd(World world, Random random, int x, int z) {
		this.addOreSpawn(MRBlocksRegister.oreEnderCristal, Blocks.end_stone, world, random, x, z, 16, 16, 6, 4, 0, 60);
		this.addOreSpawn(MRBlocksRegister.oreEndernite, Blocks.end_stone, world, random, x, z, 16, 16, 6, 4, 0, 60);
		this.addOreSpawn(MRBlocksRegister.oreRagnarite, Blocks.end_stone, world, random, x, z, 16, 16, 6, 4, 0, 60);
	}
	public void generateSurface(World world, Random random, int x, int z) {
		
		
	}
	public void generateNether(World world, Random random, int x, int z) {
		this.addOreSpawn(MRBlocksRegister.oreCobalt, Blocks.netherrack, world, random, x, z, 16, 16, 6, 4, 0, 60);
		this.addOreSpawn(MRBlocksRegister.oreMagnetite, Blocks.netherrack, world, random, x, z, 16, 16, 6, 4, 0, 60);
		this.addOreSpawn(MRBlocksRegister.oreNethiron, Blocks.netherrack, world, random, x, z, 16, 16, 6, 4, 0, 60);
	}
	public void addOreSpawn(Block block, Block allowedBlock, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY ){
	for(int i = 0; i < chancesToSpawn; i++){
	int posX = blockXPos + random.nextInt(maxX);
	int posY = minY + random.nextInt(maxY -minY);
	int posZ = blockZPos + random.nextInt(maxZ);
	new WorldGenMinable(block, maxVeinSize, allowedBlock).generate(world, random, posX, posY, posZ);
	}
	}
}

