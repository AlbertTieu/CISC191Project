package packageGUI;

import projectPacage.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Lead Author(s):
 * @author Albert Tieu
 * @author Sophie Lee
 * 
 * Other contributors:
 * 
 * References:
 * 
 * 
 *  
 * Version/date: v.1 4/19/2024
 * 
 * Responsibilities of class:
 * The DungeonGUI will provide the player an interface to explore a Dungeon object	
 * Any actions the player does will modify the Dungeon object
 */

public class DungeonGUI extends JFrame
{
	//fields
	private int WINDOW_WIDTH = 600;
	private int WINDOW_HEIGHT = 600;
	
	Dungeon dungeon = new Dungeon();	//the Dungeon the player will explore
	
	
	//JButtons
	
	JButton[][] tileButtons = new JButton[10][10];
	
	
	//
	
	//constructors
	
	/**
	 * Constructor for the DungeonGUI
	 */
	public DungeonGUI(Dungeon theDungeon)
	{
		dungeon = new Dungeon(theDungeon);
		Tile[][] dungeonTiles = dungeon.getTiles();
		
	
		
		for (int row = 0; row < tileButtons.length; row++)
		{
			for (int column = 0; column < tileButtons.length; column++)
			{
				//the line below is a band-aid fix, until Dungeon.generateTiles() decides to work	
				Tile tile = dungeonTiles[row][column];
				tile = new Tile();
				tileButtons[row][column] = new JButton(tile.toString());
				tileButtons[row][column].addActionListener(new ButtonListener());
			}
		}
		
		setTitle("Dungeon");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLayout(new GridLayout(tileButtons.length,tileButtons.length));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
		for (int row = 0; row < tileButtons.length; row++)
		{
			for (int column = 0; column < tileButtons.length; column++)
			{
				add(tileButtons[row][column]);
			}
		}
        
		setVisible(true);
		
	}
	
	//methods
	
	/**
	 * main method used to test JUST the Dungeon GUI.
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Dungeon d = new Dungeon();
		d.setTiles(d.generateTiles(10));
		DungeonGUI test = new DungeonGUI(d);
	}
	
	//button listeners
	
	/**
	 * update every tile when the player "moves" to an adjacent tile
	 */
	private class ButtonListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			
		}
	}
	
}
