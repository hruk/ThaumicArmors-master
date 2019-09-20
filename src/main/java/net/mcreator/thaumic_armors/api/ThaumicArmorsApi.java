/*******************************************************************************
 * ThaumicArmors
 * Copyright (c) 2012 - 2019 hruk.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at
 * 
 *
 * Contributors:
 *     hruk -  implementation
 ******************************************************************************/
package net.mcreator.thaumic_armors.api;

import java.util.*;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.mcreator.thaumic_armors.*;

import net.minecraft.block.Block;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.potion.Potion;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.LoaderState;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Main API class for Thaumic Armors, has child classes for most features.<br>
 * Check {@link IMCHelper} for InterModComms registration
 *
 * @author shinoow
 *
 */
public class ThaumicArmorsApi {

	/**
	 * String used to specify the API version in the "package-info.java" classes
	 */
	public static final String API_VERSION = "1.23.0";

	public static final ArmorMaterial crimsonRangerArmor = EnumHelper.addArmorMaterial("DreadiumS", "thaumic_armors:crimsonranger", 45, new int[]{3, 6, 8, 3}, 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.5F);

	public static final Logger logger = LogManager.getLogger("ThaumicArmorsApi");

	@SideOnly(Side.CLIENT)
	private static FontRenderer aklo_font;
	
	}
