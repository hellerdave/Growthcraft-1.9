package growthcraft.fishtrap.common.block;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public final class FishTrapBlocks 
{
	public static Block fishTrap = new BlockFishTrap();

	private FishTrapBlocks() {}

	public static void registerBlocks()
	{
		GameRegistry.registerBlock(fishTrap, fishTrap.getUnlocalizedName());
	}
	public static void registerRecipes()
	{
		//GameRegistry.addRecipe(new ShapedOreRecipe(fishTrap.asStack(1), "ACA", "CBC", "ACA", 'A', "plankWood", 'B', Items.lead, 'C', Items.string));
	}
}