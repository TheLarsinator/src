package com.lom.LotsOMobsItems;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

import com.lom.LotsOMobsCore.LotsOMobs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemMaterials extends Item
{
    public ItemMaterials()
    {
        super();
        this.maxStackSize = 64;
        this.setCreativeTab(LotsOMobs.LotsOMobsItemsTab);
        
    }
}