package projectPacage;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

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
public class Enemy extends Actor
{
	//fields

	// An Enemy has-a image
	private BufferedImage enemyImage;
	
	// for variables such as healthPoints or attackPoints, 
	// i could call the getter method which references the getHealthPoints method from Actor
	// or i could make my own variable
	
	// An enemy has health points 
	// Setting healthPoints to the getHealthPoints method on the current enemy object, which is inherited from Actor, which should thereby access Actor's healthPoints variable
	private int healthPoints = this.getHealthPoints();
	
	// An enemy has attack points
	// Setting attackPoints to the getAttackPoints method on the current enemy object, which is inherited from Actor, which should thereby access Actor's attackPoints variable
	private int attackPoints = this.getAttackPoints();

	
	//constructors
	
	public Enemy() throws IOException 
	{
		super();
		enemyImage = null;
	}
	
	public Enemy(int newHealthPoints, int newAttackPoints) 
	{
		super(newHealthPoints, newAttackPoints);
	}
	
	public Enemy(Enemy newEnemy)
	{
		super(newEnemy);
	}

	 //// Methods ////
	public BufferedImage getEnemyImage()
	{
		return enemyImage;
	}
	
	@Override
	/**
	 * Method to set the health points of an actor
	 * @param newHealthPoints the new health points of an actor
	 */
	public void setHealthPoints(int newHealthPoints)
	{
		healthPoints = newHealthPoints;
	}
	
	@Override
	/**
	 * Method to set the attack points of an actor
	 * @param newAttackPoints the new attack points of an actor
	 */
	public void setAttackPoints(int newAttackPoints)
	{
		attackPoints = newAttackPoints;
	}

}
