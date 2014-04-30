package com.lom.LotsOMobsCore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.util.EnumHelper;

import com.lom.LotsOMobsBiomes.BiomeGenAntartica;
import com.lom.LotsOMobsBiomes.BiomeGenArcticOcean;
import com.lom.LotsOMobsBiomes.BiomeGenDinoIslands;
import com.lom.LotsOMobsBiomes.BiomeGenDinoJungle;
import com.lom.LotsOMobsBiomes.BiomeGenDinoMountains;
import com.lom.LotsOMobsBiomes.BiomeGenDinoOcean;
import com.lom.LotsOMobsBiomes.BiomeGenDinoPlains;
import com.lom.LotsOMobsBiomes.BiomeGenIceIslands;
import com.lom.LotsOMobsBiomes.BiomeGenIceMountains;
import com.lom.LotsOMobsBiomes.BiomeGenIceOcean;
import com.lom.LotsOMobsBiomes.BiomeGenIcePlains;
import com.lom.LotsOMobsBlocks.BlockAmberOre;
import com.lom.LotsOMobsBlocks.BlockAncientFire;
import com.lom.LotsOMobsBlocks.BlockDinoLeaves;
import com.lom.LotsOMobsBlocks.BlockDinoLog;
import com.lom.LotsOMobsBlocks.BlockDinoPortal;
import com.lom.LotsOMobsBlocks.BlockDinoWoodPlanks;
import com.lom.LotsOMobsBlocks.BlockDinoWoodStairs;
import com.lom.LotsOMobsBlocks.BlockEasterCake;
import com.lom.LotsOMobsBlocks.BlockEasterEgg;
import com.lom.LotsOMobsBlocks.BlockFossilOre;
import com.lom.LotsOMobsBlocks.BlockIceCobble;
import com.lom.LotsOMobsBlocks.BlockIcePortal;
import com.lom.LotsOMobsBlocks.BlockIceStone;
import com.lom.LotsOMobsBlocks.BlockMyFlower;
import com.lom.LotsOMobsCrops.BlockPineApple;
import com.lom.LotsOMobsCrops.BlockTomato;
import com.lom.LotsOMobsCrops.ItemMyFoodSeed;
import com.lom.LotsOMobsDino.WorldProviderDino;
import com.lom.LotsOMobsEntity.EntityAnt;
import com.lom.LotsOMobsEntity.EntityBear;
import com.lom.LotsOMobsEntity.EntityBee;
import com.lom.LotsOMobsEntity.EntityBird;
import com.lom.LotsOMobsEntity.EntityBoar;
import com.lom.LotsOMobsEntity.EntityBrontosaurus;
import com.lom.LotsOMobsEntity.EntityBullFrog;
import com.lom.LotsOMobsEntity.EntityBunny;
import com.lom.LotsOMobsEntity.EntityButterfly;
import com.lom.LotsOMobsEntity.EntityCamel;
import com.lom.LotsOMobsEntity.EntityCroco;
import com.lom.LotsOMobsEntity.EntityDeer;
import com.lom.LotsOMobsEntity.EntityEasterBunny;
import com.lom.LotsOMobsEntity.EntityEasterChick;
import com.lom.LotsOMobsEntity.EntityElephant;
import com.lom.LotsOMobsEntity.EntityFireFly;
import com.lom.LotsOMobsEntity.EntityFishy;
import com.lom.LotsOMobsEntity.EntityFly;
import com.lom.LotsOMobsEntity.EntityFrog;
import com.lom.LotsOMobsEntity.EntityGekko;
import com.lom.LotsOMobsEntity.EntityGiraffe;
import com.lom.LotsOMobsEntity.EntityGoat;
import com.lom.LotsOMobsEntity.EntityGorilla;
import com.lom.LotsOMobsEntity.EntityHermitCrab;
import com.lom.LotsOMobsEntity.EntityIchtyosaurus;
import com.lom.LotsOMobsEntity.EntityKakkerlak;
import com.lom.LotsOMobsEntity.EntityLion;
import com.lom.LotsOMobsEntity.EntityLizard;
import com.lom.LotsOMobsEntity.EntityNarwal;
import com.lom.LotsOMobsEntity.EntityPDFrog;
import com.lom.LotsOMobsEntity.EntityPenguin;
import com.lom.LotsOMobsEntity.EntityPolarBear;
import com.lom.LotsOMobsEntity.EntityPterosaurus;
import com.lom.LotsOMobsEntity.EntityRaptor;
import com.lom.LotsOMobsEntity.EntitySanta;
import com.lom.LotsOMobsEntity.EntityShell;
import com.lom.LotsOMobsEntity.EntitySnake;
import com.lom.LotsOMobsEntity.EntitySquirrel;
import com.lom.LotsOMobsEntity.EntityTRex;
import com.lom.LotsOMobsEntity.EntityTriceratops;
import com.lom.LotsOMobsEntity.EntityTropicalFishy;
import com.lom.LotsOMobsEntity.EntityTurtle;
import com.lom.LotsOMobsEntity.EntityVulture;
import com.lom.LotsOMobsEntity.EntityWhale;
import com.lom.LotsOMobsEntity.EntityWinterDeer;
import com.lom.LotsOMobsEntity.EntityWorm;
import com.lom.LotsOMobsIceAge.WorldProviderIceAge;
import com.lom.LotsOMobsItems.ItemCactiOnAStick;
import com.lom.LotsOMobsItems.ItemDNA;
import com.lom.LotsOMobsItems.ItemEasterCake;
import com.lom.LotsOMobsItems.ItemFlintAndFossil;
import com.lom.LotsOMobsItems.ItemMaterials;
import com.lom.LotsOMobsItems.ItemMyAxe;
import com.lom.LotsOMobsItems.ItemMyPickaxe;
import com.lom.LotsOMobsItems.ItemMyShovel;
import com.lom.LotsOMobsItems.ItemPortalPlacer;
import com.lom.LotsOMobsItems.ItemTimeTraveler;
import com.lom.LotsOMobsItems.MyFood;
import com.lom.LotsOMobsTabs.MyBlockTab;
import com.lom.LotsOMobsTabs.MyCombatTab;
import com.lom.LotsOMobsTabs.MyItemsTab;
import com.lom.LotsOMobsWorldGen.FossilOreGeneration;
import com.lom.LotsOMobsWorldGen.OreGeneration;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod (modid = "lom",name = "LotsOMobs", version = "version")
/**100.000 downloads!!!
 * http://prntscr.com/1hz9gd
 * http://prntscr.com/1hzais
 * @author Lars
 */
public class LotsOMobs
{
	public static String modid = "lom";	
	@SidedProxy(clientSide = "com.lom.LotsOMobsCore.LotsOMobsClient",serverSide = "com.lom.LotsOMobsCore.LotsOMobsProxy")
	public static LotsOMobsProxy proxy;
	@Instance("LotsOMobs")
	public static LotsOMobs instance;	
//Enums
	static ToolMaterial EnumToolMaterialHorn= EnumHelper.addToolMaterial("HORN", 1, 100, 2.1F, 1, 17);
	static ToolMaterial EnumToolMaterialIvory= EnumHelper.addToolMaterial("IVORY", 1, 200, 5.0F, 2, 8);
	static ToolMaterial EnumToolMaterialIcemintuim= EnumHelper.addToolMaterial("ICEMINTUIM", 2, 500, 8F, 4, 12);
	static ToolMaterial EnumToolMaterialAmber= EnumHelper.addToolMaterial("AMBER", 5, 1800, 15F, 8, 24);

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
	
//Biomes
	public static  BiomeGenBase modBiomeAntartica;
	public static  BiomeGenBase modBiomeArcticOcean;
	public static  BiomeGenBase modBiomeDinoPlains;
	public static  BiomeGenBase modBiomeDinoMountains;
	public static  BiomeGenBase modBiomeDinoOcean;
	public static  BiomeGenBase modBiomeDinoIslands;
	public static  BiomeGenBase modBiomeDinoJungle;
	public static  BiomeGenBase modBiomeIcePlains;
	public static  BiomeGenBase modBiomeIceMountains;
	public static  BiomeGenBase modBiomeIceOcean;
	public static  BiomeGenBase modBiomeIceIslands;

//Items
	public static Item DeerFur;
	public static Item Horn;
	public static Item Venison;
	public static Item RawVenison;
	public static Item BoarMeat;
	public static Item RawBoar;
	public static Item Ivory;
	public static Item IvoryBlade;
	public static Item ReptileMeat;
	public static Item RawReptile;
	public static Item WhaleMeat;
	public static Item RawWhale;
	public static Item SmashedBug;
	public static Item CamelMeat;
	public static Item RawCamel;
	public static Item CactiOnAStick;
	public static Item LionMeat;
	public static Item RawLion;
	public static Item WildStew;
	public static Item CookedFrog;
	public static Item RawFrog;
	public static Item Honey;
	public static Item Tomato;
	public static Item PineApple;
	public static Item PenguinMeat;
	public static Item RawPenguin;
	public static Item AngoraWool;
	public static Item FlintAndFossil;
	public static Item DinoBone;
	public static Item DinoFur;
	public static Item TimeTraveler;
	public static Item PortalPlacer;
	public static Item Amber;
	public static Item EasterCake1;
	public static Item EasterCake2;
	public static Item EasterCake3;
	public static Item EasterCake4;
	public static Item EasterCake5;
	
	public static Item HornSword;	
	public static  Item AmberPickaxe;
	public static  Item AmberAxe;
	public static  Item AmberShovel;
	public static  Item AmberSword;
	public static  Item AmberHoe;
	public static  Item IvoryPickaxe;
	public static  Item IvoryAxe;
	public static  Item IvoryShovel;
	public static  Item IvorySword;
	public static  Item IvoryHoe;
	
	public static  Item FurHelmet;
	public static  Item FurChestplate;
	public static  Item FurLeggings;
	public static  Item FurBoots;
	//Christmas Special
	public static  Item SantaHelmet;
	public static  Item SantaChestplate;
	public static  Item SantaLeggings;
	public static  Item SantaBoots;
	
	public static  Item AmberHelmet;
	public static  Item AmberChestplate;
	public static  Item AmberLeggings;
	public static  Item AmberBoots;
	
	public static  Item DinoFurHelmet;
	public static  Item DinoFurChestplate;
	public static  Item DinoFurLeggings;
	public static  Item DinoFurBoots;	
//Fossils and shit
	//Fossils and DNAs
	public static  Item FossilTri;
	public static  Item FossilBro;
	public static  Item FossilRap;
	public static  Item FossilRex;
	public static  Item FossilPte;
	public static  Item FossilMam;
	public static  Item FossilSab;
	public static  Item FossilIch;
	public static  Item DNATri;
	public static  Item DNABro;
	public static  Item DNARap;
	public static  Item DNARex;
	public static  Item DNAPte;
	public static  Item DNAMam;
	public static  Item DNASab;
	public static  Item DNAIch;

//Blocks
	public static Block PineAppleBlock;
	public static Block TomatoBlock;
	public static Block DinoPortal;
	public static Block DinoLeaves;
	public static Block DinoLog;
	public static Block AncientFire;
	public static Block FossilOre;
	public static Block AmberOre;
	public static Block DinoWoodPlanks;
	public static Block DinoWoodStairs;
	public static Block IceStone;
	public static Block IceCobble;
	public static Block IcePortal;
	public static Block EasterCake1Block;
	public static Block EasterCake2Block;
	public static Block EasterCake3Block;
	public static Block EasterCake4Block;
	public static Block EasterCake5Block;

	public static BlockMyFlower OrangeFlower;
	public static BlockMyFlower Flowers;
	public static BlockMyFlower PurpleFlower;
	public static BlockMyFlower WhiteFlower;
	public static BlockMyFlower BlueFlower;
	public static BlockMyFlower PinkFlower;
	public static BlockMyFlower YellowFlower;
	public static BlockMyFlower RedFlower;
	//EasterEggs
	public static Block EasterEgg1;
	public static Block EasterEgg2;
	public static Block EasterEgg3;
	public static Block EasterEgg4;
	public static Block EasterEgg5;
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
        MinecraftForge.TERRAIN_GEN_BUS.register(this);
        this.initConfiguration(event);
//Biomes
		 modBiomeAntartica = new BiomeGenAntartica(ConfigDetails.AntarticaID).setColor(747097).setBiomeName("Antartica");
		 modBiomeArcticOcean = new BiomeGenArcticOcean(ConfigDetails.ArcticOceanID).setColor(747097).setBiomeName("Arctic Ocean");
		 modBiomeDinoPlains = new BiomeGenDinoPlains(ConfigDetails.DinoTerrainID).setColor(6546587).setBiomeName("Dino Plains");
		 modBiomeDinoMountains = new BiomeGenDinoMountains(ConfigDetails.DinoTerrainID+1).setColor(6546587).setBiomeName("Dino Mountains");
		 modBiomeDinoOcean = new BiomeGenDinoOcean(ConfigDetails.DinoTerrainID+2).setColor(6546587).setBiomeName("Dino Ocean");
		 modBiomeDinoIslands = new BiomeGenDinoIslands(ConfigDetails.DinoTerrainID+3).setColor(6546587).setBiomeName("Dino Islands");
		 modBiomeDinoJungle = new BiomeGenDinoJungle(ConfigDetails.DinoTerrainID+4).setColor(6546587).setBiomeName("Dino Jungle");	
		 modBiomeIcePlains = new BiomeGenIcePlains(ConfigDetails.IceTerrainID+1).setColor(6546587).setBiomeName("Ice Plains");
		 modBiomeIceMountains = new BiomeGenIceMountains(ConfigDetails.IceTerrainID+2).setColor(6546587).setBiomeName("Ice Mountains");
		 modBiomeIceOcean = new BiomeGenIceOcean(ConfigDetails.IceTerrainID+3).setColor(6546587).setBiomeName("Ice Ocean");
		 modBiomeIceIslands = new BiomeGenIceIslands(ConfigDetails.IceTerrainID+4).setColor(6546587).setBiomeName("Ice Islands");
		 
		 BiomeDictionary.registerBiomeType(modBiomeAntartica, Type.WASTELAND);
	     BiomeManager.addSpawnBiome(modBiomeAntartica);
	     
	     BiomeDictionary.registerBiomeType(modBiomeArcticOcean, Type.WASTELAND);
	     BiomeManager.addSpawnBiome(modBiomeArcticOcean);
//Dimensions
		DimensionManager.registerProviderType(ConfigDetails.dimension, WorldProviderDino.class, false);
		DimensionManager.registerDimension(ConfigDetails.dimension, ConfigDetails.dimension);
		
		DimensionManager.registerProviderType(ConfigDetails.dimension2, WorldProviderIceAge.class, false);
		DimensionManager.registerDimension(ConfigDetails.dimension2, ConfigDetails.dimension2);
//Blocks
		PineAppleBlock = new BlockPineApple().setHardness(0.1F).setBlockName("PineApple");
		TomatoBlock = new BlockTomato().setHardness(0.1F).setBlockName("Tomato");
		DinoPortal = new BlockDinoPortal(0).setHardness(0.1F).setBlockName("DinoPortal");
		IcePortal = new BlockIcePortal(0).setHardness(0.1F).setBlockName("IcePortal");
		DinoLeaves = new BlockDinoLeaves().setHardness(0.1F).setBlockName("DinoLeaves");
		DinoLog = new BlockDinoLog(Material.wood).setHardness(8.3F).setBlockName("DinoLog");
		AncientFire = new BlockAncientFire().setHardness(0.0F).setBlockName("AncientFire");
		FossilOre = new BlockFossilOre(2, 0).setBlockName("FossilOre").setHardness(1.3F);
		AmberOre = new BlockAmberOre(2, 0).setBlockName("AmberOre").setHardness(10.9F);
		IceStone= new BlockIceStone(0, null).setBlockName("IceStone").setHardness(10.9F);
		IceCobble = new BlockIceCobble(0, null).setBlockName("IceCobble").setHardness(10.9F);
		DinoWoodPlanks = new BlockDinoWoodPlanks(Material.wood).setBlockName("DinoWoodPlanks").setHardness(2F).setResistance(8F);
		DinoWoodStairs = new BlockDinoWoodStairs().setBlockName("DinoWoodStairs").setHardness(2F).setResistance(8F);
		EasterCake1Block = new BlockEasterCake().setHardness(0.1F).setBlockName("EasterCake1").setBlockTextureName("EasterCake1");
		EasterCake2Block = new BlockEasterCake().setHardness(0.1F).setBlockName("EasterCake2").setBlockTextureName("EasterCake2");
		EasterCake3Block = new BlockEasterCake().setHardness(0.1F).setBlockName("EasterCake3").setBlockTextureName("EasterCake3");
		EasterCake4Block = new BlockEasterCake().setHardness(0.1F).setBlockName("EasterCake4").setBlockTextureName("EasterCake4");
		EasterCake5Block = new BlockEasterCake().setHardness(0.1F).setBlockName("EasterCake5").setBlockTextureName("EasterCake5");

		//Flowers
		OrangeFlower = (BlockMyFlower)(new BlockMyFlower(ConfigDetails.OrangeFlowerID)).setHardness(0.0F).setBlockName("OrangeFlower");
		Flowers = (BlockMyFlower)(new BlockMyFlower(ConfigDetails.FlowerID)).setHardness(0.0F).setBlockName("Flowers");
		PurpleFlower = (BlockMyFlower)(new BlockMyFlower(ConfigDetails.PurpleFlowerID)).setHardness(0.0F).setBlockName("PurpleFlower");
		WhiteFlower = (BlockMyFlower)(new BlockMyFlower(ConfigDetails.WhiteFlowerID)).setHardness(0.0F).setBlockName("WhiteFlower");
		BlueFlower = (BlockMyFlower)(new BlockMyFlower(ConfigDetails.BlueFlowerID)).setHardness(0.0F).setBlockName("BlueFlower");
		PinkFlower = (BlockMyFlower)(new BlockMyFlower(ConfigDetails.PinkFlowerID)).setHardness(0.0F).setBlockName("PinkFlower");
		YellowFlower = (BlockMyFlower)(new BlockMyFlower(ConfigDetails.YellowFlowerID)).setHardness(0.0F).setBlockName("YellowFlower");
		RedFlower = (BlockMyFlower)(new BlockMyFlower(ConfigDetails.RedFlowerID)).setHardness(0.0F).setBlockName("RedFlower");
		//EasterEggs
		EasterEgg1 = (new BlockEasterEgg().setBlockName("EasterEgg1").setHardness(0.5F).setResistance(0F));
		EasterEgg2 = (new BlockEasterEgg().setBlockName("EasterEgg2").setHardness(0.5F).setResistance(0F));
		EasterEgg3 = (new BlockEasterEgg().setBlockName("EasterEgg3").setHardness(0.5F).setResistance(0F));
		EasterEgg4 = (new BlockEasterEgg().setBlockName("EasterEgg4").setHardness(0.5F).setResistance(0F));
		EasterEgg5 = (new BlockEasterEgg().setBlockName("EasterEgg5").setHardness(0.5F).setResistance(0F));
				
		 //Register Blocks
	     GameRegistry.registerBlock(PineAppleBlock, "PineAppleBlock");
	     GameRegistry.registerBlock(TomatoBlock, "TomatoBlock");
	     GameRegistry.registerBlock(DinoPortal, "DinoPortal");
	     GameRegistry.registerBlock(DinoLeaves, "DinoLeaves");
	     GameRegistry.registerBlock(DinoLog, "DinoLog");
	     GameRegistry.registerBlock(AncientFire, "AncientFire");
	     GameRegistry.registerBlock(FossilOre, "FossilOre");
	     GameRegistry.registerBlock(AmberOre, "AmberOre");
	     GameRegistry.registerBlock(IceStone, "IceStone");
	     GameRegistry.registerBlock(IceCobble, "IceCobble");
	     GameRegistry.registerBlock(IcePortal, "IcePortal");
	     GameRegistry.registerBlock(DinoWoodPlanks, "DinoPlanks");
	     GameRegistry.registerBlock(DinoWoodStairs, "DinoStairs");
	     GameRegistry.registerBlock(EasterCake1Block, "EasterCake1Block");
	     GameRegistry.registerBlock(EasterCake2Block, "EasterCake2Block");
	     GameRegistry.registerBlock(EasterCake3Block, "EasterCake3Block");
	     GameRegistry.registerBlock(EasterCake4Block, "EasterCake4Block");
	     GameRegistry.registerBlock(EasterCake5Block, "EasterCake5Block");

	     //Flowers
	     /*GameRegistry.registerBlock(OrangeFlower, "Orange Flower");
	     GameRegistry.registerBlock(Flowers, "Flowers");
	     GameRegistry.registerBlock(PurpleFlower, "Purple Flowers");
	     GameRegistry.registerBlock(WhiteFlower, "White Flowers");
	     GameRegistry.registerBlock(BlueFlower, "Blue Flower");
	     GameRegistry.registerBlock(PinkFlower, "Pink Flower");
	     GameRegistry.registerBlock(YellowFlower, "Yellow Flower");
	     GameRegistry.registerBlock(RedFlower, "Red Flowers");*/
	     //EasterEggs
	     GameRegistry.registerBlock(EasterEgg1, "EasterEgg1");
	     GameRegistry.registerBlock(EasterEgg2, "EasterEgg2");
	     GameRegistry.registerBlock(EasterEgg3, "EasterEgg3");
	     GameRegistry.registerBlock(EasterEgg4, "EasterEgg4");
	     GameRegistry.registerBlock(EasterEgg5, "EasterEgg5");
//Items
		 DeerFur = new ItemMaterials().setTextureName(modid + ":DeerFur").setUnlocalizedName("DeerFur");
		 Horn = new ItemMaterials().setTextureName(modid + ":Horn").setUnlocalizedName("Horn");
		 AngoraWool = new ItemMaterials().setTextureName(modid + ":AngoraWool").setUnlocalizedName("AngoraWool");
		 Ivory = new ItemMaterials().setTextureName(modid + ":Ivory").setUnlocalizedName("Ivory");
		 IvoryBlade = new ItemMaterials().setTextureName(modid + ":IvoryBlade").setUnlocalizedName("IvoryBlade");
		 RawVenison = new MyFood(3, 1F, false).setTextureName(modid + ":" + "RawVenison").setUnlocalizedName("RawVenison");
		 SmashedBug = new ItemMaterials().setTextureName(modid + ":SmashedBug").setUnlocalizedName("SmashedBug");
		 CactiOnAStick = new ItemCactiOnAStick().setTextureName(modid + ":CactiOnAStick").setUnlocalizedName("CactiOnAStick");
		 FlintAndFossil = new ItemFlintAndFossil(0).setTextureName(modid + ":FlintAndFossil").setUnlocalizedName("FlintAndFossil");
		 DinoBone = new ItemMaterials().setTextureName(modid + ":DinoBone").setUnlocalizedName("DinoBone");
		 DinoFur = new ItemMaterials().setTextureName(modid + ":DinoFur").setUnlocalizedName("DinoFur");
		 TimeTraveler = new ItemTimeTraveler().setTextureName(modid + ":TimeTraveler").setUnlocalizedName("TimeTraveler");
		 PortalPlacer = new ItemPortalPlacer().setTextureName(modid + ":PortalPlacer").setUnlocalizedName("PortalPlacer");		 
		 Amber = new ItemMaterials().setTextureName(modid + ":Amber").setUnlocalizedName("Amber");		 
		 
		 Venison = new MyFood(6, 1F, false).setTextureName(modid + ":Venison").setUnlocalizedName("Venison");
		 RawVenison = new MyFood(2, 1F, false).setTextureName(modid + ":RawVenison").setUnlocalizedName("RawVenison");
		 RawBoar = new MyFood(3, 1F, false).setUnlocalizedName("RawBoar").setTextureName(modid + ":RawBoar");
		 BoarMeat = new MyFood(7, 1F, false).setUnlocalizedName("BoarMeat").setTextureName(modid + ":BoarMeat");
		 RawReptile = new MyFood(1, 1F, false).setUnlocalizedName("RawReptile").setTextureName(modid + ":RawReptile");
		 ReptileMeat = new MyFood(3, 1F, false).setUnlocalizedName("ReptileMeat").setTextureName(modid + ":ReptileMeat");
		 RawWhale = new MyFood(3, 1F, false).setUnlocalizedName("RawWhale").setTextureName(modid + ":RawWhale");
		 WhaleMeat = new MyFood(6, 1F, false).setUnlocalizedName("WhaleMeat").setTextureName(modid + ":WhaleMeat");
		 RawCamel = new MyFood(2, 1F, false).setUnlocalizedName("RawCamel").setTextureName(modid + ":RawCamel");
		 CamelMeat = new MyFood(5, 1F, false).setUnlocalizedName("CamelMeat").setTextureName(modid + ":CamelMeat");
		 RawLion = new MyFood(4, 1F, false).setUnlocalizedName("RawLion").setTextureName(modid + ":RawLion");
		 LionMeat = new MyFood(8, 1F, false).setUnlocalizedName("LionMeat").setTextureName(modid + ":LionMeat");
		 WildStew = new MyFood(15, 1F, false).setUnlocalizedName("WildStew").setTextureName(modid + ":WildStew");
		 RawFrog = new MyFood(3, 1F, false).setUnlocalizedName("RawFrog").setTextureName(modid + ":RawFrog");
		 CookedFrog = new MyFood(5, 1F, false).setUnlocalizedName("CookedFrog").setTextureName(modid + ":CookedFrog");
		 Honey = new MyFood(3, 1F, false).setUnlocalizedName("Honey").setTextureName(modid + ":Honey");
		 PineApple = new ItemMyFoodSeed(5, 0.6F, LotsOMobs.PineAppleBlock, Blocks.farmland).setUnlocalizedName("PineApple").setTextureName(modid + ":PineApple").setCreativeTab(LotsOMobs.LotsOMobsItemsTab);
		 Tomato = new ItemMyFoodSeed(5, 0.6F, LotsOMobs.TomatoBlock, Blocks.farmland).setUnlocalizedName("Tomato").setTextureName(modid + ":Tomato").setCreativeTab(LotsOMobs.LotsOMobsItemsTab);
		 RawPenguin = new MyFood(3, 1F, false).setUnlocalizedName("RawPenguin").setTextureName(modid + ":RawPenguin");
		 PenguinMeat = new MyFood(7, 1F, false).setUnlocalizedName("PenguinMeat").setTextureName(modid + ":PenguinMeat");
		 EasterCake1 = new ItemEasterCake(LotsOMobs.EasterCake1Block).setMaxStackSize(1).setUnlocalizedName("EasterCake").setCreativeTab(LotsOMobs.LotsOMobsItemsTab).setTextureName("EasterCake1");
		 EasterCake2 = new ItemEasterCake(LotsOMobs.EasterCake2Block).setMaxStackSize(1).setUnlocalizedName("EasterCake").setCreativeTab(LotsOMobs.LotsOMobsItemsTab).setTextureName("EasterCake2");
		 EasterCake3 = new ItemEasterCake(LotsOMobs.EasterCake3Block).setMaxStackSize(1).setUnlocalizedName("EasterCake").setCreativeTab(LotsOMobs.LotsOMobsItemsTab).setTextureName("EasterCake3");
		 EasterCake4 = new ItemEasterCake(LotsOMobs.EasterCake4Block).setMaxStackSize(1).setUnlocalizedName("EasterCake").setCreativeTab(LotsOMobs.LotsOMobsItemsTab).setTextureName("EasterCake4");
		 EasterCake5 = new ItemEasterCake(LotsOMobs.EasterCake5Block).setMaxStackSize(1).setUnlocalizedName("EasterCake").setCreativeTab(LotsOMobs.LotsOMobsItemsTab).setTextureName("EasterCake5");
//Fossils and Shit
		//Fossils and DNAs
		 FossilTri = new ItemDNA().setUnlocalizedName("FossilTri").setTextureName(modid + ":Fossil");
		 FossilBro = new ItemDNA().setUnlocalizedName("FossilBro").setTextureName(modid + ":Fossil");
		 FossilRap = new ItemDNA().setUnlocalizedName("FossilRap").setTextureName(modid + ":Fossil");
		 FossilRex = new ItemDNA().setUnlocalizedName("FossilRex").setTextureName(modid + ":Fossil");
		 FossilPte = new ItemDNA().setUnlocalizedName("FossilPte").setTextureName(modid + ":Fossil");
		 FossilMam = new ItemDNA().setUnlocalizedName("FossilMam").setTextureName(modid + ":Fossil");
		 FossilSab = new ItemDNA().setUnlocalizedName("FossilSab").setTextureName(modid + ":Fossil");
		 FossilIch = new ItemDNA().setUnlocalizedName("FossilIch").setTextureName(modid + ":Fossil");
		 DNATri = new ItemDNA().setUnlocalizedName("DNATri").setTextureName(modid + ":DNATri");
		 DNABro = new ItemDNA().setUnlocalizedName("DNABro").setTextureName(modid + ":DNABro");
		 DNARap = new ItemDNA().setUnlocalizedName("DNARap").setTextureName(modid + ":DNARap");
		 DNARex = new ItemDNA().setUnlocalizedName("DNARex").setTextureName(modid + ":DNARex");
		 DNAPte = new ItemDNA().setUnlocalizedName("DNAPte").setTextureName(modid + ":DNAPte");
		 DNAMam = new ItemDNA().setUnlocalizedName("DNAMam").setTextureName(modid + ":DNAMam");
		 DNASab = new ItemDNA().setUnlocalizedName("DNASab").setTextureName(modid + ":DNASab");
		 DNAIch = new ItemDNA().setUnlocalizedName("DNAIch").setTextureName(modid + ":DNAIch");
		 
		 HornSword = (new ItemSword(LotsOMobs.EnumToolMaterialHorn)).setUnlocalizedName("HornSword").setTextureName(modid + ":HornSword").setCreativeTab(LotsOMobs.LotsOMobsCombatTab);
		 AmberPickaxe = (new ItemMyPickaxe(LotsOMobs.EnumToolMaterialAmber)).setUnlocalizedName("AmberPickaxe").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":AmberPickaxe"); ;
		 AmberAxe = (new ItemMyAxe(LotsOMobs.EnumToolMaterialAmber)).setUnlocalizedName("AmberAxe").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":AmberAxe"); ;
		 AmberShovel = (new ItemMyShovel(LotsOMobs.EnumToolMaterialAmber)).setUnlocalizedName("AmberShovel").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":AmberShovel"); ;
		 AmberSword = (new ItemSword(LotsOMobs.EnumToolMaterialAmber)).setUnlocalizedName("AmberSword").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":AmberSword"); ;
		 AmberHoe = (new ItemHoe( LotsOMobs.EnumToolMaterialAmber)).setUnlocalizedName("AmberHoe").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":AmberHoe"); ;
		 
		 IvoryPickaxe = (new ItemMyPickaxe(LotsOMobs.EnumToolMaterialIvory)).setUnlocalizedName("IvoryPickaxe").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":IvoryPickaxe"); ;
		 IvoryAxe = (new ItemMyAxe(LotsOMobs.EnumToolMaterialIvory)).setUnlocalizedName("IvoryAxe").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":IvoryAxe"); ;
		 IvoryShovel = (new ItemMyShovel(LotsOMobs.EnumToolMaterialIvory)).setUnlocalizedName("IvoryShovel").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":IvoryShovel"); ;
		 IvorySword = (new ItemSword(LotsOMobs.EnumToolMaterialIvory)).setUnlocalizedName("IvorySword").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":IvorySword"); ;
		 IvoryHoe = (new ItemHoe( LotsOMobs.EnumToolMaterialIvory)).setUnlocalizedName("IvoryHoe").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":IvoryHoe"); ;

		 FurHelmet = new ItemArmor(LotsOMobs.Fur, proxy.addArmor("FurArmor"), 0).setUnlocalizedName("FurHelmet").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":FurHelmet");;
		 FurChestplate = new ItemArmor( LotsOMobs.Fur, proxy.addArmor("FurArmor"), 1).setUnlocalizedName("FurChest").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":FurChest");;
		 FurLeggings = new ItemArmor(LotsOMobs.Fur, proxy.addArmor("FurArmor"), 2).setUnlocalizedName("FurLeggings").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":FurLeggings");;
		 FurBoots = new ItemArmor(LotsOMobs.Fur, proxy.addArmor("FurArmor"), 3).setUnlocalizedName("FurBoots").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":FurBoots");;
		//Christmas Special
		 SantaHelmet = new ItemArmor(LotsOMobs.Santa, proxy.addArmor("SantaArmor"), 0).setUnlocalizedName("SantaHelmet").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":SantaHelmet");
		 SantaChestplate = new ItemArmor(LotsOMobs.Santa, proxy.addArmor("SantaArmor"), 1).setUnlocalizedName("SantaChest").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":SantaChest");
		 SantaLeggings = new ItemArmor(LotsOMobs.Santa, proxy.addArmor("SantaArmor"), 2).setUnlocalizedName("SantaLegging").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":SantaLegging");
		 SantaBoots = new ItemArmor(LotsOMobs.Santa, proxy.addArmor("SantaArmor"), 3).setUnlocalizedName("SantaBoots").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":SantaBoots");
		 
		 AmberHelmet = new ItemArmor(LotsOMobs.AmberA, proxy.addArmor("Amber"), 0).setUnlocalizedName("AmberHelmet").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":AmberHelmet");
		 AmberChestplate = new ItemArmor(LotsOMobs.AmberA, proxy.addArmor("Amber"), 1).setUnlocalizedName("AmberChest").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":AmberChest");
		 AmberLeggings = new ItemArmor(LotsOMobs.AmberA, proxy.addArmor("Amber"), 2).setUnlocalizedName("AmberLeggings").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":AmberLeggings");
		 AmberBoots = new ItemArmor(LotsOMobs.AmberA, proxy.addArmor("Amber"), 3).setUnlocalizedName("AmberBoots").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":AmberBoots");

		 DinoFurHelmet = new ItemArmor(LotsOMobs.Dino, proxy.addArmor("DinoFurArmor"), 0).setUnlocalizedName("DinoHelmet").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":DinoHelmet");;
		 DinoFurChestplate = new ItemArmor(LotsOMobs.Dino, proxy.addArmor("DinoFurArmor"), 1).setUnlocalizedName("DinoChest").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":DinoChest");;
		 DinoFurLeggings = new ItemArmor(LotsOMobs.Dino, proxy.addArmor("DinoFurArmor"), 2).setUnlocalizedName("DinoLeggings").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":DinoLeggings");;
		 DinoFurBoots = new ItemArmor(LotsOMobs.Dino, proxy.addArmor("DinoFurArmor"), 3).setUnlocalizedName("DinoBoots").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":DinoBoots");;

//Register Items
		 GameRegistry.registerItem(DeerFur, "Deer_Fur", modid);
		 GameRegistry.registerItem(Horn, "Horn", modid);
		 GameRegistry.registerItem(AngoraWool, "AngoraWool", modid);
		 GameRegistry.registerItem(Ivory, "Ivory", modid);
		 GameRegistry.registerItem(IvoryBlade, "IvoryBlade", modid);
		 GameRegistry.registerItem(SmashedBug, "SmashedBug", modid);
		 GameRegistry.registerItem(CactiOnAStick, "CactiOnAStick", modid);
		 GameRegistry.registerItem(FlintAndFossil, "FlintAndFossil", modid);
		 GameRegistry.registerItem(DinoBone, "DinoBone", modid);
		 GameRegistry.registerItem(DinoFur, "DinoFur", modid);
		 GameRegistry.registerItem(TimeTraveler, "TimeTraveler", modid);
		 GameRegistry.registerItem(PortalPlacer, "PortalPlacer", modid);
		 GameRegistry.registerItem(Amber, "Amber", modid);
		 GameRegistry.registerItem(EasterCake1, "EasterCake1", modid);
		 GameRegistry.registerItem(EasterCake2, "EasterCake2", modid);
		 GameRegistry.registerItem(EasterCake3, "EasterCake3", modid);
		 GameRegistry.registerItem(EasterCake4, "EasterCake4", modid);
		 GameRegistry.registerItem(EasterCake5, "EasterCake5", modid);
		 
//Fossils and Shit
		 GameRegistry.registerItem(FossilTri, "FossilTri", modid);
		 GameRegistry.registerItem(FossilBro, "FossilBro", modid);
		 GameRegistry.registerItem(FossilRap, "FossilRap", modid);
		 GameRegistry.registerItem(FossilRex, "FossilRex", modid);
		 GameRegistry.registerItem(FossilMam, "FossilMam", modid);
		 GameRegistry.registerItem(FossilSab, "FossilSab", modid);
		 GameRegistry.registerItem(FossilPte, "FossilPte", modid);
		 GameRegistry.registerItem(FossilIch, "FossilIch", modid);
		 GameRegistry.registerItem(DNATri, "DNATri", modid);
		 GameRegistry.registerItem(DNABro, "DNABro", modid);
		 GameRegistry.registerItem(DNARap, "DNARap", modid);
		 GameRegistry.registerItem(DNARex, "DNARex", modid);
		 GameRegistry.registerItem(DNAPte, "DNAPte", modid);
		 GameRegistry.registerItem(DNAMam, "DNAMam", modid);
		 GameRegistry.registerItem(DNASab, "DNASab", modid);
		 GameRegistry.registerItem(DNAIch, "DNAIch", modid);
		 
		 
		 GameRegistry.registerItem(RawVenison, "Raw_Venison", modid);
		 GameRegistry.registerItem(Venison, "Venison", modid);
		 GameRegistry.registerItem(RawBoar, "Raw_Boar", modid);
		 GameRegistry.registerItem(BoarMeat, "BoarMeat", modid);
		 GameRegistry.registerItem(RawReptile, "Raw_Reptile", modid);
		 GameRegistry.registerItem(ReptileMeat, "ReptileMeat", modid);
		 GameRegistry.registerItem(RawWhale, "Raw_Whale", modid);
		 GameRegistry.registerItem(WhaleMeat, "WhaleMeat", modid);
		 GameRegistry.registerItem(RawCamel, "Raw_Camel", modid);
		 GameRegistry.registerItem(CamelMeat, "CamelMeat", modid);
		 GameRegistry.registerItem(RawLion, "RawLion", modid);
		 GameRegistry.registerItem(LionMeat, "LionMeat", modid);
		 GameRegistry.registerItem(WildStew, "WildStew", modid);
		 GameRegistry.registerItem(RawFrog, "Raw_Frog", modid);
		 GameRegistry.registerItem(CookedFrog, "CookedFrog", modid);
		 GameRegistry.registerItem(Honey, "Honey", modid);
		 GameRegistry.registerItem(Tomato, "Tomato", modid);
		 GameRegistry.registerItem(PineApple, "PineApple", modid);
		 GameRegistry.registerItem(RawPenguin, "Raw_Penguin", modid);
		 GameRegistry.registerItem(PenguinMeat, "PenguinMeat", modid);

		 GameRegistry.registerItem(HornSword, "HornSword", modid);
		 GameRegistry.registerItem(AmberSword, "AmberSword", modid);
		 GameRegistry.registerItem(AmberPickaxe, "AmberPickaxe", modid);
		 GameRegistry.registerItem(AmberAxe, "AmberAxe", modid);
		 GameRegistry.registerItem(AmberShovel, "AmberShovel", modid);
		 GameRegistry.registerItem(AmberHoe, "AmberHoe", modid);
		 GameRegistry.registerItem(IvorySword, "IvorySword", modid);
		 GameRegistry.registerItem(IvoryPickaxe, "IvoryPickaxe", modid);
		 GameRegistry.registerItem(IvoryAxe, "IvoryAxe", modid);
		 GameRegistry.registerItem(IvoryShovel, "IvoryShovel", modid);
		 GameRegistry.registerItem(IvoryHoe, "IvoryHoe", modid);
		 
		 GameRegistry.registerItem(FurHelmet, "FurHelmet", modid);
		 GameRegistry.registerItem(FurChestplate, "FurChestplate", modid);
		 GameRegistry.registerItem(FurLeggings, "FurLeggings", modid);
		 GameRegistry.registerItem(FurBoots, "FurBoots", modid);
		 GameRegistry.registerItem(SantaHelmet, "SantaHelmet", modid);
		 GameRegistry.registerItem(SantaChestplate, "SantaChestplate", modid);
		 GameRegistry.registerItem(SantaLeggings, "SantaLeggings", modid);
		 GameRegistry.registerItem(SantaBoots, "SantaBoots", modid);
		 GameRegistry.registerItem(AmberHelmet, "AmberHelmet", modid);
		 GameRegistry.registerItem(AmberChestplate, "AmberChestplate", modid);
		 GameRegistry.registerItem(AmberLeggings, "AmberLeggings", modid);
		 GameRegistry.registerItem(AmberBoots, "AmberBoots", modid);
		 GameRegistry.registerItem(DinoFurHelmet, "DinoFurHelmet", modid);
		 GameRegistry.registerItem(DinoFurChestplate, "DinoFurChestplate", modid);
		 GameRegistry.registerItem(DinoFurLeggings, "DinoFurLeggings", modid);
		 GameRegistry.registerItem(DinoFurBoots, "DinoFurBoots", modid);
		 
		 //MinecraftForge.EVENT_BUS.register(new BoneMealEventDino()); 
	     //WorldGeneration
	     GameRegistry.registerWorldGenerator(new FossilOreGeneration(), 2);
	     GameRegistry.registerWorldGenerator(new OreGeneration(), 2);
		 proxy.registerSound();		
	}
	
//Void Load
	@EventHandler
	public void load(FMLInitializationEvent event)
	{	
//Recipes
		 GameRegistry.addSmelting(RawVenison, new ItemStack(Venison, 1), 1.0F);
		 GameRegistry.addSmelting(RawBoar, new ItemStack(BoarMeat, 1), 1.0F);
		 GameRegistry.addSmelting(RawReptile, new ItemStack(ReptileMeat, 1), 1.0F);
		 GameRegistry.addSmelting(RawWhale, new ItemStack(WhaleMeat, 1), 1.0F);
		 GameRegistry.addSmelting(RawCamel, new ItemStack(CamelMeat, 1), 1.0F);
		 GameRegistry.addSmelting(RawLion, new ItemStack(LionMeat, 1), 1.0F);
		 GameRegistry.addSmelting(RawFrog, new ItemStack(CookedFrog, 1), 1.0F);

		 
		 GameRegistry.addRecipe(new ItemStack(CactiOnAStick, 1), new Object [] {"#", "X", Character.valueOf('#'), Items.fishing_rod, Character.valueOf('X'), Blocks.cactus});
		 GameRegistry.addRecipe(new ItemStack(WildStew, 1), new Object [] {"@", "2", "&", Character.valueOf('@'), LotsOMobs.Venison, Character.valueOf('2'), LotsOMobs.BoarMeat, Character.valueOf('&'), Items.bowl});
		 GameRegistry.addRecipe(new ItemStack(WildStew, 1), new Object [] {"2", "@", "&", Character.valueOf('@'), LotsOMobs.Venison, Character.valueOf('2'), LotsOMobs.BoarMeat, Character.valueOf('&'), Items.bowl});
		 
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
		 GameRegistry.addRecipe(new ItemStack(TimeTraveler, 1), new Object [] {"#P#", "RXR", "#A#", Character.valueOf('#'), Items.iron_ingot, Character.valueOf('P'), LotsOMobs.DinoPortal, Character.valueOf('R'), Items.redstone, Character.valueOf('X'), Blocks.stone_button, Character.valueOf('A'), LotsOMobs.Amber});
		 
		 GameRegistry.addShapelessRecipe(new ItemStack(DinoPortal, 1), new Object[]{ LotsOMobs.FlintAndFossil, FossilTri });
		 GameRegistry.addShapelessRecipe(new ItemStack(DinoPortal, 1), new Object[]{ LotsOMobs.FlintAndFossil, FossilBro });
		 GameRegistry.addShapelessRecipe(new ItemStack(DinoPortal, 1), new Object[]{ LotsOMobs.FlintAndFossil, FossilRap });
		 GameRegistry.addShapelessRecipe(new ItemStack(DinoPortal, 1), new Object[]{ LotsOMobs.FlintAndFossil, FossilRex });
		 GameRegistry.addShapelessRecipe(new ItemStack(DinoPortal, 1), new Object[]{ LotsOMobs.FlintAndFossil, FossilPte });
		 GameRegistry.addShapelessRecipe(new ItemStack(DinoPortal, 1), new Object[]{ LotsOMobs.FlintAndFossil, FossilIch });
		 GameRegistry.addShapelessRecipe(new ItemStack(FlintAndFossil, 1), new Object[]{ Items.flint, FossilSab });
		 GameRegistry.addShapelessRecipe(new ItemStack(FlintAndFossil, 1), new Object[]{ Items.flint, FossilTri });
		 GameRegistry.addShapelessRecipe(new ItemStack(FlintAndFossil, 1), new Object[]{ Items.flint, FossilBro });
		 GameRegistry.addShapelessRecipe(new ItemStack(FlintAndFossil, 1), new Object[]{ Items.flint, FossilRap });
		 GameRegistry.addShapelessRecipe(new ItemStack(FlintAndFossil, 1), new Object[]{ Items.flint, FossilRex });
		 GameRegistry.addShapelessRecipe(new ItemStack(FlintAndFossil, 1), new Object[]{ Items.flint, FossilPte });
		 GameRegistry.addShapelessRecipe(new ItemStack(FlintAndFossil, 1), new Object[]{ Items.flint, FossilMam });
		 GameRegistry.addShapelessRecipe(new ItemStack(FlintAndFossil, 1), new Object[]{ Items.flint, FossilIch });
		 
		 GameRegistry.addRecipe(new ItemStack(Items.stick, 4), new Object [] {"#", "#", Character.valueOf('#'), LotsOMobs.DinoWoodPlanks});
		 GameRegistry.addRecipe(new ItemStack(DinoWoodPlanks, 4), new Object [] {"#", Character.valueOf('#'), LotsOMobs.DinoLog});	 
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
		 GameRegistry.addRecipe(new ItemStack(LotsOMobs.EasterCake1, 1), new Object [] {"###", "XCX", "ZZZ", Character.valueOf('#'), Items.milk_bucket, Character.valueOf('X'), Items.sugar, Character.valueOf('C'), LotsOMobs.EasterEgg1, Character.valueOf('Z'), Items.wheat});
		 GameRegistry.addRecipe(new ItemStack(LotsOMobs.EasterCake2, 1), new Object [] {"###", "XCX", "ZZZ", Character.valueOf('#'), Items.milk_bucket, Character.valueOf('X'), Items.sugar, Character.valueOf('C'), LotsOMobs.EasterEgg2, Character.valueOf('Z'), Items.wheat});
		 GameRegistry.addRecipe(new ItemStack(LotsOMobs.EasterCake3, 1), new Object [] {"###", "XCX", "ZZZ", Character.valueOf('#'), Items.milk_bucket, Character.valueOf('X'), Items.sugar, Character.valueOf('C'), LotsOMobs.EasterEgg3, Character.valueOf('Z'), Items.wheat});
		 GameRegistry.addRecipe(new ItemStack(LotsOMobs.EasterCake4, 1), new Object [] {"###", "XCX", "ZZZ", Character.valueOf('#'), Items.milk_bucket, Character.valueOf('X'), Items.sugar, Character.valueOf('C'), LotsOMobs.EasterEgg4, Character.valueOf('Z'), Items.wheat});
		 GameRegistry.addRecipe(new ItemStack(LotsOMobs.EasterCake5, 1), new Object [] {"###", "XCX", "ZZZ", Character.valueOf('#'), Items.milk_bucket, Character.valueOf('X'), Items.sugar, Character.valueOf('C'), LotsOMobs.EasterEgg5, Character.valueOf('Z'), Items.wheat});

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
		 
//Mobs
		if(ConfigDetails.DeerOn == true)
		{	
		EntityRegistry.registerGlobalEntityID(EntityDeer.class, "Deer", EntityRegistry.findGlobalUniqueEntityId(), 0x7D3B0C, 0xB37346);
        EntityRegistry.addSpawn(EntityDeer.class, 20, 1, 4, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.forest, BiomeGenBase.forestHills});
		}
		if(ConfigDetails.BoarOn == true)
		{	
		EntityRegistry.registerGlobalEntityID(EntityBoar.class, "Boar", EntityRegistry.findGlobalUniqueEntityId(), 0x7D3B0C, 0x351f0a);
        EntityRegistry.addSpawn(EntityBoar.class, 20, 1, 4, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.icePlains, BiomeGenBase.plains});
		}
		if(ConfigDetails.BirdOn == true)
		{	
		EntityRegistry.registerGlobalEntityID(EntityBird.class, "Bird", EntityRegistry.findGlobalUniqueEntityId(), 0xFFFFFF, 0xFC7419);
        EntityRegistry.addSpawn(EntityBird.class, 20, 1, 4, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.beach, BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.coldTaiga, BiomeGenBase.desert, BiomeGenBase.extremeHills, BiomeGenBase.iceMountains, BiomeGenBase.jungle, BiomeGenBase.icePlains, BiomeGenBase.plains, BiomeGenBase.mesa, BiomeGenBase.mesaPlateau, BiomeGenBase.mesaPlateau_F, BiomeGenBase.roofedForest, BiomeGenBase.savanna, BiomeGenBase.savannaPlateau, BiomeGenBase.swampland});
		}
		if(ConfigDetails.SquirrelOn == true)
		{    
	        EntityRegistry.registerGlobalEntityID(EntitySquirrel.class,  "Squirrel", EntityRegistry.findGlobalUniqueEntityId(), 0x634205, 0x633405);
	        EntityRegistry.addSpawn(EntitySquirrel.class,  10,  1,  6,  EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.forest});
		}
		if(ConfigDetails.BunnyOn == true)
		{   
	        EntityRegistry.registerGlobalEntityID(EntityBunny.class,  "Bunny", EntityRegistry.findGlobalUniqueEntityId(), 0x634205, 0x633405);
	        EntityRegistry.addSpawn(EntityBunny.class,  10,  1,  6,  EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.forest});
		}
		if(ConfigDetails.LizardOn == true)
		{
	    	EntityRegistry.registerGlobalEntityID(EntityLizard.class,  "Lizard", EntityRegistry.findGlobalUniqueEntityId(), 0xBA6B11, 0xEDCBA4);
	    	EntityRegistry.addSpawn(EntityLizard.class,  50,  4,  5,  EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.desert});
		}
		if(ConfigDetails.GiraffeOn == true)
		{  
	    	EntityRegistry.registerGlobalEntityID(EntityGiraffe.class, "Giraffe", EntityRegistry.findGlobalUniqueEntityId(), 0xFFD324, 0xA87C4A);
	 	  	EntityRegistry.addSpawn(EntityGiraffe.class, 15, 4, 4, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.savanna, BiomeGenBase.savannaPlateau});
	 	  	LanguageRegistry.instance().addStringLocalization("entity.Giraffe.name", "Giraffe");
		}
		if(ConfigDetails.ElephantOn == true)
		{
	    	EntityRegistry.registerGlobalEntityID(EntityElephant.class, "Elephant", EntityRegistry.findGlobalUniqueEntityId(), 0x858585, 0xD6D6D6);
	 	  	EntityRegistry.addSpawn(EntityElephant.class, 25, 2, 3, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.savanna, BiomeGenBase.savannaPlateau});
		}
		if(ConfigDetails.FishyOn == true)
		{    
	        EntityRegistry.registerGlobalEntityID(EntityFishy.class, "Fishy", EntityRegistry.findGlobalUniqueEntityId(), 0xF78A2A, 0xF78A2A);
	        EntityRegistry.addSpawn(EntityFishy.class, 50, 5, 15, EnumCreatureType.waterCreature, new BiomeGenBase[] { 
	        	 BiomeGenBase.beach,
	        	 BiomeGenBase.forest,
	        	 BiomeGenBase.forestHills,
	        	 BiomeGenBase.frozenRiver,
	        	 BiomeGenBase.jungle, 
	        	 BiomeGenBase.plains, 
	        	 BiomeGenBase.river,
	        	 BiomeGenBase.swampland, 
	        	 BiomeGenBase.taiga,
	        	 BiomeGenBase.ocean,
	        	 BiomeGenBase.extremeHills,
	        	 });
		}
		if(ConfigDetails.WhaleOn == true)
		{ 
	    	EntityRegistry.registerGlobalEntityID(EntityWhale.class, "Whale", EntityRegistry.findGlobalUniqueEntityId(), 0x757C82, 0x97AEC4);
	        EntityRegistry.addSpawn(EntityWhale.class, 9, 1, 12, EnumCreatureType.waterCreature, new BiomeGenBase[] {BiomeGenBase.ocean, BiomeGenBase.frozenOcean});
		}
		if(ConfigDetails.WinterDeerOn == true)
		{	
		    EntityRegistry.registerGlobalEntityID(EntityWinterDeer.class, "WinterDeer", EntityRegistry.findGlobalUniqueEntityId(), 0x7D3B0C, 0xCFBDA9);
	        EntityRegistry.addSpawn(EntityWinterDeer.class, 20, 1, 4, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.taiga, BiomeGenBase.taigaHills});
		}
		if(ConfigDetails.BearOn == true)
		{	 
	     	EntityRegistry.registerGlobalEntityID(EntityBear.class, "Bear", EntityRegistry.findGlobalUniqueEntityId(), 0x4A2710, 0x85471D);
	 	 	EntityRegistry.addSpawn(EntityBear.class, 15, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.plains, BiomeGenBase.icePlains, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.taiga, BiomeGenBase.taigaHills});
		}
		if(ConfigDetails.GorillaOn == true)
		{  
			EntityRegistry.registerGlobalEntityID(EntityGorilla.class, "Gorilla", EntityRegistry.findGlobalUniqueEntityId(), 0x414447, 0xFFFFFF);
		  	EntityRegistry.addSpawn(EntityGorilla.class, 50, 1, 7, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.jungle, BiomeGenBase.jungleHills});
		}
		if(ConfigDetails.CamelOn == true)
		{   
	        EntityRegistry.registerGlobalEntityID(EntityCamel.class, "Camel", EntityRegistry.findGlobalUniqueEntityId(), 0xFADFCD, 0xF5C9AB);
	     	EntityRegistry.addSpawn(EntityCamel.class, 25, 2, 6, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.desert, BiomeGenBase.desertHills});
		}
		if(ConfigDetails.SnakeOn == true)
		{
	      	EntityRegistry.registerGlobalEntityID(EntitySnake.class, "Snake", EntityRegistry.findGlobalUniqueEntityId(), 0xA2C981, 0x377306);
	 	  	EntityRegistry.addSpawn(EntitySnake.class, 50, 4, 5, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.forest, BiomeGenBase.jungle});
		}
		if(ConfigDetails.ButterFlyOn == true)
		{
	    	EntityRegistry.registerGlobalEntityID(EntityButterfly.class, "Butterfly", EntityRegistry.findGlobalUniqueEntityId(), 0xF2AD96, 0xFF0000);
	 	  	EntityRegistry.addSpawn(EntityButterfly.class, 50, 4, 5, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.forest, BiomeGenBase.jungle});
		}
		if(ConfigDetails.AntOn == true)
		{
	    	EntityRegistry.registerGlobalEntityID(EntityAnt.class, "Ant", EntityRegistry.findGlobalUniqueEntityId(), 0x000000, 0xFF0000);
	     	EntityRegistry.addSpawn(EntityAnt.class, 50, 15, 20, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.forest});
		}
		if(ConfigDetails.TurtleOn == true)
		{ 	
	     	EntityRegistry.registerGlobalEntityID(EntityTurtle.class,  "Turtle", EntityRegistry.findGlobalUniqueEntityId(), 0x506E21, 0xDEC2A2);
	     	EntityRegistry.addSpawn(EntityTurtle.class,  50,  4,  5,  EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.swampland, BiomeGenBase.plains});
		}
		if(ConfigDetails.GekkoOn == true)
		{
	    	EntityRegistry.registerGlobalEntityID(EntityGekko.class,  "Gekko", EntityRegistry.findGlobalUniqueEntityId(), 0xDEC2A2, 0x506E21);
	    	EntityRegistry.addSpawn(EntityGekko.class,  50,  4,  5,  EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.swampland});
		}
		if(ConfigDetails.CrocoOn == true)
		{ 
	        EntityRegistry.registerGlobalEntityID(EntityCroco.class,  "Croco", EntityRegistry.findGlobalUniqueEntityId(), 0xDEC2A2, 0x506E21);
	        EntityRegistry.addSpawn(EntityCroco.class,  50,  4,  5,  EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.swampland});
		}
		if(ConfigDetails.LionOn == true)
		{    
	        EntityRegistry.registerGlobalEntityID(EntityLion.class,  "Lion", EntityRegistry.findGlobalUniqueEntityId(), 0x94734a, 0x99600F);
	        EntityRegistry.addSpawn(EntityLion.class,  10,  1,  2,  EnumCreatureType.waterCreature, new BiomeGenBase[] {BiomeGenBase.savanna, BiomeGenBase.savannaPlateau});
		}
		if(ConfigDetails.PDFrogOn == true)
		{  
	    	EntityRegistry.registerGlobalEntityID(EntityPDFrog.class, "PDFrog", EntityRegistry.findGlobalUniqueEntityId(), 0xFFAE00, 0xF2FF00);
	     	EntityRegistry.addSpawn(EntityPDFrog.class, 150, 2, 2, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.jungle, BiomeGenBase.jungleHills});
		}
			if(ConfigDetails.FrogOn == true)
		{  
	    	EntityRegistry.registerGlobalEntityID(EntityFrog.class, "Frog", EntityRegistry.findGlobalUniqueEntityId(), 0x1A8C0F, 0x75A807);
	     	EntityRegistry.addSpawn(EntityFrog.class, 15, 2, 2, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.swampland});
		}
			if(ConfigDetails.FlyOn == true)
		{  
	    	EntityRegistry.registerGlobalEntityID(EntityFly.class, "Fly", EntityRegistry.findGlobalUniqueEntityId(), 0x000000, 0x5ED0F2);
	     	EntityRegistry.addSpawn(EntityFly.class, 15, 2, 2, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.forest, BiomeGenBase.beach, BiomeGenBase.jungle, BiomeGenBase.plains, BiomeGenBase.river, BiomeGenBase.swampland, BiomeGenBase.mushroomIsland, BiomeGenBase.savanna});
		}
			if(ConfigDetails.FireFlyOn == true)
		{  
	    	EntityRegistry.registerGlobalEntityID(EntityFireFly.class, "FireFly", EntityRegistry.findGlobalUniqueEntityId(), 0x000000, 0xE08B1B);
	     	EntityRegistry.addSpawn(EntityFireFly.class, 15, 2, 2, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.forest, BiomeGenBase.beach, BiomeGenBase.jungle, BiomeGenBase.plains, BiomeGenBase.river, BiomeGenBase.swampland, BiomeGenBase.mushroomIsland,BiomeGenBase.savanna});
		}
			if(ConfigDetails.BullFrogOn == true)
		{  
	    	EntityRegistry.registerGlobalEntityID(EntityBullFrog.class, "BullFrog", EntityRegistry.findGlobalUniqueEntityId(), 0x459E36, 0x6E4919);
	     	EntityRegistry.addSpawn(EntityBullFrog.class, 15, 3, 5, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.savanna});
		}
			if(ConfigDetails.BeeOn == true)
		{  
	    	EntityRegistry.registerGlobalEntityID(EntityBee.class, "Bee", EntityRegistry.findGlobalUniqueEntityId(), 0xF6FF00, 0x000000);
	     	EntityRegistry.addSpawn(EntityBee.class, 15, 2, 2, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.forest});
		}
		if(ConfigDetails.EasterBunnyOn == true)
		{   
		    EntityRegistry.registerGlobalEntityID(EntityEasterBunny.class,  "EasterBunny", EntityRegistry.findGlobalUniqueEntityId(), 0xE0D01B, 0xE0741B);
		    EntityRegistry.addSpawn(EntityBunny.class,  15,  1,  1,  EnumCreatureType.creature, new BiomeGenBase[] {            	 
		         BiomeGenBase.beach,
		       	 BiomeGenBase.forest,
		       	 BiomeGenBase.forestHills,
		       	 BiomeGenBase.frozenRiver,
		       	 BiomeGenBase.jungle, 
		       	 BiomeGenBase.plains, 
		       	 BiomeGenBase.river,
		       	 BiomeGenBase.swampland, 
		       	 BiomeGenBase.taiga,
		       	 BiomeGenBase.extremeHills,
		       	 BiomeGenBase.desert,});
		}
		if(ConfigDetails.NarwalOn == true)
		{
	        EntityRegistry.registerGlobalEntityID(EntityNarwal.class, "Narwal", EntityRegistry.findGlobalUniqueEntityId(), 0x000000, 0x43607D);
	        EntityRegistry.addSpawn(EntityNarwal.class, 5, 1, 12, EnumCreatureType.waterCreature, new BiomeGenBase[] {BiomeGenBase.ocean, BiomeGenBase.frozenOcean, LotsOMobs.modBiomeArcticOcean});
		}
		if(ConfigDetails.PenguinOn == true)
		{ 
	        EntityRegistry.registerGlobalEntityID(EntityPenguin.class, "Penguin", EntityRegistry.findGlobalUniqueEntityId(), 0x000000, 0xFFFFFF);
	     	EntityRegistry.addSpawn(EntityPenguin.class, 10, 4, 12, EnumCreatureType.creature, new BiomeGenBase[] {LotsOMobs.modBiomeAntartica, LotsOMobs.modBiomeArcticOcean, BiomeGenBase.icePlains});
		}
		if(ConfigDetails.IceBearOn == true)
		{
	    	EntityRegistry.registerGlobalEntityID(EntityPolarBear.class, "Icebear", EntityRegistry.findGlobalUniqueEntityId() , 0xFAF4F0, 0xFFFFFF);
	 	  	EntityRegistry.addSpawn(EntityPolarBear.class, 15, 4, 5, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.frozenOcean, LotsOMobs.modBiomeArcticOcean, BiomeGenBase.icePlains});
		}
		if(ConfigDetails.VultureOn == true)
		{
	 	  	EntityRegistry.registerGlobalEntityID(EntityVulture.class, "Vulture", EntityRegistry.findGlobalUniqueEntityId(), 0xFFFFFF, 0xFC7419);
	     	EntityRegistry.addSpawn(EntityVulture.class, 40, 10, 11, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.savanna});
		}
		if(ConfigDetails.SantaOn == true)
		{		//* Christmas Special*//
	        EntityRegistry.registerGlobalEntityID(EntitySanta.class, "Santa", EntityRegistry.findGlobalUniqueEntityId(), 0xE82525, 0xFFFFFF);
	        EntityRegistry.addSpawn(EntitySanta.class, 5, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] {
	            	 BiomeGenBase.beach,
	            	 BiomeGenBase.forest,
	            	 BiomeGenBase.forestHills,
	            	 BiomeGenBase.frozenRiver,
	            	 BiomeGenBase.jungle, 
	            	 BiomeGenBase.plains, 
	            	 BiomeGenBase.river,
	            	 BiomeGenBase.swampland, 
	            	 BiomeGenBase.taiga,
	            	 BiomeGenBase.extremeHills,
	            	 });
		}
		if(ConfigDetails.KakkerlakOn == true)
		{  
	    	EntityRegistry.registerGlobalEntityID(EntityKakkerlak.class, "Cockroach", EntityRegistry.findGlobalUniqueEntityId(), 0x220a00, 0x000000);
	     	EntityRegistry.addSpawn(EntityKakkerlak.class, 50, 15, 20, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.forest, BiomeGenBase.jungle, BiomeGenBase.swampland, BiomeGenBase.plains});
		}
		if(ConfigDetails.WormOn == true)
		{  
			EntityRegistry.registerGlobalEntityID(EntityWorm.class, "Worm", EntityRegistry.findGlobalUniqueEntityId(), 0xF7ADCB, 0xFFFFFF);
			EntityRegistry.addSpawn(EntityWorm.class, 15, 2, 2, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.forest, BiomeGenBase.plains});
		}
		if(ConfigDetails.HermitCrabOn == true)
		{  
			EntityRegistry.registerGlobalEntityID(EntityHermitCrab.class, "HermitCrab", EntityRegistry.findGlobalUniqueEntityId(), 0xF77F07, 0x875420);
			EntityRegistry.addSpawn(EntityHermitCrab.class, 25, 2, 6, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.beach, BiomeGenBase.ocean/*, LotsOMobs.modBiomeTropicBeach*/});
    		EntityRegistry.registerGlobalEntityID(EntityShell.class, "Shell", EntityRegistry.findGlobalUniqueEntityId());		}
		if(ConfigDetails.FishyOn == true)
		{    
	        EntityRegistry.registerGlobalEntityID(EntityTropicalFishy.class, "TFishy", EntityRegistry.findGlobalUniqueEntityId(), 0xF78A2A, 0x000000);
	        EntityRegistry.addSpawn(EntityTropicalFishy.class, 50, 5, 15, EnumCreatureType.waterCreature, new BiomeGenBase[] {/*LotsOMobs.modBiomeTropicBeach*/});
	    }
		if(ConfigDetails.GoatOn == true)
		{    
	        EntityRegistry.registerGlobalEntityID(EntityGoat.class, "Goat", EntityRegistry.findGlobalUniqueEntityId(), 0xad9074, 0x938578);
	        EntityRegistry.addSpawn(EntityGoat.class, 50, 5, 15, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forestHills, BiomeGenBase.jungleHills, BiomeGenBase.iceMountains, BiomeGenBase.taigaHills});
		}
		if(ConfigDetails.TriceratopsOn == true)
		{  
	        //Dinosaurs
	        EntityRegistry.registerGlobalEntityID(EntityTriceratops.class,  "Triceratops", ConfigDetails.TriceratopsID, 0x79B814, 0x416606);
	        EntityRegistry.addSpawn(EntityTriceratops.class,  25,  1,  2,  EnumCreatureType.creature, new BiomeGenBase[] {LotsOMobs.modBiomeDinoPlains, LotsOMobs.modBiomeDinoIslands, LotsOMobs.modBiomeDinoJungle, LotsOMobs.modBiomeDinoMountains, LotsOMobs.modBiomeDinoOcean});
		}
		if(ConfigDetails.BrontosaurusOn == true)
		{   
	        EntityRegistry.registerGlobalEntityID(EntityBrontosaurus.class,  "Brontosaurus", ConfigDetails.BrontosaurusID, 0xADADAD, 0x7A797A);
	        EntityRegistry.addSpawn(EntityBrontosaurus.class,  25,  1,  2,  EnumCreatureType.creature, new BiomeGenBase[] {LotsOMobs.modBiomeDinoPlains, LotsOMobs.modBiomeDinoIslands, LotsOMobs.modBiomeDinoJungle, LotsOMobs.modBiomeDinoMountains, LotsOMobs.modBiomeDinoOcean});
	        }
		if(ConfigDetails.TRexOn == true)
		{  
	        EntityRegistry.registerGlobalEntityID(EntityTRex.class,  "TRex", ConfigDetails.TRexID, 0x2B6308, 0x182410);
	        EntityRegistry.addSpawn(EntityTRex.class,  5,  1,  1,  EnumCreatureType.creature, new BiomeGenBase[] {LotsOMobs.modBiomeDinoPlains, LotsOMobs.modBiomeDinoIslands, LotsOMobs.modBiomeDinoJungle, LotsOMobs.modBiomeDinoMountains, LotsOMobs.modBiomeDinoOcean});
		}
		if(ConfigDetails.PterosaurusOn == true)
		{  
	        EntityRegistry.registerGlobalEntityID(EntityPterosaurus.class,  "Pterosaurus", ConfigDetails.PterosaurusID, 0xC3C99B, 0x2B6308);
	        EntityRegistry.addSpawn(EntityPterosaurus.class,  10,  1,  2,  EnumCreatureType.creature, new BiomeGenBase[] {LotsOMobs.modBiomeDinoPlains, LotsOMobs.modBiomeDinoIslands, LotsOMobs.modBiomeDinoJungle, LotsOMobs.modBiomeDinoMountains, LotsOMobs.modBiomeDinoOcean});
		}
		if(ConfigDetails.IchtyosaurusOn == true)
		{  
	        EntityRegistry.registerGlobalEntityID(EntityIchtyosaurus.class,  "Ichtyosaurus", ConfigDetails.IchtyosaurusID, 0x374392, 0xe6d5b5);
	        EntityRegistry.addSpawn(EntityIchtyosaurus.class,  15,  5, 8,  EnumCreatureType.waterCreature, new BiomeGenBase[] {LotsOMobs.modBiomeDinoOcean});
		}
		if(ConfigDetails.RaptorOn == true)
		{  
	        EntityRegistry.registerGlobalEntityID(EntityRaptor.class,  "Raptor", ConfigDetails.RaptorID,  0xEDCBA4, 0xBA6B11);
	        EntityRegistry.addSpawn(EntityRaptor.class,  15,  5, 8,  EnumCreatureType.creature, new BiomeGenBase[] {LotsOMobs.modBiomeDinoPlains, LotsOMobs.modBiomeDinoIslands, LotsOMobs.modBiomeDinoJungle, LotsOMobs.modBiomeDinoMountains, LotsOMobs.modBiomeDinoOcean});
		}
		if(ConfigDetails.EasterBunnyOn == true)
		{   
		    EntityRegistry.registerGlobalEntityID(EntityEasterChick.class,  "EasterChick", EntityRegistry.findGlobalUniqueEntityId(), 0xfff200, 0xf7ce00);
		    EntityRegistry.addSpawn(EntityBunny.class,  25,  3,  5,  EnumCreatureType.creature, new BiomeGenBase[] {            	 
		         BiomeGenBase.beach,
		       	 BiomeGenBase.forest,
		       	 BiomeGenBase.forestHills,
		       	 BiomeGenBase.frozenRiver,
		       	 BiomeGenBase.jungle, 
		       	 BiomeGenBase.plains, 
		       	 BiomeGenBase.river,
		       	 BiomeGenBase.swampland, 
		       	 BiomeGenBase.taiga,
		       	 BiomeGenBase.extremeHills,
		       	 BiomeGenBase.desert,});
		}
	
//TODO Add more Mobs		
     	proxy.registerRenderInformation();
     	
     	ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(LotsOMobs.PineApple, 0, 1, 4, 50));
     	ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(LotsOMobs.PineApple, 0, 1, 4, 50));
     	ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(LotsOMobs.PineApple, 0, 1, 4, 50));
     	ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(LotsOMobs.PineApple, 0, 1, 4, 50));
     	
     	ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(LotsOMobs.Tomato, 0, 1, 4, 50));
     	ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(LotsOMobs.Tomato, 0, 1, 4, 50));
     	ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(LotsOMobs.Tomato, 0, 1, 4, 50));
     	ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(LotsOMobs.Tomato, 0, 1, 4, 50));     	
	}
}