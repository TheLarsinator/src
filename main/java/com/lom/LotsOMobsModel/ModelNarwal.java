// Date: 11.10.2012 22:05:45
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.lom.LotsOMobsModel;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


@SideOnly(Side.CLIENT)
public class ModelNarwal extends ModelBase
{
  //fields
    ModelRenderer Body;
    ModelRenderer Horn;
    ModelRenderer Fin2;
    ModelRenderer Fin1;
    ModelRenderer TailC;
    ModelRenderer Tail;
  
  public ModelNarwal()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      Body = new ModelRenderer(this, 0, 0);
      Body.addBox(0F, 0F, 0F, 12, 7, 28);
      Body.setRotationPoint(-6F, 15F, 0F);
      Body.setTextureSize(128, 128);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Horn = new ModelRenderer(this, 0, 37);
      Horn.addBox(0F, 0F, 0F, 2, 2, 20);
      Horn.setRotationPoint(-1F, 18F, -20F);
      Horn.setTextureSize(128, 128);
      Horn.mirror = true;
      setRotation(Horn, 0F, 0F, 0F);
      Fin2 = new ModelRenderer(this, 58, 0);
      Fin2.addBox(-8F, 0F, -2F, 8, 1, 5);
      Fin2.setRotationPoint(-6F, 20F, 9F);
      Fin2.setTextureSize(128, 128);
      Fin2.mirror = true;
      setRotation(Fin2, 0F, 0F, 0F);
      Fin1 = new ModelRenderer(this, 58, 12);
      Fin1.addBox(0F, 0F, -2F, 8, 1, 5);
      Fin1.setRotationPoint(6F, 20F, 9F);
      Fin1.setTextureSize(128, 128);
      Fin1.mirror = true;
      setRotation(Fin1, 0F, 0F, 0F);
      TailC = new ModelRenderer(this, 0, 0);
      TailC.addBox(-2F, 0F, 0F, 4, 1, 3);
      TailC.setRotationPoint(0F, 18F, 28F);
      TailC.setTextureSize(128, 128);
      TailC.mirror = true;
      setRotation(TailC, 0F, 0F, 0F);
      Tail = new ModelRenderer(this, 44, 40);
      Tail.addBox(-7F, 0F, 3F, 14, 1, 5);
      Tail.setRotationPoint(0F, 18F, 28F);
      Tail.setTextureSize(128, 128);
      Tail.mirror = true;
      setRotation(Tail, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Body.render(f5);
    Horn.render(f5);
    Fin2.render(f5);
    Fin1.render(f5);
    TailC.render(f5);
    Tail.render(f5);
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
    Tail.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    TailC.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    Fin1.rotateAngleZ = MathHelper.cos(f * 0.54F) * 0.44F * f1;
    Fin2.rotateAngleZ = MathHelper.cos(f * 0.54F) * 0.44F * f1;
 
  }

}
