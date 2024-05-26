package packageGUI;
import projectPacage.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

// A NewDungeonGUI is a JFrame
public class NewDungeonGUI extends JFrame
{
	//// Fields ////
	
	// The DungeonGUI class has its own player
	// Making this variable static so that when other classes try to access it, they will receive the same information about the player and not a new instance of a player
	private static Player player;
	// A DungeonGUI has-a width
	private int width = 4;
	// A DungeonGUI has-a length
	private int length = 4;
	// A DungeonGUI has-a Window Width
	private int WINDOW_WIDTH = 600;
	// A DungeonGUI has-a Window Height
	private int WINDOW_HEIGHT = 600;
	// A DungeonGUI has-a dungeon
	private JButton[][] dungeon;
	
	// A DungeonGUI has a score button
	private JButton score;
	
	// A DungeonGUI has-a score panel
	private JPanel scorePanel;
	
	//// Constructors ////
	
	/**
	 * Constructor to instantiate a new DungeonGUI object
	 */
	public NewDungeonGUI() 
	{
		// set dungeon to a new JButton 2D array with the width and length as its parameters
		dungeon = new JButton[4][4];
		player = new Player(10,10);
		player.setName("player!");
		setLayout(new BorderLayout());
		scorePanel = new JPanel();
		score = new JButton("See score here!");
		score.addActionListener(new SeeScoreButtonListener());
		scorePanel.add(score);
 		add(scorePanel, BorderLayout.EAST);

		for (int row = 0; row < width; row++)
		{
			for (int column = 0; column < length; column++)
			{
				// Sets the title of the window to Dungeon
				setTitle("Dungeon");
				// sets the size of the window to the window width and heigh
		        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		        // Set the Layout of the window to be a grid layout with parameters width and length
		        setLayout(new GridLayout(width, length));
		        // Set the default close operation
		        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        
				// through each iteration of row and column, set the specific row and index in dungeon to a new JButton
				dungeon[row][column] = new JButton();
				
				add(dungeon[row][column]);
	
				dungeon[row][column].addActionListener(new RegularButtonListener());
			}
			
		}
		
		// adds the enemy button listeners to buttons where we want the enemy to be
		dungeon[0][2].addActionListener(new EnemyButtonListener());
		dungeon[1][1].addActionListener(new EnemyButtonListener());
		dungeon[2][3].addActionListener(new EnemyButtonListener());
		dungeon[3][0].addActionListener(new EnemyButtonListener());
		
		// adds the treasure button listeners to buttons where we want the treasure to be
		dungeon[0][3].addActionListener(new TreasureButtonListener());
		dungeon[2][0].addActionListener(new TreasureButtonListener());
		dungeon[3][2].addActionListener(new TreasureButtonListener());
		
		
		// sets the window to be visible
		setVisible(true);
	}
	
	// Method to get the player from any class
	public Player getPlayer()
	{
		return player;
	}
	public static void main(String[] args) 
	{
		NewDungeonGUI ndg = new NewDungeonGUI();
	}
}
