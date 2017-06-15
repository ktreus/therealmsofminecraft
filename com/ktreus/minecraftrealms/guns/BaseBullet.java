package com.ktreus.minecraftrealms.guns;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

public class BaseBullet extends EntityThrowable {
			public int bulletdamage = 4;
		    public BaseBullet(World world)
		    {
		        super(world);
		    }
		 
		    public BaseBullet(World world, EntityLivingBase entity)
		    {
		        super(world, entity);
		    }
		 
		    private void explode()
		    {
		        setDead();
		    }
		    @Override
		    public void onUpdate()
		    {
		        super.onUpdate();
		        if (ticksExisted > 20)
		        {
		            explode();
		        }
		 
		        for (int i = 0; i < 10; i++)
		        {
		            double x = (double)(rand.nextInt(10) - 5) / 8.0D;
		            double y = (double)(rand.nextInt(10) - 5) / 8.0D;
		            double z = (double)(rand.nextInt(10) - 5) / 8.0D;
		            worldObj.spawnParticle("fireworksSpark", posX, posY, posZ, x, y, z);
		        }
		    }
		 
		    @Override
		    protected float getGravityVelocity()
		    {
		        return 0.005F;
		    }
		 
		    @Override
		    protected void onImpact(MovingObjectPosition par1) {
		        if (par1.entityHit != null) {
		            int var2 = this.bulletdamage;
		            	par1.entityHit.performHurtAnimation();
		                par1.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)this.getThrower()), (float)var2);
		                par1.entityHit.hurtResistantTime = 10;
		            }	explode();
		        } 
		    }	


