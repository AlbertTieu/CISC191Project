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
 * Version/date: v.1 5/10/2024
 * 
 * Responsibilities of class:
 * Equipment is a type of Item.
 * This class is designed to be an object that the player can use to increase their health points
 */
//Armor is-an Item
public class Armor extends Item
{
	
    public Armor(String newName, String newDescription, int newHealthPoints)
    {
    	super(newName, newDescription, 0, newHealthPoints);
    }
    
}
