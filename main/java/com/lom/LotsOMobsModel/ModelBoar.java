// Date: 05.10.2012 14:05:38
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
public class ModelBoar extends ModelLOMBase
{
  //fields
    ModelRenderer Leg1;
    ModelRenderer Leg2;
    ModelRenderer Leg3;
    ModelRenderer Leg4;
    ModelRenderer Body;
    ModelRenderer HeadB;
    ModelRenderer HeadT;
    ModelRenderer LipB;
    ModelRenderer LipT;
    ModelRenderer LipL;
    ModelRenderer LipR;
    ModelRenderer Tand1;
    ModelRenderer Tand2;
  
  public ModelBoar()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Leg1 = new ModelRenderer(this, 0, 22);
      Leg1.addBox(0F, 0F, 0F, 3, 7, 3);
      Leg1.setRotationPoint(2F, 17F, -6F);
      Leg1.setTextureSize(64, 32);
      Leg1.mirror = true;
      setRotation(Leg1, 0F, 0F, 0F);
      Leg2 = new ModelRenderer(this, 0, 22);
      Leg2.addBox(0F, 0F, 0F, 3, 7, 3);
      Leg2.setRotationPoint(2F, 17F, 4F);
      Leg2.setTextureSize(64, 32);
      Leg2.mirror = true;
      setRotation(Leg2, 0F, 0F, 0F);
      Leg3 = new ModelRenderer(this, 0, 22);
      Leg3.addBox(0F, 0F, 0F, 3, 7, 3);
      Leg3.setRotationPoint(-5F, 17F, -6F);
      Leg3.setTextureSize(64, 32);
      Leg3.mirror = true;
      setRotation(Leg3, 0F, 0F, 0F);
      Leg4 = new ModelRenderer(this, 0, 22);
      Leg4.addBox(0F, 0F, 0F, 3, 7, 3);
      Leg4.setRotationPoint(-5F, 17F, 4F);
      Leg4.setTextureSize(64, 32);
      Leg4.mirror = true;
      setRotation(Leg4, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 14, 9);
      Body.addBox(0F, 0F, 0F, 10, 8, 15);
      Body.setRotationPoint(-5F, 10F, -7F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      HeadB = new ModelRenderer(this, 0, 0);
      HeadB.addBox(0F, 0F, 0F, 8, 4, 6);
      HeadB.setRotationPoint(-4F, 12F, -13F);
      HeadB.setTextureSize(64, 32);
      HeadB.mirror = true;
      setRotation(HeadB, 0F, 0F, 0F);
      HeadT = new ModelRenderer(this, 40, 0);
      HeadT.addBox(0F, 0F, 0F, 8, 3, 4);
      HeadT.setRotationPoint(-4F, 9F, -11F);
      HeadT.setTextureSize(64, 32);
      HeadT.mirror = true;
      setRotation(HeadT, 0F, 0F, 0F);
      LipB = new ModelRenderer(this, 0, 14);
      LipB.addBox(0F, 0F, 0F, 4, 1, 4);
      LipB.setRotationPoint(-2F, 15F, -17F);
      LipB.setTextureSize(64, 32);
      LipB.mirror = true;
      setRotation(LipB, 0F, 0F, 0F);
      LipT = new ModelRenderer(this, 0, 19);
      LipT.addBox(0F, 0F, 0F, 4, 1, 2);
      LipT.setRotationPoint(-2F, 13F, -15F);
      LipT.setTextureSize(64, 32);
      LipT.mirror = true;
      setRotation(LipT, 0F, 0F, 0F);
      LipL = new ModelRenderer(this, 52, 13);
      LipL.addBox(0F, 0F, 0F, 1, 1, 2);
      LipL.setRotationPoint(1F, 14F, -15F);
      LipL.setTextureSize(64, 32);
      LipL.mirror = true;
      setRotation(LipL, 0F, 0F, 0F);
      LipR = new ModelRenderer(this, 52, 18);
      LipR.addBox(0F, 0F, 0F, 1, 1, 2);
      LipR.setRotationPoint(-2F, 14F, -15F);
      LipR.setTextureSize(64, 32);
      LipR.mirror = true;
      setRotation(LipR, 0F, 0F, 0F);
      Tand1 = new ModelRenderer(this, 31, 0);
      Tand1.addBox(0F, 0F, 0F, 1, 3, 1);
      Tand1.setRotationPoint(2F, 13F, -17F);
      Tand1.setTextureSize(64, 32);
      Tand1.mirror = true;
      setRotation(Tand1, 0F, 0F, 0F);
      Tand2 = new ModelRenderer(this, 31, 0);
      Tand2.addBox(0F, 0F, 0F, 1, 3, 1);
      Tand2.setRotationPoint(-3F, 13F, -17F);
      Tand2.setTextureSize(64, 32);
      Tand2.mirror = true;
      setRotation(Tand2, 0F, 0F, 0F);
      
      this.addChildTo(LipL, HeadB);
      this.addChildTo(LipR, HeadB);
      this.addChildTo(LipT, HeadB);
      this.addChildTo(LipB, HeadB);
      this.addChildTo(HeadT, HeadB);
      this.addChildTo(Tand1, HeadB);
      this.addChildTo(Tand2, HeadB);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    this.setRotationAngles(f, f1, f2, f3, f4, f5);
    
    if (this.isChild)
    {
        float var8 = 2.0F;
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0F, 5.0F * f5, 2.0F * f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glScalef(1.0F / var8, 1.0F / var8, 1.0F / var8);
        GL11.glTranslatef(0.0F, 24.0F * f5, 0.0F);
        Leg1.render(f5);
        Leg2.render(f5);
        Leg3.render(f5);
        Leg4.render(f5);
        Body.render(f5);
        HeadB.render(f5);
    /*    HeadT.render(f5);
        LipB.render(f5);
        LipT.render(f5);
        LipL.render(f5);
        LipR.render(f5);
        Tand1.render(f5);
        Tand2.render(f5);*/
        GL11.glPopMatrix();
        
    }
    else
    {
    
    Leg1.render(f5);
    Leg2.render(f5);
    Leg3.render(f5);
    Leg4.render(f5);
    Body.render(f5);
    HeadB.render(f5);
 /*   HeadT.render(f5);
    LipB.render(f5);
    LipT.render(f5);
    LipL.render(f5);
    LipR.render(f5);
    Tand1.render(f5);
    Tand2.render(f5);*/
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
    Leg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    Leg2.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    Leg3.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    Leg4.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    
  }
 

}
