
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.monkeysquad.bingo.init;

import net.monkeysquad.bingo.client.gui.BingoPlayerGuiScreen;
import net.monkeysquad.bingo.client.gui.BingoGuiScreen;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BingoModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(BingoModMenus.BINGO_PLAYER_GUI.get(), BingoPlayerGuiScreen::new);
			MenuScreens.register(BingoModMenus.BINGO_GUI.get(), BingoGuiScreen::new);
		});
	}
}
