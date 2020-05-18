
package com.tdc.mod.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import java.util.List;
import java.util.Collections;

import com.tdc.mod.itemgroup.TheDarkCrystalItemGroup;
import com.tdc.mod.item.CrystalShardItem;
import com.tdc.mod.TdcModTtModElements;

@TdcModTtModElements.ModElement.Tag
public class CrystaltopBlock extends TdcModTtModElements.ModElement {
	@ObjectHolder("tdc_mod_tt:crystaltop")
	public static final Block block = null;
	public CrystaltopBlock(TdcModTtModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(TheDarkCrystalItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.GROUND).hardnessAndResistance(1f, 10f).lightValue(0));
			setRegistryName("crystaltop");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(CrystalShardItem.block, (int) (1)));
		}
	}
}
