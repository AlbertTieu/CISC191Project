package packageGUI;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import projectPacage.*;

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
	
	private BufferedImage myPicture;
	
	private JButton[] menuButtons = new JButton[menuButtonNames.length];
	
	private JLabel enemyHpLabel;
	private JLabel playerHpLabel;
	private JLabel picLabel;
	
	private JPanel actionPanel;
	private JPanel statusPanel;
	private JPanel leftPanel;
	private JPanel rightPanel;
	

	private JTextPane combatLog;
	
	private JScrollPane logScroll;
	
	//constructors
	
	/**
	 * Constructor for the MenuGUI
	 * @throws IOException 
	 */
	public CombatGUI(Player p, Enemy e) throws IOException
	{
		player = p;
		enemy = e;
		combatSimulation = new Combat(p,e);
		
//		myPicture = enemy.getEnemyImage();
//		picLabel = new JLabel(new ImageIcon(myPicture));
		
        combatLog = new JTextPane();
        logScroll = new JScrollPane(combatLog);
		
		setTitle("Combat");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLayout(new GridLayout(1,2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        enemyHpLabel = new JLabel("Enemy HP: " + enemy.getHp());
        playerHpLabel = new JLabel("Player HP: " + player.getHp());
        
        statusPanel = new JPanel();
        statusPanel.setLayout(new GridLayout(1,2));
        statusPanel.add(playerHpLabel);
        statusPanel.add(enemyHpLabel);
        
        actionPanel = new JPanel();
        actionPanel.setLayout(new GridLayout(1,3));
        
    	for(int i = 0; i < menuButtonNames.length; i++) 
    	{
    		menuButtons[i] = new JButton(menuButtonNames[i]);
    		actionPanel.add(menuButtons[i]);
    		menuButtons[i].addActionListener(new ButtonListener());
    	}
       
        leftPanel = new JPanel();
        leftPanel.setLayout(new BorderLayout());
        leftPanel.add(actionPanel, BorderLayout.SOUTH);
        leftPanel.add(statusPanel, BorderLayout.NORTH);
        
        rightPanel = new JPanel();
        rightPanel.setLayout(new GridLayout(1,1));
        rightPanel.add(logScroll);
        
        add(leftPanel);
        add(rightPanel);
        
		setVisible(true);
    	
	}
	

	//methods

	//getters
	
//	public Combat getCombatSimulation()
//	{
//		return combatSimulation;
//	}

	//setters
	
//	public void setCombatSimulation(Combat combatSimulation)
//	{
//		this.combatSimulation = combatSimulation;
//	}
	
	//other
	
	/**
	 * main method used to test JUST the Combat GUI.
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		Player testPlayer = new Player();
		Enemy testEnemy = new Enemy();
		CombatGUI test = new CombatGUI(testPlayer, testEnemy);
	}
	
	private class ButtonListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			combatLog.setText(combatLog.getText() + "You attacked enemy for " + combatSimulation.attackEnemy() + "\n");
			enemyHpLabel.setText("Enemy HP: " + enemy.getHp());
			combatLog.setText(combatLog.getText() + "Enemy attacked you for " + combatSimulation.attackPlayer() + "\n");
			playerHpLabel.setText("Player HP: " + player.getHp());
		}
	}
	
}