package com.lom.lotsomobscore;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.util.EnumHelper;

import com.lom.lotsomobsachievement.LotsOMobsAchievements;
import com.lom.lotsomobsinit.LotsOMobsAchievementsBook;
import com.lom.lotsomobsinit.LotsOMobsBiomes;
import com.lom.lotsomobsinit.LotsOMobsBlocks;
import com.lom.lotsomobsinit.LotsOMobsItems;
import com.lom.lotsomobsinit.LotsOMobsMobs;
import com.lom.lotsomobsinit.LotsOMobsRecipes;
import com.lom.lotsomobstabs.MyBlockTab;
import com.lom.lotsomobstabs.MyCombatTab;
import com.lom.lotsomobstabs.MyItemsTab;
import com.lom.lotsomobsworldgen.FossilOreGeneration;
import com.lom.lotsomobsworldgen.OreGeneration;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod (modid = "lom",name = "LotsOMobs", version = "version")
/**100.000 downloads!!!
 * http://prntscr.com/1hz9gd
 * http://prntscr.com/1hzais
 * @author Lars
 */
public class LotsOMobs
{
	public static String modid = "lom";	
	@SidedProxy(clientSide = "com.lom.lotsomobscore.LotsOMobsClient",serverSide = "com.lom.lotsomobscore.LotsOMobsProxy")
	public static LotsOMobsProxy proxy;
	@Instance("LotsOMobs")
	public static LotsOMobs instance;	
//Enums
	public static ToolMaterial EnumToolMaterialHorn= EnumHelper.addToolMaterial("HORN", 1, 100, 2.1F, 1, 17);
	public static ToolMaterial EnumToolMaterialIvory= EnumHelper.addToolMaterial("IVORY", 1, 200, 5.0F, 2, 8);
	public static ToolMaterial EnumToolMaterialIcemintuim= EnumHelper.addToolMaterial("ICEMINTUIM", 2, 500, 8F, 4, 12);
	public static ToolMaterial EnumToolMaterialAmber= EnumHelper.addToolMaterial("AMBER", 5, 1800, 15F, 8, 24);

	public static final ArmorMaterial Fur = EnumHelper.addArmorMaterial("Fur",  6, new int[] {2, 4, 3, 2}, 17);
	public static final ArmorMaterial Santa = EnumHelper.addArmorMaterial("Santa",  7, new int[] {1, 3, 2, 1}, 15);
	public static final ArmorMaterial AmberA = EnumHelper.addArmorMaterial("Amber",  200, new int[] {5, 10, 8, 5}, 12);
	public static final ArmorMaterial Dino = EnumHelper.addArmorMaterial("Dino",  75, new int[] {3, 8, 6, 3}, 10);
	public static final ArmorMaterial Eskimo = EnumHelper.addArmorMaterial("Eskimo",  8, new int[] {3, 5, 4, 4}, 20);
	public static final ArmorMaterial IcemintuimA = EnumHelper.addArmorMaterial("Icemintuim", 90, new int[] {3, 6, 5, 3}, 12);
//Tabs
	public static CreativeTabs LotsOMobsItemsTab = new MyItemsTab(CreativeTabs.getNextID(),"LotsOMobsItems");
	public static CreativeTabs LotsOMobsCombatTab = new MyCombatTab(CreativeTabs.getNextID(),"LotsOMobsCombat");
	public static CreativeTabs LotsOMobsBlockTab = new MyBlockTab(CreativeTabs.getNextID(),"LotsOMobsBlock");
	
//Configurations	
	public void initConfiguration(FMLPreInitializationEvent event)
	{
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());		
		config.load();
		/**Here are all the Configuration settings for the mobs**/
		ConfigDetails.DeerOn = config.get("Mobs" , "Deer", true).getBoolean(true);
		ConfigDetails.BoarOn = config.get("Mobs" , "Boar", true).getBoolean(true);
		ConfigDetails.WinterDeerOn = config.get("Mobs" , "WinterDeer", true).getBoolean(true);
		ConfigDetails.BearOn = config.get("Mobs" , "Bear", true).getBoolean(true);
		ConfigDetails.GorillaOn = config.get("Mobs" , "Gorilla", true).getBoolean(true);
		ConfigDetails.WhaleOn = config.get("Mobs" , "Whale", true).getBoolean(true);
		ConfigDetails.NarwalOn = config.get("Mobs" , "Narwhale", true).getBoolean(true);
		ConfigDetails.FishyOn = config.get("Mobs" , "Fishy", true).getBoolean(true);
		ConfigDetails.CamelOn = config.get("Mobs" , "Camel", true).getBoolean(true);
		ConfigDetails.BirdOn = config.get("Mobs" , "Bird", true).getBoolean(true);
		ConfigDetails.PenguinOn = config.get("Mobs" , "Penguin", true).getBoolean(true);
		ConfigDetails.IceBearOn = config.get("Mobs" , "IceBear", true).getBoolean(true);
		ConfigDetails.SnakeOn = config.get("Mobs" , "Snake", true).getBoolean(true);
		ConfigDetails.ButterFlyOn = config.get("Mobs" , "ButterFly", true).getBoolean(true);
		ConfigDetails.GiraffeOn = config.get("Mobs" , "Giraffe", true).getBoolean(true);
		ConfigDetails.ElephantOn = config.get("Mobs" , "Elephant", true).getBoolean(true);
		ConfigDetails.VultureOn = config.get("Mobs" , "Vulture", true).getBoolean(true);
		ConfigDetails.AntOn = config.get("Mobs" , "Ant", true).getBoolean(true);
		ConfigDetails.TurtleOn = config.get("Mobs" , "Turtle", true).getBoolean(true);
		ConfigDetails.LizardOn = config.get("Mobs" , "Lizard", true).getBoolean(true);
		ConfigDetails.GekkoOn = config.get("Mobs" , "Gekko", true).getBoolean(true);
		ConfigDetails.SantaOn = config.get("Mobs" , "Santa", true).getBoolean(true);
		ConfigDetails.CrocoOn = config.get("Mobs" , "Croco", true).getBoolean(true);
		ConfigDetails.TriceratopsOn = config.get("Mobs" , "Triceratops", true).getBoolean(true);
		ConfigDetails.BrontosaurusOn = config.get("Mobs" , "Brontosaurus", true).getBoolean(true);
		ConfigDetails.RaptorOn = config.get("Mobs" , "Raptor", true).getBoolean(true);
		ConfigDetails.TRexOn = config.get("Mobs" , "T-Rex", true).getBoolean(true);
		ConfigDetails.PterosaurusOn = config.get("Mobs" , "Pterosaur", true).getBoolean(true);
		ConfigDetails.MammothOn = config.get("Mobs" , "Mammoth", true).getBoolean(true);
		ConfigDetails.SaberToothOn = config.get("Mobs" , "SaberTooth", true).getBoolean(true);
		ConfigDetails.LionOn = config.get("Mobs" , "Lion", true).getBoolean(true);
		ConfigDetails.EskimoOn = config.get("Mobs" , "Eskimo", true).getBoolean(true);
		ConfigDetails.CavemanOn = config.get("Mobs" , "Caveman", true).getBoolean(true);
		ConfigDetails.BunnyOn = config.get("Mobs" , "Bunny", true).getBoolean(true);
		ConfigDetails.EasterBunnyOn = config.get("Mobs" , "EasterBunny", true).getBoolean(true);
		ConfigDetails.SquirrelOn = config.get("Mobs" , "Squirrel", true).getBoolean(true);
		ConfigDetails.KakkerlakOn = config.get("Mobs" , "Cockroach", true).getBoolean(true);
		ConfigDetails.BirdyOn = config.get("Mobs" , "Birdy", true).getBoolean(true);
		ConfigDetails.MuskOxOn = config.get("Mobs" , "Musk Ox", true).getBoolean(true);
		ConfigDetails.PDFrogOn = config.get("Mobs" , "Poison Dart Frog", true).getBoolean(true);
		ConfigDetails.FrogOn = config.get("Mobs" , "Frog", true).getBoolean(true);
		ConfigDetails.FlyOn = config.get("Mobs" , "Fly", true).getBoolean(true);
		ConfigDetails.FireFlyOn = config.get("Mobs" , "FireFly", true).getBoolean(true);
		ConfigDetails.BullFrogOn = config.get("Mobs" , "BullFrog", true).getBoolean(true);
		ConfigDetails.BeeOn = config.get("Mobs" , "Bee", true).getBoolean(true);
		ConfigDetails.WormOn = config.get("Mobs" , "Worm", true).getBoolean(true);
		ConfigDetails.HermitCrabOn = config.get("Mobs" , "Hermit Crab", true).getBoolean(true);
		ConfigDetails.EmpirosaurusOn = config.get("Mobs", "Empirosaurus", true).getBoolean(true);
		ConfigDetails.GoatOn = config.get("Mobs" , "Goat", true).getBoolean(true);
		ConfigDetails.IchtyosaurusOn = config.get("Mobs" , "Ichtyosaurus", true).getBoolean(true);	
		/**Here are all the Configuration settings for the biomes**/
		ConfigDetails.AntarticaID = config.get("Biome" , "Antartica", 40).getInt();
		ConfigDetails.ArcticOceanID = config.get("Biome" , "Arctic Ocean", 41).getInt();
		ConfigDetails.DinoTerrainID = config.get("Biome" , "Dino Terrain(Uses this + the next three)", 42).getInt();
		ConfigDetails.IceTerrainID = config.get("Biome" , "Ice Terrain(Uses this + the next three)", 46).getInt();
		//Add 3 for next ID, Ice uses 46, 47, 48 and 49		
		/**Here are all the Configuration settings for the dimensions**/
		ConfigDetails.dimension = config.get("Dimension" , "Dino Dimension", -24).getInt();
		ConfigDetails.dimension2 = config.get("Dimension" , "Ice Dimension", -25).getInt();
		
		ConfigDetails.TriceratopsID = config.get("Mob ID (Only for the DNA Mobs)" , "Triceratops ID", 110).getInt();
		ConfigDetails.BrontosaurusID = config.get("Mob ID (Only for the DNA Mobs)" , "Brontosaurus ID", 111).getInt();
		ConfigDetails.RaptorID = config.get("Mob ID (Only for the DNA Mobs)" , "Raptor ID", 112).getInt();
		ConfigDetails.TRexID = config.get("Mob ID (Only for the DNA Mobs)" , "T-Rex ID", 113).getInt();
		ConfigDetails.PterosaurusID = config.get("Mob ID (Only for the DNA Mobs)" , "Pterosaurus ID", 114).getInt();
		ConfigDetails.MammothID = config.get("Mob ID (Only for the DNA Mobs)" , "Mammoth ID", 115).getInt();
		ConfigDetails.SaberToothID = config.get("Mob ID (Only for the DNA Mobs)" , "SaberTooth ID", 116).getInt();
		ConfigDetails.IchtyosaurusID = config.get("Mob ID (Only for the DNA Mobs)" , "Ichtyosaurus ID", 117).getInt();		
		config.save();		
	}

//PreInit
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
     this.initConfiguration(event);
     LotsOMobsBlocks.Init();
     LotsOMobsItems.Init();
     LotsOMobsBiomes.Init();
     LotsOMobsAchievementsBook.Init();

     GameRegistry.registerWorldGenerator(new FossilOreGeneration(), 2);
     GameRegistry.registerWorldGenerator(new OreGeneration(), 2);
		 proxy.registerSound();		
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{	
		LotsOMobsMobs.Init();
		LotsOMobsRecipes.RecipeBook();		
     	
		proxy.registerRenderInformation();
     	
     	ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(LotsOMobsItems.PineApple, 0, 1, 4, 50));
     	ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(LotsOMobsItems.PineApple, 0, 1, 4, 50));
     	ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(LotsOMobsItems.PineApple, 0, 1, 4, 50));
     	ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(LotsOMobsItems.PineApple, 0, 1, 4, 50));
     	
     	ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(LotsOMobsItems.Tomato, 0, 1, 4, 50));
     	ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(LotsOMobsItems.Tomato, 0, 1, 4, 50));
     	ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(LotsOMobsItems.Tomato, 0, 1, 4, 50));
     	ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(LotsOMobsItems.Tomato, 0, 1, 4, 50));     	

     	MinecraftForge.EVENT_BUS.register(new LotsOMobsAchievements());
     	FMLCommonHandler.instance().bus().register(new LotsOMobsAchievements());
	
	}
	
}