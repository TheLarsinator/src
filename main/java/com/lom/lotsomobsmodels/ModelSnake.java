// Date: 26.12.2012 23:37:17
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.lom.lotsomobsmodels;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
@SideOnly(Side.CLIENT)
public class ModelSnake extends ModelBase
{
  //fields
    ModelRenderer Head;
    ModelRenderer Eye2;
    ModelRenderer Eye;
    ModelRenderer Tong;
    ModelRenderer Shape1;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape0;
    ModelRenderer Shape11;
    ModelRenderer Tail;
  
  public ModelSnake()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Head = new ModelRenderer(this, 49, 0);
      Head.addBox(0F, 0F, 0F, 3, 1, 4);
      Head.setRotationPoint(0F, 23F, -7F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Eye2 = new ModelRenderer(this, 36, 0);
      Eye2.addBox(0F, 0F, 0F, 1, 1, 1);
      Eye2.setRotationPoint(2F, 22F, -4F);
      Eye2.setTextureSize(64, 32);
      Eye2.mirror = true;
      setRotation(Eye2, 0F, 0F, 0F);
      Eye = new ModelRenderer(this, 41, 0);
      Eye.addBox(0F, 0F, 0F, 1, 1, 1);
      Eye.setRotationPoint(0F, 22F, -4F);
      Eye.setTextureSize(64, 32);
      Eye.mirror = true;
      setRotation(Eye, 0F, 0F, 0F);
      Tong = new ModelRenderer(this, 43, 0);
      Tong.addBox(0F, 0F, -2F, 1, 0, 2);
      Tong.setRotationPoint(1F, 23F, -7F);
      Tong.setTextureSize(64, 32);
      Tong.mirror = true;
      setRotation(Tong, 0F, 0F, 0F);
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape1.setRotationPoint(1F, 23F, -3F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 0, 0);
      Shape3.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape3.setRotationPoint(2F, 23F, -2F);
      Shape3.setTextureSize(64, 32);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 0, 0);
      Shape4.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape4.setRotationPoint(3F, 23F, -1F);
      Shape4.setTextureSize(64, 32);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 0, 0);
      Shape5.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape5.setRotationPoint(3F, 23F, 0F);
      Shape5.setTextureSize(64, 32);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 0, 0);
      Shape6.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape6.setRotationPoint(2F, 23F, 1F);
      Shape6.setTextureSize(64, 32);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 0, 0);
      Shape7.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape7.setRotationPoint(1F, 23F, 2F);
      Shape7.setTextureSize(64, 32);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, 0F, 0F);
      Shape8 = new ModelRenderer(this, 0, 0);
      Shape8.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape8.setRotationPoint(0F, 23F, 3F);
      Shape8.setTextureSize(64, 32);
      Shape8.mirror = true;
      setRotation(Shape8, 0F, 0F, 0F);
      Shape9 = new ModelRenderer(this, 0, 0);
      Shape9.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape9.setRotationPoint(-1F, 23F, 4F);
      Shape9.setTextureSize(64, 32);
      Shape9.mirror = true;
      setRotation(Shape9, 0F, 0F, 0F);
      Shape0 = new ModelRenderer(this, 0, 0);
      Shape0.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape0.setRotationPoint(-1F, 23F, 5F);
      Shape0.setTextureSize(64, 32);
      Shape0.mirror = true;
      setRotation(Shape0, 0F, 0F, 0F);
      Shape11 = new ModelRenderer(this, 9, 0);
      Shape11.addBox(0F, 0F, 0F, 2, 1, 1);
      Shape11.setRotationPoint(0F, 23F, 6F);
      Shape11.setTextureSize(64, 32);
      Shape11.mirror = true;
      setRotation(Shape11, 0F, 0F, 0F);
      Tail = new ModelRenderer(this, 59, 6);
      Tail.addBox(0F, -2F, 0F, 1, 3, 1);
      Tail.setRotationPoint(1F, 23F, 7F);
      Tail.setTextureSize(64, 32);
      Tail.mirror = true;
      setRotation(Tail, -0.5948578F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Head.render(f5);
    Eye2.render(f5);
    Eye.render(f5);
    Tong.render(f5);
    Shape1.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    Shape5.render(f5);
    Shape6.render(f5);
    Shape7.render(f5);
    Shape8.render(f5);
    Shape9.render(f5);
    Shape0.render(f5);
    Shape11.render(f5);
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
    Tong.rotateAngleY = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    Tail.rotateAngleY = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
  }

}
