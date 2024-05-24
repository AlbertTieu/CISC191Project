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

	int hp;
	int atk;
	private BufferedImage enemyImage;
	
	//constructors
	
	public Enemy() throws IOException 
	{
		hp = 0;
		atk = 0;
		enemyImage = null;
	}
	
	public Enemy(int newHp, int newAtk) 
	{
		hp = newHp;
		atk = newAtk;
	}
	
	public Enemy(Enemy newEnemy)
	{
		hp = newEnemy.getHealthPoints();
		atk = newEnemy.getAttackPoints();
	}

	public BufferedImage getEnemyImage()
	{
		return enemyImage;
	}

}
