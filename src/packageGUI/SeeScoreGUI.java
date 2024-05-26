package packageGUI;
import java.awt.*;

import javax.swing.*;
import projectPacage.*;

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
 * Version/date: v.1 5/23/2024
 * 
 * Responsibilities of class:
 * The EndScoreGUI will provide the player a page showing their achievements
 */
// EndScoreGUI is-a JPanel
public class SeeScoreGUI extends JFrame
{
	// What do we need here?
	// we need to create an endscore object so we can run its methods here
	// call on endscore's write to file method
	// a text label that takes endscore.readtextwhatever as a parameter
	// we need window stuff
	
	// An EndScoreGUI has a window width
	private int WINDOW_WIDTH = 300;
	// An EndScoreGUI has a window height
	private int WINDOW_HEIGHT = 300;
	// An EndScore has a score of achievements
	private JLabel achievementsScore;
	
	private SeeScore endScore;
		
	/**
	 * Constructor to instantiate a new EndScoreGUI object
	 */
	public SeeScoreGUI(String endScoreData)
	{
		// create a new end score object
		// set the variable endScore to the above line
		// set the label for achievementsScore to endscore.readfromfile
		// add achievementsScore to the panel
		achievementsScore = new JLabel(endScoreData);
		
		add(achievementsScore);
		// Set this window's title.
		setTitle("Dungeon");
		
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}
