package com.sara.commands;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;

public class readURL extends CommandBase{

	@Override
	public String getName() {
		return "/readURL";
	}

	@Override
	public String getCommandUsage(ICommandSender sender) {
		return "/readURL<url>";
	}

	@Override
	public void execute(ICommandSender sender, String[] args) throws CommandException {

		try {
			   URL url = new URL("https://docs.google.com/document/d/1lqkIlxzKWEIDPBFcp85ayH3yJVaKGsgZpmBdKtAFx2I/pub");
			   Scanner s = new Scanner(url.openStream());
			   System.out.println("Content READ");
			   // read from your scanner
			}
			catch(IOException ex) {
			   // there was some connection problem, or the file did not exist on the server,
			   // or your URL was not in the right format.
			   // think about what to do now, and put it here.
			   ex.printStackTrace(); // for now, simply output it.
			}
	}

}
