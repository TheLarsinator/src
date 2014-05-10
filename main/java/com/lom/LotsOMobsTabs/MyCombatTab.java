package com.lom.lotsomobstabs;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.lom.lotsomobscore.LotsOMobs;

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
