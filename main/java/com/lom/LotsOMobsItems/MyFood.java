package com.lom.LotsOMobsItems;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemFood;

import com.lom.LotsOMobsCore.LotsOMobs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MyFood extends ItemFood 
{

	public MyFood(int par1, float par3, boolean par4)
	{
		super(par1, par3, par4);
		this.setCreativeTab(LotsOMobs.LotsOMobsItemsTab);
	}

}
