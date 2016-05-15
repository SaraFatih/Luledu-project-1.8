package com.sara.commands;

import com.sara.blocks.BlockBook;
import com.sara.myMod.ModBlocks;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class StartAssignment extends CommandBase{

	@Override
	public String getName() {
		return "startAssignment";
	}

	@Override
	public String getCommandUsage(ICommandSender sender) {
		return "/startAssignment <number>";
	}

	@Override
	public void execute(ICommandSender sender, String[] args) throws CommandException {
		int count=0;
		int i;
		//BlockBook myBook = new BlockBook();
		if(args[0].equals("1")){
			if(sender instanceof EntityPlayer){
				EntityPlayer player = (EntityPlayer) sender;
				World world = player.getEntityWorld();
				//world.getB
				//Blocks.diamond_block
				double x = player.getLookVec().xCoord;
				double y = player.getLookVec().yCoord;
				double z = player.getLookVec().zCoord;
				BlockPos blockpos =  new BlockPos(player.posX  + x * 2 - 2 + count,  player.posY , player.posZ + z + count);
				for(i=0;i<20;i++){
					
					world.setBlockState(blockpos, ModBlocks.myBook.getDefaultState());
					count+=7;
					blockpos =  new BlockPos(player.posX  + x * 2 - 2 + 15*count,  player.posY , player.posZ + z + 15*count);
					

				}
				}
	}

	}
	}
