package growthcraft.fishtrap;

import growthcraft.core.common.definition.BlockDefinition;
import growthcraft.fishtrap.common.block.BlockFishTrap;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraft.init.Items;

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
	
	public static BlockDefinition fishTrap;

	@EventHandler
	public void preload(FMLPreInitializationEvent event)
	{
		fishTrap = new BlockDefinition(new BlockFishTrap());

		registerBlocks();
	}

	private void registerBlocks()
	{
		GameRegistry.registerBlock(fishTrap.getBlock(), "grc.fishTrap");
	}

	private void registerRecipes()
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(fishTrap.asStack(1), "ACA", "CBC", "ACA", 'A', "plankWood", 'B', Items.lead, 'C', Items.string));
	}

	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		registerRecipes();
	}

	@EventHandler
	public void postload(FMLPostInitializationEvent event)
	{
	}
}

