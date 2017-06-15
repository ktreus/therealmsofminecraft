package com.ktreus.minecraftrealms.blocks.ores;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreBase extends Block {

	public OreBase(Material material) {
		super(material);
		// TODO Auto-generated constructor stub
		// NADA Auto-generated constructor stub
		this.setHardness(2.75F); // meu bloco ta duro '-'--''-'-'
		this.setHarvestLevel("pickaxe", 3); // os minérios do nether e do the end vão ser todos minerados com diamante, da outras dimensões vão ter que usar 
											// as picaretas dos minérios que complementam o vannila
	}
	// novos minérios a partir daqui
	//separar os que vai pro nether e pro the end
	//
	
	public static class OreCobalt extends OreBase{
		// NETHER
		public OreCobalt(Material material) {
			super(material);
		}
	}
	public static class OreEnderCristal extends OreBase{
		// THE END
		public OreEnderCristal(Material material) {
			super(material);
		}
	}
	public static class OreEndernite extends OreBase{
		// THE END
		public OreEndernite(Material material) {
			super(material);
		}
	}
	public static class OreMagnetite extends OreBase{
		// NETHER
		public OreMagnetite(Material material) {
			super(material);
		}
	}
	public static class OreNethiron extends OreBase{
		// NETHER
		public OreNethiron(Material material) {
			super(material);
		}
	}
	public static class OreRagnarite extends OreBase{
		// THE END
		public OreRagnarite(Material material) {
			super(material);
		}
	}
	////////////////// complemento do vanilla acaba aqui //////////////////////////
	////////////////// a partir daqui é os minérios de outras dimensões////////////
	////////////////// todos extendem OreBase /////////////////////////////////////
}
