package Rock.Controller;

import Rock.Model.Rock;

public class RockAppController
{
	private Rock letsRock;

	public void start()
	{
		String beginString = "";
		System.out.println("Let the rock Paper Scissors begin! Type rock, paper, or " 
				+ "scissors to make your choice and then hit enter and try your luck!");
		sendTextToRock(beginString);
	}

	public String sendTextToRock(String userText)
	{
		String respondText = "";
		
		respondText = letsRock.rockString(respondText);
		
		return respondText;
	}
}
