package com.sara.commands;

import com.sara.blocks.BlockCheck;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;

public class printSuccess extends CommandBase{

	@Override
	public String getName() {
		return "/printSucess";
	}

	@Override
	public String getCommandUsage(ICommandSender sender) {
		return "/printSuccess";
	}

	@Override
	public void execute(ICommandSender sender, String[] args) throws CommandException {
		if(sender instanceof EntityPlayer){
			EntityPlayer player = (EntityPlayer) sender;
			if(BlockCheck.answer==true){
				player.addChatMessage(new ChatComponentText("Correct answer! Keep up the good job!!"));
			
			}
			else if(BlockCheck.answer==false)
				player.addChatMessage(new ChatComponentText("wrong answer, try again by placing the check block!"));

	}

	
	
	
	
	
	}
	
}
