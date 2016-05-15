package com.sara.commands;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class CommandHealth extends CommandBase {

	private static final String RED = null;
	public int x ;
	@Override
	public String getName() {
		
		return "heal";
	}

	@Override
	public String getCommandUsage(ICommandSender sender) {
		
		return "/heal";
	}

	@Override
	public void execute(ICommandSender sender, String[] args) throws CommandException {
		if(sender instanceof EntityPlayer){
			EntityPlayer player = (EntityPlayer) sender ;
			player.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(200);
			player.setHealth(200);
			
		} else {
			sender.addChatMessage(new ChatComponentText(EnumChatFormatting.RED +"Command not found"));
			
		}
		
	}

	
}
