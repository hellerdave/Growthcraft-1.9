package growthcraft.fishtrap.common;

import growthcraft.fishtrap.common.block.FishTrapBlocks;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy 
{
	public void preInit(FMLPreInitializationEvent event) 
	{
		FishTrapBlocks.registerBlocks(); 
	}

	public void init(FMLInitializationEvent event) 
	{
		FishTrapBlocks.registerRecipes();
	}

	public void postInit(FMLPostInitializationEvent event)
	{
	}
}