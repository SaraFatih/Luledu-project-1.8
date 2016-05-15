package com.sara.commands;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;

public class URLtest extends CommandBase{

	@Override
	public String getName() {
		return "getURL";
	}

	@Override
	public String getCommandUsage(ICommandSender sender) {
		return "/getURL";
	}

	@Override
	public void execute(ICommandSender sender, String[] args) throws CommandException {
		FileOutputStream outStream = null;
		try {
			outStream = new FileOutputStream("unique_file_to_find_on_the_server.csv"); 
			//take the date and parse it, pass it as a binary object
			outStream.write("whatever".getBytes());
		 } catch (IOException e) {  
		    e.printStackTrace();  
		 } finally { 
			try {
				outStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			 		 
		}
	}

}
