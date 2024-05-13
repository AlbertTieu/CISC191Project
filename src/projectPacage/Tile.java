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
 * This class is designed to be a piece of the dungeon that the
 * player explores. It may contain encounters that the player 
 * will navigate through.
 */
public class Tile
{
	//fields
	
	private Encounter encounter;
	private Player player;
	private boolean explored;
	private boolean playered;
	private int ENCOUNTER_CHANCE = 10;
	
	//constructors
	
	public Tile() 
	{
		explored = false;
		playered = false;
		
		//tiles have a chance to have an encounter
		if ((int) (Math.random() * ENCOUNTER_CHANCE) == 0)
		{
			encounter = new Encounter();
		} else 
		{
			encounter = null;
		}
	}
	
	//methods
	
	public boolean getExploredStatus()
	{
		return explored;
	}
	
	public boolean getPlayeredStatus()
	{
		return playered;
	}
	
	public Encounter getEncounter()
	{
		return encounter;
	}
	
	//setters mutators whatever
	
	public void setEncounter(String encounterName)
	{
		encounter = new Encounter();
	}
	
	/**
	 * Changes the status of whether or not the tile has been "explored"
	 */
	public void changeExploredStatus()
	{
		explored = !explored;
	}
	
	/**
	 * Changed the status of whether or not the player is in the tile
	 */
	public void changePlayeredStatus()
	{
		playered = !playered;
	}
	
	/**
	 * toString describing the tile
	 */
	@Override
	public String toString()
	{
		if (this.getEncounter() != null)
		{
			return "E";
		} else
		{
			return "";
		}
	}
	
}
