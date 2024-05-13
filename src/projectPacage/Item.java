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
	// An Item has an atk stat;
	private int atkStat;
   // An Item has a hp stat;
	private int hpStat;
	// An Item has a name;
	private String name;
   // An Item has a description;
	private String description;

	//constructors

	public Item()
	{
		atkStat = 0;
		hpStat = 0;
		name = null;
		description = null;
	}


	//methods
	/**
     * Method to allow the user to get the atk stat of a item 
     **/
     public int getAtkStat()
     {
         return atkStat;
     }
 	/** 
 	* retrieves the type of the item
 	**/
 	public int getHpStat()
 	{
 		return hpStat;
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
 	public void setAtkStat(int newAtk)
 	{
         atkStat = newAtk;
 	}
 	
 	/**
 	*	* sets the power of the item
 	**/
 	public void setHPStat(int newHP)
 	{
 		hpStat = newHP; 
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
 	
 	 
}
