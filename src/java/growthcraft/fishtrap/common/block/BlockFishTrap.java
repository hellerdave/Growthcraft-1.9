package growthcraft.fishtrap.common.block;

import growthcraft.core.GrowthCraftCore;

import net.minecraft.block.material.Material;
import net.minecraft.block.Block;

public class BlockFishTrap extends Block
{
	public BlockFishTrap()
	{
		super(Material.wood);
		setTickRandomly(true);
		setHardness(0.4F);
		setStepSound(soundTypeWood);
		setUnlocalizedName("fishTrap");
		setCreativeTab(GrowthCraftCore.creativeTab);
	}
}
