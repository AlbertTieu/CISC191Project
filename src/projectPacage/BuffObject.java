package projectPacage;

/**
 * Lead Author(s):
 * 
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
 *         Version/date: v.1 4/25/2024
 * 
 *         Responsibilities of class:
 *         Equipment is a type of Item.
 *         This class is designed to be an object that will aid the player
 */
// A BuffObject is a Item
public class BuffObject extends Item
{

	// A BuffObject hasBeenUsed
	private boolean hasBeenUsed;

	// Constructors
	/**
	 * Constructor to instantiate a default BuffObject
	 */
	public BuffObject(String newName, String newDescription,
			int newAttackPoints, int newHealthPoints)
	{
		super(newName, newDescription, newAttackPoints,
				newHealthPoints);
		hasBeenUsed = false;

	}

	// Methods

	/**
	 * Method to "use" a buff object, aka add the buff to the specified player
	 * for a set duration
	 * 
	 * @param buffObject the buff object being applied
	 * @param player     the player using the object
	 */
	public void useOnPlayer(Player player)
	{
		// we want to have the buff effects applied to the player ONCE while the
		// duration is still greater than 0
		// we want to decrement the duration
		// when the duration is less than 0, we want to remove the buff effects
		if (hasBeenUsed == false)
		{
			player.setHealthPoints(getHealthPoints() + player.getHealthPoints());
			player.setAttackPoints(getAttackPoints() + player.getAttackPoints());
			// create an instance variable to refer to the SPECIFICALLY the buff
			// Object's duration
			hasBeenUsed = true;
		}
	}

}
