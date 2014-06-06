package com.lom.lotsomobsbiomes;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

import com.lom.lotsomobsinit.LotsOMobsBlocks;

public class BiomeGenIcePlains extends BiomeGenBase
{
    public BiomeGenIcePlains(int var1)
    {
        super(var1);
        this.setBiomeName("Antartica");
        this.waterColorMultiplier = -13395457;
        this.setHeight(height_LowPlains);
        this.spawnableCreatureList.clear();
        this.topBlock = Blocks.glass;
        this.fillerBlock = Blocks.planks;
        this.getEnableSnow();
        this.setTemperatureRainfall(0.1F, 17F);       
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
    }       
   
}
 

