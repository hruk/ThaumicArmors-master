
/*******************************************************************************
 * Thaumic Armors
 * Copyright (c) 2012 - 2019 hruk.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at
 *
 * Contributors:
 *     hruk -  implementation
 ******************************************************************************/
package net.mcreator.thaumic_armors.init;

import net.mcreator.thaumic_armors.thaumic_armors;
import net.mcreator.thaumic_armors.api.ThaumicArmorsApi;
import net.mcreator.thaumic_armors.init.TAItems;
import net.mcreator.thaumic_armors.armors.*;
import net.mcreator.thaumic_armors.Tabs.TATabs;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDoor;
import net.minecraft.item.ItemFood;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.*;

public class ItemHandler implements ILifeCycleHandler {

@Override
	public void preInit(FMLPreInitializationEvent event) {

		//Armor
		TAItems.crimson_ranger_helm = new ItemCrimsonRanger(ThaumicArmorsApi.crimsonRangerArmor, 5, EntityEquipmentSlot.HEAD, "crimsonrangerhelm");
		TAItems.crimson_ranger_chestplate = new ItemCrimsonRanger(ThaumicArmorsApi.crimsonRangerArmor, 5, EntityEquipmentSlot.CHEST, "crimsonrangerplate");
		TAItems.crimson_ranger_leggings = new ItemCrimsonRanger(ThaumicArmorsApi.crimsonRangerArmor, 5, EntityEquipmentSlot.LEGS, "crimsonrangerlegs");
		TAItems.crimson_ranger_boots = new ItemCrimsonRanger(ThaumicArmorsApi.crimsonRangerArmor, 5, EntityEquipmentSlot.FEET, "crimsonrangerboots");
		}
{
		registerItem(TAItems.crimson_ranger_helm, "crimsonrangerhelm");
		registerItem(TAItems.crimson_ranger_chestplate, "crimsonrangerplate");
		registerItem(TAItems.crimson_ranger_leggings, "crimsonrangerlegs");
		registerItem(TAItems.crimson_ranger_boots, "crimsonrangerboots");
}

	@Override
	public void init(FMLInitializationEvent event) {

	}

	@Override
	public void postInit(FMLPostInitializationEvent event) {}

	@Override
	public void loadComplete(FMLLoadCompleteEvent event) {}

	private static void registerItem(Item item, String name){
		InitHandler.INSTANCE.ITEMS.add(item.setRegistryName(new ResourceLocation(thaumic_armors.modid, name)));
	}
}
