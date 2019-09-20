package net.mcreator.thaumic_armors;

import java.util.ArrayList;
import java.util.List;


import net.mcreator.thaumic_armors.CommonProxythaumic_armors;
import net.mcreator.thaumic_armors.init.ILifeCycleHandler;
import net.mcreator.thaumic_armors.init.ItemHandler;
import net.mcreator.thaumic_armors.init.InitHandler;
import net.mcreator.thaumic_armors.ClientProxythaumic_armors;

import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.Metadata;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLFingerprintViolationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInterModComms;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerAboutToStartEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

@Mod(modid = thaumic_armors.modid, name = thaumic_armors.name, version = thaumic_armors.version)
public class thaumic_armors {

	public static final String version = "TA_version";
	public static final String modid = "thaumicarmors";
	public static final String name = "ThaumicArmors";

	@Metadata(thaumic_armors.modid)
	public static ModMetadata metadata;

	@Instance(thaumic_armors.modid)
	public static thaumic_armors instance = new thaumic_armors();

	@SidedProxy(clientSide = "net.mcreator.thaumic_armors.ClientProxythaumic_armors",
			serverSide = "net.mcreator.thaumic_armors.CommonProxythaumic_armors")
	public static CommonProxythaumic_armors proxy;

	private static List<ILifeCycleHandler> handlers = new ArrayList<ILifeCycleHandler>(){{
		add(new ItemHandler());
		add(new InitHandler());
	}};

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		handlers.forEach(handler -> handler.preInit(event));
		proxy.preInit();
	}

	@EventHandler
	public void Init(FMLInitializationEvent event) {
		proxy.init(event);
		handlers.forEach(handler -> handler.init(event));
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit();
		handlers.forEach(handler -> handler.postInit(event));
	}

	@EventHandler
	public void loadComplete(FMLLoadCompleteEvent event){
		handlers.forEach(handler -> handler.loadComplete(event));
	}
}
