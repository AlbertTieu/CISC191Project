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
public class Consumable {

    // Fields

	// A Consumable has an atk stat;
     int atkStat;
    // A Consumable has a hp stat;
     int hpStat;
    // A Consumable has a duration
    // mb duration is like the amount of tiles you move
     int duration;
    
    // Constructors

    public Consumable()
    {
       atkStat = 0;
       hpStat = 0;
       duration = 5;
    }

    public Consumable(int atkStat, int hpStat, int duration)  
	{
		// adds consumable stats to an array list
		ArrayList<Integer> consumableStats = new ArrayList<Integer>();
		consumableStats.add(atkStat);
		consumableStats.add(hpStat);
        consumableStats.add(duration);
    }

    // Methods

    public void Consume(Player player, Consumable consumable)
    {
        // the consumable's stats are added to the player's
        player.setHp(consumable.getHpStat() + player.getHp());
        player.setAtk(consumable.getAtkStat() + player.getAtk());
        // we should remove the consumable from the player's inventory after

    }

    /**
    * Method to allow the user to get the atk stat of a consumable 
    **/
    public int getAtkStat()
    {
        return atkStat;
    }
	/** 
	* retrieves the type of the consumable
	**/
	public int getHpStat()
	{
		return hpStat;
	}

	/**
	*	* retrieves the power of the consumable
	**/
	public int setAtkStat(int newAtk)
	{
        atkStat = newAtk;
		return atkStat;
	}
	
	/**
	*	* sets the power of the consumable
	**/
	public int setHPStat(int newHP)
	{
		hpStat = newHP;
		return hpStat;
	}

    public int setDuration(int duration)
    {
        
    }
}
