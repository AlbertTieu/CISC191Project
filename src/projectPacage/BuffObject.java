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
 * Version/date: v.1 4/25/2024
 * 
 * Responsibilities of class:
 * Equipment is a type of Item.
 * This class is designed to be an object that will aid the player
 */
// A BuffObject is a Item
public class BuffObject extends Item
{
	 
	// A BuffObject has-an atk stat;
    int atkStat;
    // A BuffObject has-a hpStat
    int hpStat;
    // A BuffObject has-a duration
    int duration;
    
    // Constructors
    /**
     * Constructor to instantiate a default BuffObject
     */
    public BuffObject()
    {
    	atkStat = 0;
    	hpStat = 0;
    	duration = 5;
    }
    
   /**
    * Constructor to instantiate a buff object with the passed atk and hp stats and duration
    * @param newAtkStat the value of the atkStat for this object
    * @param newHpStat the value of the HpStat for this object
    * @param newDuration the value of the Duration for this object
    */
    public BuffObject(int newAtkStat, int newHpStat, int newDuration)
    {
    	atkStat = 0;
    	hpStat = 0;
    	duration = 5;
    }
    
    // Methods
    
    /**
     * Method to "use" a buff object, aka add the buff to the specified player for a set duration
     * @param buffObject the buff object being applied
     * @param player the player using the object
     */
    public void useBuffOject(Player player, BuffObject buffObject)
    {
    	// we want to have the buff effects applied to the player ONCE while the duration is still greater than 0
    	// we want to decrement the duration
    	// when the duration is less than 0, we want to remove the buff effects
    	if(buffObject.getDuration()>0)
    	{
    		setBuffApplied(player, buffObject, true);
    		// create an instance variable to refer to the SPECIFICALLY the buff Object's duration
    		int buffObjectDuration = buffObject.getDuration();
    		buffObjectDuration--;
    	}
    	else if(buffObject.getDuration() == 0)
    	{
    		setBuffApplied(player, buffObject, false);
    	}
    }
    
    /**
     * Method that, depending if the parameter applied is true or false, will keep the buff object's stats added to the player's stats or if it will remove them
     */
    public void setBuffApplied(Player player, BuffObject buffObject, boolean applied)
    {
    	// set the player HP and Atk before the loop so that the buffs will only be applied once
    	player.setHp(buffObject.getHpStat() + player.getHp());
        player.setAtk(buffObject.getAtkStat() + player.getAtk());
        
    	if(applied == true)
    	{
    		
    	}
    	else if(applied == false)
    	{
    		player.setHp(player.getHp()- buffObject.getHpStat());
            player.setAtk(player.getAtk()- buffObject.getAtkStat());
    	}
    }
    
    /**
     * Method to allow the user to get the duration of a item 
     **/
     public int getDuration()
     {
         return duration;
     }
     
}

