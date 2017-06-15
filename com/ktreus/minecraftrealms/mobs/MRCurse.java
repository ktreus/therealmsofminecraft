package com.ktreus.minecraftrealms.mobs;

import com.ktreus.minecraftrealms.registers.MRGreatSwordsRegister;
import com.ktreus.minecraftrealms.registers.MRToolsRegister;

import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class MRCurse extends EntityMob {
	private double moveSpeed;
	private static ItemStack heldItem;
	public MRCurse(World par1World) {
		super(par1World);
		setSize(1,2);
		moveSpeed = 0.5;
		setHealth(26);
		heldItem = new ItemStack (Items.golden_axe);
		this.isImmuneToFire = true;
		this.getHeldItem();
		this.getNavigator().setBreakDoors(true);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIBreakDoor(this));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false));
		this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityVillager.class, this.moveSpeed, true));
		this.tasks.addTask(4, new EntityAIMoveTowardsRestriction(this, this.moveSpeed));
		this.tasks.addTask(5, new EntityAIMoveThroughVillage(this, this.moveSpeed, false));
		this.tasks.addTask(6, new EntityAIWander(this, this.moveSpeed));
		this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(7, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityVillager.class, 0, false));
		
	}
	
	public MRCurse(World world, double x, double y, double z) {
		this(world);
		setPosition (x,y,z);
	}

	public int getAttackStrength(){
		return 4;
	}

    public int getTotalArmorValue()
    {
    	return 8;
    }
	public boolean isAIEnabled(){
		return true;
	}
	public ItemStack getHeldItem(){
		return heldItem;
	}
	protected void dropFewItems(boolean par1, int par2)
	{
	  int i = rand.nextInt(2 + par2); // 0 ou 1 drops, mais drops caso o player tenha looting
	  for (int j = 0; j < i; j++)     // par1 é ignorado (pois é o boolean (verdadeiro ou falso) de se tem looting ou não), pra que os drops sejam de mesma quantidade quando morto pelo ambiente ou pelo player sem looting
	  {
	    dropItem(Items.coal, 1);
	  }
	  i = rand.nextInt(2 + par2);
	  for (int k = 0; k < i; k++)
	  {
	    dropItem(Items.apple, 1);
	  }
	}
	public static class MRSpecter extends EntityMob {
		private double moveSpeed;
		private static ItemStack heldItem;
		public MRSpecter(World par1World) {
			super(par1World);
			setSize(1,2);
			moveSpeed = 0.5;
			setHealth(19);
			heldItem = new ItemStack (MRToolsRegister.pickaxeEndernite);
			this.isImmuneToFire = true;
			this.getHeldItem();
			this.getNavigator().setBreakDoors(true);
			this.tasks.addTask(0, new EntityAISwimming(this));
			this.tasks.addTask(1, new EntityAIBreakDoor(this));
			this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false));
			this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityVillager.class, this.moveSpeed, true));
			this.tasks.addTask(4, new EntityAIMoveTowardsRestriction(this, this.moveSpeed));
			this.tasks.addTask(5, new EntityAIMoveThroughVillage(this, this.moveSpeed, false));
			this.tasks.addTask(6, new EntityAIWander(this, this.moveSpeed));
			this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
			this.tasks.addTask(7, new EntityAILookIdle(this));
			this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
			this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
			this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityVillager.class, 0, false));
			
		}
		
		public MRSpecter(World world, double x, double y, double z) {
			this(world);
			setPosition (x,y,z);
		}
		public int getAttackStrength(){
			return 9;
		}

	    public int getTotalArmorValue()
	    {
	    	return 3;
	    }
	    public ItemStack getHeldItem(){
			return heldItem;
		}
	}
	public static class MRDoomed extends EntityMob {
		private double moveSpeed;
		private static ItemStack heldItem;
		public MRDoomed(World par1World) {
			super(par1World);
			setSize(1,2);
			moveSpeed = 0.25;
			setHealth(30);
			heldItem = new ItemStack (MRGreatSwordsRegister.baseGreatsword);
			this.isImmuneToFire = true;
			this.getHeldItem();
			this.getNavigator().setBreakDoors(true);
			this.tasks.addTask(0, new EntityAISwimming(this));
			this.tasks.addTask(1, new EntityAIBreakDoor(this));
			this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false));
			this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityVillager.class, this.moveSpeed, true));
			this.tasks.addTask(4, new EntityAIMoveTowardsRestriction(this, this.moveSpeed));
			this.tasks.addTask(5, new EntityAIMoveThroughVillage(this, this.moveSpeed, false));
			this.tasks.addTask(6, new EntityAIWander(this, this.moveSpeed));
			this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
			this.tasks.addTask(7, new EntityAILookIdle(this));
			this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
			this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
			this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityVillager.class, 0, false));
			
		}	
		public MRDoomed(World world, double x, double y, double z) {
			this(world);
			setPosition (x,y,z);
		}
		
		public int getAttackStrength(){
			return 7;
		}

	    public int getTotalArmorValue()
	    {
	    	return 3;
	    }
	    public ItemStack getHeldItem(){
			return heldItem;
		}
	}
}

