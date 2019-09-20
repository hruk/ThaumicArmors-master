package net.mcreator.thaumic_armors.Tabs;

import net.mcreator.thaumic_armors.init.TAItems;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

/**
 * Creative Tab references
 * @author hruk
 */
public class TATabs {

	public static void init(){ /* Nothing special here, just initializing all the static things */}

	public static final CreativeTabs tabCombat = new CreativeTabs("taArmors"){

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(TAItems.crimson_ranger_helm);
		}
	};
}