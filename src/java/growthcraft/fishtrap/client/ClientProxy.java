package growthcraft.fishtrap.client;

import growthcraft.fishtrap.common.CommonProxy;
import growthcraft.core.util.ModelResourceLocationFactory;

import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy 
{
	public final ModelResourceLocationFactory modelResLoc = new ModelResourceLocationFactory("growthcraft-fishtrap");

	@Override
	public void preInit(FMLPreInitializationEvent event) 
	{
		super.preInit(event);
		ModelLoader.setCustomModelResourceLocation(blocks.fishTrap.getItem(), 0, modelResLoc.create(blocks.fishTrap.getBlock().getUnlocalizedName().substring(5), "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) 
	{
		super.init(event);
	}

	@Override
	public void postInit(FMLPostInitializationEvent event) 
	{
		super.postInit(event);
	}
}
