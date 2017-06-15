package com.ktreus.minecraftrealms.blocks;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.ktreus.minecraftrealms.mobs.MRCurse;
import com.ktreus.minecraftrealms.mobs.MRCurse.MRDoomed;
import com.ktreus.minecraftrealms.mobs.MRCurse.MRSpecter;

public class MonsterSpawnBlockTileEntity extends TileEntity {
	public int delay = 20;
    public int metadata;
    public double yaw;
    public double yaw2 = 0.0;
    public static int mob;

    public boolean anyPlayerInRange() {
        EntityPlayer player = this.worldObj.getClosestPlayer((double)this.xCoord + 0.5, (double)this.yCoord + 0.5, (double)this.zCoord + 0.5, 16.0);
        if (player != null && !player.capabilities.isCreativeMode) {
            return true;
        }
        return false;
    }

    public void updateEntity() {
        if (!this.anyPlayerInRange()) {
            return;
        }
        if (!this.worldObj.isRemote) {
            if (this.delay == -1) {
                this.updateDelay();
            }
            if (this.delay > 0) {
                --this.delay;
                return;
            }
            this.spawnEntity();
            this.worldObj.setBlockToAir(this.xCoord, this.yCoord, this.zCoord);
        }
        super.updateEntity();
    }
    //copypasta para novas classes overriding A SEGUNDA APENAS, se não, feijoada.
   
    public static Entity getEntity(int metadata, int mob, World world, int x, int y, int z) {
       mob = MonsterSpawnBlockTileEntity.mob;
    	MRCurse e = null;
        e = (MRCurse) new MRCurse(world);
        {
        return e;
    } 
}

    public void spawnEntity() {
    	int tmob = this.mob;
        Entity entity = MonsterSpawnBlockTileEntity.getEntity(this.metadata, tmob, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
        if (entity == null) {
            entity = new MRCurse(this.worldObj);
		}
        entity.setLocationAndAngles((double)this.xCoord + 0.5, (double)this.yCoord, (double)this.zCoord + 0.5, this.worldObj.rand.nextFloat() * 360.0f, 0.0f);
        this.worldObj.spawnEntityInWorld(entity);
        this.worldObj.playAuxSFX(2004, this.xCoord, this.yCoord, this.zCoord, 0);
        if (this.worldObj.isRemote && entity instanceof EntityLiving) {
            ((EntityLiving)entity).spawnExplosionParticle();
        } 
    }
    /// copypasta vem até aqui
    private void updateDelay() {
        this.delay = 200 + this.worldObj.rand.nextInt(600);
    }
   //NOVOS TILE ENTITY PARA NOVOS MONSTROS
   // ESSE ABAIXO É TEMPORÁRIO (OU NÃO)
    public static class MonsterSpawnBlazerTileEntity extends MonsterSpawnBlockTileEntity {
    	 
    	
    	public static Entity getEntity(int metadata, int mob, World world, int x, int y, int z) {
    	        mob = MonsterSpawnBlockTileEntity.mob;
    	        EntityBlaze e = null;
    	        e = new EntityBlaze(world);
    	        {
    	        return e;
    	    }
    	}
    	
    	@Override
    	public void spawnEntity() {
    	    	int tmob = this.mob;
    	        // MUDAR O MonsterSpawnBlazerTileEntity CASO FAZER OUTRA CLASSE
    	    	Entity entity = MonsterSpawnBlazerTileEntity.getEntity(this.metadata, tmob, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
    	        if (entity == null) {
    	            entity = new EntityBlaze(this.worldObj);
    			}
    	        entity.setLocationAndAngles((double)this.xCoord + 0.5, (double)this.yCoord, (double)this.zCoord + 0.5, this.worldObj.rand.nextFloat() * 360.0f, 0.0f);
    	        this.worldObj.spawnEntityInWorld(entity);
    	        this.worldObj.playAuxSFX(2004, this.xCoord, this.yCoord, this.zCoord, 0);
    	        if (this.worldObj.isRemote && entity instanceof EntityLiving) {
    	            ((EntityLiving)entity).spawnExplosionParticle();
    	        }
    	    }
    }
    //public class MonsterSpawnSpectrumTileEntity extends MonsterSpawnBlockTileEntity {}  //basicamente é isso, o resto é copypasta e pequenas alterações.
    //public class MonsterSpawnBanditTileEntity extends MonsterSpawnBlockTileEntity {}
    //public class MonsterSpawnRedstoneRobotTileEntity extends MonsterSpawnBlockTileEntity {}
public static class MonsterSpawnCurseTileEntity extends MonsterSpawnBlockTileEntity {
    	 
    	
    	public static Entity getEntity(int metadata, int mob, World world, int x, int y, int z) {
    	        mob = MonsterSpawnBlockTileEntity.mob;
    	        MRCurse e = null;
    	        e = new MRCurse(world);
    	        {
    	        return e;
    	    }
    	}
    	
    	@Override
    	public void spawnEntity() {
    	    	int tmob = this.mob;
    	        // MUDAR O MonsterSpawnBlazerTileEntity CASO FAZER OUTRA CLASSE
    	    	Entity entity = MonsterSpawnCurseTileEntity.getEntity(this.metadata, tmob, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
    	        if (entity == null) {
    	            entity = new MRCurse(this.worldObj);
    			}
    	        entity.setLocationAndAngles((double)this.xCoord + 0.5, (double)this.yCoord, (double)this.zCoord + 0.5, this.worldObj.rand.nextFloat() * 360.0f, 0.0f);
    	        this.worldObj.spawnEntityInWorld(entity);
    	        this.worldObj.playAuxSFX(2004, this.xCoord, this.yCoord, this.zCoord, 0);
    	        if (this.worldObj.isRemote && entity instanceof EntityLiving) {
    	            ((EntityLiving)entity).spawnExplosionParticle();
    	        }
    	    }
    }
public static class MonsterSpawnSpecterTileEntity extends MonsterSpawnBlockTileEntity {
	 
	
	public static Entity getEntity(int metadata, int mob, World world, int x, int y, int z) {
	        mob = MonsterSpawnBlockTileEntity.mob;
	        MRCurse.MRSpecter e = null;
	        e = new MRCurse.MRSpecter(world);
	        {
	        return e;
	    }
	}
	
	@Override
	public void spawnEntity() {
	    	int tmob = this.mob;
	        // MUDAR O MonsterSpawnBlazerTileEntity CASO FAZER OUTRA CLASSE
	    	Entity entity = MonsterSpawnSpecterTileEntity.getEntity(this.metadata, tmob, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
	        if (entity == null) {
	            entity = new MRCurse.MRSpecter(this.worldObj);
			}
	        entity.setLocationAndAngles((double)this.xCoord + 0.5, (double)this.yCoord, (double)this.zCoord + 0.5, this.worldObj.rand.nextFloat() * 360.0f, 0.0f);
	        this.worldObj.spawnEntityInWorld(entity);
	        this.worldObj.playAuxSFX(2004, this.xCoord, this.yCoord, this.zCoord, 0);
	        if (this.worldObj.isRemote && entity instanceof EntityLiving) {
	            ((EntityLiving)entity).spawnExplosionParticle();
	        }
	    }
}public static class MonsterSpawnDoomedTileEntity extends MonsterSpawnBlockTileEntity {
	 
	
	public static Entity getEntity(int metadata, int mob, World world, int x, int y, int z) {
	        mob = MonsterSpawnBlockTileEntity.mob;
	        MRCurse.MRDoomed e = null;
	        e = new MRCurse.MRDoomed(world);
	        {
	        return e;
	    }
	}
	
	@Override
	public void spawnEntity() {
	    	int tmob = this.mob;
	        // MUDAR O MonsterSpawnBlazerTileEntity CASO FAZER OUTRA CLASSE
	    	Entity entity = MonsterSpawnDoomedTileEntity.getEntity(this.metadata, tmob, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
	        if (entity == null) {
	            entity = new MRCurse.MRDoomed(this.worldObj);
			}
	        entity.setLocationAndAngles((double)this.xCoord + 0.5, (double)this.yCoord, (double)this.zCoord + 0.5, this.worldObj.rand.nextFloat() * 360.0f, 0.0f);
	        this.worldObj.spawnEntityInWorld(entity);
	        this.worldObj.playAuxSFX(2004, this.xCoord, this.yCoord, this.zCoord, 0);
	        if (this.worldObj.isRemote && entity instanceof EntityLiving) {
	            ((EntityLiving)entity).spawnExplosionParticle();
	        }
	    }
}

}
