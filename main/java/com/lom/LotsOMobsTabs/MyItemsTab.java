package com.lom.LotsOMobsTabs;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.lom.LotsOMobsCore.LotsOMobs;

public class MyItemsTab extends CreativeTabs
{
	public MyItemsTab(int i, String label) {
		super(label);

	}

	@Override
	public Item getTabIconItem() {
		return LotsOMobs.Horn;
	}
}
