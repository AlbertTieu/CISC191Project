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
public class Player 
{
	//fields
	
	//A Player has-a HP Level
	int hp;
	//A Player has-a attack power
	int atk;
	//A Player has-a inventory
	ArrayList<Item> inventory; 
	
	
	//constructors
	public Player()
	{
		hp = 10;
		atk = 10;
	}

	public Player(Player newPlayer)
	{
		hp = newPlayer.getHp();
		atk = newPlayer.getAtk();
		inventory = newPlayer.getInventory();
	}
	
	//methods
		
	//setters
	
	/*
	 * setter for the Player's hp value
	 */
	public void setHp(int newHp) 
	{
		hp = newHp;
	}
	
	/*
	 * setter for the Player's atk value
	 */
	public void setAtk(int newAtk) 
	{
		atk = newAtk;
	}
	
	//getters
	
	/*
	 * getter for the Player's hp value
	 */
	public int getHp() 
	{
		return hp;
	}
	
	/*
	 * getter for the Player's atk value
	 */
	public int getAtk() 
	{
		return atk;
	}
	
	public ArrayList<Item> getInventory() 
	{
		return inventory;
	}
	
	//other
	
	public void addEquipment(Equipment equipment) 
	{
		inventory.add(equipment);
	}
	
	public void addConsumable (Consumable consumable) 
	{
		inventory.add(consumable);
	
	}
	
	public void addBuffObject(BuffObject buffObject) 
	{
		inventory.add(buffObject);
	}
	
}
