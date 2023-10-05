
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.monkeysquad.bingo.init;

import net.monkeysquad.bingo.block.LeaveBlock;
import net.monkeysquad.bingo.block.GrassplantBlock;
import net.monkeysquad.bingo.block.GrassBlock;
import net.monkeysquad.bingo.block.GrassAgainBlock;
import net.monkeysquad.bingo.BingoMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class BingoModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BingoMod.MODID);
	public static final RegistryObject<Block> GRASS = REGISTRY.register("grass", () -> new GrassBlock());
	public static final RegistryObject<Block> GRASSPLANT = REGISTRY.register("grassplant", () -> new GrassplantBlock());
	public static final RegistryObject<Block> LEAVE = REGISTRY.register("leave", () -> new LeaveBlock());
	public static final RegistryObject<Block> GRASS_AGAIN = REGISTRY.register("grass_again", () -> new GrassAgainBlock());
}
