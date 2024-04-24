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

	//int dungeonSize;
	Player player;
	Tile[][] tiles;
	
	//constructors
	
	public Dungeon() 
	{
		player = null;
		tiles = generateTiles();
		
		for (Tile[] tileSet : tiles) 
		{
			for (Tile theTile : tileSet)
			{
				System.out.println(theTile.toString());
			}
			
		}
	}
	
	/**
	 * 
	 * @param dungeon	the Dungeon object used to create another Dungeon
	 */
	public Dungeon(Dungeon dungeon) 
	{
		player = dungeon.getPlayer();
		tiles = dungeon.getTiles();
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
	
	public void setTiles(Tile[][] newTiles)
	{
		tiles = newTiles;
	}
	
	//other

	/**
	 * generate a basic set of Dungeon Tiles (10x10)
	 * @return	the set of Tiles
	 */
	public Tile[][] generateTiles() 
	{
		int i = 1;
		Tile[][] generatedTiles = new Tile[10][10];
		for (int row = 0; row < (generatedTiles.length); row++) 
		{
			for (int column = 0; column < (generatedTiles[row].length); column++)
			{
				generatedTiles[row][column] = new Tile();
				System.out.print(i + ":");
				System.out.println(generatedTiles[row][column].toString());
				i++;
			}
			
		}
		return generatedTiles;
	}
	
	/**
	 * generate a set of Dungeon Tiles given a certain number
	 * @param dungeonSize	the size of the dungeon
	 * @return				the set of Tiles
	 */
	public Tile[][] generateTiles(int dungeonSize) 
	{
		Tile[][] generatedTiles = new Tile[dungeonSize][dungeonSize];
		for (Tile[] tileSet : generatedTiles) 
		{
			for (Tile theTile : tileSet)
			{
				theTile = new Tile();
			}
			
		}
		return generatedTiles;
	}
	
	
}
