
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maxandme.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class MAndMModTabs {
	public static CreativeModeTab TAB_TAB;

	public static void load() {
		TAB_TAB = new CreativeModeTab("tabtab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.AIR);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
