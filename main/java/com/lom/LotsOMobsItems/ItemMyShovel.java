package com.lom.LotsOMobsItems;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

import com.lom.LotsOMobsCore.LotsOMobs;

public class ItemMyShovel extends ItemSpade
{

	public ItemMyShovel(Item.ToolMaterial par2EnumToolMaterial) 
	{
		super(par2EnumToolMaterial);
		this.setCreativeTab(LotsOMobs.LotsOMobsCombatTab);
	}
	
}