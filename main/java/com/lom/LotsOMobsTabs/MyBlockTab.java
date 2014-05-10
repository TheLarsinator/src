package com.lom.lotsomobstabs;


import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.lom.lotsomobscore.LotsOMobs;

public class MyBlockTab extends CreativeTabs
{
	public MyBlockTab(int i, String label) {
		super(label);

	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(LotsOMobs.EasterEgg1);
	}
}
