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
 * This class is designed to be an object that the player can
 * utilize in order to give them an advantage in combat or other
 * scenarios.
 */
public class Item
{
	// maybe make abstract because we're not creating an itme object
	// fields ///
	// An Item has an atk stat;
	private int attackPoints;
   // An Item has a hp stat;
	private int healthPoints;
	// An Item has a name;
	private String name;
   // An Item has a description;
	private String description;

	//constructors

	public Item(String newName, String newDescription)
	{
		attackPoints = 0;
		healthPoints = 0;
		name = newName;
		description = newDescription;
	}
	
	public Item(String newName, String newDescription, int newAttackPoints, int newHealthPoints)
	{
		attackPoints = newAttackPoints;
		healthPoints = newHealthPoints;
		name = newName;
		description = newDescription;
	}


	//methods
	/**
     * Method to allow the user to get the atk stat of a item 
     **/
     public int getAttackPoints()
     {
         return attackPoints;
     }
 	/** 
 	* retrieves the type of the item
 	**/
 	public int getHealthPoints()
 	{
 		return healthPoints;
 	}

	/**
	* Method to get the name of an item
	*/
	public String getName()
	{
		return name;
	}

	/**
	* Method to get the description of an item
	*/
	public String getDescription()
	{
		return description;
	}

 	
 	/**
 	*	* retrieves the power of the item
 	**/
 	public void setAttackPoints(int newAttackPoints)
 	{
         attackPoints = newAttackPoints;
 	}
 	
 	/**
 	*	* sets the power of the item
 	**/
 	public void setHealthPoints(int newHealthPoints)
 	{
 		healthPoints = newHealthPoints; 
		}

	/**
 	*	Method to set the name of the item
 	**/
 	public void setName(String newName)
 	{
        name = newName;
 	}
 	
 	/**
 	*	Method to set the description of the item
 	**/
 	public void setDescription(String newDescription)
 	{
        description = newDescription;
 	}
 	
 	public String toString()
 	{
 		return name + " , " + description + " , " + attackPoints + " , " + healthPoints;
 	}
 	 
}
