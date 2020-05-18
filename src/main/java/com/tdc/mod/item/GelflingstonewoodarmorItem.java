
package com.tdc.mod.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.Entity;

import com.tdc.mod.itemgroup.TheDarkCrystalItemGroup;
import com.tdc.mod.TdcModTtModElements;

@TdcModTtModElements.ModElement.Tag
public class GelflingstonewoodarmorItem extends TdcModTtModElements.ModElement {
	@ObjectHolder("tdc_mod_tt:gelflingstonewoodarmorhelmet")
	public static final Item helmet = null;
	@ObjectHolder("tdc_mod_tt:gelflingstonewoodarmorbody")
	public static final Item body = null;
	@ObjectHolder("tdc_mod_tt:gelflingstonewoodarmorlegs")
	public static final Item legs = null;
	@ObjectHolder("tdc_mod_tt:gelflingstonewoodarmorboots")
	public static final Item boots = null;
	public GelflingstonewoodarmorItem(TdcModTtModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{2, 5, 6, 2}[slot.getIndex()];
			}

			public int getEnchantability() {
				return 9;
			}

			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}

			@OnlyIn(Dist.CLIENT)
			public String getName() {
				return "gelflingstonewoodarmor";
			}

			public float getToughness() {
				return 0f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(TheDarkCrystalItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "tdc_mod_tt:textures/models/armor/diamond_armor_texture__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("gelflingstonewoodarmorhelmet"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(TheDarkCrystalItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "tdc_mod_tt:textures/models/armor/diamond_armor_texture__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("gelflingstonewoodarmorbody"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(TheDarkCrystalItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "tdc_mod_tt:textures/models/armor/diamond_armor_texture__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("gelflingstonewoodarmorlegs"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(TheDarkCrystalItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "tdc_mod_tt:textures/models/armor/diamond_armor_texture__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("gelflingstonewoodarmorboots"));
	}
}
