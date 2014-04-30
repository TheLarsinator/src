// Date: 24.12.2012 11:10:59
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
public class ModelCamel extends ModelBase
{
  //fields
    ModelRenderer Body;
    ModelRenderer Leg2;
    ModelRenderer Leg4;
    ModelRenderer Leg1;
    ModelRenderer Leg3;
    ModelRenderer BultAB;
    ModelRenderer BultVB;
    ModelRenderer BultAM;
    ModelRenderer BultAT;
    ModelRenderer BultVM;
    ModelRenderer BultVT;
    ModelRenderer Neck;
    ModelRenderer Neck2;
    ModelRenderer Head;
    ModelRenderer Nose;
    ModelRenderer Tail;
  
  public ModelCamel()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      Body = new ModelRenderer(this, 0, 0);
      Body.addBox(0F, 0F, 0F, 16, 12, 22);
      Body.setRotationPoint(-8F, 0F, 0F);
      Body.setTextureSize(128, 64);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Leg2 = new ModelRenderer(this, 0, 0);
      Leg2.addBox(0F, 0F, 0F, 4, 12, 4);
      Leg2.setRotationPoint(-8F, 12F, 0F);
      Leg2.setTextureSize(128, 64);
      Leg2.mirror = true;
      setRotation(Leg2, 0F, 0F, 0F);
      Leg4 = new ModelRenderer(this, 0, 0);
      Leg4.addBox(0F, 0F, 0F, 4, 12, 4);
      Leg4.setRotationPoint(-8F, 12F, 18F);
      Leg4.setTextureSize(128, 64);
      Leg4.mirror = true;
      setRotation(Leg4, 0F, 0F, 0F);
      Leg1 = new ModelRenderer(this, 0, 0);
      Leg1.addBox(0F, 0F, 0F, 4, 12, 4);
      Leg1.setRotationPoint(4F, 12F, 0F);
      Leg1.setTextureSize(128, 64);
      Leg1.mirror = true;
      setRotation(Leg1, 0F, 0F, 0F);
      Leg3 = new ModelRenderer(this, 0, 0);
      Leg3.addBox(0F, 0F, 0F, 4, 12, 4);
      Leg3.setRotationPoint(4F, 12F, 18F);
      Leg3.setTextureSize(128, 64);
      Leg3.mirror = true;
      setRotation(Leg3, 0F, 0F, 0F);
      BultAB = new ModelRenderer(this, 84, 0);
      BultAB.addBox(0F, 0F, 0F, 14, 4, 8);
      BultAB.setRotationPoint(-7F, -4F, 0F);
      BultAB.setTextureSize(128, 64);
      BultAB.mirror = true;
      setRotation(BultAB, 0F, 0F, 0F);
      BultVB = new ModelRenderer(this, 84, 0);
      BultVB.addBox(0F, 0F, 0F, 14, 4, 8);
      BultVB.setRotationPoint(-7F, -4F, 13F);
      BultVB.setTextureSize(128, 64);
      BultVB.mirror = true;
      setRotation(BultVB, 0F, 0F, 0F);
      BultAM = new ModelRenderer(this, 88, 13);
      BultAM.addBox(0F, 0F, 0F, 14, 1, 6);
      BultAM.setRotationPoint(-7F, -5F, 14F);
      BultAM.setTextureSize(128, 64);
      BultAM.mirror = true;
      setRotation(BultAM, 0F, 0F, 0F);
      BultAT = new ModelRenderer(this, 92, 21);
      BultAT.addBox(0F, 0F, 0F, 14, 1, 4);
      BultAT.setRotationPoint(-7F, -6F, 15F);
      BultAT.setTextureSize(128, 64);
      BultAT.mirror = true;
      setRotation(BultAT, 0F, 0F, 0F);
      BultVM = new ModelRenderer(this, 88, 13);
      BultVM.addBox(0F, 0F, 0F, 14, 1, 6);
      BultVM.setRotationPoint(-7F, -5F, 1F);
      BultVM.setTextureSize(128, 64);
      BultVM.mirror = true;
      setRotation(BultVM, 0F, 0F, 0F);
      BultVT = new ModelRenderer(this, 92, 21);
      BultVT.addBox(0F, 0F, 0F, 14, 1, 4);
      BultVT.setRotationPoint(-7F, -6F, 2F);
      BultVT.setTextureSize(128, 64);
      BultVT.mirror = true;
      setRotation(BultVT, 0F, 0F, 0F);
      Neck = new ModelRenderer(this, 57, 0);
      Neck.addBox(0F, 0F, 0F, 4, 6, 8);
      Neck.setRotationPoint(-2F, 5F, -6F);
      Neck.setTextureSize(128, 64);
      Neck.mirror = true;
      setRotation(Neck, 0.4461433F, 0F, 0F);
      Neck2 = new ModelRenderer(this, 57, 0);
      Neck2.addBox(-2F, 0F, 0F, 4, 6, 8);
      Neck2.setRotationPoint(0F, 5F, -6F);
      Neck2.setTextureSize(128, 64);
      Neck2.mirror = true;
      setRotation(Neck2, 1.933288F, 0F, 0F);
      Head = new ModelRenderer(this, 0, 46);
      Head.addBox(0F, 0F, 0F, 8, 6, 6);
      Head.setRotationPoint(-4F, -7F, -8F);
      Head.setTextureSize(128, 64);
      Head.mirror = true;
      setRotation(Head, -0.0174533F, 0F, 0F);
      Nose = new ModelRenderer(this, 0, 36);
      Nose.addBox(0F, 0F, 0F, 8, 3, 6);
      Nose.setRotationPoint(-4F, -4F, -14F);
      Nose.setTextureSize(128, 64);
      Nose.mirror = true;
      setRotation(Nose, 0F, 0F, 0F);
      Tail = new ModelRenderer(this, 32, 37);
      Tail.addBox(0F, 0F, 0F, 2, 8, 1);
      Tail.setRotationPoint(-1F, 1F, 21F);
      Tail.setTextureSize(128, 64);
      Tail.mirror = true;
      setRotation(Tail, 0.5205006F, 0F, 0F);
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
        Body.render(f5);
        Leg2.render(f5);
        Leg4.render(f5);
        Leg1.render(f5);
        Leg3.render(f5);
        BultAB.render(f5);
        BultVB.render(f5);
        BultAM.render(f5);
        BultAT.render(f5);
        BultVM.render(f5);
        BultVT.render(f5);
        Neck.render(f5);
        Neck2.render(f5);
        Head.render(f5);
        Nose.render(f5);
        Tail.render(f5);
        GL11.glPopMatrix();
        
    }
    else
    {
    
    
    Body.render(f5);
    Leg2.render(f5);
    Leg4.render(f5);
    Leg1.render(f5);
    Leg3.render(f5);
    BultAB.render(f5);
    BultVB.render(f5);
    BultAM.render(f5);
    BultAT.render(f5);
    BultVM.render(f5);
    BultVT.render(f5);
    Neck.render(f5);
    Neck2.render(f5);
    Head.render(f5);
    Nose.render(f5);
    Tail.render(f5);
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
    Leg2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    Leg3.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    Leg4.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
  }

}
