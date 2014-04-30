package com.lom.LotsOMobsBiomes;

import com.lom.LotsOMobsCore.LotsOMobs;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenIceIslands extends BiomeGenBase
{
    public BiomeGenIceIslands(int var1)
    {
        super(var1);
        this.setBiomeName("Antartica");
        this.waterColorMultiplier = -13395457;
        this.setHeight(height_PartiallySubmerged);
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
 

