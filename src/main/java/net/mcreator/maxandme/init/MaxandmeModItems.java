
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maxandme.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.maxandme.item.WarhammerItem;
import net.mcreator.maxandme.MaxandmeMod;

public class MaxandmeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MaxandmeMod.MODID);
	public static final RegistryObject<Item> WARHAMMER = REGISTRY.register("warhammer", () -> new WarhammerItem());
}
