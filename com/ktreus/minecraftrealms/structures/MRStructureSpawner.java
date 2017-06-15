package com.ktreus.minecraftrealms.structures;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class MRStructureSpawner implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId) {
		
		case 0 :
			//Generates our surface world
			generateSurface(world, random, chunkX*16, chunkZ*16);
			
		case -1 :
			//Generates our surface world
			generateNether(world, random, chunkX*16, chunkZ*16);
			
		case 1 :
			//Generates our surface world
			generateEnd(world, random, chunkX*16, chunkZ*16);
			
		case 2 :
			//Generates the bandit land
			generateBanditLand(world, random, chunkX*16, chunkZ*16);
		}
		
	}

	private void generateSurface(World world, Random random, int x, int z) {
		//this.addOreSpawn(modqualquer.minerioqqr, world, random, i=blockXPos, j= blockZPos, maxX, maxZ, maxVeinSize, chancetospawn, minY, maxY); 
		BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(x, z);
		if((biome instanceof BiomeGenBase)) 
		{
			for(int a = 0; a < 1; a++)    // esse "a < 1", se você aumentar esse 1, vai multiplicar a quantidade de estruturas em um mesmo lugar.
										//só é bom aumentar pra quem faz um quarto quadrado e quer fazer um "castelo procedural"
			{
				int i = x + random.nextInt(16);
				int k = z + random.nextInt(16);
				int j = world.getHeightValue(i, k);
			
		// a cada 320 blocos, uma nova estrutura é gerada nos biomas planos(aqueles que só tem grama)
		// bem melhor que os script de baixo desse, que, além de supersaturar o mundo, trava o jogo.
		//NUNCA MISTURE INGLÊS COM PORTUGUÊS EM QUALQUER LINGUAGEM DE PROGRAMAÇÃO, ISSO SÓ VAI DEIXAR MAIS CONFUSO
		
		if ((x % 320 == 0) && (z % 320 ==0) && biome == BiomeGenBase.plains) {
			    // setar chunkX etc.
			 new MRCastleUrbanLootTST().generate(world, random, i, j, k);
			  }
			}
		
		
		}
		
		
		/*
		BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(x, z);
		
		if((biome instanceof BiomeGenBase)) 
		{
			for(int a = 0; a < 8; a++)
			{
				int i = x + random.nextInt(16);
				int k = z + random.nextInt(16);
				int j = world.getHeightValue(i, k);
			}
			
		if((biome == BiomeGenBase.desert)) {
			for(int a = 0; a < 8; a++) {
				int i = x + random.nextInt(1024);
				int k = z + random.nextInt(1024);
				int j = world.getHeightValue(i, k);
				new MRCampTest().generate(world, random, i, j, k);
			}
			
		  }
		  
		if((biome == BiomeGenBase.plains)) {
			for(int a = 0; a < 8; a++) {
				int i = x + random.nextInt(1024);
				int k = z + random.nextInt(1024);
				int j = world.getHeightValue(i, k);
				new MRCastleUrbanLootTST().generate(world, random, i, j, k);
			}
	      }
        }*/
}

	private void generateBanditLand(World world, Random random, int x, int z) {
		//this.addOreSpawn(modqualquer.minerioqqr, world, random, i=blockXPos, j= blockZPos, maxX, maxZ, maxVeinSize, chancetospawn, minY, maxY); 
		
		//not implemented yet
	}

	private void generateNether(World world, Random random, int x, int z) {
		// TODO Auto-generated method stub
		
	}
	
	private void generateEnd(World world, Random random, int x, int z) {
		// TODO Auto-generated method stub
		
	}
 }
