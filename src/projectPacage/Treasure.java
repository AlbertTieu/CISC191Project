package projectPacage;

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
 * Version/date: v.1 4/11/2024
 * 
 * Responsibilities of class:
 * a Treasure is-an Encounter
 * This class is designed to be an encounter in which the player 
 * recieves an item.
 */
public class Treasure
{
	//fields
	// A treasure has-a list of treasures
	// Created an ArrayList for the treasure object
	// so that we can store new items in there
	ArrayList<Item> listOfTreasures;
	
	//constructors
    
    // a treasure object should have an item in it
	public Treasure()
    {
		listOfTreasures = new ArrayList<>();
    }
	
	//methods 
	/**
	 * Method to add an Item to a treasure chest
	 */
	public void addToTreasure(Item newItem)
	{
		// treasure adds the desired item into the list
		listOfTreasures.add(newItem);
	}
	
    /**
    * method to give the player the item in the treasure chest
    */
    public void givePlayer(Player person)
    {
    	// trying to use ArrayList's forEach method that for each item in the listOfTreasures, it will add the item
		// to the player's inventory
		listOfTreasures.forEach((item)-> person.addToInventory(item));
    }
}
