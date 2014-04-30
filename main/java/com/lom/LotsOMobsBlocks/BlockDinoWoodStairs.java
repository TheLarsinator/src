package com.lom.LotsOMobsBlocks;

import net.minecraft.block.BlockStairs;
import net.minecraft.client.renderer.texture.IIconRegister;

import com.lom.LotsOMobsCore.LotsOMobs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDinoWoodStairs extends BlockStairs
{
	public BlockDinoWoodStairs() {
		super(LotsOMobs.DinoWoodPlanks, 0);
		this.setCreativeTab(LotsOMobs.LotsOMobsBlockTab);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister)
	{

	    blockIcon = iconRegister.registerIcon(LotsOMobs.modid + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}
	
}