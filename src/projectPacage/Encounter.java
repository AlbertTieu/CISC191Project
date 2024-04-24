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
 * This class is designed to be an object within Tile, giving 
 * the player a chance to interact with "encounters" within a 
 * dungeon.
 */
public class Encounter
{
	//fields

	String choice;
	
	//constructors
	
	public Encounter() 
	{
		
	}
	
	//methods
	
	public String getChoice() 
	{
		return choice;
	}
	
	public void setChoice(String theChoice)
	{
		choice = theChoice;
	}
	
}
