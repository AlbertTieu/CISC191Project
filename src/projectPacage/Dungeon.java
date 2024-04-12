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
 * This class is designed to be a space where the player can 
 * explore.
 */
public class Dungeon
{
	//fields

	Player player;
	Tile[][] tiles;
	
	//constructors
	
	public Dungeon() 
	{
		player = null;
	}
	
	//methods
	
	//getters
	
	public Tile[][] getTiles() 
	{
		return tiles;
	}
	
	public Tile getTile(int row, int column) 
	{
		return tiles[row][column];
	}
	
	public Player getPlayer()
	{
		return player;
	}
	
	//setters
	
	public void setPlayer(Player newPlayer) 
	{
		player = newPlayer;
	}
	
	//other

	public Tile[][] generateTiles() 
	{
		Tile[][] generatedTiles = new Tile[10][10];
		return generatedTiles;
	}
	
	
}
