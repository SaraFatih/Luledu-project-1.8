package com.sara.commands;

import java.awt.Button;
import java.util.ArrayList;
import java.util.List;

import scala.tools.cmd.CommandLineParser;

import com.sara.myMod.ModBlocks;
import com.sara.myMod.MyMod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockButton;
import net.minecraft.block.BlockButtonStone;
import net.minecraft.block.BlockLever;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandBlockData;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class ShowBlocks extends CommandBase{
	

	public static boolean blackLine;
	@Override
	public String getName() {
		return "show";
	}

	@Override
	public String getCommandUsage(ICommandSender sender) {
		return "/show <number>";
	}

	@Override
	public void execute(ICommandSender sender, String[] args) throws CommandException {
		ReadFromFile read = new ReadFromFile();
		int counter = read.getCounter();
		if(sender instanceof EntityPlayer){
			EntityPlayer player = (EntityPlayer) sender;
			World world = player.getEntityWorld();
			double x = player.getLookVec().xCoord;
			double y = player.getLookVec().yCoord;
			double z = player.getLookVec().zCoord;
			if(args.length ==0){
				sender.addChatMessage(new ChatComponentText("Invalid arguments"));
			}
			else{
				BlockPos startPosition =  new BlockPos(player.posX  + x * 2 - 2,  player.posY  /*+  player.getEyeHeight() + y*2 */ + counter, player.posZ + z/* * 2*/ );
				
				//if(blackLine==true){
					//BlockPos blackPosition =  new BlockPos(player.posX  + x * 2 - 2,  player.posY  /*+  player.getEyeHeight() + y*2 */ + counter, player.posZ + z/* * 2*/ );
					//world.setBlockState(blackPosition, ModBlocks.black.getDefaultState());
				//	blackLine=false;
				//}
			
				//else {
				int i, xOffset = 1;
				
				for(i=0;i<args.length;i++){
					BlockPos blockpos = startPosition.offset(EnumFacing.EAST, xOffset);
					System.out.println(args[i]);
					if(!(args[i]==null)){
						xOffset++;
					
						if(args[i].equals("0")){
							world.setBlockState(blockpos, ModBlocks.zero.getDefaultState());
							sender.addChatMessage(new ChatComponentText("Block 0 added to your game"));
						}
							
						else if (args[i].equals("1")){
					
							world.setBlockState(blockpos, ModBlocks.one.getDefaultState());
							sender.addChatMessage(new ChatComponentText("Block 1 added to your game"));
						}
						else if(args[i].equals("2")){
						
							world.setBlockState(blockpos, ModBlocks.two.getDefaultState());
							sender.addChatMessage(new ChatComponentText("Block 2 added to your game"));
						}
						else if(args[i].equals("3")){	
							world.setBlockState(blockpos, ModBlocks.three.getDefaultState());
							sender.addChatMessage(new ChatComponentText("Block 3 added to your game"));
						}
						else if(args[i].equals("4")){	
						
							world.setBlockState(blockpos, ModBlocks.four.getDefaultState());
							sender.addChatMessage(new ChatComponentText("Block 4 added to your game"));
						}	
						else if(args[i].equals("5")){
						
							world.setBlockState(blockpos, ModBlocks.five.getDefaultState());
							sender.addChatMessage(new ChatComponentText("Block 5 added to your game"));
						}
						else if(args[i].equals("6")){
						
							world.setBlockState(blockpos, ModBlocks.six.getDefaultState());
							sender.addChatMessage(new ChatComponentText("Block 6 added to your game"));
						}
						else if(args[i].equals("7")){
						
							world.setBlockState(blockpos, ModBlocks.seven.getDefaultState());
							sender.addChatMessage(new ChatComponentText("Block 7 added to your game"));
						}	
						else if(args[i].equals("8")){
						
							world.setBlockState(blockpos, ModBlocks.eight.getDefaultState());
							sender.addChatMessage(new ChatComponentText("Block 8 added to your game"));
						}
						else if(args[i].equals("9")){
					
							world.setBlockState(blockpos, ModBlocks.nine.getDefaultState());
							sender.addChatMessage(new ChatComponentText("Block 9 added to your game"));
						}
						else if(args[i].equals("+")){	
						
							world.setBlockState(blockpos, ModBlocks.plus.getDefaultState());
							sender.addChatMessage(new ChatComponentText("Block + added to your game"));
						}
						
						else if(args[i].equals("-")){
							world.setBlockState(blockpos, ModBlocks.minus.getDefaultState());
							sender.addChatMessage(new ChatComponentText("Block - added to your game"));
						}
						else if(args[i].equals("*")){
					
							world.setBlockState(blockpos, ModBlocks.multi.getDefaultState());
							sender.addChatMessage(new ChatComponentText("Block x added to your game"));
						}
						else if(args[i].equals("/")){
						
							world.setBlockState(blockpos, ModBlocks.divide.getDefaultState());
							sender.addChatMessage(new ChatComponentText("Block / added to your game"));
						}
						else if(args[i].equals("=")){
					
							world.setBlockState(blockpos, ModBlocks.equal.getDefaultState());
							sender.addChatMessage(new ChatComponentText("Block = added to your game"));
						}
						else if(args[i].equals("?")){
					
							world.setBlockState(blockpos, ModBlocks.questionMark.getDefaultState());
							sender.addChatMessage(new ChatComponentText("Block ? added to your game"));
						}
						else	
							xOffset--;	
					
					}
					
					if (xOffset > 1) {
						world.setBlockState(startPosition, ModBlocks.check.getDefaultState());
						
						//IBlockState leverState = Blocks.lever.getDefaultState().withProperty(BlockLever.FACING, BlockLever.EnumOrientation.SOUTH); 
						//world.setBlockState(startPosition.offset(EnumFacing.SOUTH), leverState);
					
						//IBlockState standingSignState = Blocks.standing_sign.getDefaultState().withProperty(BlockLever.FACING, BlockLever.EnumOrientation.SOUTH); 
						//world.setBlockState(startPosition.offset(EnumFacing.SOUTH), standingSignState);
						//IBlockState standingSignState = Blocks.standing_sign.getDefaultState().withProperty(property, value)
						//world.setBlockState(startPosition, standingSignState);
						
						

						
					}
					//blackLine=true;
				}
				
			}
				//here
				
		}
			
	}
		
		
	}






//}
