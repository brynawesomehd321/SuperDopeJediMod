package superdopesquad.superdopejedimod;

import java.awt.Color;
import java.io.IOException;

import javax.swing.plaf.synth.ColorType;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.Display;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.ScaledResolution;



public class FactionGUI extends GuiScreen{

	int guiWidth = 250;
	int guiHeight = 350;
	
	int sithWidth = 125;
	int sithHeight = 175;
	
	int jediWidth = 125;
	int jediHeight = 175;
	
	GuiButton SithButton;
	GuiButton JediButton;
	
	@Override
	public void drawScreen(int X, int Y, float Ticks) {
		
		
		
		int guiX = (width - guiWidth) / 2;
		int guiY = (height - guiHeight) / 2;
		GL11.glColor4f(1, 1, 1, 1);
		drawDefaultBackground();
		mc.renderEngine.bindTexture(new ResourceLocation(SuperDopeJediMod.MODID, "textures/gui/FactionGUI.png"));
		drawTexturedModalRect(guiX, guiY, 0, 0, guiWidth, guiHeight);
		drawTexturedModalRect(guiX, guiY, 0, 81, sithWidth, sithHeight);
		
		// Draw the count of how many credits the user has.
		// We know the number of credits, because it was an input into the class.
		//ScaledResolution res = new ScaledResolution(this.mc, this.mc.displayWidth, this.mc.displayHeight);
		FontRenderer fontRender = mc.fontRendererObj;
		//int displayWidthScaled = res.getScaledWidth();
		//int displayHeightScaled = res.getScaledHeight();
		mc.entityRenderer.setupOverlayRendering();
		int textX = guiX + 20;
		int textY = guiY + 20;
		int color = 0x990000;

		super.drawScreen(X, Y, Ticks);
	}

	@Override
	public void initGui() {
		
		int guiX = (width - guiWidth) / 2;
		int guiY = (height - guiHeight) / 2;
		buttonList.clear();
		buttonList.add(SithButton = new GuiButton(1, guiX + 10, guiY + 30, 250, 175, "Sith"));
		buttonList.add(JediButton = new GuiButton(2, guiX + 10, guiY + 200, 250, 175, "Republic"));
		super.initGui();
	}
	
	@Override
	protected void actionPerformed(GuiButton SithButton) throws IOException {
		switch(SithButton.id){
		case 1:
			SithButton.displayString = "You have chosen Sith.";
			JediButton.enabled = false;
			SithButton.enabled = false;
		}
		super.actionPerformed(SithButton);
	}
	
}