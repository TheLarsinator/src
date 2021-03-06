package com.lom.lotsomobsinit;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.world.biome.BiomeGenBase;

import com.lom.lotsomobscore.ConfigDetails;
import com.lom.lotsomobsentity.EntityAnt;
import com.lom.lotsomobsentity.EntityBear;
import com.lom.lotsomobsentity.EntityBee;
import com.lom.lotsomobsentity.EntityBird;
import com.lom.lotsomobsentity.EntityBoar;
import com.lom.lotsomobsentity.EntityBrontosaurus;
import com.lom.lotsomobsentity.EntityBullFrog;
import com.lom.lotsomobsentity.EntityBunny;
import com.lom.lotsomobsentity.EntityButterfly;
import com.lom.lotsomobsentity.EntityCamel;
import com.lom.lotsomobsentity.EntityCroco;
import com.lom.lotsomobsentity.EntityDeer;
import com.lom.lotsomobsentity.EntityEasterBunny;
import com.lom.lotsomobsentity.EntityEasterChick;
import com.lom.lotsomobsentity.EntityElephant;
import com.lom.lotsomobsentity.EntityFireFly;
import com.lom.lotsomobsentity.EntityFishy;
import com.lom.lotsomobsentity.EntityFly;
import com.lom.lotsomobsentity.EntityFrog;
import com.lom.lotsomobsentity.EntityGekko;
import com.lom.lotsomobsentity.EntityGiraffe;
import com.lom.lotsomobsentity.EntityGoat;
import com.lom.lotsomobsentity.EntityGorilla;
import com.lom.lotsomobsentity.EntityHermitCrab;
import com.lom.lotsomobsentity.EntityIchtyosaurus;
import com.lom.lotsomobsentity.EntityKakkerlak;
import com.lom.lotsomobsentity.EntityLion;
import com.lom.lotsomobsentity.EntityLizard;
import com.lom.lotsomobsentity.EntityMammoth;
import com.lom.lotsomobsentity.EntityMuskOx;
import com.lom.lotsomobsentity.EntityNarwal;
import com.lom.lotsomobsentity.EntityPDFrog;
import com.lom.lotsomobsentity.EntityPenguin;
import com.lom.lotsomobsentity.EntityPolarBear;
import com.lom.lotsomobsentity.EntityPterosaurus;
import com.lom.lotsomobsentity.EntityRaptor;
import com.lom.lotsomobsentity.EntitySaberTooth;
import com.lom.lotsomobsentity.EntitySanta;
import com.lom.lotsomobsentity.EntityShell;
import com.lom.lotsomobsentity.EntitySnake;
import com.lom.lotsomobsentity.EntitySquirrel;
import com.lom.lotsomobsentity.EntityTRex;
import com.lom.lotsomobsentity.EntityTriceratops;
import com.lom.lotsomobsentity.EntityTropicalFishy;
import com.lom.lotsomobsentity.EntityTurtle;
import com.lom.lotsomobsentity.EntityVulture;
import com.lom.lotsomobsentity.EntityWhale;
import com.lom.lotsomobsentity.EntityWinterDeer;
import com.lom.lotsomobsentity.EntityWorm;

import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class LotsOMobsMobs 
{
	public static void Init()
	{
		//Mobs
//Temporary fix for missing vanilla creature spawn:
        EntityRegistry.addSpawn(EntityCow.class, 20, 1, 4, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.plains, BiomeGenBase.icePlains});
        EntityRegistry.addSpawn(EntityPig.class, 20, 1, 4, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.plains, BiomeGenBase.icePlains});
        EntityRegistry.addSpawn(EntitySheep.class, 20, 1, 4, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.plains, BiomeGenBase.icePlains});
        EntityRegistry.addSpawn(EntityHorse.class, 20, 1, 4, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.plains});


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
			        EntityRegistry.addSpawn(EntityNarwal.class, 5, 1, 12, EnumCreatureType.waterCreature, new BiomeGenBase[] {BiomeGenBase.ocean, BiomeGenBase.frozenOcean, LotsOMobsBiomes.modBiomeArcticOcean});
				}
				if(ConfigDetails.PenguinOn == true)
				{ 
			        EntityRegistry.registerGlobalEntityID(EntityPenguin.class, "Penguin", EntityRegistry.findGlobalUniqueEntityId(), 0x000000, 0xFFFFFF);
			     	EntityRegistry.addSpawn(EntityPenguin.class, 10, 4, 12, EnumCreatureType.creature, new BiomeGenBase[] {LotsOMobsBiomes.modBiomeAntartica, LotsOMobsBiomes.modBiomeArcticOcean, BiomeGenBase.icePlains});
				}
				if(ConfigDetails.IceBearOn == true)
				{
			    	EntityRegistry.registerGlobalEntityID(EntityPolarBear.class, "Icebear", EntityRegistry.findGlobalUniqueEntityId() , 0xFAF4F0, 0xFFFFFF);
			 	  	EntityRegistry.addSpawn(EntityPolarBear.class, 15, 4, 5, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.frozenOcean, LotsOMobsBiomes.modBiomeArcticOcean, BiomeGenBase.icePlains});
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
			        EntityRegistry.addSpawn(EntityTriceratops.class,  25,  1,  2,  EnumCreatureType.creature, new BiomeGenBase[] {LotsOMobsBiomes.modBiomeDinoPlains, LotsOMobsBiomes.modBiomeDinoIslands, LotsOMobsBiomes.modBiomeDinoJungle, LotsOMobsBiomes.modBiomeDinoMountains, LotsOMobsBiomes.modBiomeDinoOcean});
				}
				if(ConfigDetails.BrontosaurusOn == true)
				{   
			        EntityRegistry.registerGlobalEntityID(EntityBrontosaurus.class,  "Brontosaurus", ConfigDetails.BrontosaurusID, 0xADADAD, 0x7A797A);
			        EntityRegistry.addSpawn(EntityBrontosaurus.class,  25,  1,  2,  EnumCreatureType.creature, new BiomeGenBase[] {LotsOMobsBiomes.modBiomeDinoPlains, LotsOMobsBiomes.modBiomeDinoIslands, LotsOMobsBiomes.modBiomeDinoJungle, LotsOMobsBiomes.modBiomeDinoMountains, LotsOMobsBiomes.modBiomeDinoOcean});
			        }
				if(ConfigDetails.TRexOn == true)
				{  
			        EntityRegistry.registerGlobalEntityID(EntityTRex.class,  "TRex", ConfigDetails.TRexID, 0x2B6308, 0x182410);
			        EntityRegistry.addSpawn(EntityTRex.class,  5,  1,  1,  EnumCreatureType.creature, new BiomeGenBase[] {LotsOMobsBiomes.modBiomeDinoPlains, LotsOMobsBiomes.modBiomeDinoIslands, LotsOMobsBiomes.modBiomeDinoJungle, LotsOMobsBiomes.modBiomeDinoMountains, LotsOMobsBiomes.modBiomeDinoOcean});
				}
				if(ConfigDetails.PterosaurusOn == true)
				{  
			        EntityRegistry.registerGlobalEntityID(EntityPterosaurus.class,  "Pterosaurus", ConfigDetails.PterosaurusID, 0xC3C99B, 0x2B6308);
			        EntityRegistry.addSpawn(EntityPterosaurus.class,  10,  1,  2,  EnumCreatureType.creature, new BiomeGenBase[] {LotsOMobsBiomes.modBiomeDinoPlains, LotsOMobsBiomes.modBiomeDinoIslands, LotsOMobsBiomes.modBiomeDinoJungle, LotsOMobsBiomes.modBiomeDinoMountains, LotsOMobsBiomes.modBiomeDinoOcean});
				}
				if(ConfigDetails.IchtyosaurusOn == true)
				{  
			        EntityRegistry.registerGlobalEntityID(EntityIchtyosaurus.class,  "Ichtyosaurus", ConfigDetails.IchtyosaurusID, 0x374392, 0xe6d5b5);
			        EntityRegistry.addSpawn(EntityIchtyosaurus.class,  15,  5, 8,  EnumCreatureType.waterCreature, new BiomeGenBase[] {LotsOMobsBiomes.modBiomeDinoOcean});
				}
				if(ConfigDetails.RaptorOn == true)
				{  
			        EntityRegistry.registerGlobalEntityID(EntityRaptor.class,  "Raptor", ConfigDetails.RaptorID,  0xEDCBA4, 0xBA6B11);
			        EntityRegistry.addSpawn(EntityRaptor.class,  15,  5, 8,  EnumCreatureType.creature, new BiomeGenBase[] {LotsOMobsBiomes.modBiomeDinoPlains, LotsOMobsBiomes.modBiomeDinoIslands, LotsOMobsBiomes.modBiomeDinoJungle, LotsOMobsBiomes.modBiomeDinoMountains, LotsOMobsBiomes.modBiomeDinoOcean});
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
				if(ConfigDetails.MammothOn == true)
				{    
			        EntityRegistry.registerGlobalEntityID(EntityMammoth.class,  "Mammoth", ConfigDetails.MammothID, 0x4A2710, 0x85471D);
			        EntityRegistry.addSpawn(EntityMammoth.class,  10,  1,  2,  EnumCreatureType.creature, new BiomeGenBase[] {LotsOMobsBiomes.modBiomeIcePlains, LotsOMobsBiomes.modBiomeIceMountains, LotsOMobsBiomes.modBiomeIceOcean, LotsOMobsBiomes.modBiomeIceIslands});
				}
				if(ConfigDetails.SaberToothOn == true)
				{   
			        EntityRegistry.registerGlobalEntityID(EntitySaberTooth.class,  "SaberTooth", ConfigDetails.SaberToothID, 0x6c4821, 0xcab7a0);
			        EntityRegistry.addSpawn(EntitySaberTooth.class,  10,  1,  2,  EnumCreatureType.creature, new BiomeGenBase[] {LotsOMobsBiomes.modBiomeIcePlains, LotsOMobsBiomes.modBiomeIceMountains, LotsOMobsBiomes.modBiomeIceOcean, LotsOMobsBiomes.modBiomeIceIslands});
				}
				if(ConfigDetails.MuskOxOn == true)
				{  
			    	EntityRegistry.registerGlobalEntityID(EntityMuskOx.class, "MuskOx", EntityRegistry.findGlobalUniqueEntityId(), 0x8b6a4e, 0x64493d);
			     	EntityRegistry.addSpawn(EntityMuskOx.class, 15, 6, 9, EnumCreatureType.creature, new BiomeGenBase[] {LotsOMobsBiomes.modBiomeIcePlains, LotsOMobsBiomes.modBiomeIceMountains, LotsOMobsBiomes.modBiomeIceOcean, LotsOMobsBiomes.modBiomeIceIslands});
				}
	}

}
