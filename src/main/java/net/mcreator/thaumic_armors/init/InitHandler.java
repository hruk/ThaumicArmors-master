package net.mcreator.thaumic_armors.init;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.*;

import net.mcreator.thaumic_armors.thaumic_armors;
import net.mcreator.thaumic_armors.api.APIUtils;
import net.mcreator.thaumic_armors.api.ThaumicArmorsApi;
import net.mcreator.thaumic_armors.init.TAItems;
import net.mcreator.thaumic_armors.CommonProxythaumic_armors;
import net.mcreator.thaumic_armors.init.*;
import net.mcreator.thaumic_armors.Tabs.TATabs;


import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.Tuple;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.DimensionType;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.*;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fluids.*;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class InitHandler implements ILifeCycleHandler {

	public static final InitHandler INSTANCE = new InitHandler();

	public static Configuration cfg;

	final List<Block> BLOCKS = new ArrayList<>();
	final List<Item> ITEMS = new ArrayList<>();
	final List<Biome> BIOMES = new ArrayList<>();
	final List<Enchantment> ENCHANTMENTS = new ArrayList<>();
	final List<Potion> POTIONS = new ArrayList<>();
	final List<PotionType> POTION_TYPES = new ArrayList<>();
	final List<SoundEvent> SOUND_EVENTS = new ArrayList<>();

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		thaumic_armors.metadata = event.getModMetadata();
		TATabs.init();
	}
	
	@SubscribeEvent
	public void registerEnchantments(RegistryEvent.Register<Enchantment> event){
		event.getRegistry().registerAll(ENCHANTMENTS.toArray(new Enchantment[0]));
	}

	@SubscribeEvent
	public void registerPotions(RegistryEvent.Register<Potion> event){
		event.getRegistry().registerAll(POTIONS.toArray(new Potion[0]));
	}

	@SubscribeEvent
	public void registerPotionTypes(RegistryEvent.Register<PotionType> event){
		event.getRegistry().registerAll(POTION_TYPES.toArray(new PotionType[0]));
	}

	@SubscribeEvent
	public void registerSoundEvents(RegistryEvent.Register<SoundEvent> event){
		event.getRegistry().registerAll(SOUND_EVENTS.toArray(new SoundEvent[0]));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postInit(FMLPostInitializationEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loadComplete(FMLLoadCompleteEvent event) {
		// TODO Auto-generated method stub
		
	}
}
