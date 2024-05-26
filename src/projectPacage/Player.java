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
 * This class is designed to be the character that the player
 * controls. It stores all the values of this character.
 */
public class Player extends Actor
{
	
	// A Player has healthPoints
	// Setting healthPoints to the getHealthPoints method on the current player object, which is inherited from Actor, which should thereby access Actor's healthPoints variable
	private int healthPoints = this.getHealthPoints();
	
	//A Player has attack points
	// Setting attackPoints to the getAttackPoints method on the current player object, which is inherited from Actor, which should thereby access Actor's attackPoints variable
	private int attackPoints = this.getAttackPoints();
	//A Player has-a name
	private String name;
	//A Player has-a Weapon
	private Weapon weapon;
	//A Player has-a Armor
	private Armor armor;
	//A Player has-a inventory
	private ArrayList<Item> inventory; 
	
	
	//constructors
	public Player()
	{
		super();
		setHealthPoints(10);
		setAttackPoints(10);
		name = "Player";
		weapon = new Weapon("test", "test", 0);
		armor = new Armor("test", "test", 0);
		inventory = new ArrayList<Item>();
	}
	
	public Player(int newHealthPoints, int newAttackPoints)
	{
		super(newHealthPoints, newAttackPoints);
		name = "Player";
		weapon = new Weapon("test", "test", 0);
		armor = new Armor("test", "test", 0);
		inventory = new ArrayList<Item>();


	}

	
	//methods
		
	//setters
	
	@Override
	/*
	 * setter for the Player's hp value
	 */
	public void setHealthPoints(int newHealthPoints) 
	{
		healthPoints = newHealthPoints; //+ armor.getHealthPoints();
	}
	
	@Override
	/*
	 * setter for the Player's atk value
	 */
	public void setAttackPoints(int newAttackPoints) 
	{
		attackPoints = newAttackPoints; // + weapon.getAttackPoints();
	}
	
	
	/**
     * Method to allow the user to set the player's name
     * @param newName the new Name of the player
     **/
     public void setName(String newName)
     {
         name = newName;
     }
	
	//getters
	
	/**
     * Method to allow the user to get the name of a player
     * @return name
     **/
     public String getName()
     {
         return name;
     }
     
     public Armor getArmor()
     {
    	 return armor;
     }

	
	public ArrayList<Item> getInventory() 
	{
		return inventory;
	}
	
	//other
	
	public void addToInventory(Item item) 
	{
		
		inventory.add(item);
	}
	
	public void equipWeapon(Weapon newWeapon)
    {   
		weapon = newWeapon;
		setAttackPoints(weapon.getAttackPoints() + getAttackPoints());

    }
	public void equipArmor(Armor newArmor)
	{
		armor = newArmor;
		setHealthPoints(armor.getHealthPoints() + getHealthPoints());
	}
}
