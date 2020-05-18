
package com.tdc.mod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import com.tdc.mod.item.CrystalShardItem;
import com.tdc.mod.TdcModTtModElements;

@TdcModTtModElements.ModElement.Tag
public class TheDarkCrystalItemGroup extends TdcModTtModElements.ModElement {
	public TheDarkCrystalItemGroup(TdcModTtModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabthe_dark_crystal") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(CrystalShardItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
