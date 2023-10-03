package net.monkeysquad.bingo.client.gui;

import net.monkeysquad.bingo.world.inventory.BingoGuiMenu;
import net.monkeysquad.bingo.procedures.HoesProcedure;
import net.monkeysquad.bingo.procedures.FrotressProcedure;
import net.monkeysquad.bingo.procedures.DiamondsProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class BingoGuiScreen extends AbstractContainerScreen<BingoGuiMenu> {
	private final static HashMap<String, Object> guistate = BingoGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public BingoGuiScreen(BingoGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(new ResourceLocation("bingo:textures/screens/bingogui1.1.png"), this.leftPos + -22, this.topPos + -13, 0, 0, 224, 182, 224, 182);

		if (FrotressProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("bingo:textures/screens/done.png"), this.leftPos + 78, this.topPos + -5, 0, 0, 22, 22, 22, 22);
		}
		if (DiamondsProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("bingo:textures/screens/done.png"), this.leftPos + 114, this.topPos + -5, 0, 0, 22, 22, 22, 22);
		}
		if (HoesProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("bingo:textures/screens/done.png"), this.leftPos + 150, this.topPos + -5, 0, 0, 22, 22, 22, 22);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
	}
}
