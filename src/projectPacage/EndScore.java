package projectPacage;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;



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
 * ex: number of items obtained, how many enemies defeated
 * This class is designed to be an object that the player can use to increase their health points
 */

public class EndScore
{
	//An EndScore has-a player
	private Player player;
	
	//An EndScore has an Inventory List
	private ArrayList<Item> inventoryList;
	
	public EndScore(Player player)
	{
		// contains
		// player name
		// create a Player Parameter to pass in the name of the player we want to get the score from
		//set this player to the passsed player
		this.player = player;
		// how many items in the inventory
		// lets get the inventory from the player
		inventoryList = player.getInventory();
		// can use the array list size method
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
			outputFile.println("Player:" + player.getName() + ", Items gained:" + inventoryList.size());
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
		
	/**
	 * Method to read from the file
	 */
	}
	
	
}
