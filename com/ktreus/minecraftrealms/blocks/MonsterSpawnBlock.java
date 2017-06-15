package com.ktreus.minecraftrealms.blocks;

import java.util.Random;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.ktreus.minecraftrealms.blocks.MonsterSpawnBlockTileEntity.MonsterSpawnBlazerTileEntity;
import com.ktreus.minecraftrealms.blocks.MonsterSpawnBlockTileEntity.MonsterSpawnCurseTileEntity;
import com.ktreus.minecraftrealms.blocks.MonsterSpawnBlockTileEntity.MonsterSpawnDoomedTileEntity;
import com.ktreus.minecraftrealms.blocks.MonsterSpawnBlockTileEntity.MonsterSpawnSpecterTileEntity;

public class MonsterSpawnBlock extends BlockContainer {

	protected MonsterSpawnBlock(Material material) {
		super(material);
	}
	public MonsterSpawnBlock() {
        super(Material.rock);
        setCreativeTab(CreativeTabs.tabMisc);
    }

    public int idDropped(int par1, Random par2Random, int par3) {
        return 0;
    }

    public int quantityDropped(Random par1Random) {
        return 0;
    }

    public void registerBlockIcons(IIconRegister iconRegister) {
    }

    public boolean isOpaqueCube() {
        return false;
    }

    public IIcon getIcon(int i, int j) {
        return Blocks.mob_spawner.getIcon(i, j);
    }

    public TileEntity createNewTileEntity(World var1, int var2) {
        return new MonsterSpawnBlockTileEntity();
    }
    // aqui já é outro block de mob
    public static class MonsterSpawnBlazer extends MonsterSpawnBlock{
    	@Override
    	public TileEntity createNewTileEntity(World var1, int var2) {
            return new MonsterSpawnBlazerTileEntity();
        }
    }
    // public class MonsterSpawnSpectrum extends MonsterSpawnBlock{} //basicamente isto
    public static class MonsterSpawnCurse extends MonsterSpawnBlock{
    	@Override
    	public TileEntity createNewTileEntity(World var1, int var2) {
            return new  MonsterSpawnCurseTileEntity();
        }
    }
    public static class MonsterSpawnSpecter extends MonsterSpawnBlock{
    	@Override
    	public TileEntity createNewTileEntity(World var1, int var2) {
            return new MonsterSpawnDoomedTileEntity();
        }
    }
    public static class MonsterSpawnDoomed extends MonsterSpawnBlock{
    	@Override
    	public TileEntity createNewTileEntity(World var1, int var2) {
            return new MonsterSpawnSpecterTileEntity();
        }
    }
}
