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
public class Equipment 
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
		// An Item has stats
		ArrayList<Integer> equipmentStats = new ArrayList<Integer>();
		equipmentStats.add(atkStat);
		equipmentStats.add(hpStat);
	}
    // Methods

    /**
    * Method to allow a player to put on an equipment object 
    @param newEquipment the equipment the player wants to equip
    **/
    public void Equip(Player player, Equipment newEquipment)
    {   
        // when we equip an item
        // we want to add it to player inventory
        // we want the stats to be added to the player
        // alternatively the player could create an equipment object
        // and then use methods to do the above ^^
        // adds equipment to player's inventory
        // add the hp stat of the equipment to the player's hp
        player.setHp(newEquipment.getHPStat() + player.getHp());
        // add the atk stat of the equipment to the player's atk
        player.setAtk(newEquipment.getAtkStat() + player.getAtk());
    }

    public void Dequip(Player player, Equipment equipment)
    {
        // remove the hp stat of the equipment from the player's hp
        player.setHp(player.getHp() - equipment.getHPStat());
        // remove the atk stat of the equipment from the player's atk
        player.setAtk(player.getAtk() - equipment.getAtkStat());
    }

    /**
    * Method to allow the user to get the atk stat of an equipment 
    **/
    public int getAtkStat()
    {
        return atkStat;
    }
	/** 
	* retrieves the type of the item
	**/
	public int getHPStat()
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
