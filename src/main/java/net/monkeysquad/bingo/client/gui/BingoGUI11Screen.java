package net.monkeysquad.bingo.client.gui;

import net.monkeysquad.bingo.world.inventory.BingoGUI11Menu;
import net.monkeysquad.bingo.procedures.CHoneyProcedure;
import net.monkeysquad.bingo.procedures.CFortressProcedure;
import net.monkeysquad.bingo.procedures.CDiamondProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class BingoGUI11Screen extends AbstractContainerScreen<BingoGUI11Menu> {
	private final static HashMap<String, Object> guistate = BingoGUI11Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public BingoGUI11Screen(BingoGUI11Menu container, Inventory inventory, Component text) {
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
		if (mouseX > leftPos + 4 && mouseX < leftPos + 28 && mouseY > topPos + -8 && mouseY < topPos + 16)
			guiGraphics.renderTooltip(font, Component.translatable("gui.bingo.bingo_gui_11.tooltip_cover_me_with_diamonds"), mouseX, mouseY);
		if (mouseX > leftPos + 40 && mouseX < leftPos + 64 && mouseY > topPos + -8 && mouseY < topPos + 16)
			guiGraphics.renderTooltip(font, Component.translatable("gui.bingo.bingo_gui_11.tooltip_sticky_situation"), mouseX, mouseY);
		if (mouseX > leftPos + 76 && mouseX < leftPos + 100 && mouseY > topPos + -8 && mouseY < topPos + 16)
			guiGraphics.renderTooltip(font, Component.translatable("gui.bingo.bingo_gui_11.tooltip_a_terrible_fortress"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(new ResourceLocation("bingo:textures/screens/bingogui1.2.png"), this.leftPos + -23, this.topPos + -15, 0, 0, 224, 182, 224, 182);

		if (CDiamondProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("bingo:textures/screens/done.png"), this.leftPos + 5, this.topPos + -7, 0, 0, 22, 22, 22, 22);
		}
		if (CHoneyProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("bingo:textures/screens/done.png"), this.leftPos + 41, this.topPos + -7, 0, 0, 22, 22, 22, 22);
		}
		if (CFortressProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("bingo:textures/screens/done.png"), this.leftPos + 77, this.topPos + -7, 0, 0, 22, 22, 22, 22);
		}

		guiGraphics.blit(new ResourceLocation("bingo:textures/screens/done.png"), this.leftPos + 113, this.topPos + -7, 0, 0, 22, 22, 22, 22);

		guiGraphics.blit(new ResourceLocation("bingo:textures/screens/done.png"), this.leftPos + 149, this.topPos + -7, 0, 0, 22, 22, 22, 22);

		guiGraphics.blit(new ResourceLocation("bingo:textures/screens/done.png"), this.leftPos + 5, this.topPos + 29, 0, 0, 22, 22, 22, 22);

		guiGraphics.blit(new ResourceLocation("bingo:textures/screens/done.png"), this.leftPos + 41, this.topPos + 29, 0, 0, 22, 22, 22, 22);

		guiGraphics.blit(new ResourceLocation("bingo:textures/screens/done.png"), this.leftPos + 77, this.topPos + 29, 0, 0, 22, 22, 22, 22);

		guiGraphics.blit(new ResourceLocation("bingo:textures/screens/done.png"), this.leftPos + 113, this.topPos + 29, 0, 0, 22, 22, 22, 22);

		guiGraphics.blit(new ResourceLocation("bingo:textures/screens/done.png"), this.leftPos + 149, this.topPos + 29, 0, 0, 22, 22, 22, 22);

		guiGraphics.blit(new ResourceLocation("bingo:textures/screens/done.png"), this.leftPos + 5, this.topPos + 65, 0, 0, 22, 22, 22, 22);

		guiGraphics.blit(new ResourceLocation("bingo:textures/screens/done.png"), this.leftPos + 41, this.topPos + 65, 0, 0, 22, 22, 22, 22);

		guiGraphics.blit(new ResourceLocation("bingo:textures/screens/done.png"), this.leftPos + 77, this.topPos + 65, 0, 0, 22, 22, 22, 22);

		guiGraphics.blit(new ResourceLocation("bingo:textures/screens/done.png"), this.leftPos + 113, this.topPos + 65, 0, 0, 22, 22, 22, 22);

		guiGraphics.blit(new ResourceLocation("bingo:textures/screens/done.png"), this.leftPos + 149, this.topPos + 65, 0, 0, 22, 22, 22, 22);

		guiGraphics.blit(new ResourceLocation("bingo:textures/screens/done.png"), this.leftPos + 5, this.topPos + 101, 0, 0, 22, 22, 22, 22);

		guiGraphics.blit(new ResourceLocation("bingo:textures/screens/done.png"), this.leftPos + 41, this.topPos + 101, 0, 0, 22, 22, 22, 22);

		guiGraphics.blit(new ResourceLocation("bingo:textures/screens/done.png"), this.leftPos + 77, this.topPos + 101, 0, 0, 22, 22, 22, 22);

		guiGraphics.blit(new ResourceLocation("bingo:textures/screens/done.png"), this.leftPos + 113, this.topPos + 101, 0, 0, 22, 22, 22, 22);

		guiGraphics.blit(new ResourceLocation("bingo:textures/screens/done.png"), this.leftPos + 149, this.topPos + 101, 0, 0, 22, 22, 22, 22);

		guiGraphics.blit(new ResourceLocation("bingo:textures/screens/done.png"), this.leftPos + 5, this.topPos + 137, 0, 0, 22, 22, 22, 22);

		guiGraphics.blit(new ResourceLocation("bingo:textures/screens/done.png"), this.leftPos + 41, this.topPos + 137, 0, 0, 22, 22, 22, 22);

		guiGraphics.blit(new ResourceLocation("bingo:textures/screens/done.png"), this.leftPos + 77, this.topPos + 137, 0, 0, 22, 22, 22, 22);

		guiGraphics.blit(new ResourceLocation("bingo:textures/screens/done.png"), this.leftPos + 113, this.topPos + 137, 0, 0, 22, 22, 22, 22);

		guiGraphics.blit(new ResourceLocation("bingo:textures/screens/done.png"), this.leftPos + 149, this.topPos + 137, 0, 0, 22, 22, 22, 22);

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
