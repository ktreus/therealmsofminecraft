package com.ktreus.minecraftrealms.registers;

import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;

import com.ktreus.minecraftrealms.MinecraftRealms;
import com.ktreus.minecraftrealms.guns.ArrowLauncher;
import com.ktreus.minecraftrealms.guns.BaseBullet;
import com.ktreus.minecraftrealms.guns.BaseGun;
import com.ktreus.minecraftrealms.guns.ammo.BaseAmmo;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class MRGunsRegister {
	//GUNS
	public static Item baseGun;
	public static Item arrowLauncher;
	//MUNIÇÕES AKA AMMO
	public static Item baseAmmo;
	//COMEÇO DOS RESGISTERS
	public static void mainRegistry(){
		MRGunsRegister.init();
		MRGunsRegister.register();
	}
	public static void init(){
		///GUNS
		baseGun = new BaseGun().setUnlocalizedName("baseGun").setTextureName("minecraftrealms:tools/uniques/elegard_47");
		arrowLauncher = new ArrowLauncher().setUnlocalizedName("arrowLauncher").setTextureName("minecraftrealms:tools/uniques/ArrowGunBase");
		///AMMO
		baseAmmo = new BaseAmmo().setUnlocalizedName("baseAmmo").setTextureName("minecraftrealms:tools/uniques/projectiles/bulletBase");
	}
	public static void register(){
		//GUN REGISTRY
		GameRegistry.registerItem(baseGun, baseGun.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(arrowLauncher, arrowLauncher.getUnlocalizedName().substring(5));
		//ITEM REGISTRY
		GameRegistry.registerItem(baseAmmo, baseAmmo.getUnlocalizedName().substring(5));
		}

	}

