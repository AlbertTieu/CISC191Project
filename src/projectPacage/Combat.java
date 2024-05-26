package projectPacage;

import packageGUI.NewDungeonGUI;

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
 * This class is designed to be a scenario where the player is 
 * engaged in combat with an enemy.
 */

public class Combat
{
	//fields
	// Combat has-a player
	Player player;
	// Combat has-a enemy
	Enemy enemy;
	
	//constructors
	
	public Combat()
	{
		enemy = new Enemy(5,5);
		getPlayer();
	}
	
	public Combat(Player thePlayer, Enemy theEnemy)
	{
		player = thePlayer;
		enemy = theEnemy;
	}
	
	public Combat(Combat newCombat)
	{
		player = newCombat.getPlayer();
		enemy = newCombat.getEnemy();
	}
	
	//methods
	
	//getters
	
	public Player getPlayer()
	{
		NewDungeonGUI newDungeonGUI = new NewDungeonGUI();
		player = newDungeonGUI.getPlayer();
		return player;
	}
	
	public Enemy getEnemy()
	{
		return enemy;
	}
	
	//setters
	
	public void setPlayer(Player newPlayer)
	{
		player = newPlayer;
	}
	
	public void setEnemy(Enemy newEnemy)
	{
		enemy = newEnemy;
	}
	
	//other
	

	public int healthAfterBattle()
	{
		// (enemy's attack - player's attack) + player's hp + armor's hp
		// all of this is set equal to the player's hp
		player.setHealthPoints(enemyAttackAfterBlocked()+player.getHealthPoints()+player.getArmor().getHealthPoints());
		return player.getHealthPoints();
	}
	
	public int enemyAttackAfterBlocked()
	{
		enemy.setAttackPoints(enemy.getAttackPoints()-player.getAttackPoints());
		return enemy.getAttackPoints();
	}

	
}
