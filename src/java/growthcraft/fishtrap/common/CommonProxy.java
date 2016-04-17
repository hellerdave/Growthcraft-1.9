package growthcraft.fishtrap.common;

import growthcraft.fishtrap.common.module.GrcFishTrapBlocks;
import growthcraft.api.core.module.ModuleContainer;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy 
{
	public final GrcFishTrapBlocks blocks = new GrcFishTrapBlocks();
	private final ModuleContainer modules = new ModuleContainer();

	public CommonProxy()
	{
		modules.add(blocks);
	}

	public void preInit(FMLPreInitializationEvent event) 
	{
		modules.preInit();
		modules.register();
	}

	public void init(FMLInitializationEvent event) 
	{
		modules.init();
	}

	public void postInit(FMLPostInitializationEvent event)
	{
		modules.postInit();
	}
}
