package com.ktreus.minecraftrealms.proxy;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;

import com.ktreus.minecraftrealms.guns.BaseBullet;
import com.ktreus.minecraftrealms.mobs.MRCurse;
import com.ktreus.minecraftrealms.mobs.MRCurse.MRDoomed;
import com.ktreus.minecraftrealms.mobs.MRCurse.MRSpecter;
import com.ktreus.minecraftrealms.registers.MRGreatSwordsRegister;
import com.ktreus.minecraftrealms.registers.MRGunsRegister;
import com.ktreus.minecraftrealms.renders.MobRenderBase.MobRenderCurse;
import com.ktreus.minecraftrealms.renders.MobRenderBase.MobRenderDoomed;
import com.ktreus.minecraftrealms.renders.MobRenderBase.MobRenderEnderSpecter;

import cpw.mods.fml.client.registry.RenderingRegistry;


public class ClientProxy extends CommonProxy {
	
	//greatswords and guns renders
		IItemRenderer GunsRender = new com.ktreus.minecraftrealms.renders.GunsRender();
		IItemRenderer GSRender = new com.ktreus.minecraftrealms.renders.GreatswordRender();
		
		public void registerRenders() {
		  	//GUNS
		  MinecraftForgeClient.registerItemRenderer(MRGunsRegister.baseGun,(IItemRenderer) GunsRender);
		  MinecraftForgeClient.registerItemRenderer(MRGunsRegister.arrowLauncher,  (IItemRenderer) GunsRender);
		  //MinecraftForgeClient.registerItemRenderer(MRGunsRegister.arrowLauncher, new com.ktreus.minecraftrealms.renders.GunsRender());
			//GREATSWORDS
		  MinecraftForgeClient.registerItemRenderer(MRGreatSwordsRegister.baseGreatsword,  (IItemRenderer) GSRender);
		  MinecraftForgeClient.registerItemRenderer(MRGreatSwordsRegister.diamondGreatsword,  (IItemRenderer) GSRender);
		  //projectiles
		  RenderingRegistry.registerEntityRenderingHandler(BaseBullet.class, new RenderSnowball(MRGunsRegister.baseAmmo));
		  /// mobs
		  RenderingRegistry.registerEntityRenderingHandler(MRCurse.class, new MobRenderCurse(new ModelBiped(), 1));
		  RenderingRegistry.registerEntityRenderingHandler(MRDoomed.class, new MobRenderDoomed(new ModelBiped(), 1));
		  RenderingRegistry.registerEntityRenderingHandler(MRSpecter.class, new MobRenderEnderSpecter(new ModelBiped(), 1));
	    }
		
}
