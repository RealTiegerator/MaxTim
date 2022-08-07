
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maxandme.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.maxandme.item.WarhammerItem;
import net.mcreator.maxandme.item.TntGunItem;
import net.mcreator.maxandme.item.TinIngotItem;
import net.mcreator.maxandme.item.BronzeIngotItem;
import net.mcreator.maxandme.MAndMMod;

public class MAndMModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MAndMMod.MODID);
	public static final RegistryObject<Item> WARHAMMER = REGISTRY.register("warhammer", () -> new WarhammerItem());
	public static final RegistryObject<Item> TIN_ORE = block(MAndMModBlocks.TIN_ORE, MAndMModTabs.TAB_TAB);
	public static final RegistryObject<Item> TIN_INGOT = REGISTRY.register("tin_ingot", () -> new TinIngotItem());
	public static final RegistryObject<Item> TIN_BLOCK = block(MAndMModBlocks.TIN_BLOCK, MAndMModTabs.TAB_TAB);
	public static final RegistryObject<Item> BRONZE_INGOT = REGISTRY.register("bronze_ingot", () -> new BronzeIngotItem());
	public static final RegistryObject<Item> BRONZE_BLOCK = block(MAndMModBlocks.BRONZE_BLOCK, MAndMModTabs.TAB_TAB);
	public static final RegistryObject<Item> TNT_GUN = REGISTRY.register("tnt_gun", () -> new TntGunItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
