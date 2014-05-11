package com.lom.lotsomobsentity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.lom.lotsomobsinit.LotsOMobsItems;

public class EntityBear extends EntityAgeableMob
{
    private double moveSpeed;

	public EntityBear(World par1World)
    {
        super(par1World);
        this.setSize(0.9F, 1.3F);
		this.moveSpeed = 0.23D;
        
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAITempt(this, 0.25F, Items.wheat, false));
        this.tasks.addTask(2, new EntityAIMate(this, moveSpeed));
        this.tasks.addTask(4, new EntityAIWander(this, 0.2F));
        this.tasks.addTask(5, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(6, new EntityAILookIdle(this));
        this.tasks.addTask(7, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, true));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    public boolean isAIEnabled()
    {
        return true;
    }

    protected void func_110147_ax()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(15.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.20000000298023224D);
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "lom:bear";
    }
  /*  protected void dropRareDrop(int par1)
    {
        this.dropItem(LotsOMobsItems.BearHead.blockID, 1);
    }
*/
    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "lom:bear";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "lom:bear";
    }

    /**
     * Returns the volume for the sounds this mob makes.
     */
    protected float getSoundVolume()
    {
        return 0.4F;
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected Item getDropItem()
    {
        return Items.leather;
    }

    /**
     * Drop 0-2 items of this living's type
     */
    protected void dropFewItems(boolean par1, int par2)
    {
        int var3 = this.rand.nextInt(3) + this.rand.nextInt(1 + par2);
        int var4;

        for (var4 = 0; var4 < var3; ++var4)
        {
            this.dropItem(Items.leather, 1);
            this.dropItem(Items.fish, 1);
        }

        var3 = this.rand.nextInt(3) + 1 + this.rand.nextInt(1 + par2);

        for (var4 = 0; var4 < var3; ++var4)
        {
            if (this.isBurning())
            {
                this.dropItem(Items.cooked_beef, 1);
            }
            else
            {
                this.dropItem(Items.beef, 1);
            }
        }
    }


    /**
     * Returns the current armor value as determined by a call to InventoryPlayer.getTotalArmorValue
     */
    public int getTotalArmorValue()
    {
        return 2;
    }
    /**
     * This function is used when two same-species animals in 'love mode' breed to generate the new baby animal.
     */
    public EntityBear spawnBabyAnimal(EntityAgeable par1EntityAgeable)
    {
        return new EntityBear(this.worldObj);
    }

    public EntityAgeable createChild(EntityAgeable par1EntityAgeable)
    {
        return this.spawnBabyAnimal(par1EntityAgeable);
    }
    public boolean isBreedingItem(ItemStack par1ItemStack)
    {
        return par1ItemStack.getItem() == LotsOMobsItems.RawBoar;
    }

}
