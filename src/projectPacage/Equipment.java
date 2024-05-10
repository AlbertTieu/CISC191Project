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
 * Equipment is a type of Item.
 * This class is designed to be an object that the player can
 * equip to grant some benefit.
 */
//Equipment is a Item
// MAY DELETE THIS CLASS
public class Equipment extends Item
{
	// Fields
	// An equipment has an atk stat;
     int atkStat;
    // An equipment has a hp stat;
     int hpStat;
    // Constructors

    public Equipment()
    {
       atkStat = 0;
       hpStat = 0;
    }
    // Constructor to Instantiate an equipment object
	public Equipment(int atkStat, int hpStat) // other parameters from the equipment class)
	{
		atkStat = 0;
	    hpStat = 0;
	}

}
