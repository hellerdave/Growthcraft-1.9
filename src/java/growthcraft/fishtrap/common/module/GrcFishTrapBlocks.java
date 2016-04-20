package growthcraft.fishtrap.common.module;

import growthcraft.fishtrap.common.block.BlockFishTrap;
import growthcraft.core.common.module.GrcModuleBase;
import growthcraft.core.common.definition.BlockDefinition;

public class GrcFishTrapBlocks extends GrcModuleBase
{
	public BlockDefinition fishTrap;

	@Override
	public void preInit()
	{
		this.fishTrap = new BlockDefinition(new BlockFishTrap());
	}

	@Override
	public void register()
	{
		fishTrap.register("fish_trap");
	}

	@Override
	public void init()
	{
		registerRecipes();
	}

	public void registerRecipes()
	{
		//GameRegistry.addRecipe(new ShapedOreRecipe(fishTrap.asStack(1), "ACA", "CBC", "ACA", 'A', "plankWood", 'B', Items.lead, 'C', Items.string));
	}
}
