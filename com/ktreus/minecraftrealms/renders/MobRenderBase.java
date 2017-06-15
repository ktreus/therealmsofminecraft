package com.ktreus.minecraftrealms.renders;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class MobRenderBase extends RenderBiped {

	public MobRenderBase(ModelBiped mdl, float shadowsize) {
		super(mdl, shadowsize);
	}
	   protected ResourceLocation getEntityTexture(Entity entity)
	    {
	        return new ResourceLocation("minecraftreals:textures/mobs/skin_curse.png");
	    }

	    public void doRender(Entity entity, double x, double y, double z, float rotationYaw, float rotationPitch)
	    {
	        super.doRender((EntityLiving)entity, x, y, z, rotationYaw, rotationPitch);
	    }
	    public static class MobRenderCurse extends MobRenderBase {

	    	public MobRenderCurse(ModelBiped mdl, float shadowsize) {
	    		super(mdl, shadowsize);
	    	}
	    	@Override
	    	   protected ResourceLocation getEntityTexture(Entity entity)
	    	    {
	    	        return new ResourceLocation("minecraftreals:textures/mobs/skin_curse.png");
	    	    }
	    	@Override
	    	    public void doRender(Entity entity, double x, double y, double z, float rotationYaw, float rotationPitch)
	    	    {
	    	        super.doRender((EntityLiving)entity, x, y, z, rotationYaw, rotationPitch);
	    	    }

	    }
	    public static class MobRenderDoomed extends MobRenderBase {

	    	public MobRenderDoomed(ModelBiped mdl, float shadowsize) {
	    		super(mdl, shadowsize);
	    	}
	    	@Override
	    	   protected ResourceLocation getEntityTexture(Entity entity)
	    	    {
	    	        return new ResourceLocation("minecraftreals:textures/mobs/skin_doomed.png");
	    	    }
	    	@Override
	    	    public void doRender(Entity entity, double x, double y, double z, float rotationYaw, float rotationPitch)
	    	    {
	    	        super.doRender((EntityLiving)entity, x, y, z, rotationYaw, rotationPitch);
	    	    }

	    }
	    public static class MobRenderEnderSpecter extends MobRenderBase {

	    	public MobRenderEnderSpecter(ModelBiped mdl, float shadowsize) {
	    		super(mdl, shadowsize);
	    	}
	    	@Override
	    	   protected ResourceLocation getEntityTexture(Entity entity)
	    	    {
	    	        return new ResourceLocation("minecraftreals:textures/mobs/skin_spectrum.png");
	    	    }
	    	@Override
	    	    public void doRender(Entity entity, double x, double y, double z, float rotationYaw, float rotationPitch)
	    	    {
	    	        super.doRender((EntityLiving)entity, x, y, z, rotationYaw, rotationPitch);
	    	    }

	    }
}
