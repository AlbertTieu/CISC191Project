package packageGUI;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

import projectPacage.Armor;
import projectPacage.Player;
import projectPacage.Treasure;
import projectPacage.Weapon;

public class TreasureGUI extends JFrame
{
	// A TreasureGUI has-a Window Height
	private int WINDOW_WIDTH = 600;
	// A TreasureGUI has-a Window Height
	private int WINDOW_HEIGHT = 600;
	// A TreasureGUI has a Treasure Chest
	private Treasure treasureChest;
	// A TreasureGUI has a piece of armor
	private Armor armor;
	// A TreasureGUI has a weapon
	private Weapon weapon;
	// A TreasureGUI has a message label
	private JLabel messageLabel;
	// A TreasureGUI has a player;
	private Player player;
	
	public TreasureGUI()
	{
		// Sets the title of the window to Dungeon
		setTitle("Dungeon");
		// sets the size of the window to the window width and heigh
	    setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
	    // Set the default close operation
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    // sets messageLabel to a new JLabel describing what the player found
	    messageLabel = new JLabel("You found: " + armor + " and a " + weapon);
	    
	    // adds the messageLabel to the pane
	    add(messageLabel);
	    
	    setVisible(true);
	    
	    // sets treasureChest to a new Treasure object
	    treasureChest = new Treasure();
	    
	    // sets armor to a new armor object with 2 health points
	    armor = new Armor("Armor!", "Gives +2 Health Points", 2);
	    
	    // sets weapon to a new weapon object with 1 attack points
	    weapon = new Weapon("Weapon!", "Gives +1 Attack Point", 1);

	    treasureChest.addToTreasure(armor);
	    
	    treasureChest.addToTreasure(weapon);
	    
	    NewDungeonGUI dungeon = new NewDungeonGUI();
	    
	    player = dungeon.getPlayer();
	    
	    player.equipArmor(armor);
	    
	    player.equipWeapon(weapon);
	 
	    treasureChest.givePlayer(player);
	}
	
	public static void main(String[] args)
	{
		TreasureGUI tg = new TreasureGUI();
	}
}
