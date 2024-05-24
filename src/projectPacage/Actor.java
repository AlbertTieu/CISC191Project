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
 * Version/date: v.1 5/22/2024
 * 
 * Responsibilities of class:
 * Contains the information of an object that extends the Actor Class
**/
public abstract class Actor
{
	// An Actor has health Points
	private int healthPoints;
	
	// An Actor has attack Points
	private int attackPoints;
	
	/**
	 * Default Constructor for an object that extends Actor
	 */
	public Actor()
	{
		healthPoints = 0;
		attackPoints = 0;
	}
	
	/**
	 * Constructor to instantiate an object that extends Actor
	 * @param newActor 
	 */
	public Actor(Actor newActor)
	{
		healthPoints = newActor.getHealthPoints();
		attackPoints = newActor.getAttackPoints();
	}
	/**
	 * Method to get the health points of an actor
	 * @return health points
	 */
	public int getHealthPoints()
	{
		return healthPoints;
	}
	
	/**
	 * Method to get the attack points of an actor
	 * @return attack points
	 */
	public int getAttackPoints()
	{
		return attackPoints;
	}
	
	/**
	 * Method to set the health points of an actor
	 * @param newHealthPoints the new health points of an actor
	 */
	public void setHealthPoints(int newHealthPoints)
	{
		healthPoints = newHealthPoints;
	}
	
	/**
	 * Method to set the attack points of an actor
	 * @param newAttackPoints the new attack points of an actor
	 */
	public void setAttackPoints(int newAttackPoints)
	{
		attackPoints = newAttackPoints;
	}
}
