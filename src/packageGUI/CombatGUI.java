package packageGUI;

import projectPacage.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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
 * Version/date: v.1 4/19/2024
 * 
 * Responsibilities of class:
 * The CombatGUI will provide the player an interface to engage in combat
 */

public class CombatGUI extends JFrame
{
	//fields
	
	private int WINDOW_WIDTH = 600;
	private int WINDOW_HEIGHT = 600;
	
	private Player player;
	private Enemy enemy;
	private Combat combatSimulation;
	private String[] menuButtonNames = 
		{
				"Attack",
				"Use Item",
				"Use Skill"
				
		};
	
	private JButton[] menuButtons = new JButton[menuButtonNames.length];
	
	private JPanel actionPanel;

	
	//constructors
	
	/**
	 * Constructor for the MenuGUI
	 */
	public CombatGUI(Player p, Enemy e)
	{
		player = p;
		enemy = e;
		
		setTitle("Combat");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        actionPanel = new JPanel();
        actionPanel.setLayout(new GridLayout(1,3));
        add(actionPanel, BorderLayout.SOUTH);
        
    	for(int i = 0; i < menuButtonNames.length; i++) 
    	{
    		menuButtons[i] = new JButton(menuButtonNames[i]);
    		actionPanel.add(menuButtons[i]);
    	}
        
		setVisible(true);
    	
	}
	

	//methods

	//getters
	
	public Combat getCombatSimulation()
	{
		return combatSimulation;
	}

	//setters
	
	public void setCombatSimulation(Combat combatSimulation)
	{
		this.combatSimulation = combatSimulation;
	}
	
	//other
	
	/**
	 * main method used to test JUST the Combat GUI.
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Player testPlayer = new Player();
		Enemy testEnemy = new Enemy();
		CombatGUI test = new CombatGUI(testPlayer, testEnemy);
	}
	
}