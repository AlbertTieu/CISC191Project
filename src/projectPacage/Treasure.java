package projectPacage;

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
public class Treasure extends Encounter
{
	//fields
	// A Treasure has-a item 
    Item item;
	
	//constructors
    
    // a treasure object should have an item in it
	public Treasure()
    {
        // create a new item object
        item = new Item();
    }
	
	//methods 
	
	/**
    * method to keep track of the item gained?
    */
    public Item generateItem()
    {
        return item;
    }
	
    /**
    * method to give the player the item in the treasure chest
    */
    public void givePlayer()
    {
        
    }
}
