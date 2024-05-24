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
	//fields
	
	// Terms:
	// Health Points = hp
	// Attack = atk
	// Can change these terms during Final Submission if that would be easier to read
	
	//A Player has-a HP Level
	private int healthPoints;
	//A Player has-a attack power
	private int attackPoints;
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
		super()
		healthPoints = 10;
		attackPoints = 10;
		name = "Player";
		weapon = new Weapon(null, null, attackPoints);
		armor = new Armor(null, null, attackPoints);
	}

	public Player(Player newPlayer)
	{
		healthPoints = newPlayer.getHealthPoints();
		attackPoints = newPlayer.getAttackPoints();
		name = "Player";
		weapon = new Weapon(null, null, attackPoints);
		armor = new Armor(null, null, attackPoints);
		inventory = newPlayer.getInventory();
	}
	
	//methods
		
	//setters
	
	@Override
	/*
	 * setter for the Player's hp value
	 */
	public void setHealthPoints(int newHealthPoints) 
	{
		healthPoints = newHealthPoints + armor.getHealthPoints();
	}
	
	/*
	 * setter for t he Player's atk value
	 */
	public void setAttackPoints(int newAttackPoints) 
	{
		attackPoints = newAttackPoints + weapon.getHealthPoints();
	}
	
	/**
     * Method to allow the user to set the player's name
     * @param newName the new Name of the player
     **/
     public void setAttackPoints(String newName)
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
		addToInventory(weapon);
		weapon = newWeapon;
    }
	public void equipArmor(Armor newArmor)
	{
		addToInventory(armor);
		armor = newArmor;
	}
}
