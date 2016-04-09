/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2016 IceDragon200
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package growthcraft.core;

import growthcraft.api.core.log.GrcLogger;
import growthcraft.api.core.log.ILogger;
import growthcraft.api.core.module.ModuleContainer;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(
	modid = GrowthCraftCore.MODID,
	name = GrowthCraftCore.NAME,
	dependencies = GrowthCraftCore.DEPENDENCIES,
	acceptedMinecraftVersions = GrowthCraftCore.MINECRAFT_VERSION,
	version = GrowthCraftCore.VERSION
)
public class GrowthCraftCore
{
	public static final String MODID = "GrowthCraft|Core";
	public static final String NAME = "GrowthCraft Core";
	public static final String DEPENDENCIES = "";
	public static final String MINECRAFT_VERSION = "[1.8.9]";
	public static final String VERSION = "3.0.0";

	@Mod.Instance(MODID)
	public static GrowthCraftCore instance;

	private final ILogger logger = new GrcLogger(MODID);
	private final ModuleContainer modules = new ModuleContainer();

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		modules.setLogger(logger);
		//modules.add();
		modules.freeze();

		modules.preInit();
		modules.register();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		modules.init();
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		modules.postInit();
	}
}
