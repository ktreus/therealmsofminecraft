package com.ktreus.minecraftrealms.registers;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.biome.BiomeGenBase;

import com.ktreus.minecraftrealms.MinecraftRealms;
import com.ktreus.minecraftrealms.mobs.MRCurse;
import com.ktreus.minecraftrealms.mobs.MRCurse.MRDoomed;
import com.ktreus.minecraftrealms.mobs.MRCurse.MRSpecter;

import cpw.mods.fml.common.registry.EntityRegistry;

public class MRMobsRegister {
	public static com.ktreus.minecraftrealms.mobs.MRCurse MRCurse;
	static int ModEntityID;
public static void mainRegistry(){
	MRMobsRegister.register();
	MRMobsRegister.init();
}
public static void init(){
	//
	EntityRegistry.addSpawn(MRCurse.class, 10, 4, 6, EnumCreatureType.monster, BiomeGenBase.hell);
	//EntityRegistry.addSpawn(MRCurse.MRDoomed.class, 10, 4, 6, EnumCreatureType.monster, BiomeGenBase.hell);
	//EntityRegistry.addSpawn(MRCurse.MRSpecter.class, 10, 4, 6, EnumCreatureType.monster, BiomeGenBase.sky);
}
public static void register(){
	EntityRegistry.registerGlobalEntityID(MRCurse.class, "Curse", EntityRegistry.findGlobalUniqueEntityId(), 643264, 15535215);
	//EntityRegistry.registerModEntity(MRDoomed.class, "Doomed", ModEntityID++, MinecraftRealms.instance, 80, 1, false);
	//EntityRegistry.registerModEntity(MRSpecter.class, "Specter", ModEntityID++, MinecraftRealms.instance, 80, 1, false);
}
}
