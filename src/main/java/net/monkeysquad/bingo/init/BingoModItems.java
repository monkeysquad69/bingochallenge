
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.monkeysquad.bingo.init;

import net.monkeysquad.bingo.BingoMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class BingoModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BingoMod.MODID);
	public static final RegistryObject<Item> GRASS = block(BingoModBlocks.GRASS);
	public static final RegistryObject<Item> GRASSPLANT = block(BingoModBlocks.GRASSPLANT);
	public static final RegistryObject<Item> LEAVE = block(BingoModBlocks.LEAVE);
	public static final RegistryObject<Item> GRASS_2 = block(BingoModBlocks.GRASS_2);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
