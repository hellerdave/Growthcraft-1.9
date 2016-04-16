package growthcraft.fishtrap;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
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

	@Instance(MOD_ID)
	public static GrowthCraftFishTrap instance;

	@EventHandler
	public void preload(FMLPreInitializationEvent event)
	{
	}

	@EventHandler
	public void load(FMLInitializationEvent event)
	{
	}

	@EventHandler
	public void postload(FMLPostInitializationEvent event)
	{
	}
}

