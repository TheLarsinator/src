// Date: 02.08.2013 16:32:33
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.lom.LotsOMobsModel;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelFrog extends ModelLOMBase
{
  //fields
    ModelRenderer body;
    ModelRenderer eye;
    ModelRenderer eye2;
    ModelRenderer mouth;
    ModelRenderer mouthb;
    ModelRenderer backleg;
    ModelRenderer bottomleg;
    ModelRenderer toe1;
    ModelRenderer toe2;
    ModelRenderer backleg2;
    ModelRenderer bottomleg2;
    ModelRenderer toe3;
    ModelRenderer toe4;
    ModelRenderer frontleg;
    ModelRenderer frontleg2;
    ModelRenderer toefront;
    ModelRenderer toefront2;
    ModelRenderer flllow;
    ModelRenderer flllow2;
    ModelRenderer toefront3;
    ModelRenderer toefront4;
    
    
  
  public ModelFrog()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      body = new ModelRenderer(this, 39, 0);
      body.addBox(0F, 0F, 0F, 5, 2, 3);
      body.setRotationPoint(-2F, 20.2F, -1F);
      body.setTextureSize(64, 32);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0.0872665F);
      eye = new ModelRenderer(this, 30, 0);
      eye.addBox(0F, 0F, 0F, 1, 1, 1);
      eye.setRotationPoint(-3F, 19.7F, -1.5F);
      eye.setTextureSize(64, 32);
      eye.mirror = true;
      setRotation(eye, 0F, 0F, 0F);
      eye2 = new ModelRenderer(this, 25, 0);
      eye2.addBox(0F, 0F, 0F, 1, 1, 1);
      eye2.setRotationPoint(-3F, 19.7F, 1.5F);
      eye2.setTextureSize(64, 32);
      eye2.mirror = true;
      setRotation(eye2, 0F, 0F, 0F);
      mouth = new ModelRenderer(this, 25, 3);
      mouth.addBox(-2F, 0F, 0F, 2, 1, 3);
      mouth.setRotationPoint(-2F, 20.2F, -1F);
      mouth.setTextureSize(64, 32);
      mouth.mirror = true;
      setRotation(mouth, 0F, 0F, 0.0523599F);
      mouthb = new ModelRenderer(this, 25, 8);
      mouthb.addBox(-2F, 0F, 0F, 2, 1, 2);
      mouthb.setRotationPoint(-1.5F, 21.2F, -0.5F);
      mouthb.setTextureSize(64, 32);
      mouthb.mirror = true;
      setRotation(mouthb, 0F, 0F, 0.0872665F);
      backleg = new ModelRenderer(this, 35, 10);
      backleg.addBox(-2F, 0F, 0F, 3, 1, 1);
      backleg.setRotationPoint(2F, 21.7F, 1.5F);
      backleg.setTextureSize(64, 32);
      backleg.mirror = true;
      setRotation(backleg, 0F, 0.5235988F, -0.0523599F);
      bottomleg = new ModelRenderer(this, 45, 15);
      bottomleg.addBox(-2F, 0F, 0F, 3, 1, 1);
      bottomleg.setRotationPoint(2F, 22.1F, 1.5F);
      bottomleg.setTextureSize(64, 32);
      bottomleg.mirror = true;
      setRotation(bottomleg, 0F, 0.5235988F, -0.4537856F);
      toe1 = new ModelRenderer(this, 45, 20);
      toe1.addBox(-1F, 0F, -1F, 1, 1, 2);
      toe1.setRotationPoint(1.2F, 22.9F, 2.6F);
      toe1.setTextureSize(64, 32);
      toe1.mirror = true;
      setRotation(toe1, 0F, 0.5235988F, -0.0523599F);
      toe2 = new ModelRenderer(this, 45, 25);
      toe2.addBox(0F, 0F, 0F, 1, 1, 1);
      toe2.setRotationPoint(-0.7F, 23F, 3.1F);
      toe2.setTextureSize(64, 32);
      toe2.mirror = true;
      setRotation(toe2, 0F, 0.5235988F, -0.0523599F);
      backleg2 = new ModelRenderer(this, 45, 10);
      backleg2.addBox(-2F, 0F, -1F, 3, 1, 1);
      backleg2.setRotationPoint(2F, 21.7F, -0.5F);
      backleg2.setTextureSize(64, 32);
      backleg2.mirror = true;
      setRotation(backleg2, 0F, -0.5235988F, -0.0523599F);
      bottomleg2 = new ModelRenderer(this, 35, 15);
      bottomleg2.addBox(-2F, 0F, -1F, 3, 1, 1);
      bottomleg2.setRotationPoint(2F, 22.1F, -0.5F);
      bottomleg2.setTextureSize(64, 32);
      bottomleg2.mirror = true;
      setRotation(bottomleg2, 0F, -0.5235988F, -0.4537856F);
      toe3 = new ModelRenderer(this, 35, 20);
      toe3.addBox(-1F, 0F, -1F, 1, 1, 2);
      toe3.setRotationPoint(1.2F, 22.9F, -1.6F);
      toe3.setTextureSize(64, 32);
      toe3.mirror = true;
      setRotation(toe3, 0F, -0.5235988F, -0.0523599F);
      toe4 = new ModelRenderer(this, 35, 25);
      toe4.addBox(0F, 0F, -1F, 1, 1, 1);
      toe4.setRotationPoint(-0.7F, 23F, -2.1F);
      toe4.setTextureSize(64, 32);
      toe4.mirror = true;
      setRotation(toe4, 0F, -0.5235988F, -0.0523599F);
      frontleg = new ModelRenderer(this, 10, 10);
      frontleg.addBox(0F, 0F, 0F, 1, 1, 1);
      frontleg.setRotationPoint(-1.7F, 21.2F, -1.4F);
      frontleg.setTextureSize(64, 32);
      frontleg.mirror = true;
      setRotation(frontleg, -0.1396263F, 0F, 0.1047198F);
      frontleg2 = new ModelRenderer(this, 0, 10);
      frontleg2.addBox(0F, 0F, -1F, 1, 1, 1);
      frontleg2.setRotationPoint(-1.7F, 21.2F, 2.4F);
      frontleg2.setTextureSize(64, 32);
      frontleg2.mirror = true;
      setRotation(frontleg2, 0.1396263F, 0F, 0.1047198F);
      toefront = new ModelRenderer(this, 10, 20);
      toefront.addBox(0F, 0F, 0F, 1, 1, 2);
      toefront.setRotationPoint(-1.9F, 22.9F, -2F);
      toefront.setTextureSize(64, 32);
      toefront.mirror = true;
      setRotation(toefront, 0F, 0F, 0F);
      toefront2 = new ModelRenderer(this, 10, 25);
      toefront2.addBox(0F, 0F, 0F, 1, 1, 1);
      toefront2.setRotationPoint(-2.6F, 22.9F, -1.5F);
      toefront2.setTextureSize(64, 32);
      toefront2.mirror = true;
      setRotation(toefront2, 0F, 0F, -0.0174533F);
      flllow = new ModelRenderer(this, 10, 15);
      flllow.addBox(0F, 0F, 0F, 1, 1, 1);
      flllow.setRotationPoint(-1.8F, 22.2F, -1.5F);
      flllow.setTextureSize(64, 32);
      flllow.mirror = true;
      setRotation(flllow, 0F, 0F, 0.0872665F);
      flllow2 = new ModelRenderer(this, 0, 15);
      flllow2.addBox(0F, 0F, 0F, 1, 1, 1);
      flllow2.setRotationPoint(-1.8F, 22.2F, 1.5F);
      flllow2.setTextureSize(64, 32);
      flllow2.mirror = true;
      setRotation(flllow2, 0F, 0F, 0.0872665F);
      toefront3 = new ModelRenderer(this, 0, 20);
      toefront3.addBox(0F, 0F, -2F, 1, 1, 2);
      toefront3.setRotationPoint(-1.9F, 22.9F, 3F);
      toefront3.setTextureSize(64, 32);
      toefront3.mirror = true;
      setRotation(toefront3, 0F, 0F, 0F);
      toefront4 = new ModelRenderer(this, 0, 25);
      toefront4.addBox(0F, 0F, 0F, 1, 1, 1);
      toefront4.setRotationPoint(-2.6F, 22.9F, 1.5F);
      toefront4.setTextureSize(64, 32);
      toefront4.mirror = true;
      setRotation(toefront4, 0F, 0F, -0.0174533F);
      
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    body.render(f5);
    eye.render(f5);
    eye2.render(f5);
    mouth.render(f5);
    mouthb.render(f5);
    backleg.render(f5);
    bottomleg.render(f5);
    toe1.render(f5);
    toe2.render(f5);
    backleg2.render(f5);
    bottomleg2.render(f5);
    toe3.render(f5);
    toe4.render(f5);
    frontleg.render(f5);
    frontleg2.render(f5);
    toefront.render(f5);
    toefront2.render(f5);
    flllow.render(f5);
    flllow2.render(f5);
    toefront3.render(f5);
    toefront4.render(f5);
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
  }

}
