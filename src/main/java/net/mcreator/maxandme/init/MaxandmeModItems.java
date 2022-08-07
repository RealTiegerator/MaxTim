
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
import net.mcreator.maxandme.item.TinIngotItem;
import net.mcreator.maxandme.item.BronzeIngotItem;
import net.mcreator.maxandme.MaxandmeMod;

public class MaxandmeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MaxandmeMod.MODID);
	public static final RegistryObject<Item> WARHAMMER = REGISTRY.register("warhammer", () -> new WarhammerItem());
	public static final RegistryObject<Item> TIN_ORE = block(MaxandmeModBlocks.TIN_ORE, MaxandmeModTabs.TAB_TAB);
	public static final RegistryObject<Item> TIN_INGOT = REGISTRY.register("tin_ingot", () -> new TinIngotItem());
	public static final RegistryObject<Item> TIN_BLOCK = block(MaxandmeModBlocks.TIN_BLOCK, MaxandmeModTabs.TAB_TAB);
	public static final RegistryObject<Item> BRONZE_INGOT = REGISTRY.register("bronze_ingot", () -> new BronzeIngotItem());
	public static final RegistryObject<Item> BRONZE_BLOCK = block(MaxandmeModBlocks.BRONZE_BLOCK, MaxandmeModTabs.TAB_TAB);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
