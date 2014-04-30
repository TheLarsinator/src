package com.lom.LotsOMobsTabs;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.lom.LotsOMobsCore.LotsOMobs;

public class MyCombatTab extends CreativeTabs
{
	public MyCombatTab(int i, String label) {
		super(label);

	}

	@Override
	public Item getTabIconItem() {
		return LotsOMobs.HornSword;
	}
}
