package com.sara.items;

import com.sara.myMod.MyMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemSaraGeneric extends Item{
	private String name;
	
	public ItemSaraGeneric(String itemName){
		name = itemName;
		GameRegistry.registerItem(this,name);
		setUnlocalizedName(MyMod.MODID + "_" + itemName);
		setCreativeTab(CreativeTabs.tabMisc);
	}
	
	public String getName(){
		return name;
		
	}
	
	

}
