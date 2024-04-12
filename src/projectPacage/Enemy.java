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
 * This class is designed to be an enemy for the player to fight
 * in combat scenarios.
 */
public class Enemy
{
	//fields

	int hp;
	int atk;
	
	//constructors
	
	public Enemy() 
	{
		hp = 0;
		atk = 0;
	}
	
	public Enemy(int newHp, int newAtk) 
	{
		hp = newHp;
		atk = newAtk;
	}
	
	public Enemy(Enemy newEnemy)
	{
		hp = newEnemy.getHp();
		atk = newEnemy.getAtk();
	}
	
	//methods
	
	//setters
	
	/*
	 * setter for the Enemy hp value
	 */
	public void setHp(int newHp) 
	{
		hp = newHp;
	}
	
	/*
	 * setter for the Enemy atk value
	 */
	public void setAtk(int newAtk) 
	{
		atk = newAtk;
	}
	
	//getters
	
	/*
	 * getter for the Enemy hp value
	 */
	public int getHp() 
	{
		return hp;
	}
	
	/*
	 * getter for the Enemy atk value
	 */
	public int getAtk() 
	{
		return atk;
	}
		
	//other
	
}
