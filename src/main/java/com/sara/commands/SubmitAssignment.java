package com.sara.commands;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;

public class SubmitAssignment extends CommandBase{

	@Override
	public String getName() {
		return "submit";
	}

	@Override
	public String getCommandUsage(ICommandSender sender) {
		return "/submit";
	}

	@Override
	public void execute(ICommandSender sender, String[] args) throws CommandException {
		
	}

}
