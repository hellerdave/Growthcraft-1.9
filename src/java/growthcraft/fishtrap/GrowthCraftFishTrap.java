package growthcraft.fishtrap;

import growthcraft.fishtrap.common.CommonProxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod;

@Mod(
	modid = GrowthCraftFishTrap.MOD_ID,
	name = GrowthCraftFishTrap.MOD_NAME,
	version = GrowthCraftFishTrap.MOD_VERSION,
	dependencies = "required-after:Growthcraft@@VERSION@"
)
public class GrowthCraftFishTrap
{
	public static final String MOD_ID = "Growthcraft|Fishtrap";
	public static final String MOD_NAME = "Growthcraft Fishtrap";
	public static final String MOD_VERSION = "@VERSION@";

	@Instance
	public static GrowthCraftFishTrap instance = new GrowthCraftFishTrap();
	
	@SidedProxy(clientSide="growthcraft.client.ClientProxy", serverSide="growthcraft.client.ServerProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		// Blocks + Items registered in common proxy
		proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		// Recipes registed in common proxy
		proxy.init(event);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		proxy.postInit(event);
	}
}

