package com.ktreus.minecraftrealms.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockStackBase extends Block {

	public BlockStackBase(Material material) {
		super(material);
		this.setResistance(3F);
		this.setHardness(23);
		this.setHarvestLevel("pickaxe", 1);
		// TODO Auto-generated constructor stub
	}
public static class BlockCobalt extends BlockStackBase{

	public BlockCobalt(Material material) {
		super(material);
		// TODO Auto-generated constructor stub
	}}
public static class BlockEnderCristal extends BlockStackBase{

	public BlockEnderCristal(Material material) {
		super(material);
		// TODO Auto-generated constructor stub
	}}
public static class BlockEndernite extends BlockStackBase{

	public BlockEndernite(Material material) {
		super(material);
		// TODO Auto-generated constructor stub
	}}
public static class BlockMagnetite extends BlockStackBase{

	public BlockMagnetite(Material material) {
		super(material);
		// TODO Auto-generated constructor stub
	}}
public static class BlockNethiron extends BlockStackBase{

	public BlockNethiron(Material material) {
		super(material);
		// TODO Auto-generated constructor stub
	}}
public static class BlockRagnarite extends BlockStackBase{

	public BlockRagnarite(Material material) {
		super(material);
		// TODO Auto-generated constructor stub
	}}

}
