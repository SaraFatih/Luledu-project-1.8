package com.sara.commands;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;

public class SudokuReadFromFile extends CommandBase{
	
	public static int counter;
	
	public int getCounter(){
		return counter;
	}
	
	@Override
	public String getName() {
		return "readSudokuFile";
	}

	@Override
	public String getCommandUsage(ICommandSender sender) {
		return "/readSudokuFile <fileName>";
	}

	@Override
	public void execute(ICommandSender sender, String[] args) throws CommandException {
		counter=0;
		String csvFile = "/Users/home/Downloads/forge-latest/src/main/resources/assets/sara_mymod/SudokuFiles/" + args[0] +".csv";
		BufferedReader br = null;
		String line = "";
		String csvSplitBy = ",";

		try {

			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
				int s;
				int a;
				String[] questions = line.split(csvSplitBy);
				for(s=1;s<questions.length;s++){

				String[] questionArray = new String[100];
				
				for(a=0;a<questions[s].length();a++){
					
					char c = questions[s].charAt(a);
					if (c != ' ') {
						questionArray[a]= String.valueOf(c);
					}
				}
				
				SudokuShowBlocks mine = new SudokuShowBlocks();
				mine.execute(sender, questionArray);
				counter++;
			}
	
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		System.out.println("Done");

	}

}
