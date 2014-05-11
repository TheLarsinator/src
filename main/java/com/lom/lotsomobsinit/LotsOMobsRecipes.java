package com.lom.lotsomobsinit;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.lom.lotsomobscore.LotsOMobs;

import cpw.mods.fml.common.registry.GameRegistry;

import static com.lom.lotsomobsinit.LotsOMobsBlocks.*;
import static com.lom.lotsomobsinit.LotsOMobsItems.*;

public class LotsOMobsRecipes 
{
	public static void RecipeBook()
	{
		//Recipes
		 GameRegistry.addSmelting(RawVenison, new ItemStack(Venison, 1), 1.0F);
		 GameRegistry.addSmelting(RawBoar, new ItemStack(BoarMeat, 1), 1.0F);
		 GameRegistry.addSmelting(RawReptile, new ItemStack(ReptileMeat, 1), 1.0F);
		 GameRegistry.addSmelting(RawWhale, new ItemStack(WhaleMeat, 1), 1.0F);
		 GameRegistry.addSmelting(RawCamel, new ItemStack(CamelMeat, 1), 1.0F);
		 GameRegistry.addSmelting(RawLion, new ItemStack(LionMeat, 1), 1.0F);
		 GameRegistry.addSmelting(RawFrog, new ItemStack(CookedFrog, 1), 1.0F);
		 GameRegistry.addSmelting(IcemintuimOre, new ItemStack(IcemintuimBar, 1), 1.0F);
		 GameRegistry.addSmelting(IceIron, new ItemStack(Items.iron_ingot, 1), 1.0F);

		 
		 GameRegistry.addRecipe(new ItemStack(CactiOnAStick, 1), new Object [] {"#", "X", Character.valueOf('#'), Items.fishing_rod, Character.valueOf('X'), Blocks.cactus});
		 GameRegistry.addRecipe(new ItemStack(WildStew, 1), new Object [] {"@", "2", "&", Character.valueOf('@'), Venison, Character.valueOf('2'), BoarMeat, Character.valueOf('&'), Items.bowl});
		 GameRegistry.addRecipe(new ItemStack(WildStew, 1), new Object [] {"2", "@", "&", Character.valueOf('@'), Venison, Character.valueOf('2'), BoarMeat, Character.valueOf('&'), Items.bowl});
		 
		 GameRegistry.addRecipe(new ItemStack(HornSword, 1), new Object [] {"#", "#", "X", Character.valueOf('#'), Horn, Character.valueOf('X'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(IvoryPickaxe, 1), new Object [] {"###", " X ", " X ", Character.valueOf('#'), Ivory, Character.valueOf('X'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(IvoryShovel, 1), new Object [] {"#", "X", "X", Character.valueOf('#'), IvoryBlade, Character.valueOf('X'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(IvorySword, 1), new Object [] {"#", "#", "X", Character.valueOf('#'), Ivory, Character.valueOf('X'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(IvoryAxe, 1), new Object [] {"#X ", " X ", " X ", Character.valueOf('#'), IvoryBlade, Character.valueOf('X'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(IvoryAxe, 1), new Object [] {" X#", " X ", " X ", Character.valueOf('#'), IvoryBlade, Character.valueOf('X'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(IvoryHoe, 1), new Object [] {"##", " X", " X", Character.valueOf('#'), Ivory, Character.valueOf('X'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(IvoryHoe, 1), new Object [] {"##", "X ", "X ", Character.valueOf('#'), Ivory, Character.valueOf('X'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(AmberPickaxe, 1), new Object [] {"###", " X ", " X ", Character.valueOf('#'), Amber, Character.valueOf('X'), DinoBone});
		 GameRegistry.addRecipe(new ItemStack(AmberShovel, 1), new Object [] {"#", "X", "X", Character.valueOf('#'), Amber, Character.valueOf('X'), DinoBone});
		 GameRegistry.addRecipe(new ItemStack(AmberSword, 1), new Object [] {"#", "#", "X", Character.valueOf('#'), Amber, Character.valueOf('X'), DinoBone});
		 GameRegistry.addRecipe(new ItemStack(AmberAxe, 1), new Object [] {"##", "#X ", " X", Character.valueOf('#'), Amber, Character.valueOf('X'), DinoBone});
		 GameRegistry.addRecipe(new ItemStack(AmberAxe, 1), new Object [] {"##", "X#", "X ", Character.valueOf('#'), Amber, Character.valueOf('X'), DinoBone});
		 GameRegistry.addRecipe(new ItemStack(AmberHoe, 1), new Object [] {"##", " X", " X", Character.valueOf('#'), Amber, Character.valueOf('X'), DinoBone});
		 GameRegistry.addRecipe(new ItemStack(AmberHoe, 1), new Object [] {"##", "X ", "X ", Character.valueOf('#'), Amber, Character.valueOf('X'), DinoBone});
		 GameRegistry.addRecipe(new ItemStack(TimeTraveler, 1), new Object [] {"#P#", "RXR", "#A#", Character.valueOf('#'), Items.iron_ingot, Character.valueOf('P'), DinoPortal, Character.valueOf('R'), Items.redstone, Character.valueOf('X'), Blocks.stone_button, Character.valueOf('A'), Amber});
		 
		 GameRegistry.addShapelessRecipe(new ItemStack(DinoPortal, 1), new Object[]{ FlintAndFossil, FossilTri });
		 GameRegistry.addShapelessRecipe(new ItemStack(DinoPortal, 1), new Object[]{ FlintAndFossil, FossilBro });
		 GameRegistry.addShapelessRecipe(new ItemStack(DinoPortal, 1), new Object[]{ FlintAndFossil, FossilRap });
		 GameRegistry.addShapelessRecipe(new ItemStack(DinoPortal, 1), new Object[]{ FlintAndFossil, FossilRex });
		 GameRegistry.addShapelessRecipe(new ItemStack(DinoPortal, 1), new Object[]{ FlintAndFossil, FossilPte });
		 GameRegistry.addShapelessRecipe(new ItemStack(DinoPortal, 1), new Object[]{ FlintAndFossil, FossilIch });
		 GameRegistry.addShapelessRecipe(new ItemStack(FlintAndFossil, 1), new Object[]{ Items.flint, FossilSab });
		 GameRegistry.addShapelessRecipe(new ItemStack(FlintAndFossil, 1), new Object[]{ Items.flint, FossilTri });
		 GameRegistry.addShapelessRecipe(new ItemStack(FlintAndFossil, 1), new Object[]{ Items.flint, FossilBro });
		 GameRegistry.addShapelessRecipe(new ItemStack(FlintAndFossil, 1), new Object[]{ Items.flint, FossilRap });
		 GameRegistry.addShapelessRecipe(new ItemStack(FlintAndFossil, 1), new Object[]{ Items.flint, FossilRex });
		 GameRegistry.addShapelessRecipe(new ItemStack(FlintAndFossil, 1), new Object[]{ Items.flint, FossilPte });
		 GameRegistry.addShapelessRecipe(new ItemStack(FlintAndFossil, 1), new Object[]{ Items.flint, FossilMam });
		 GameRegistry.addShapelessRecipe(new ItemStack(FlintAndFossil, 1), new Object[]{ Items.flint, FossilIch });
		 
		 GameRegistry.addRecipe(new ItemStack(Items.stick, 4), new Object [] {"#", "#", Character.valueOf('#'), DinoWoodPlanks});
		 GameRegistry.addRecipe(new ItemStack(DinoWoodPlanks, 4), new Object [] {"#", Character.valueOf('#'), DinoLog});	 
		 GameRegistry.addRecipe(new ItemStack(Items.wooden_pickaxe, 1), new Object [] {"###", " X ", " X ", Character.valueOf('#'), DinoWoodPlanks, Character.valueOf('X'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(Items.wooden_shovel, 1), new Object [] {"#", "X", "X", Character.valueOf('#'), DinoWoodPlanks, Character.valueOf('X'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(Items.wooden_sword, 1), new Object [] {"#", "#", "X", Character.valueOf('#'), DinoWoodPlanks, Character.valueOf('X'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(Items.wooden_axe, 1), new Object [] {"##", "#X ", " X", Character.valueOf('#'), DinoWoodPlanks, Character.valueOf('X'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(Items.wooden_axe, 1), new Object [] {"##", "X#", "X ", Character.valueOf('#'), DinoWoodPlanks, Character.valueOf('X'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(Items.wooden_hoe, 1), new Object [] {"##", " X", " X", Character.valueOf('#'), DinoWoodPlanks, Character.valueOf('X'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(Items.wooden_hoe, 1), new Object [] {"##", "X ", "X ", Character.valueOf('#'), DinoWoodPlanks, Character.valueOf('X'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(DinoWoodStairs, 4), new Object [] {"#  ", "## ", "###", Character.valueOf('#'), DinoWoodPlanks});
		 GameRegistry.addRecipe(new ItemStack(Blocks.crafting_table, 1), new Object [] {"##", "##", Character.valueOf('#'), DinoWoodPlanks});
		 GameRegistry.addRecipe(new ItemStack(Items.wooden_door, 1), new Object [] {"##", "##", "##", Character.valueOf('#'), DinoWoodPlanks});
		 GameRegistry.addRecipe(new ItemStack(Blocks.chest, 1), new Object [] {"###", "# #","###",  Character.valueOf('#'), DinoWoodPlanks});
		 GameRegistry.addRecipe(new ItemStack(Items.sign, 1), new Object [] {"###", "###", " X ", Character.valueOf('#'), DinoWoodPlanks, Character.valueOf('X'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(EasterCake1, 1), new Object [] {"###", "XCX", "ZZZ", Character.valueOf('#'), Items.milk_bucket, Character.valueOf('X'), Items.sugar, Character.valueOf('C'), EasterEgg1, Character.valueOf('Z'), Items.wheat});
		 GameRegistry.addRecipe(new ItemStack(EasterCake2, 1), new Object [] {"###", "XCX", "ZZZ", Character.valueOf('#'), Items.milk_bucket, Character.valueOf('X'), Items.sugar, Character.valueOf('C'), EasterEgg2, Character.valueOf('Z'), Items.wheat});
		 GameRegistry.addRecipe(new ItemStack(EasterCake3, 1), new Object [] {"###", "XCX", "ZZZ", Character.valueOf('#'), Items.milk_bucket, Character.valueOf('X'), Items.sugar, Character.valueOf('C'), EasterEgg3, Character.valueOf('Z'), Items.wheat});
		 GameRegistry.addRecipe(new ItemStack(EasterCake4, 1), new Object [] {"###", "XCX", "ZZZ", Character.valueOf('#'), Items.milk_bucket, Character.valueOf('X'), Items.sugar, Character.valueOf('C'), EasterEgg4, Character.valueOf('Z'), Items.wheat});
		 GameRegistry.addRecipe(new ItemStack(EasterCake5, 1), new Object [] {"###", "XCX", "ZZZ", Character.valueOf('#'), Items.milk_bucket, Character.valueOf('X'), Items.sugar, Character.valueOf('C'), EasterEgg5, Character.valueOf('Z'), Items.wheat});

		 GameRegistry.addRecipe(new ItemStack(FurHelmet, 1), new Object [] {"###", "# #", Character.valueOf('#'), DeerFur});
		 GameRegistry.addRecipe(new ItemStack(FurChestplate, 1), new Object [] {"# #", "###", "###", Character.valueOf('#'), DeerFur});
		 GameRegistry.addRecipe(new ItemStack(FurLeggings, 1), new Object [] {"###", "# #", "# #", Character.valueOf('#'), DeerFur});
		 GameRegistry.addRecipe(new ItemStack(FurBoots, 1), new Object [] {"# #", "# #", Character.valueOf('#'), DeerFur});
		 GameRegistry.addRecipe(new ItemStack(AmberHelmet, 1), new Object [] {"###", "# #", Character.valueOf('#'), Amber});
		 GameRegistry.addRecipe(new ItemStack(AmberChestplate, 1), new Object [] {"# #", "###", "###", Character.valueOf('#'), Amber});
		 GameRegistry.addRecipe(new ItemStack(AmberLeggings, 1), new Object [] {"###", "# #", "# #", Character.valueOf('#'), Amber});
		 GameRegistry.addRecipe(new ItemStack(AmberBoots, 1), new Object [] {"# #", "# #", Character.valueOf('#'), Amber});
		 GameRegistry.addRecipe(new ItemStack(DinoFurHelmet, 1), new Object [] {"###", "# #", Character.valueOf('#'), DinoFur});
		 GameRegistry.addRecipe(new ItemStack(DinoFurChestplate, 1), new Object [] {"# #", "###", "###", Character.valueOf('#'), DinoFur});
		 GameRegistry.addRecipe(new ItemStack(DinoFurLeggings, 1), new Object [] {"###", "# #", "# #", Character.valueOf('#'), DinoFur});
		 GameRegistry.addRecipe(new ItemStack(DinoFurBoots, 1), new Object [] {"# #", "# #", Character.valueOf('#'), DinoFur});
		 
		 GameRegistry.addRecipe(new ItemStack(IcemintuimHelmet, 1), new Object [] {"###", "# #", Character.valueOf('#'), IcemintuimBar});
		 GameRegistry.addRecipe(new ItemStack(IcemintuimChestplate, 1), new Object [] {"# #", "###", "###", Character.valueOf('#'), IcemintuimBar});
		 GameRegistry.addRecipe(new ItemStack(IcemintuimLeggings, 1), new Object [] {"###", "# #", "# #", Character.valueOf('#'), IcemintuimBar});
		 GameRegistry.addRecipe(new ItemStack(IcemintuimBoots, 1), new Object [] {"# #", "# #", Character.valueOf('#'), IcemintuimBar});
		 
		 GameRegistry.addRecipe(new ItemStack(EskimoHelmet, 1), new Object [] {"###", "# #", Character.valueOf('#'), WoolyFur});
		 GameRegistry.addRecipe(new ItemStack(EskimoChestplate, 1), new Object [] {"# #", "###", "###", Character.valueOf('#'), WoolyFur});
		 GameRegistry.addRecipe(new ItemStack(EskimoLeggings, 1), new Object [] {"###", "# #", "# #", Character.valueOf('#'), WoolyFur});
		 GameRegistry.addRecipe(new ItemStack(EskimoBoots, 1), new Object [] {"# #", "# #", Character.valueOf('#'), WoolyFur});
		 
		 GameRegistry.addRecipe(new ItemStack(IcemintuimPickaxe, 1), new Object [] {"###", " X ", " X ", Character.valueOf('#'), IcemintuimBar, Character.valueOf('X'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(IcemintuimShovel, 1), new Object [] {"#", "X", "X", Character.valueOf('#'), IcemintuimBar, Character.valueOf('X'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(IcemintuimSword, 1), new Object [] {"#", "#", "X", Character.valueOf('#'), IcemintuimBar, Character.valueOf('X'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(IcemintuimAxe, 1), new Object [] {"##", "#X ", " X", Character.valueOf('#'), IcemintuimBar, Character.valueOf('X'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(IcemintuimAxe, 1), new Object [] {"##", "X#", "X ", Character.valueOf('#'), IcemintuimBar, Character.valueOf('X'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(IcemintuimHoe, 1), new Object [] {"##", " X", " X", Character.valueOf('#'), IcemintuimBar, Character.valueOf('X'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(IcemintuimHoe, 1), new Object [] {"##", "X ", "X ", Character.valueOf('#'), IcemintuimBar, Character.valueOf('X'), Items.stick});
		 
	}

}
