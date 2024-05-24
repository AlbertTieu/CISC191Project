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
	
	
	public void skills() 
	{
		
	}
	
	public void item() 
	{
		
	}
	
	public void use() 
	{
		
	}
	
	/**
	 * method for when enemy is attacked
	 */
	public int attackEnemy()
	{
		int damageDealt = player.getAttackPoints();
		enemy.setHealthPoints(enemy.getHealthPoints() - damageDealt);
		return damageDealt;
	}

	/**
	 * method for when player is attacked
	 */
	public int attackPlayer() 
	{
		int damageDealt = enemy.getAttackPoints();
		player.setHealthPoints(player.getHealthPoints() - damageDealt);
		return damageDealt;
	}
	
}
