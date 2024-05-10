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
 * This class is designed to be an object that the player can use to increase their damage
 */
//A Weapon is-an Item
public class Weapon extends Item
{
    // A Weapon has-a attack stat
    int atk;
    
    public Weapon()
    {
    	atk = 0;
    }
    
    /**
    * Constructor to instantiate a Weapon Objject
    */ 
    public Weapon(int newAtk)
    {
       setAtkStat(newAtk);
    }
}
