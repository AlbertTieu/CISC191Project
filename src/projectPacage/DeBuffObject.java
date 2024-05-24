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
public class DeBuffObject extends Item
{
	// A Consumable will either, decrease the atk of enemies, decrease the health of enemies, or both
    // Fields

	// A deBuffObject hasBeenUsed
	private boolean hasBeenUsed;
	
    // Constructors

    public DeBuffObject(String newName, String newDescription, int newAttackPoints, int newHealthPoints)  
	{
    	super(newName, newDescription, newAttackPoints, newHealthPoints);
    	hasBeenUsed = false;
  
    }

    // Methods

    public void useOnEnemy(Enemy enemy)
    {
        // the consumable's stats are added to the player's
    	if(hasBeenUsed == false)
    	{
    		enemy.setHealthPoints(getHealthPoints() + enemy.getHealthPoints());
    		enemy.setAttackPoints(getAttackPoints() + enemy.getAttackPoints());
    		hasBeenUsed = true;
    	}
    	
        // we should remove the consumable from the player's inventory after

    }

	}
