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
	// fields ///

	// An Item has-a type
	Item type;

	//constructors
	// creates a new item which has a type and a power

	public Item(Item rip)
	{
		int placeholder;
		int placeholder2;
	}

	//methods
	/**
	* retrieves the type of the item
	**/
	public Item getItemType()
	{
		return type;
	}

	/**
	*	* retrieves the power of the item
	**/
	public String getItemStats()
	{
		return power;
	}
	
	/**
	*	* sets the power of the item
	**/
	public String setItemType(String newType)
	{
		type = newType;
		return type;
	}

	/**
	*Method in case you want to change the stats of the item  (do we need this?)
	*/
	public String setItemStats (String newPower)
	{
		power = newPower;
		return power;
	}
	
	
}
