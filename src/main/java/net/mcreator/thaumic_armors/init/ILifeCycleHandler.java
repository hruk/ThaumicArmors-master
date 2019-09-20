package net.mcreator.thaumic_armors.init;

import net.minecraftforge.fml.common.event.*;

/**
 * Simple interface to create separate modules for things during mod startup
 * @author shinoow
 *
 */
public interface ILifeCycleHandler {

	public void preInit(FMLPreInitializationEvent event);

	public void init(FMLInitializationEvent event);

	public void postInit(FMLPostInitializationEvent event);

	public void loadComplete(FMLLoadCompleteEvent event);
}
