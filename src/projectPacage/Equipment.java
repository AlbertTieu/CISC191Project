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
 * Equipment is a type of Item.
 * This class is designed to be an object that the player can
 * equip to grant some benefit.

 // taking a quick break!
 */
public class Equipment extends Item
{
    // Fields
    // Constructors
    public Equipment()
    {
    	//power is already from the Item class
        String power;
        //i dont think we need to declare an Equipment item in the
        //constructor of Equipment
        // o true
        Equipment thing = new Equipment();
        thing.setItemType("Equipment");

    }
    // Methods

    public String setPower(String newPower)
    {
        power = newPower;
        return power;
    }

    public void Equip()
    {

    }
}
