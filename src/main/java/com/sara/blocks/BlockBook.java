package com.sara.blocks;

import com.sara.commands.MakeBeacon;
import com.sara.myMod.MyMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.CommandException;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockBook extends Block {
	String name = "assignBook";

	
	public BlockBook() {
		super(Material.wood);
		GameRegistry.registerBlock(this, name);
		setUnlocalizedName(MyMod.MODID + "_" + name);
		setCreativeTab(CreativeTabs.tabAllSearch);
		setHardness(-1);
		setBlockUnbreakable();
		setResistance(5F);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe",2);
	}
	public String getName(){
		return name;
	}
	
	@Override
	public boolean onBlockActivated(World parWorld, BlockPos parBlockPos, 
	      IBlockState parIBlockState, EntityPlayer parPlayer, EnumFacing parSide, 
	      float hitX, float hitY, float hitZ)
	{
	    if (!parWorld.isRemote)
	    {
	        MyMod.proxy.openMyGui(); 
	       MakeBeacon makeIt = new MakeBeacon();
	        String[] args = null;
	        try {
				makeIt.execute(parPlayer, args);
			} catch (CommandException e) {
				System.out.println("HAVING A PROBLEM");
			}
	    }
	        
	    return true;
	}

}
