package packageGUI;
import javax.swing.*;
import java.awt.*;
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
 * The ShopGUI class is a class where the player can interact with the Shop Window and its components
 */
 //A ShopGUI is-a JFrame
public class ShopGUI extends JFrame
{
	// hello helloo
     // We will use this class to display the shop GUI
    // set the window width to 350
    private final int windowWidth = 350;
    // set the window width to 350
    private final int windowHeight = 350;
    // create a panel for the text portion
    private JPanel textPanel;
    // create a panel for the item buttons
    private JPanel itemPanel;
    // create a welcome label
    private JLabel welcome;
    // create an instructions label
    private JLabel instructions;
    // create a weapon button
    private JButton Weapon;
    // create an armor button
    private JButton Armor;
    // create a consumable button
    private JButton Consumable;
    // create a buff object button
    private JButton BuffObject;

    public ShopGUI()
    {
        // set window size
        setSize(windowWidth, windowHeight);
        // set title of the window
        setTitle("Shop!");
        // default operation when exit button is clicked
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // displays the window
        setVisible(true);
        // Sets up the textPanel
        
        // call on textPanelSetUp to display the items in the textPanel
        textPanelSetUp();

        // call on itemPanelSetUp to display the items in the itemPanel
        itemPanelSetUp();

        // Adds the text panel to the Shop Pane
        add(textPanel);
        // Adds the item panel to the Shop Pane
        add(itemPanel);
    }

    /**
    * Method to set up the textPanel
    */
    public void textPanelSetUp()
    {
        // contains
        // two text boxes
        // creates a welcome label
        welcome = new JLabel("Welcome to the shop!");
        // one for instructions
        instructions = new JLabel("You may pick only 2 items (max) of your choice!");
        // maybe implement a layout for this

    }
    /**
    * Method to set up the itemPanel
    */
    public void itemPanelSetUp()
    {
        // contains 4 item buttons
        // each button will have their own button listener
        // its not the most efficient, but goal for me 
        // is to get everything done first, improve later
        //Weapon = new JButton("Weapon, +10 atk");
        // Add an action listener to the weapon button
        
        //Armor = new JButton("Armor, +10 hp");
        //Consumable = new JButton("Consumable, -10 hp on enemies");
        //BuffObject = new JButton(("Buff Object, +10 hp to yourself"));

        // maybe use combo box here instead, and one purchase button
        
    }


}