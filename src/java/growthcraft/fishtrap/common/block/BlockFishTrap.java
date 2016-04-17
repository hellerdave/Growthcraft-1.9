package growthcraft.fishtrap.common.block;

import growthcraft.core.GrowthCraftCore;
import growthcraft.core.common.block.GrcBlockBase;

import net.minecraft.block.material.Material;

public class BlockFishTrap extends GrcBlockBase
{
	public BlockFishTrap()
	{
		super(Material.wood);
		setTickRandomly(true);
		setHardness(0.4F);
		setStepSound(soundTypeWood);
		setUnlocalizedName("fishtrap");
		setCreativeTab(GrowthCraftCore.creativeTab);
	}
}
