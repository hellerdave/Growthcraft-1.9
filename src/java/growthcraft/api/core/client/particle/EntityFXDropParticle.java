// Copied from Buildcraft core and edited for Growthcraft
package growthcraft.api.core.client.particle;

import net.minecraft.block.state.IBlockState;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fluids.IFluidBlock;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class EntityFXDropParticle extends EntityFX
{
	/**
	 * The height of the current bob
	 */
	private int bobTimer;

	public EntityFXDropParticle(World world, double x, double y, double z, float particleRed, float particleGreen, float particleBlue)
	{
		super(world, x, y, z, 0.0D, 0.0D, 0.0D);

		this.particleRed = particleRed;
		this.particleGreen = particleGreen;
		this.particleBlue = particleBlue;

		setParticleTextureIndex(113);
		setSize(0.01F, 0.01F);
		this.particleGravity = 0.06F;
		this.bobTimer = 40;
		this.particleMaxAge = (int) (64.0D / (Math.random() * 0.8D + 0.2D));
		this.xSpeed = 0.0D;
		this.ySpeed = 0.0D;
		this.zSpeed = 0.0D;
	}

	/**
	 * Called to update the entity's position/logic.
	 */
	@Override
	public void onUpdate()
	{
		this.prevPosX = this.posX;
		this.prevPosY = this.posY;
		this.prevPosZ = this.posZ;

		this.ySpeed -= this.particleGravity;

		if (this.bobTimer-- > 0)
		{
			this.xSpeed *= 0.02D;
			this.ySpeed *= 0.02D;
			this.zSpeed *= 0.02D;
			setParticleTextureIndex(113);
		}
		else
		{
			setParticleTextureIndex(112);
		}

		moveEntity(this.xSpeed, this.ySpeed, this.zSpeed);
		this.xSpeed *= 0.9800000190734863D;
		this.ySpeed *= 0.9800000190734863D;
		this.zSpeed *= 0.9800000190734863D;

		if (this.particleMaxAge-- <= 0)
		{
			setExpired();
		}

		if (this.isCollided)
		{
			setParticleTextureIndex(114);

			this.xSpeed *= 0.699999988079071D;
			this.zSpeed *= 0.699999988079071D;
		}

		final BlockPos pos = new BlockPos(posX, posY, posZ);
		final IBlockState state = worldObj.getBlockState(pos);
		final Material material = state.getMaterial();
		final Block block = state.getBlock();

		if ((material.isLiquid() || material.isSolid()) && block instanceof IFluidBlock)
		{
			final double d0 = MathHelper.floor_double(this.posY) + 1 -
				((IFluidBlock)block).getFilledPercentage(worldObj, pos);

			if (this.posY < d0)
			{
				setExpired();
			}
		}
	}
}
