
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.monkeysquad.bingo.init;

import net.monkeysquad.bingo.item.HoItem;
import net.monkeysquad.bingo.item.FortresItem;
import net.monkeysquad.bingo.item.DiamoItem;
import net.monkeysquad.bingo.BingoMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

public class BingoModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BingoMod.MODID);
	public static final RegistryObject<Item> DIAMO = REGISTRY.register("diamo", () -> new DiamoItem());
	public static final RegistryObject<Item> HO = REGISTRY.register("ho", () -> new HoItem());
	public static final RegistryObject<Item> FORTRES = REGISTRY.register("fortres", () -> new FortresItem());
}
