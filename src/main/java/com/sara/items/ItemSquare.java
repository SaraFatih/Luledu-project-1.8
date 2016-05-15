package com.sara.items;

import com.sara.myMod.MyMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemSquare extends Item {
	
	private static String name = "square";
	private static String[] metaNames = {"green","red"};
	public ItemSquare(){

		GameRegistry.registerItem(this,name);
		setUnlocalizedName(MyMod.MODID + "_" + name);
		setHasSubtypes(true);
		setCreativeTab(CreativeTabs.tabMisc);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack par1ItemStack){
		return super.getUnlocalizedName() + "." + metaNames[par1ItemStack.getItemDamage()];
	}
	
	public String getName(){
		return name;
		
	}
	
	public static String getNameFromDamage(int damage){
		return name + metaNames[damage];
	}
	
	public static void registerVariants(){
		String[] variantNames = new String[metaNames.length];
		for(int i = 0; i < metaNames.length;i++){
			variantNames[i] = MyMod.MODID + ":" + getNameFromDamage(i);
		}
		//ModelBakery.addVariantName(MyMod.square,variantNames);
		
	}
	
	
	
}
