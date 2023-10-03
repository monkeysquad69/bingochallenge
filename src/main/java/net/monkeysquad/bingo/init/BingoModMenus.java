
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.monkeysquad.bingo.init;

import net.monkeysquad.bingo.world.inventory.BingoPlayerGuiMenu;
import net.monkeysquad.bingo.world.inventory.BingoGuiMenu;
import net.monkeysquad.bingo.BingoMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

public class BingoModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, BingoMod.MODID);
	public static final RegistryObject<MenuType<BingoPlayerGuiMenu>> BINGO_PLAYER_GUI = REGISTRY.register("bingo_player_gui", () -> IForgeMenuType.create(BingoPlayerGuiMenu::new));
	public static final RegistryObject<MenuType<BingoGuiMenu>> BINGO_GUI = REGISTRY.register("bingo_gui", () -> IForgeMenuType.create(BingoGuiMenu::new));
}
