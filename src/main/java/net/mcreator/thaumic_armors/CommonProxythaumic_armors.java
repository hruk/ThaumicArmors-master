package net.mcreator.thaumic_armors;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumHand;
import net.minecraft.util.IThreadListener;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class CommonProxythaumic_armors {

	public void preInit(FMLPreInitializationEvent event) {
	}

	public void init(FMLInitializationEvent event) {
	}
	
	public ModelBiped getArmorModel(int id){
		return null;
	}
	
	public void postInit() {}
	
	public void preInit() {}
	
	
}

