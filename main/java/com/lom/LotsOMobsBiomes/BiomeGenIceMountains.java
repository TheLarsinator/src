package com.lom.lotsomobsbiomes;

import com.lom.lotsomobscore.LotsOMobs;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenIceMountains extends BiomeGenBase
{
    public BiomeGenIceMountains(int var1)
    {
        super(var1);
        this.setBiomeName("Antartica");
        this.waterColorMultiplier = -13395457;
        this.setHeight(height_MidHills);
        this.spawnableCreatureList.clear();
        this.topBlock = Blocks.snow;
        this.fillerBlock = LotsOMobs.IceStone;
        this.getEnableSnow();
        this.setTemperatureRainfall(0.1F, 17F);       
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
    }       
   
}
 

