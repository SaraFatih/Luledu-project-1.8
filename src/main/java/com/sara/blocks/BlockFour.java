package com.sara.blocks;

import com.sara.myMod.MyMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockFour extends Block {
	String name = "four";
	public BlockFour() {
		super(Material.rock);
		GameRegistry.registerBlock(this, name);
		setUnlocalizedName(MyMod.MODID + "_" + name);
		setCreativeTab(CreativeTabs.tabAllSearch);
		setHardness(2F);
		setResistance(5F);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe",2);
	}
	
	public String getName(){
		return name;
	}
	

}
