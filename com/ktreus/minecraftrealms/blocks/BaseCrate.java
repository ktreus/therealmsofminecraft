package com.ktreus.minecraftrealms.blocks;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.ktreus.minecraftrealms.registers.MRItemsRegister;
import com.ktreus.minecraftrealms.registers.MRUniquesRegister;

public class BaseCrate extends Block {
	
	public BaseCrate(Material material) {
		super(material);
		this.stepSound = soundTypeWood;
		this.blockHardness = 2.5F;
		this.setHarvestLevel("axe", 1);
	}
	 public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
	        ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
	        drops.add(new ItemStack(Items.coal, world.rand.nextInt(3) + 1));
	        drops.add(new ItemStack(Items.iron_ingot, world.rand.nextInt(2) + 1));
	        drops.add(new ItemStack(Items.bread, world.rand.nextInt(5) + 1));
	        if (world.rand.nextFloat() < 0.1F)
	            drops.add(new ItemStack(Items.diamond));
	        if (world.rand.nextFloat() < 0.01F)
	            drops.add(new ItemStack(MRUniquesRegister.majestrySword));
	        return drops;
	    }
	 public static class CratePoor extends BaseCrate { // para futuros updates

		public CratePoor(Material material) { 
			super(material);
			}
		@Override
 			public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
	        ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
	        drops.add(new ItemStack(Items.coal, world.rand.nextInt(3) + 1));
	        drops.add(new ItemStack(Items.carrot, world.rand.nextInt(2) + 1));
	        drops.add(new ItemStack(Items.bread, world.rand.nextInt(5) + 1));
	         drops.add(new ItemStack(Blocks.planks, world.rand.nextInt(5) + 1));
	         drops.add(new ItemStack(Items.flint, world.rand.nextInt(2) + 1));
	        if (world.rand.nextFloat() < 0.2F)
	            drops.add(new ItemStack(Items.iron_ingot));
	        if (world.rand.nextFloat() < 0.01F)
	            drops.add(new ItemStack(Items.gold_ingot));
	        return drops;
	    }

		}
	 public static class CrateNormal extends BaseCrate {

			public CrateNormal(Material material) { 
				super(material);
			}
			@Override
	 			public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		        ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		        drops.add(new ItemStack(Items.coal, world.rand.nextInt(3) + 1));
		        drops.add(new ItemStack(Items.slime_ball, world.rand.nextInt(2) + 1));
		        drops.add(new ItemStack(Items.beef, world.rand.nextInt(5) + 1));
		        drops.add(new ItemStack(Blocks.cobblestone, world.rand.nextInt(15) + 1));
		        if (world.rand.nextFloat() < 0.1F)
		            drops.add(new ItemStack(Items.gold_ingot));
		        if (world.rand.nextFloat() < 0.25F)
		            drops.add(new ItemStack(Items.clay_ball));
		        if (world.rand.nextFloat() < 0.01F)
		            drops.add(new ItemStack(Items.emerald));
		        return drops;
		    }

			}
	 public static class CrateGood extends BaseCrate { 

			public CrateGood(Material material) { 
				super(material);
			}
			@Override	
	 			public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		        ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		        drops.add(new ItemStack(Items.iron_ingot, world.rand.nextInt(7) + 1));
		        drops.add(new ItemStack(Items.coal, world.rand.nextInt(2) + 1));
		        drops.add(new ItemStack(Items.emerald, world.rand.nextInt(5) + 1));
		        if (world.rand.nextFloat() < 0.6F)
		            drops.add(new ItemStack(Items.gold_ingot, world.rand.nextInt(3) + 1));
		        if (world.rand.nextFloat() < 0.1F)
		            drops.add(new ItemStack(Items.diamond));
		        if (world.rand.nextFloat() < 0.001F)
		            drops.add(new ItemStack(MRUniquesRegister.majestrySword));
		        return drops;
		    }

			}
	 //// daqui pra baixo, não se acha no overworld
	 public static class CrateExcelent extends BaseCrate { 

			public CrateExcelent(Material material) { 
				super(material);
			}
			@Override	
	 			public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		        ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		        drops.add(new ItemStack(Items.iron_ingot, world.rand.nextInt(17) + 1));
		        drops.add(new ItemStack(Items.gold_ingot, world.rand.nextInt(12) + 1));
		        drops.add(new ItemStack(Items.blaze_rod, world.rand.nextInt(5) + 1));
		        if (world.rand.nextFloat() < 0.6F)
		            drops.add(new ItemStack(Items.diamond, world.rand.nextInt(3) + 1));
		        if (world.rand.nextFloat() < 0.1F)
		            drops.add(new ItemStack(Blocks.diamond_block));
		        else
		        	drops.add(new ItemStack(Blocks.obsidian, world.rand.nextInt(3) + 1));
		        if (world.rand.nextFloat() < 0.001F)
		            drops.add(new ItemStack(Items.apple));
		        return drops;
		    }

			}
	 public static class CrateSuperb extends BaseCrate { 

			public CrateSuperb(Material material) { 
				super(material);
			}
			@Override	
	 			public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		        ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		        drops.add(new ItemStack(Items.iron_ingot, world.rand.nextInt(37) + 1));
		        drops.add(new ItemStack(Items.golden_apple, world.rand.nextInt(2) + 1));
		        drops.add(new ItemStack(Items.experience_bottle, world.rand.nextInt(64) + 1));
		        if (world.rand.nextFloat() < 0.6F)
		            drops.add(new ItemStack(Items.diamond, world.rand.nextInt(3) + 1));
		        if (world.rand.nextFloat() < 0.5F)
		            drops.add(new ItemStack(Blocks.diamond_block));
		        if (world.rand.nextFloat() < 0.6F)
		            drops.add(new ItemStack(Items.gold_ingot, world.rand.nextInt(6) + 1));
		        if (world.rand.nextFloat() < 0.1F)
		            drops.add(new ItemStack(MRUniquesRegister.majestrySword));
		        return drops;
		    }

			}
	 /// exclusiva do nether
	 public static class CrateNether extends BaseCrate { 

			public CrateNether(Material material) { 
				super(material);
			}
			@Override	
	 			public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		        ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		        drops.add(new ItemStack(MRItemsRegister.ingotNethiron, world.rand.nextInt(37) + 1));
		        drops.add(new ItemStack(MRItemsRegister.ingotCobalt, world.rand.nextInt(37) + 1));
		        drops.add(new ItemStack(MRItemsRegister.ingotMagnetite, world.rand.nextInt(37) + 1));
		        drops.add(new ItemStack(Items.golden_apple, world.rand.nextInt(2) + 1));
		        drops.add(new ItemStack(Items.experience_bottle, world.rand.nextInt(16) + 1));
		        drops.add(new ItemStack(Items.gold_ingot, world.rand.nextInt(6) + 1));
		        if (world.rand.nextFloat() < 0.001F)
		            drops.add(new ItemStack(MRUniquesRegister.majestrySword));
		        return drops;
		    }

			}
	 /// exclusiva do the end
	 public static class CrateEnd extends BaseCrate { 

			public CrateEnd(Material material) { 
				super(material);
			}
			@Override	
	 			public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		        ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		        drops.add(new ItemStack(MRItemsRegister.ingotEndernite, world.rand.nextInt(37) + 1));
		        drops.add(new ItemStack(MRItemsRegister.ingotRagnarite, world.rand.nextInt(37) + 1));
		        drops.add(new ItemStack(MRItemsRegister.gemsEnderCristal, world.rand.nextInt(37) + 1));
		        drops.add(new ItemStack(Items.golden_apple, world.rand.nextInt(2) + 1));
		        drops.add(new ItemStack(Items.experience_bottle, world.rand.nextInt(16) + 1));
		        drops.add(new ItemStack(Items.gold_ingot, world.rand.nextInt(6) + 1));
		        if (world.rand.nextFloat() < 0.001F)
		            drops.add(new ItemStack(MRUniquesRegister.majestrySword));
		        return drops;
		    }

			}
}
	 

