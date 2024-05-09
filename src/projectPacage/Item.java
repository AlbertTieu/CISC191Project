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
    int atkStat;
   // An Item has a hp stat;
    int hpStat;

	//constructors
	// creates a new item which has a type and a power

	public Item()
	{
		atkStat = 0;
		hpStat = 0;
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
 	*	* retrieves the power of the item
 	**/
 	public int setAtkStat(int newAtk)
 	{
         atkStat = newAtk;
 		return atkStat;
 	}
 	
 	/**
 	*	* sets the power of the item
 	**/
 	public int setHPStat(int newHP)
 	{
 		hpStat = newHP;
 		return hpStat;
 	}
 	
 	 
}
