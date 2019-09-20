package net.mcreator.thaumic_armors.armors;

import net.mcreator.thaumic_armors.thaumic_armors;
import net.mcreator.thaumic_armors.Tabs.TATabs;
import net.mcreator.thaumic_armors.init.TAItems;
import net.mcreator.thaumic_armors.api.ThaumicArmorsApi;
import net.mcreator.thaumic_armors.api.APIUtils;
import net.mcreator.thaumic_armors.armors.ModelCrimsonRanger;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBiped.ArmPose;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;




public class ItemCrimsonRanger extends ItemTAArmor {
	public ItemCrimsonRanger(ArmorMaterial par2EnumArmorMaterial, int par3, EntityEquipmentSlot par4, String name){
		super(par2EnumArmorMaterial, par3, par4, name);
	}
	
	@Override
	public String getItemStackDisplayName(ItemStack par1ItemStack) {

		return TextFormatting.DARK_RED + super.getItemStackDisplayName(par1ItemStack);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String layer) {
		if(stack.getItem() == TAItems.crimson_ranger_helm || stack.getItem() == TAItems.crimson_ranger_chestplate || stack.getItem() == TAItems.crimson_ranger_boots)
			return "thaumic_armors:textures/armor/crimsonranger_base.png";

		if(stack.getItem() == TAItems.crimson_ranger_leggings)
			return "thaumic_armors:textures/armor/crimsonranger_overlay.png";
		else return null;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped armorModel) {
		if(itemStack != null){
			if(itemStack.getItem() instanceof ItemCrimsonRanger){
				EntityEquipmentSlot type = ((ItemArmor)itemStack.getItem()).armorType;
				if(type == EntityEquipmentSlot.FEET || type == EntityEquipmentSlot.CHEST)
					armorModel = thaumic_armors.proxy.getArmorModel(0);
				else
					armorModel = thaumic_armors.proxy.getArmorModel(1);
			} if(armorModel != null){
				armorModel.bipedHead.showModel = armorSlot == EntityEquipmentSlot.HEAD;
				armorModel.bipedHeadwear.showModel = armorSlot == EntityEquipmentSlot.HEAD;
				armorModel.bipedBody.showModel = armorSlot == EntityEquipmentSlot.CHEST || armorSlot == EntityEquipmentSlot.LEGS;
				armorModel.bipedRightArm.showModel = armorSlot == EntityEquipmentSlot.CHEST;
				armorModel.bipedLeftArm.showModel = armorSlot == EntityEquipmentSlot.CHEST;
				armorModel.bipedRightLeg.showModel = armorSlot == EntityEquipmentSlot.LEGS || armorSlot == EntityEquipmentSlot.FEET;
				armorModel.bipedLeftLeg.showModel = armorSlot == EntityEquipmentSlot.LEGS || armorSlot == EntityEquipmentSlot.FEET;
				armorModel.isSneak = entityLiving.isSneaking();
				armorModel.isRiding = entityLiving.isRiding();
				armorModel.isChild = entityLiving.isChild();
				armorModel.rightArmPose = entityLiving.getHeldItemMainhand() != null ? entityLiving.getHeldItemMainhand().getItemUseAction() == EnumAction.BLOCK && entityLiving.getItemInUseCount() > 0 ? ArmPose.BLOCK : entityLiving.getHeldItemMainhand().getItemUseAction() == EnumAction.BOW && entityLiving.getItemInUseCount() > 0 ? ArmPose.BOW_AND_ARROW : ArmPose.ITEM : ArmPose.EMPTY;
				armorModel.leftArmPose = entityLiving.getHeldItemOffhand() != null ? entityLiving.getHeldItemOffhand().getItemUseAction() == EnumAction.BLOCK && entityLiving.getItemInUseCount() > 0 ? ArmPose.BLOCK : entityLiving.getHeldItemMainhand() != null && entityLiving.getHeldItemMainhand().getItemUseAction() == EnumAction.BOW && entityLiving.getItemInUseCount() > 0 ? ArmPose.BOW_AND_ARROW : ArmPose.ITEM : ArmPose.EMPTY;
				armorModel.swingProgress = entityLiving.swingProgress;
	
				return armorModel;
			}
		}
		return null;
	}
}

