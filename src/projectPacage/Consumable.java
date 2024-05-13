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
//A Consumable is a Item
public class Consumable extends Item
{
	// A Consumable will either, decrease the atk of enemies, decrease the health of enemies, or both
	    // Fields

		// A Consumable has an atk stat;
		private int atkStat;
	    // A Consumable has a hp stat;
		private int hpStat;
	    // A Consumable has a duration
	  
	    
	    // Constructors

	    public Consumable()
	    {
	       atkStat = 0;
	       hpStat = 0;
	    }

	    public Consumable(int atkStat, int hpStat)  
		{
	    	this.atkStat = atkStat;
	    	this.hpStat = hpStat;
	    }

	    // Methods

	    public void Consume(Player player, Consumable consumable)
	    {
	        // the consumable's stats are added to the player's
	        player.setHp(consumable.getHpStat() + player.getHp());
	        player.setAtk(consumable.getAtkStat() + player.getAtk());
	        // we should remove the consumable from the player's inventory after

	    }

	}
