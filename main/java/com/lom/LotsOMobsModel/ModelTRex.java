// Date: 13.01.2013 11:39:33
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
public class ModelTRex extends ModelLOMBase
{
  //fields
    ModelRenderer Neck;
    ModelRenderer Head;
    ModelRenderer Jaw1;
    ModelRenderer Jaw2;
    ModelRenderer Leg1;
    ModelRenderer Leg2;
    ModelRenderer Tail1;
    ModelRenderer Tail2;
    ModelRenderer Tail3;
    ModelRenderer Arm1;
    ModelRenderer Arm2;
    ModelRenderer Body;
    ModelRenderer L5;
    ModelRenderer R2;
    ModelRenderer L2;
    ModelRenderer L3;
    ModelRenderer L4;
    ModelRenderer L1;
    ModelRenderer R1;
    ModelRenderer R5;
    ModelRenderer R3;
    ModelRenderer R4;
    ModelRenderer Teeth1;
    ModelRenderer Teeth2;
    ModelRenderer Teeth3;
    ModelRenderer Teeth4;
    ModelRenderer Teeth5;
    ModelRenderer Teeth6;
    ModelRenderer Teeth7;
    ModelRenderer Teeth8;
    ModelRenderer Teeth9;
    ModelRenderer Teeth10;
    ModelRenderer Teeth11;
    ModelRenderer Teeth12;
    ModelRenderer Teeth13;
    ModelRenderer Teeth14;
    ModelRenderer Teeth15;
    ModelRenderer Teeth16;
    ModelRenderer Teeth17;
    ModelRenderer Teeth18;
    ModelRenderer Teeth19;
    ModelRenderer Teeth20;
    ModelRenderer Teeth21;
    ModelRenderer Teeth22;
    ModelRenderer Teeth23;
    ModelRenderer Teeth24;
    ModelRenderer Teeth25;
    ModelRenderer Teeth26;
    ModelRenderer Teeth27;
    ModelRenderer Teeth28;
    ModelRenderer Teeth29;
    ModelRenderer Teeth30;
    ModelRenderer Teeth31;
    ModelRenderer Teeth32;
    ModelRenderer Teeth33;
    ModelRenderer Teeth34;
    ModelRenderer Teeth35;
    ModelRenderer Teeth36;
    ModelRenderer Teeth37;
    ModelRenderer Teeth38;
    ModelRenderer Teeth39;
    ModelRenderer Teeth40;
    ModelRenderer Teeth41;
    ModelRenderer Teeth42;
    ModelRenderer Teeth43;
    ModelRenderer Teeth44;
    ModelRenderer Teeth45;
    ModelRenderer Teeth46;
    ModelRenderer Teeth47;
    ModelRenderer Teeth48;
    ModelRenderer Teeth49;
    ModelRenderer Teeth50;
    ModelRenderer Teeth51;
    ModelRenderer Teeth52;
  
  public ModelTRex()
  {
    textureWidth = 512;
    textureHeight = 512;
    
      Neck = new ModelRenderer(this, 0, 27);
      Neck.addBox(0F, 0F, 0F, 9, 7, 18);
      Neck.setRotationPoint(-3F, -34F, -48F);
      Neck.setTextureSize(512, 512);
      Neck.mirror = true;
      setRotation(Neck, -0.2230705F, 0F, 0F);
      Head = new ModelRenderer(this, 0, 426);
      Head.addBox(0F, 0F, 0F, 19, 16, 14);
      Head.setRotationPoint(-7F, -38F, -57F);
      Head.setTextureSize(512, 512);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Jaw1 = new ModelRenderer(this, 89, 464);
      Jaw1.addBox(0F, 0F, -12F, 17, 4, 21);
      Jaw1.setRotationPoint(-6F, -26F, -66F);
      Jaw1.setTextureSize(512, 512);
      Jaw1.mirror = true;
      setRotation(Jaw1, 0F, 0F, 0F);
      Jaw2 = new ModelRenderer(this, 0, 464);
      Jaw2.addBox(0F, 0F, -12F, 17, 4, 21);
      Jaw2.setRotationPoint(-6F, -35F, -66F);
      Jaw2.setTextureSize(512, 512);
      Jaw2.mirror = true;
      setRotation(Jaw2, 0F, 0F, 0F);
      Leg1 = new ModelRenderer(this, 0, 150);
      Leg1.addBox(0F, 0F, 0F, 11, 29, 11);
      Leg1.setRotationPoint(8F, -5F, -5F);
      Leg1.setTextureSize(512, 512);
      Leg1.mirror = true;
      setRotation(Leg1, 0F, 0F, 0F);
      Leg2 = new ModelRenderer(this, 51, 150);
      Leg2.addBox(0F, 0F, 0F, 11, 29, 11);
      Leg2.setRotationPoint(-16F, -5F, -5F);
      Leg2.setTextureSize(512, 512);
      Leg2.mirror = true;
      setRotation(Leg2, 0F, 0F, 0F);
      Tail1 = new ModelRenderer(this, 452, 0);
      Tail1.addBox(-6F, 0F, 0F, 12, 9, 18);
      Tail1.setRotationPoint(1F, -14F, 20F);
      Tail1.setTextureSize(512, 512);
      Tail1.mirror = true;
      setRotation(Tail1, -0.1487195F, 0F, 0F);
      Tail2 = new ModelRenderer(this, 452, 32);
      Tail2.addBox(-4F, 5F, 15F, 8, 7, 18);
      Tail2.setRotationPoint(1F, -14F, 20F);
      Tail2.setTextureSize(512, 512);
      Tail2.mirror = true;
      setRotation(Tail2, 0.111544F, 0F, 0F);
      Tail3 = new ModelRenderer(this, 452, 64);
      Tail3.addBox(-2F, 11F, 30F, 4, 5, 22);
      Tail3.setRotationPoint(1F, -14F, 20F);
      Tail3.setTextureSize(512, 512);
      Tail3.mirror = true;
      setRotation(Tail3, 0.2974216F, 0F, 0F);
      Arm1 = new ModelRenderer(this, 0, 196);
      Arm1.addBox(0F, 0F, -12F, 4, 4, 15);
      Arm1.setRotationPoint(14F, -13F, -29F);
      Arm1.setTextureSize(512, 512);
      Arm1.mirror = true;
      setRotation(Arm1, 0.6506238F, 0F, 0F);
      Arm2 = new ModelRenderer(this, 0, 196);
      Arm2.addBox(0F, 0F, -12F, 4, 4, 15);
      Arm2.setRotationPoint(-15F, -13F, -29F);
      Arm2.setTextureSize(512, 512);
      Arm2.mirror = true;
      setRotation(Arm2, 0.6506238F, 0F, 0F);
      Body = new ModelRenderer(this, 116, 0);
      Body.addBox(0F, 0F, 0F, 25, 21, 56);
      Body.setRotationPoint(-11F, -32F, -31F);
      Body.setTextureSize(512, 512);
      Body.mirror = true;
      setRotation(Body, -0.3346145F, 0F, 0F);
      L5 = new ModelRenderer(this, 0, 0);
      L5.addBox(0F, 0F, 0F, 3, 3, 3);
      L5.setRotationPoint(6F, -21F, 10F);
      L5.setTextureSize(512, 512);
      L5.mirror = true;
      setRotation(L5, -0.3346145F, 0F, 0F);
      R2 = new ModelRenderer(this, 0, 0);
      R2.addBox(0F, 0F, 0F, 3, 3, 3);
      R2.setRotationPoint(-7F, -30F, -16F);
      R2.setTextureSize(512, 512);
      R2.mirror = true;
      setRotation(R2, -0.3346145F, 0F, 0F);
      L2 = new ModelRenderer(this, 0, 0);
      L2.addBox(0F, 0F, 0F, 3, 3, 3);
      L2.setRotationPoint(6F, -30F, -16F);
      L2.setTextureSize(512, 512);
      L2.mirror = true;
      setRotation(L2, -0.3346145F, 0F, 0F);
      L3 = new ModelRenderer(this, 0, 0);
      L3.addBox(0F, 0F, 0F, 3, 3, 3);
      L3.setRotationPoint(6F, -27F, -8F);
      L3.setTextureSize(512, 512);
      L3.mirror = true;
      setRotation(L3, -0.3346145F, 0F, 0F);
      L4 = new ModelRenderer(this, 0, 0);
      L4.addBox(0F, 0F, 0F, 3, 3, 3);
      L4.setRotationPoint(6F, -24F, 1F);
      L4.setTextureSize(512, 512);
      L4.mirror = true;
      setRotation(L4, -0.3346145F, 0F, 0F);
      L1 = new ModelRenderer(this, 0, 0);
      L1.addBox(0F, 0F, 0F, 3, 3, 3);
      L1.setRotationPoint(6F, -33F, -24F);
      L1.setTextureSize(512, 512);
      L1.mirror = true;
      setRotation(L1, -0.3346145F, 0F, 0F);
      R1 = new ModelRenderer(this, 0, 0);
      R1.addBox(0F, 0F, 0F, 3, 3, 3);
      R1.setRotationPoint(-7F, -33F, -24F);
      R1.setTextureSize(512, 512);
      R1.mirror = true;
      setRotation(R1, -0.3346145F, 0F, 0F);
      R5 = new ModelRenderer(this, 0, 0);
      R5.addBox(0F, 0F, 1.866667F, 3, 3, 3);
      R5.setRotationPoint(-7F, -21F, 10F);
      R5.setTextureSize(512, 512);
      R5.mirror = true;
      setRotation(R5, -0.3346145F, 0F, 0F);
      R3 = new ModelRenderer(this, 0, 0);
      R3.addBox(0F, 0F, 0F, 3, 3, 3);
      R3.setRotationPoint(-7F, -27F, -8F);
      R3.setTextureSize(512, 512);
      R3.mirror = true;
      setRotation(R3, -0.3346145F, 0F, 0F);
      R4 = new ModelRenderer(this, 0, 0);
      R4.addBox(0F, 0F, 0F, 3, 3, 3);
      R4.setRotationPoint(-7F, -24F, 1F);
      R4.setTextureSize(512, 512);
      R4.mirror = true;
      setRotation(R4, -0.3346145F, 0F, 0F);
      Teeth1 = new ModelRenderer(this, 28, 0);
      Teeth1.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth1.setRotationPoint(-5F, -31F, -59F);
      Teeth1.setTextureSize(512, 512);
      Teeth1.mirror = true;
      setRotation(Teeth1, 0F, 0F, 0F);
      Teeth2 = new ModelRenderer(this, 28, 0);
      Teeth2.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth2.setRotationPoint(-3F, -28F, -77F);
      Teeth2.setTextureSize(512, 512);
      Teeth2.mirror = true;
      setRotation(Teeth2, 0F, 0F, 0F);
      Teeth3 = new ModelRenderer(this, 28, 0);
      Teeth3.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth3.setRotationPoint(9F, -28F, -75F);
      Teeth3.setTextureSize(512, 512);
      Teeth3.mirror = true;
      setRotation(Teeth3, 0F, 0F, 0F);
      Teeth4 = new ModelRenderer(this, 28, 0);
      Teeth4.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth4.setRotationPoint(9F, -28F, -73F);
      Teeth4.setTextureSize(512, 512);
      Teeth4.mirror = true;
      setRotation(Teeth4, 0F, 0F, 0F);
      Teeth5 = new ModelRenderer(this, 28, 0);
      Teeth5.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth5.setRotationPoint(9F, -28F, -71F);
      Teeth5.setTextureSize(512, 512);
      Teeth5.mirror = true;
      setRotation(Teeth5, 0F, 0F, 0F);
      Teeth6 = new ModelRenderer(this, 28, 0);
      Teeth6.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth6.setRotationPoint(9F, -28F, -69F);
      Teeth6.setTextureSize(512, 512);
      Teeth6.mirror = true;
      setRotation(Teeth6, 0F, 0F, 0F);
      Teeth7 = new ModelRenderer(this, 28, 0);
      Teeth7.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth7.setRotationPoint(9F, -28F, -67F);
      Teeth7.setTextureSize(512, 512);
      Teeth7.mirror = true;
      setRotation(Teeth7, 0F, 0F, 0F);
      Teeth8 = new ModelRenderer(this, 28, 0);
      Teeth8.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth8.setRotationPoint(9F, -28F, -65F);
      Teeth8.setTextureSize(512, 512);
      Teeth8.mirror = true;
      setRotation(Teeth8, 0F, 0F, 0F);
      Teeth9 = new ModelRenderer(this, 28, 0);
      Teeth9.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth9.setRotationPoint(9F, -28F, -63F);
      Teeth9.setTextureSize(512, 512);
      Teeth9.mirror = true;
      setRotation(Teeth9, 0F, 0F, 0F);
      Teeth10 = new ModelRenderer(this, 28, 0);
      Teeth10.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth10.setRotationPoint(9F, -28F, -61F);
      Teeth10.setTextureSize(512, 512);
      Teeth10.mirror = true;
      setRotation(Teeth10, 0F, 0F, 0F);
      Teeth11 = new ModelRenderer(this, 28, 0);
      Teeth11.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth11.setRotationPoint(9F, -28F, -77F);
      Teeth11.setTextureSize(512, 512);
      Teeth11.mirror = true;
      setRotation(Teeth11, 0F, 0F, 0F);
      Teeth12 = new ModelRenderer(this, 28, 0);
      Teeth12.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth12.setRotationPoint(7F, -28F, -77F);
      Teeth12.setTextureSize(512, 512);
      Teeth12.mirror = true;
      setRotation(Teeth12, 0F, 0F, 0F);
      Teeth13 = new ModelRenderer(this, 28, 0);
      Teeth13.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth13.setRotationPoint(5F, -28F, -77F);
      Teeth13.setTextureSize(512, 512);
      Teeth13.mirror = true;
      setRotation(Teeth13, 0F, 0F, 0F);
      Teeth14 = new ModelRenderer(this, 28, 0);
      Teeth14.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth14.setRotationPoint(3F, -28F, -77F);
      Teeth14.setTextureSize(512, 512);
      Teeth14.mirror = true;
      setRotation(Teeth14, 0F, 0F, 0F);
      Teeth15 = new ModelRenderer(this, 28, 0);
      Teeth15.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth15.setRotationPoint(1F, -28F, -77F);
      Teeth15.setTextureSize(512, 512);
      Teeth15.mirror = true;
      setRotation(Teeth15, 0F, 0F, 0F);
      Teeth16 = new ModelRenderer(this, 28, 0);
      Teeth16.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth16.setRotationPoint(-1F, -28F, -77F);
      Teeth16.setTextureSize(512, 512);
      Teeth16.mirror = true;
      setRotation(Teeth16, 0F, 0F, 0F);
      Teeth17 = new ModelRenderer(this, 28, 0);
      Teeth17.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth17.setRotationPoint(-5F, -28F, -77F);
      Teeth17.setTextureSize(512, 512);
      Teeth17.mirror = true;
      setRotation(Teeth17, 0F, 0F, 0F);
      Teeth18 = new ModelRenderer(this, 28, 0);
      Teeth18.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth18.setRotationPoint(-5F, -28F, -59F);
      Teeth18.setTextureSize(512, 512);
      Teeth18.mirror = true;
      setRotation(Teeth18, 0F, 0F, 0F);
      Teeth19 = new ModelRenderer(this, 28, 0);
      Teeth19.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth19.setRotationPoint(-5F, -28F, -75F);
      Teeth19.setTextureSize(512, 512);
      Teeth19.mirror = true;
      setRotation(Teeth19, 0F, 0F, 0F);
      Teeth20 = new ModelRenderer(this, 28, 0);
      Teeth20.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth20.setRotationPoint(-5F, -28F, -73F);
      Teeth20.setTextureSize(512, 512);
      Teeth20.mirror = true;
      setRotation(Teeth20, 0F, 0F, 0F);
      Teeth21 = new ModelRenderer(this, 28, 0);
      Teeth21.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth21.setRotationPoint(-5F, -28F, -71F);
      Teeth21.setTextureSize(512, 512);
      Teeth21.mirror = true;
      setRotation(Teeth21, 0F, 0F, 0F);
      Teeth22 = new ModelRenderer(this, 28, 0);
      Teeth22.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth22.setRotationPoint(-5F, -28F, -69F);
      Teeth22.setTextureSize(512, 512);
      Teeth22.mirror = true;
      setRotation(Teeth22, 0F, 0F, 0F);
      Teeth23 = new ModelRenderer(this, 28, 0);
      Teeth23.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth23.setRotationPoint(-5F, -28F, -67F);
      Teeth23.setTextureSize(512, 512);
      Teeth23.mirror = true;
      setRotation(Teeth23, 0F, 0F, 0F);
      Teeth24 = new ModelRenderer(this, 28, 0);
      Teeth24.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth24.setRotationPoint(-5F, -28F, -65F);
      Teeth24.setTextureSize(512, 512);
      Teeth24.mirror = true;
      setRotation(Teeth24, 0F, 0F, 0F);
      Teeth25 = new ModelRenderer(this, 28, 0);
      Teeth25.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth25.setRotationPoint(-5F, -28F, -63F);
      Teeth25.setTextureSize(512, 512);
      Teeth25.mirror = true;
      setRotation(Teeth25, 0F, 0F, 0F);
      Teeth26 = new ModelRenderer(this, 28, 0);
      Teeth26.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth26.setRotationPoint(-5F, -28F, -61F);
      Teeth26.setTextureSize(512, 512);
      Teeth26.mirror = true;
      setRotation(Teeth26, 0F, 0F, 0F);
      Teeth27 = new ModelRenderer(this, 28, 0);
      Teeth27.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth27.setRotationPoint(9F, -28F, -59F);
      Teeth27.setTextureSize(512, 512);
      Teeth27.mirror = true;
      setRotation(Teeth27, 0F, 0F, 0F);
      Teeth28 = new ModelRenderer(this, 28, 0);
      Teeth28.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth28.setRotationPoint(9F, -31F, -59F);
      Teeth28.setTextureSize(512, 512);
      Teeth28.mirror = true;
      setRotation(Teeth28, 0F, 0F, 0F);
      Teeth29 = new ModelRenderer(this, 28, 0);
      Teeth29.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth29.setRotationPoint(9F, -31F, -61F);
      Teeth29.setTextureSize(512, 512);
      Teeth29.mirror = true;
      setRotation(Teeth29, 0F, 0F, 0F);
      Teeth30 = new ModelRenderer(this, 28, 0);
      Teeth30.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth30.setRotationPoint(9F, -31F, -63F);
      Teeth30.setTextureSize(512, 512);
      Teeth30.mirror = true;
      setRotation(Teeth30, 0F, 0F, 0F);
      Teeth31 = new ModelRenderer(this, 28, 0);
      Teeth31.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth31.setRotationPoint(9F, -31F, -65F);
      Teeth31.setTextureSize(512, 512);
      Teeth31.mirror = true;
      setRotation(Teeth31, 0F, 0F, 0F);
      Teeth32 = new ModelRenderer(this, 28, 0);
      Teeth32.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth32.setRotationPoint(9F, -31F, -67F);
      Teeth32.setTextureSize(512, 512);
      Teeth32.mirror = true;
      setRotation(Teeth32, 0F, 0F, 0F);
      Teeth33 = new ModelRenderer(this, 28, 0);
      Teeth33.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth33.setRotationPoint(9F, -31F, -69F);
      Teeth33.setTextureSize(512, 512);
      Teeth33.mirror = true;
      setRotation(Teeth33, 0F, 0F, 0F);
      Teeth34 = new ModelRenderer(this, 28, 0);
      Teeth34.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth34.setRotationPoint(9F, -31F, -71F);
      Teeth34.setTextureSize(512, 512);
      Teeth34.mirror = true;
      setRotation(Teeth34, 0F, 0F, 0F);
      Teeth35 = new ModelRenderer(this, 28, 0);
      Teeth35.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth35.setRotationPoint(9F, -31F, -73F);
      Teeth35.setTextureSize(512, 512);
      Teeth35.mirror = true;
      setRotation(Teeth35, 0F, 0F, 0F);
      Teeth36 = new ModelRenderer(this, 28, 0);
      Teeth36.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth36.setRotationPoint(9F, -31F, -75F);
      Teeth36.setTextureSize(512, 512);
      Teeth36.mirror = true;
      setRotation(Teeth36, 0F, 0F, 0F);
      Teeth37 = new ModelRenderer(this, 28, 0);
      Teeth37.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth37.setRotationPoint(9F, -31F, -77F);
      Teeth37.setTextureSize(512, 512);
      Teeth37.mirror = true;
      setRotation(Teeth37, 0F, 0F, 0F);
      Teeth38 = new ModelRenderer(this, 28, 0);
      Teeth38.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth38.setRotationPoint(7F, -31F, -77F);
      Teeth38.setTextureSize(512, 512);
      Teeth38.mirror = true;
      setRotation(Teeth38, 0F, 0F, 0F);
      Teeth39 = new ModelRenderer(this, 28, 0);
      Teeth39.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth39.setRotationPoint(5F, -31F, -77F);
      Teeth39.setTextureSize(512, 512);
      Teeth39.mirror = true;
      setRotation(Teeth39, 0F, 0F, 0F);
      Teeth40 = new ModelRenderer(this, 28, 0);
      Teeth40.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth40.setRotationPoint(3F, -31F, -77F);
      Teeth40.setTextureSize(512, 512);
      Teeth40.mirror = true;
      setRotation(Teeth40, 0F, 0F, 0F);
      Teeth41 = new ModelRenderer(this, 28, 0);
      Teeth41.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth41.setRotationPoint(1F, -31F, -77F);
      Teeth41.setTextureSize(512, 512);
      Teeth41.mirror = true;
      setRotation(Teeth41, 0F, 0F, 0F);
      Teeth42 = new ModelRenderer(this, 28, 0);
      Teeth42.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth42.setRotationPoint(-1F, -31F, -77F);
      Teeth42.setTextureSize(512, 512);
      Teeth42.mirror = true;
      setRotation(Teeth42, 0F, 0F, 0F);
      Teeth43 = new ModelRenderer(this, 28, 0);
      Teeth43.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth43.setRotationPoint(-3F, -31F, -77F);
      Teeth43.setTextureSize(512, 512);
      Teeth43.mirror = true;
      setRotation(Teeth43, 0F, 0F, 0F);
      Teeth44 = new ModelRenderer(this, 28, 0);
      Teeth44.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth44.setRotationPoint(-5F, -31F, -77F);
      Teeth44.setTextureSize(512, 512);
      Teeth44.mirror = true;
      setRotation(Teeth44, 0F, 0F, 0F);
      Teeth45 = new ModelRenderer(this, 28, 0);
      Teeth45.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth45.setRotationPoint(-5F, -31F, -75F);
      Teeth45.setTextureSize(512, 512);
      Teeth45.mirror = true;
      setRotation(Teeth45, 0F, 0F, 0F);
      Teeth46 = new ModelRenderer(this, 28, 0);
      Teeth46.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth46.setRotationPoint(-5F, -31F, -73F);
      Teeth46.setTextureSize(512, 512);
      Teeth46.mirror = true;
      setRotation(Teeth46, 0F, 0F, 0F);
      Teeth47 = new ModelRenderer(this, 28, 0);
      Teeth47.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth47.setRotationPoint(-5F, -31F, -71F);
      Teeth47.setTextureSize(512, 512);
      Teeth47.mirror = true;
      setRotation(Teeth47, 0F, 0F, 0F);
      Teeth48 = new ModelRenderer(this, 28, 0);
      Teeth48.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth48.setRotationPoint(-5F, -31F, -69F);
      Teeth48.setTextureSize(512, 512);
      Teeth48.mirror = true;
      setRotation(Teeth48, 0F, 0F, 0F);
      Teeth49 = new ModelRenderer(this, 28, 0);
      Teeth49.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth49.setRotationPoint(-5F, -31F, -67F);
      Teeth49.setTextureSize(512, 512);
      Teeth49.mirror = true;
      setRotation(Teeth49, 0F, 0F, 0F);
      Teeth50 = new ModelRenderer(this, 28, 0);
      Teeth50.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth50.setRotationPoint(-5F, -31F, -65F);
      Teeth50.setTextureSize(512, 512);
      Teeth50.mirror = true;
      setRotation(Teeth50, 0F, 0F, 0F);
      Teeth51 = new ModelRenderer(this, 28, 0);
      Teeth51.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth51.setRotationPoint(-5F, -31F, -63F);
      Teeth51.setTextureSize(512, 512);
      Teeth51.mirror = true;
      setRotation(Teeth51, 0F, 0F, 0F);
      Teeth52 = new ModelRenderer(this, 28, 0);
      Teeth52.addBox(0F, 0F, 0F, 1, 2, 1);
      Teeth52.setRotationPoint(-5F, -31F, -61F);
      Teeth52.setTextureSize(512, 512);
      Teeth52.mirror = true;
      setRotation(Teeth52, 0F, 0F, 0F);
      
      this.addChildTo(Tail2, Tail1);
      this.addChildTo(Tail3, Tail1);
    
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
        Neck.render(f5);
        Head.render(f5);
        Jaw1.render(f5);
        Jaw2.render(f5);
        Leg1.render(f5);
        Leg2.render(f5);
        Tail1.render(f5);
        //Tail2.render(f5);
        //Tail3.render(f5);
        Arm1.render(f5);
        Arm2.render(f5);
        Body.render(f5);
        L5.render(f5);
        R2.render(f5);
        L2.render(f5);
        L3.render(f5);
        L4.render(f5);
        L1.render(f5);
        R1.render(f5);
        R5.render(f5);
        R3.render(f5);
        R4.render(f5);
        Teeth1.render(f5);
        Teeth2.render(f5);
        Teeth3.render(f5);
        Teeth4.render(f5);
        Teeth5.render(f5);
        Teeth6.render(f5);
        Teeth7.render(f5);
        Teeth8.render(f5);
        Teeth9.render(f5);
        Teeth10.render(f5);
        Teeth11.render(f5);
        Teeth12.render(f5);
        Teeth13.render(f5);
        Teeth14.render(f5);
        Teeth15.render(f5);
        Teeth16.render(f5);
        Teeth17.render(f5);
        Teeth18.render(f5);
        Teeth19.render(f5);
        Teeth20.render(f5);
        Teeth21.render(f5);
        Teeth22.render(f5);
        Teeth23.render(f5);
        Teeth24.render(f5);
        Teeth25.render(f5);
        Teeth26.render(f5);
        Teeth27.render(f5);
        Teeth28.render(f5);
        Teeth29.render(f5);
        Teeth30.render(f5);
        Teeth31.render(f5);
        Teeth32.render(f5);
        Teeth33.render(f5);
        Teeth34.render(f5);
        Teeth35.render(f5);
        Teeth36.render(f5);
        Teeth37.render(f5);
        Teeth38.render(f5);
        Teeth39.render(f5);
        Teeth40.render(f5);
        Teeth41.render(f5);
        Teeth42.render(f5);
        Teeth43.render(f5);
        Teeth44.render(f5);
        Teeth45.render(f5);
        Teeth46.render(f5);
        Teeth47.render(f5);
        Teeth48.render(f5);
        Teeth49.render(f5);
        Teeth50.render(f5);
        Teeth51.render(f5);
        Teeth52.render(f5);
        GL11.glPopMatrix();
        
    }
    else
    {
    Neck.render(f5);
    Head.render(f5);
    Jaw1.render(f5);
    Jaw2.render(f5);
    Leg1.render(f5);
    Leg2.render(f5);
    Tail1.render(f5);
    //Tail2.render(f5);
    //Tail3.render(f5);
    Arm1.render(f5);
    Arm2.render(f5);
    Body.render(f5);
    L5.render(f5);
    R2.render(f5);
    L2.render(f5);
    L3.render(f5);
    L4.render(f5);
    L1.render(f5);
    R1.render(f5);
    R5.render(f5);
    R3.render(f5);
    R4.render(f5);
    Teeth1.render(f5);
    Teeth2.render(f5);
    Teeth3.render(f5);
    Teeth4.render(f5);
    Teeth5.render(f5);
    Teeth6.render(f5);
    Teeth7.render(f5);
    Teeth8.render(f5);
    Teeth9.render(f5);
    Teeth10.render(f5);
    Teeth11.render(f5);
    Teeth12.render(f5);
    Teeth13.render(f5);
    Teeth14.render(f5);
    Teeth15.render(f5);
    Teeth16.render(f5);
    Teeth17.render(f5);
    Teeth18.render(f5);
    Teeth19.render(f5);
    Teeth20.render(f5);
    Teeth21.render(f5);
    Teeth22.render(f5);
    Teeth23.render(f5);
    Teeth24.render(f5);
    Teeth25.render(f5);
    Teeth26.render(f5);
    Teeth27.render(f5);
    Teeth28.render(f5);
    Teeth29.render(f5);
    Teeth30.render(f5);
    Teeth31.render(f5);
    Teeth32.render(f5);
    Teeth33.render(f5);
    Teeth34.render(f5);
    Teeth35.render(f5);
    Teeth36.render(f5);
    Teeth37.render(f5);
    Teeth38.render(f5);
    Teeth39.render(f5);
    Teeth40.render(f5);
    Teeth41.render(f5);
    Teeth42.render(f5);
    Teeth43.render(f5);
    Teeth44.render(f5);
    Teeth45.render(f5);
    Teeth46.render(f5);
    Teeth47.render(f5);
    Teeth48.render(f5);
    Teeth49.render(f5);
    Teeth50.render(f5);
    Teeth51.render(f5);
    Teeth52.render(f5);
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
    Tail1.rotateAngleY = MathHelper.cos(f * 0.3662F) * 1.4F * f1;
   // Tail2.rotateAngleY = MathHelper.cos(f * 0.5F) * 1F * f1;
    //Tail3.rotateAngleY = MathHelper.cos(f * 0.3662F) * 1.4F * f1;
    Tail1.rotateAngleZ = MathHelper.cos(f * 0.1F) * 1.4F * f1;
    //Tail2.rotateAngleZ = MathHelper.cos(f * 0.1F) * 1.4F * f1;
    //Tail3.rotateAngleZ = MathHelper.cos(f * 0.1F) * 1.4F * f1;
    Arm1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    Arm2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
  }

}
