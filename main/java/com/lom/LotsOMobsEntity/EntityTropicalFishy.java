package com.lom.LotsOMobsEntity;

import net.minecraft.world.World;

public class EntityTropicalFishy extends EntityFishy
{

	public EntityTropicalFishy(World par1World) {
		super(par1World);
        textureID = rand.nextInt(6);
	}

}
