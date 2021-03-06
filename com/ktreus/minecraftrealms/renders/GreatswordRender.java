package com.ktreus.minecraftrealms.renders;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;
import net.minecraftforge.client.IItemRenderer.ItemRendererHelper;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class GreatswordRender implements IItemRenderer {

	  Minecraft mc = Minecraft.getMinecraft();
	  @Override
	  public boolean handleRenderType(ItemStack item, ItemRenderType type) {
	  	switch(type){
	  	case ENTITY:
	  	case EQUIPPED:
	  	case EQUIPPED_FIRST_PERSON:
	  		return true;
	  	default: return false;
	  	}
	  }
	  @Override
	  public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
	  	switch(type){
	  	case ENTITY:
	  	case EQUIPPED:
	  	case EQUIPPED_FIRST_PERSON:
	  		return true;

	  	default: return false;
	  	//return false;
	  	}
	  }
	  @Override
	  public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		{
		    if (type == type.EQUIPPED_FIRST_PERSON)
		    {
		    	GL11.glPushMatrix();
		    	GL11.glRotatef(60.0F, 0, 10, 0);
		    	GL11.glRotated(-40, -0.2, 0.4, 0.3);
			  	GL11.glScaled(3.0f, 5.0f, 3.0f);
			  	GL11.glTranslatef(-0.5F, 0.05F, 0.39F);
				IIcon icon = item.getItem().getIcon(item, 0);
			  	Tessellator tessellator = Tessellator.instance;

			  	ItemRenderer.renderItemIn2D(tessellator, icon.getMaxU(), icon.getMinV(), icon.getMinU(), icon.getMaxV(), icon.getIconWidth(), icon.getIconHeight(), 0.0625F);
		    	GL11.glPopMatrix();
		    }
		    if (type == type.EQUIPPED)
		    {
		    	GL11.glPushMatrix();
		    	GL11.glRotatef(10.0F, 0, 1, 0);
		    	GL11.glRotated(-135, 57, -54, 20.5);
			  	GL11.glScaled(3.0f, 3.0f, 3.0f);
			  	GL11.glTranslatef(-1.0F, -0.6F, 0.04F);
				IIcon icon = item.getItem().getIcon(item, 0);
			  	Tessellator tessellator = Tessellator.instance;

			  	ItemRenderer.renderItemIn2D(tessellator, icon.getMaxU(), icon.getMinV(), icon.getMinU(), icon.getMaxV(), icon.getIconWidth(), icon.getIconHeight(), 0.0625F);
		    	GL11.glPopMatrix();
		    }
		    if (type == type.ENTITY)
		    {
		    	GL11.glPushMatrix();
			  	GL11.glScaled(2.5f, 2.0f, 2.0f);
			  	GL11.glTranslatef(-0.5F, 0.0F, 0.0F);
				IIcon icon = item.getItem().getIcon(item, 0);
			  	Tessellator tessellator = Tessellator.instance;

			  	ItemRenderer.renderItemIn2D(tessellator, icon.getMaxU(), icon.getMinV(), icon.getMinU(), icon.getMaxV(), icon.getIconWidth(), icon.getIconHeight(), 0.0625F);
		    	GL11.glPopMatrix();
		    }
	}
}


}
