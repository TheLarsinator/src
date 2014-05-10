package com.lom.lotsomobsdino;

import com.lom.lotsomobscore.LotsOMobs;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerBiomesDino extends GenLayer {

	protected BiomeGenBase[] allowedBiomes = {LotsOMobs.modBiomeDinoIslands, LotsOMobs.modBiomeDinoJungle, LotsOMobs.modBiomeDinoMountains, LotsOMobs.modBiomeDinoOcean, LotsOMobs.modBiomeDinoPlains};

	public GenLayerBiomesDino(long seed, GenLayer genlayer) {
	super(seed);
	this.parent = genlayer;
	}

	public GenLayerBiomesDino(long seed) {
	super(seed);
	}

	@Override
	public int[] getInts(int x, int z, int width, int depth)
	{
	int[] dest = IntCache.getIntCache(width*depth);

	for (int dz=0; dz<depth; dz++)
	{
	for (int dx=0; dx<width; dx++)
	{
	this.initChunkSeed(dx+x, dz+z);
	dest[(dx+dz*width)] = this.allowedBiomes[nextInt(this.allowedBiomes.length)].biomeID;
	}
	}
	return dest;
	}
	}
