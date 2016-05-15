package com.sara.commands;

import java.util.List;

import com.google.api.services.drive.Drive;
import com.google.api.services.drive.model.File;
import com.google.api.services.drive.model.FileList;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;


public class DriveRead extends CommandBase{

	@Override
	public String getName() {
		return "driveRead";
	}

	@Override
	public String getCommandUsage(ICommandSender sender) {
		return "/driveRead <docName>";
	}

	@Override
	public void execute(ICommandSender sender, String[] args) throws CommandException {

		DriveQuickstart driveQuickStart = new DriveQuickstart();
		  // Build a new authorized API client service.
        Drive service;
		FileList result;
		
		try {
			service = driveQuickStart.getDriveService();
			// Print the names and IDs for up to 10 files.
			result = service.files().list()
		             .setPageSize(1)
		             .setFields("nextPageToken, files(id, name)")
		             .execute();
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
        
		   List<File> files = result.getFiles();
	        if (files == null || files.size() == 0) {
	            System.out.println("No files found.");
	        } else {
	            System.out.println("Files:");
	            for (File file : files) {
	                System.out.printf("%s (%s) (%s)\n", file.getName(), file.getId(), file.getMimeType());
	               // make the files public, ony access public google forms
	                //url of the google 
	                /*
	                if(file.getName().equals(args[0])){
						System.out.println("I ENTERED");
						System.out.println("file type: "+file.getMimeType());
	                	String fileId = file.getId();
	                	 OutputStream outputStream = new ByteArrayOutputStream();
	                	 try {
							service.files().get(fileId)
							 .executeMediaAndDownloadTo(outputStream);
	                		//service.files().export(fileId, "text/csv")
	             	        //.executeMediaAndDownloadTo(outputStream);
							//System.out.println("----------------------------");
		                	System.out.println(file.getName()+" was downloaded");
		                	System.out.println("----------------------------");
						} catch (IOException e) {
							e.printStackTrace();
						}
	                	 

	                } */
	               //
	            }
	        
	        }
		
		
	}

}
