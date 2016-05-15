package com.sara.commands;

import com.sara.myMod.ModBlocks;

import net.minecraft.block.BlockBeacon;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class MakeBeacon extends CommandBase{

	@Override
	public String getName() {
		return "makeBeacon";
	}

	@Override
	public String getCommandUsage(ICommandSender sender) {
		return "/makeBeacon";
	}

	@Override
	public void execute(ICommandSender sender, String[] args) throws CommandException {
		int xoffset = 1;
		int i;
		if(sender instanceof EntityPlayer){
			EntityPlayer player = (EntityPlayer) sender;
			World world = player.getEntityWorld();
			double x = player.getLookVec().xCoord;
			double y = player.getLookVec().yCoord;
			double z = player.getLookVec().zCoord;
			
			
			BlockPos startPosition =  new BlockPos(player.posX  + x * 2,  player.posY, player.posZ + z +5);
			world.setBlockState(startPosition, Blocks.gold_block.getDefaultState());
			BlockPos blockpos = startPosition.offset(EnumFacing.EAST, xoffset);
			world.setBlockState(blockpos, Blocks.gold_block.getDefaultState());
			xoffset++;
			blockpos = startPosition.offset(EnumFacing.EAST, xoffset);
			world.setBlockState(blockpos, Blocks.gold_block.getDefaultState());
			
			xoffset=1;
			BlockPos newpos = blockpos.offset(EnumFacing.SOUTH, xoffset);
			world.setBlockState(newpos, Blocks.gold_block.getDefaultState());
			BlockPos ouestpos = newpos.offset(EnumFacing.WEST, xoffset);
			
			world.setBlockState(ouestpos, Blocks.gold_block.getDefaultState());
			BlockPos BeaconPos = new BlockPos(ouestpos.getX(),ouestpos.getY()+1,ouestpos.getZ());
			world.setBlockState(BeaconPos, Blocks.beacon.getDefaultState());
			BlockPos glassPos = new BlockPos(ouestpos.getX(),ouestpos.getY()+2,ouestpos.getZ());
			world.setBlockState(glassPos, Blocks.stained_glass.getDefaultState());
			
			xoffset++;

			ouestpos = newpos.offset(EnumFacing.WEST, xoffset);
			world.setBlockState(ouestpos, Blocks.gold_block.getDefaultState());
			xoffset=1;
			BlockPos thirdPos = ouestpos.offset(EnumFacing.SOUTH, xoffset);
			world.setBlockState(thirdPos, Blocks.gold_block.getDefaultState());
			BlockPos rightPos = thirdPos.offset(EnumFacing.EAST, xoffset);
			world.setBlockState(rightPos, Blocks.gold_block.getDefaultState());
		
			BlockPos lastPos = rightPos.offset(EnumFacing.EAST, xoffset);
			world.setBlockState(lastPos, Blocks.gold_block.getDefaultState());

			
		}

	}
}
