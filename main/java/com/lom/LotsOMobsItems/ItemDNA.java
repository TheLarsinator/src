package com.lom.LotsOMobsItems;

import net.minecraft.item.Item;

import com.lom.LotsOMobsCore.LotsOMobs;

public class ItemDNA extends Item
{
    public ItemDNA()
    {
        super();
        this.maxStackSize = 5;
        this.setCreativeTab(LotsOMobs.LotsOMobsItemsTab);
        
    }

}