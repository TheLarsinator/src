package com.lom.LotsOMobsBlocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

import com.lom.LotsOMobsCore.LotsOMobs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockFossilOre extends Block
{
	protected Random rand = new Random();
	
public BlockFossilOre(int par1, int par2)
{
         super(Material.rock);
         this.setCreativeTab(LotsOMobs.LotsOMobsBlockTab);
}

public int quantityDropped(int par1)
{
         return (1);
}

public Item getItemDropped(int par1, Random par2Random, int par3)
{
    int var3 = this.rand.nextInt(5);
    if (var3 == 0)
    {
    return LotsOMobs.FossilTri;
    }
    else if (var3 == 1)
    {
    return LotsOMobs.FossilBro;
    }
    else if (var3 == 2)
    {
    return LotsOMobs.FossilRap;
    }
    else if (var3 == 3)
    {
    return LotsOMobs.FossilRex;
    }
    else if (var3 == 4)
    {
    return LotsOMobs.FossilPte;
    }
    else
    {
    return LotsOMobs.FossilIch;
    }

}
@Override
@SideOnly(Side.CLIENT)
public void registerBlockIcons(IIconRegister iconRegister)
{

    blockIcon = iconRegister.registerIcon(LotsOMobs.modid + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
}
}