package packageGUI;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

import projectPacage.Combat;

public class NewCombatGUI extends JFrame
{
	// A CombatGUI has a Window width
	private int WINDOW_WIDTH = 300;
	
	// A CombatGUI has a Window height
	private int WINDOW_HEIGHT = 300;
	
	// A CombatGUI has a enemy's Attack Points label
	private JLabel enemyAttackPoints;
	
	// A CombatGUI has a player's health points label
	private JLabel playerHealthPoints;
	
	// A CombatGUI has an armor's protection label
	private JLabel armorProtection;
	
	// A CombatGUI has a weapon's defense label
	private JLabel weaponDefense;
	
	// A CombatGUI has combat
	private Combat combat;
	
	/**
	 * Constructor to instantiate a new CombatGUI object
	 */
	public NewCombatGUI()
	{
		 // set the title to combat
		setTitle("Combat");
		
		// set the size to width and height
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        
        // set default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
		// set combat to a new combat object 
		combat = new Combat();
		
		// Set enemyAttackPoints to a new JLabel that says how much the enemy attacked the player for
		enemyAttackPoints = new JLabel("The enemy attacked you for: " + combat.getEnemy().getAttackPoints() + " points");
		
		// Set weaponDefense to a new JLabel that says the player's attack points and the enemy's attack points after the player blocked their attack
		weaponDefense = new JLabel("Your weapon has: " + combat.getPlayer().getAttackPoints() + " attack points. After blocking the enemy's attack with your weapon, the enemy's attack is now: " + combat.enemyAttackAfterBlocked());
	
		// Set armorProtection to a new JLabel that says how much the player's armor increased their health points by
		armorProtection = new JLabel("Your armor has: " + combat.getPlayer().getArmor().getHealthPoints() + " points");
		
		// Set playerHealthPoints to a new JLabel that says how much the player's current health is
		playerHealthPoints = new JLabel("Your current health is: " + combat.healthAfterBattle() + " points");
		
		// adds to panel
		add(enemyAttackPoints);
		
		// adds to panel
		add(weaponDefense);
		
		// adds to panel
		add(armorProtection);
		
		// adds to panel
		add(playerHealthPoints);
		
	
		setVisible(true);
	}
	

}
