
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.monkeysquad.bingo.init;

import net.monkeysquad.bingo.BingoMod;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BingoModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BingoMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(BingoModBlocks.GRASS.get().asItem());
			tabData.accept(BingoModBlocks.GRASSPLANT.get().asItem());
			tabData.accept(BingoModBlocks.LEAVE.get().asItem());
			tabData.accept(BingoModBlocks.GRASS_AGAIN.get().asItem());
		}
	}
}
