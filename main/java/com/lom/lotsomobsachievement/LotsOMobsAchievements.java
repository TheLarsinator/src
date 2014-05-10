package com.lom.lotsomobsachievement;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.world.BlockEvent;

import com.lom.lotsomobscore.ConfigDetails;
import com.lom.lotsomobscore.LotsOMobs;
import com.lom.lotsomobsentity.EntityElephant;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;


public class LotsOMobsAchievements
{
	@SubscribeEvent
	public void OnItemPickUp(PlayerEvent.ItemPickupEvent event)
	{
		if(event.pickedUp.getEntityItem().getItem() == LotsOMobs.RawVenison)
		{
			event.player.addStat(LotsOMobs.AchievementDeer, 1);
		}
		if(event.pickedUp.getEntityItem().getItem() == LotsOMobs.RawBoar)
		{
			event.player.addStat(LotsOMobs.AchievementBoar, 1);
		}
		if(event.pickedUp.getEntityItem().getItem() == LotsOMobs.RawCamel)
		{
			event.player.addStat(LotsOMobs.AchievementCamel, 1);
		}
		if(event.pickedUp.getEntityItem().getItem() == LotsOMobs.RawReptile)
		{
			event.player.addStat(LotsOMobs.AchievementReptile, 1);
		}
		if(event.pickedUp.getEntityItem().getItem() == LotsOMobs.RawWhale)
		{
			event.player.addStat(LotsOMobs.AchievementWhale, 1);
		}
		if(event.pickedUp.getEntityItem().getItem() == LotsOMobs.RawLion)
		{
			event.player.addStat(LotsOMobs.AchievementLion, 1);
		}
		if(event.pickedUp.getEntityItem().getItem() == LotsOMobs.RawFrog)
		{
			event.player.addStat(LotsOMobs.AchievementFrog, 1);
		}
		if(event.pickedUp.getEntityItem().getItem() == LotsOMobs.RawPenguin)
		{
			event.player.addStat(LotsOMobs.AchievementPenguin, 1);
		}	
		if(event.pickedUp.getEntityItem().getItem() == LotsOMobs.DinoBone)
		{
			event.player.addStat(LotsOMobs.AchievementDino, 1);
		}	
		if(event.pickedUp.getEntityItem().getItem() == LotsOMobs.WoolyFur)
		{
			event.player.addStat(LotsOMobs.AchievementIceCreature, 1);
		}	
	}
	
	@SubscribeEvent
	public void OnLogIn(PlayerEvent.PlayerLoggedInEvent event)
	{
		event.player.addStat(LotsOMobs.AchievementLogIn, 1);
	}
	
	@SubscribeEvent
	public void OnTeleport(PlayerEvent.PlayerChangedDimensionEvent event)
	{
		System.out.println("DebugMSG1");

		if(event.toDim == ConfigDetails.dimension)
		{
			event.player.addStat(LotsOMobs.AchievementDino, 1);
		}
		else if(event.toDim == ConfigDetails.dimension2)
		{
			event.player.addStat(LotsOMobs.AchievementIceAge, 1);
		}
	}
	
	@SubscribeEvent
	public void OnBlockBreak(BlockEvent.BreakEvent event)
	{
		System.out.println("DebugMSG");

		if(event.block == LotsOMobs.FossilOre)
		{
			event.getPlayer().addStat(LotsOMobs.AchievementFossil, 1);
		}
		if(event.block == LotsOMobs.AmberOre)
		{
			event.getPlayer().addStat(LotsOMobs.AchievementAmber, 1);
		}
		if(event.block == LotsOMobs.IcemintuimOre)
		{
			event.getPlayer().addStat(LotsOMobs.AchievementIcemintuim, 1);
		}
	}
	
	@SubscribeEvent
	public void OnCrafted(PlayerEvent.ItemCraftedEvent event)
	{
		if(event.crafting == (new ItemStack(LotsOMobs.IcemintuimSword))||event.crafting == (new ItemStack(LotsOMobs.IcemintuimShovel))||event.crafting == (new ItemStack(LotsOMobs.IcemintuimAxe))||event.crafting == (new ItemStack(LotsOMobs.IcemintuimPickaxe))||event.crafting == (new ItemStack(LotsOMobs.IcemintuimHoe)))
		{
			event.player.addStat(LotsOMobs.AchievementIceTool, 1);
		}
		if(event.crafting == (new ItemStack(LotsOMobs.AmberSword))||event.crafting == (new ItemStack(LotsOMobs.AmberShovel))||event.crafting == (new ItemStack(LotsOMobs.AmberAxe))||event.crafting == (new ItemStack(LotsOMobs.AmberPickaxe))||event.crafting == (new ItemStack(LotsOMobs.AmberHoe)))
		{
			event.player.addStat(LotsOMobs.AchievementAmberTool, 1);
		}
	}
}
