// Date: 12/20/2012 9:25:06 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.lom.LotsOMobsModel;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
@SideOnly(Side.CLIENT)
public class ModelGorilla extends ModelBase
{
  //fields
    ModelRenderer hand1;
    ModelRenderer hand2;
    ModelRenderer Bicep2;
    ModelRenderer Bicep1;
    ModelRenderer body;
    ModelRenderer Head;
    ModelRenderer foot2;
    ModelRenderer foot1;
  
  public ModelGorilla()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      hand1 = new ModelRenderer(this, 0, 18);
      hand1.addBox(0F, 0F, 0F, 5, 9, 5);
      hand1.setRotationPoint(4F, 15F, -8F);
      hand1.setTextureSize(64, 32);
      hand1.mirror = true;
      setRotation(hand1, 0F, 0F, 0F);
      hand2 = new ModelRenderer(this, 0, 18);
      hand2.addBox(0F, 0F, 0F, 5, 9, 5);
      hand2.setRotationPoint(-9F, 15F, -8F);
      hand2.setTextureSize(64, 32);
      hand2.mirror = true;
      setRotation(hand2, 0F, 0F, 0F);
      Bicep2 = new ModelRenderer(this, 30, 0);
      Bicep2.addBox(0F, 0F, 0F, 4, 7, 4);
      Bicep2.setRotationPoint(4F, 8F, -7F);
      Bicep2.setTextureSize(64, 32);
      Bicep2.mirror = true;
      setRotation(Bicep2, 0F, 0F, 0F);
      Bicep1 = new ModelRenderer(this, 30, 0);
      Bicep1.addBox(0F, 0F, 0F, 4, 7, 4);
      Bicep1.setRotationPoint(-8F, 8F, -7F);
      Bicep1.setTextureSize(64, 32);
      Bicep1.mirror = true;
      setRotation(Bicep1, 0F, 0F, 0F);
      body = new ModelRenderer(this, 0, 0);
      body.addBox(0F, 0F, 0F, 10, 12, 4);
      body.setRotationPoint(-5F, 11F, -6F);
      body.setTextureSize(64, 32);
      body.mirror = true;
      setRotation(body, 0.8726646F, 0F, 0F);
      Head = new ModelRenderer(this, 40, 19);
      Head.addBox(0F, 0F, 0F, 6, 7, 5);
      Head.setRotationPoint(-3F, 5F, -8F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      foot2 = new ModelRenderer(this, 48, 0);
      foot2.addBox(0F, 0F, 0F, 4, 9, 4);
      foot2.setRotationPoint(1F, 15F, 0F);
      foot2.setTextureSize(64, 32);
      foot2.mirror = true;
      setRotation(foot2, 0F, 0F, 0F);
      foot1 = new ModelRenderer(this, 48, 0);
      foot1.addBox(0F, 0F, 0F, 4, 9, 4);
      foot1.setRotationPoint(-5F, 15F, 0F);
      foot1.setTextureSize(64, 32);
      foot1.mirror = true;
      setRotation(foot1, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    if (this.isChild)
    {
        float var8 = 2.0F;
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0F, 5.0F * f5, 2.0F * f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glScalef(1.0F / var8, 1.0F / var8, 1.0F / var8);
        GL11.glTranslatef(0.0F, 24.0F * f5, 0.0F);
        hand1.render(f5);
        hand2.render(f5);
        Bicep2.render(f5);
        Bicep1.render(f5);
        body.render(f5);
        Head.render(f5);
        foot2.render(f5);
        foot1.render(f5);
        GL11.glPopMatrix();
        
    }
    else
    {
    hand1.render(f5);
    hand2.render(f5);
    Bicep2.render(f5);
    Bicep1.render(f5);
    body.render(f5);
    Head.render(f5);
    foot2.render(f5);
    foot1.render(f5);
    }
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
	  super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
		 foot1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.0F * f1;
		 foot2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.0F * f1;
		 hand1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.0F * f1;
		 hand2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.0F * f1;
  }

}
