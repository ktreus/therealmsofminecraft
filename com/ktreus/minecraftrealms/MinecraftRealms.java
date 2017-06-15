package com.ktreus.minecraftrealms;

import com.ktreus.minecraftrealms.proxy.CommonProxy;
import com.ktreus.minecraftrealms.registers.MRArmorsRegister;
import com.ktreus.minecraftrealms.registers.MRBlocksRegister;
import com.ktreus.minecraftrealms.registers.MRGreatSwordsRegister;
import com.ktreus.minecraftrealms.registers.MRGunsRegister;
import com.ktreus.minecraftrealms.registers.MRItemsRegister;
import com.ktreus.minecraftrealms.registers.MRLootRegister;
import com.ktreus.minecraftrealms.registers.MRMaterialsRegister;
import com.ktreus.minecraftrealms.registers.MRMiscRegister;
import com.ktreus.minecraftrealms.registers.MRMobsRegister;
import com.ktreus.minecraftrealms.registers.MRRecipesRegister;
import com.ktreus.minecraftrealms.registers.MRStructuresRegister;
import com.ktreus.minecraftrealms.registers.MRToolsRegister;
import com.ktreus.minecraftrealms.registers.MRUniquesRegister;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
/// A VERSÃO SIGNIFICA A PORCENTAGEM DO PROJETO, BETA 1.0.0 É A "RELEASE", E A RELEASE É A CORREÇÃO DOS POSSÍVEIS BUGS
@Mod(modid = MinecraftRealms.MODID, version = "0.0.6 alpha", name = "The Realms of Minecraft")
public class MinecraftRealms
{
	@SidedProxy(clientSide = "com.ktreus.minecraftrealms.proxy.ClientProxy", serverSide = "com.ktreus.minecraftrealms.proxy.CommonProxy")
    //// 8====D
	// PUBLIC STATIC DICK MYDICK;
	// MYDICK = NEW DICK().SETSIZE(28CM).SETDICKNAME("ASTOLFO").SETTEXTURENAME("NIGGA");
	// IF (STOLE == YES){
	// MYDICK = IN_YOUR_ASS;}
	// IF (YOU == ANON){
	// ANON = BROTHER;}
	
	public static CommonProxy proxy;
	public static final String MODID = "minecraftrealms";
	@Instance(value = MODID)
	public static MinecraftRealms instance;
	
    @EventHandler
    public static void preinit(FMLPreInitializationEvent event)
    {
    MRItemsRegister.mainRegistry();
    MRBlocksRegister.mainRegistry();
    MRMobsRegister.mainRegistry();
    MRMaterialsRegister.mainRegistry();
    MRGreatSwordsRegister.mainRegistry();
    MRGunsRegister.mainRegistry();
    MRMiscRegister.mainRegistry();
	MRUniquesRegister.mainRegistry();
	MRArmorsRegister.mainRegistry();
	MRToolsRegister.mainRegistry();
    MRLootRegister.mainRegistry();
	MRStructuresRegister.mainRegistry();
    
    }
	 @EventHandler
    public static void init(FMLInitializationEvent event)
    {
	MRRecipesRegister.registerRecipes();
	proxy.registerRenders();
	
    }
	 @EventHandler
    public static void postinit(FMLPostInitializationEvent event)
    {
    //BlockPumpkin
    }
}
