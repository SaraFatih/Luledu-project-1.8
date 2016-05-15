package com.sara.myMod;

import net.minecraft.client.Minecraft;

public class ClientProxySara extends CommonProxySara{

	@Override
	public void registerRendering(){}
	
	
	@Override
	public void openMyGui()
	{
	     Minecraft.getMinecraft().displayGuiScreen(new BookGui());
	}
	
	
	
}
