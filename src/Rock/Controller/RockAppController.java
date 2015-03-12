package Rock.Controller;

import javax.swing.JOptionPane;

import Rock.Model.Rock;

public class RockAppController
{
	private Rock letsRock;
	
	public RockAppController()
	{
		letsRock = new Rock();
	}

	public void start()
	{

		JOptionPane.showMessageDialog(null, "Let the rock Paper Scissors begin!");
		sendTextToRock(letsRock);

	}


	public void sendTextToRock(Rock myRock)
	{

		letsRock.rockChoice();

		
	}
	
	private void quit()
	{
		System.exit(0);
	}
}
