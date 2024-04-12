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
 * This class is designed to be an object that the player can
 * utilize in order to give them an advantage in combat or other
 * scenarios.
 */
public class Item
{
	//fields
	// An item has-a Type
	String type;
	// An item has-a Power
	String power;
	
	//constructors
	// creates a new item which has a type and a power

	public Item()
	{
		type = "";
		power = "";
	}
	

	//methods
	/**
	* retrieves the type of the item
	**/
	public String getItemType()
	{
		return type;
	}

	/**
	*	* retrieves the power of the item
	**/
	public String getItemPower()
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

	public String setItemPower(String newPower)
	{
		power = newPower;
		return power;
	}
	
	
}
