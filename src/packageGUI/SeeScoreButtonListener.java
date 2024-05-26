package packageGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import projectPacage.SeeScore;

public class SeeScoreButtonListener implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e)
	{
		
		SeeScore seeScore = new SeeScore();
		
		try
		{
			seeScore.writeEndScoreInfo("score.txt");
		}
		catch (FileNotFoundException e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try
		{
			EndScoreGUI endscore = new EndScoreGUI(seeScore.readEndScoreInfo("score.txt"));
		}
		catch (FileNotFoundException e1)
		{
			e1.printStackTrace();
		}
	}

}
