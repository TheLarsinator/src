package com.lom.LotsOMobsCore;

import net.minecraft.client.model.ModelChicken;

import com.lom.LotsOMobsEntity.EntityAnt;
import com.lom.LotsOMobsEntity.EntityBear;
import com.lom.LotsOMobsEntity.EntityBee;
import com.lom.LotsOMobsEntity.EntityBird;
import com.lom.LotsOMobsEntity.EntityBoar;
import com.lom.LotsOMobsEntity.EntityBrontosaurus;
import com.lom.LotsOMobsEntity.EntityBullFrog;
import com.lom.LotsOMobsEntity.EntityBunny;
import com.lom.LotsOMobsEntity.EntityButterfly;
import com.lom.LotsOMobsEntity.EntityCamel;
import com.lom.LotsOMobsEntity.EntityCroco;
import com.lom.LotsOMobsEntity.EntityDeer;
import com.lom.LotsOMobsEntity.EntityEasterBunny;
import com.lom.LotsOMobsEntity.EntityEasterChick;
import com.lom.LotsOMobsEntity.EntityElephant;
import com.lom.LotsOMobsEntity.EntityFireFly;
import com.lom.LotsOMobsEntity.EntityFishy;
import com.lom.LotsOMobsEntity.EntityFly;
import com.lom.LotsOMobsEntity.EntityFrog;
import com.lom.LotsOMobsEntity.EntityGekko;
import com.lom.LotsOMobsEntity.EntityGiraffe;
import com.lom.LotsOMobsEntity.EntityGoat;
import com.lom.LotsOMobsEntity.EntityGorilla;
import com.lom.LotsOMobsEntity.EntityHermitCrab;
import com.lom.LotsOMobsEntity.EntityIchtyosaurus;
import com.lom.LotsOMobsEntity.EntityKakkerlak;
import com.lom.LotsOMobsEntity.EntityLion;
import com.lom.LotsOMobsEntity.EntityLizard;
import com.lom.LotsOMobsEntity.EntityNarwal;
import com.lom.LotsOMobsEntity.EntityPDFrog;
import com.lom.LotsOMobsEntity.EntityPenguin;
import com.lom.LotsOMobsEntity.EntityPolarBear;
import com.lom.LotsOMobsEntity.EntityPterosaurus;
import com.lom.LotsOMobsEntity.EntityRaptor;
import com.lom.LotsOMobsEntity.EntitySanta;
import com.lom.LotsOMobsEntity.EntityShell;
import com.lom.LotsOMobsEntity.EntitySnake;
import com.lom.LotsOMobsEntity.EntitySquirrel;
import com.lom.LotsOMobsEntity.EntityTRex;
import com.lom.LotsOMobsEntity.EntityTriceratops;
import com.lom.LotsOMobsEntity.EntityTropicalFishy;
import com.lom.LotsOMobsEntity.EntityTurtle;
import com.lom.LotsOMobsEntity.EntityVulture;
import com.lom.LotsOMobsEntity.EntityWhale;
import com.lom.LotsOMobsEntity.EntityWinterDeer;
import com.lom.LotsOMobsEntity.EntityWorm;
import com.lom.LotsOMobsModel.ModelAnt;
import com.lom.LotsOMobsModel.ModelBear;
import com.lom.LotsOMobsModel.ModelBird;
import com.lom.LotsOMobsModel.ModelBoar;
import com.lom.LotsOMobsModel.ModelBrontosaurus;
import com.lom.LotsOMobsModel.ModelBullFrog;
import com.lom.LotsOMobsModel.ModelBunny;
import com.lom.LotsOMobsModel.ModelButterfly;
import com.lom.LotsOMobsModel.ModelCamel;
import com.lom.LotsOMobsModel.ModelDeer;
import com.lom.LotsOMobsModel.ModelEasterBunny;
import com.lom.LotsOMobsModel.ModelElephant;
import com.lom.LotsOMobsModel.ModelFishy;
import com.lom.LotsOMobsModel.ModelFly;
import com.lom.LotsOMobsModel.ModelFrog;
import com.lom.LotsOMobsModel.ModelGiraffe;
import com.lom.LotsOMobsModel.ModelGoat;
import com.lom.LotsOMobsModel.ModelGorilla;
import com.lom.LotsOMobsModel.ModelHermitCrab;
import com.lom.LotsOMobsModel.ModelIchtyosaurus;
import com.lom.LotsOMobsModel.ModelKakkerlak;
import com.lom.LotsOMobsModel.ModelLion;
import com.lom.LotsOMobsModel.ModelLizard;
import com.lom.LotsOMobsModel.ModelNarwal;
import com.lom.LotsOMobsModel.ModelPenguin;
import com.lom.LotsOMobsModel.ModelPterosaurus;
import com.lom.LotsOMobsModel.ModelRaptor;
import com.lom.LotsOMobsModel.ModelSanta;
import com.lom.LotsOMobsModel.ModelShell;
import com.lom.LotsOMobsModel.ModelSnake;
import com.lom.LotsOMobsModel.ModelSquirrel;
import com.lom.LotsOMobsModel.ModelTRex;
import com.lom.LotsOMobsModel.ModelTriceratops;
import com.lom.LotsOMobsModel.ModelTurtle;
import com.lom.LotsOMobsModel.ModelVulture;
import com.lom.LotsOMobsModel.ModelWhale;
import com.lom.LotsOMobsModel.ModelWorm;
import com.lom.LotsOMobsRender.RenderAnt;
import com.lom.LotsOMobsRender.RenderBear;
import com.lom.LotsOMobsRender.RenderBee;
import com.lom.LotsOMobsRender.RenderBird;
import com.lom.LotsOMobsRender.RenderBoar;
import com.lom.LotsOMobsRender.RenderBrontosaurus;
import com.lom.LotsOMobsRender.RenderBullFrog;
import com.lom.LotsOMobsRender.RenderBunny;
import com.lom.LotsOMobsRender.RenderButterfly;
import com.lom.LotsOMobsRender.RenderCamel;
import com.lom.LotsOMobsRender.RenderCroco;
import com.lom.LotsOMobsRender.RenderDeer;
import com.lom.LotsOMobsRender.RenderEasterBunny;
import com.lom.LotsOMobsRender.RenderEasterChick;
import com.lom.LotsOMobsRender.RenderElephant;
import com.lom.LotsOMobsRender.RenderFireFly;
import com.lom.LotsOMobsRender.RenderFishy;
import com.lom.LotsOMobsRender.RenderFly;
import com.lom.LotsOMobsRender.RenderFrog;
import com.lom.LotsOMobsRender.RenderGekko;
import com.lom.LotsOMobsRender.RenderGiraffe;
import com.lom.LotsOMobsRender.RenderGoat;
import com.lom.LotsOMobsRender.RenderGorilla;
import com.lom.LotsOMobsRender.RenderHermitCrab;
import com.lom.LotsOMobsRender.RenderIchtyosaurus;
import com.lom.LotsOMobsRender.RenderKakkerlak;
import com.lom.LotsOMobsRender.RenderLion;
import com.lom.LotsOMobsRender.RenderLizard;
import com.lom.LotsOMobsRender.RenderNarwal;
import com.lom.LotsOMobsRender.RenderPDFrog;
import com.lom.LotsOMobsRender.RenderPenguin;
import com.lom.LotsOMobsRender.RenderPolarBear;
import com.lom.LotsOMobsRender.RenderPterosaurus;
import com.lom.LotsOMobsRender.RenderRaptor;
import com.lom.LotsOMobsRender.RenderSanta;
import com.lom.LotsOMobsRender.RenderShell;
import com.lom.LotsOMobsRender.RenderSnake;
import com.lom.LotsOMobsRender.RenderSquirrel;
import com.lom.LotsOMobsRender.RenderTRex;
import com.lom.LotsOMobsRender.RenderTriceratops;
import com.lom.LotsOMobsRender.RenderTropicalFishy;
import com.lom.LotsOMobsRender.RenderTurtle;
import com.lom.LotsOMobsRender.RenderVulture;
import com.lom.LotsOMobsRender.RenderWhale;
import com.lom.LotsOMobsRender.RenderWinterDeer;
import com.lom.LotsOMobsRender.RenderWorm;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class LotsOMobsClient extends LotsOMobsProxy
{

	
	
    @SideOnly(Side.CLIENT)
	public void registerRenderInformation()
        {
    	//Mobs
    	RenderingRegistry.registerEntityRenderingHandler(EntityDeer.class, new RenderDeer(new ModelDeer(), 0.5F));
    	RenderingRegistry.registerEntityRenderingHandler(EntityBoar.class, new RenderBoar(new ModelBoar(), 0.5F));
    	RenderingRegistry.registerEntityRenderingHandler(EntityBird.class, new RenderBird(new ModelBird(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntitySquirrel.class,new RenderSquirrel(new ModelSquirrel(), 0.2F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityGiraffe.class, new RenderGiraffe(new ModelGiraffe(), 1.3F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityElephant.class, new RenderElephant(new ModelElephant(), 1.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityLizard.class, new RenderLizard(new ModelLizard(), 0.2F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityBunny.class, new RenderBunny(new ModelBunny(), 0.2F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityWhale.class, new RenderWhale(new ModelWhale(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityFishy.class, new RenderFishy(new ModelFishy(), 0.0F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityCamel.class, new RenderCamel(new ModelCamel(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityWinterDeer.class, new RenderWinterDeer(new ModelDeer(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityTurtle.class, new RenderTurtle(new ModelTurtle(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityButterfly.class, new RenderButterfly(new ModelButterfly(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityAnt.class, new RenderAnt(new ModelAnt(), 0.0F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityGekko.class, new RenderGekko(new ModelLizard(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityBear.class, new RenderBear(new ModelBear(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityGorilla.class, new RenderGorilla(new ModelGorilla(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntitySnake.class, new RenderSnake(new ModelSnake(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityCroco.class, new RenderCroco(new ModelLizard(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityLion.class, new RenderLion(new ModelLion(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityFly.class, new RenderFly(new ModelFly(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityBee.class, new RenderBee(new ModelFly(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityFireFly.class, new RenderFireFly(new ModelFly(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityPDFrog.class, new RenderPDFrog(new ModelFrog(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityFrog.class, new RenderFrog(new ModelFrog(), 0.5F));
   		RenderingRegistry.registerEntityRenderingHandler(EntityBullFrog.class, new RenderBullFrog(new ModelBullFrog(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityEasterBunny.class, new RenderEasterBunny(new ModelEasterBunny(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityPenguin.class, new RenderPenguin(new ModelPenguin(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityKakkerlak.class, new RenderKakkerlak(new ModelKakkerlak(), 0.0F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityVulture.class, new RenderVulture(new ModelVulture(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityPolarBear.class, new RenderPolarBear(new ModelBear(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityNarwal.class, new RenderNarwal(new ModelNarwal(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntitySanta.class, new RenderSanta(new ModelSanta(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityWorm.class, new RenderWorm(new ModelWorm(), 0.0F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityHermitCrab.class, new RenderHermitCrab(new ModelHermitCrab(), 0.0F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityShell.class, new RenderShell(new ModelShell(), 0.0F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityTropicalFishy.class, new RenderTropicalFishy(new ModelFishy(), 0.0F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityGoat.class, new RenderGoat(new ModelGoat(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityTriceratops.class, new RenderTriceratops(new ModelTriceratops(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityBrontosaurus.class, new RenderBrontosaurus(new ModelBrontosaurus(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityTRex.class, new RenderTRex(new ModelTRex(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityPterosaurus.class, new RenderPterosaurus(new ModelPterosaurus(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityIchtyosaurus.class, new RenderIchtyosaurus(new ModelIchtyosaurus(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityRaptor.class, new RenderRaptor(new ModelRaptor(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityEasterChick.class, new RenderEasterChick(new ModelChicken(), 0.05F));
  		
        }
    /*
    public void registerSound() {
    	MinecraftForge.EVENT_BUS.register(new LotsOMobs_EventSounds());
    }*/
    
    public int addArmor(String armor){
    	return RenderingRegistry.addNewArmourRendererPrefix(armor);
    } 
}
