package packageGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import projectPacage.Enemy;



public class EnemyButtonListener implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e)
	{
		//NewDungeonGUI test = new NewDungeonGUI();
		// when the button is clicked on, create a new enemy object
		Enemy enemy = new Enemy(5,5);
		// when the button is clicked on, create a new CombatGUI object
		
			NewCombatGUI combat = new NewCombatGUI();
	}
	
	
}
