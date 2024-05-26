package projectPacage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import packageGUI.DungeonGUI;
import packageGUI.NewDungeonGUI;



/**
 * Lead Author(s):
 * @author Albert Tieu
 * @author Sophie Lee
 * <<add additional lead authors here>>
 * 
 * Other contributors:
 * 
 * References:
 * 
 * 
 *  
 * Version/date: v.1 5/10/2024
 * 
 * Responsibilities of class:
 * Use this when the game ends to show the player some of the things they did
 */

public class SeeScore
{
	//An EndScore has-a player
	private Player player;
	
	//An EndScore has an Inventory List
	private ArrayList<Item> inventoryList;

	public SeeScore()
	{
		// Create a new dungeon variable to reference to the newDungeonGUI
		NewDungeonGUI newDungeon = new NewDungeonGUI();
		
		// set player to the player from new dungeon
		player = newDungeon.getPlayer();
		
		// Set inventory list to player's inventory list
		inventoryList = player.getInventory();
		
	}
	
	/**
	 * Method to write the player's information to the file 
	 * @param file file that we want to write to
	 * @throws FileNotFoundException 
	 */
	public void writeEndScoreInfo(String file) throws FileNotFoundException
	{
		// create an output file to later reference the file we'll be printing to
		PrintWriter outputFile = null;
		
		// try to print information to the file
		try
		{
			// set this output file to a new PrintWriter object which takes file as its parameter
			outputFile = new PrintWriter(file);
			
			// print to the file the player's name and the size of their inventory
			outputFile.println("Player:" + player.getName());
		}
		// if the file is not found, throw a new FileNotFoundException with an error message
		catch(FileNotFoundException e)
		{
			throw new FileNotFoundException("Could not find: " + file + " ! ᕕ( ᐛ )ᕗ");
		}
		// if the outputFile is not null, then it will be closed, whether an exception was thrown or not
		finally
		{
			if(outputFile != null)
			{
				outputFile.close();
			}
		}
	}
	/**
	 * Method to read from the file
	 * @param file file that we want to read from
	 * @return info the information from the file
	 * @throws FileNotFoundException
	 */
	public String readEndScoreInfo(String file) throws FileNotFoundException
	{
		// create a file object from the passed file
		File inputFile = new File(file);
		// create a string to hold the info from the file
		String info = "";
		// create a scanner object which we'll use to read from the file
		Scanner scanner = null;
		try
		{
			// Set scanner to a Scanner object that takes input from the inputFile
			scanner = new Scanner(inputFile);
			
			// set info to the data from the input file, via the scanner.next method
			info = scanner.next();
		}
		// In case the file is not found, throw a new FileNotFoundException with an error message
		catch (FileNotFoundException e)
		{
			throw new FileNotFoundException("Could not find: " + file + " ! ᕕ( ᐛ )ᕗ");
		}
		// if the file is not null, close the file regardless of if an exception was thrown or not
		finally
		{
			scanner.close();	
		}
		// returns data from the file
		return info;
	
	}
	

	
}
