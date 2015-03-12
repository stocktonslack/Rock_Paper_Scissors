package Rock.Model;

import javax.swing.JOptionPane;

public class Rock
{

	private String rockString;
	private String enemyString;

	private int enemyAttack;

	private int winCount;
	private int loseCount;
	private int tieCount;

	public Rock()
	{

	}

	public Rock(String rockString, int enemyAttack, int winCount, int loseCount, int tieCount)
	{
		this.rockString = rockString;
		this.enemyAttack = enemyAttack;
		this.winCount = winCount;
		this.loseCount = loseCount;
		this.tieCount = tieCount;

	}

	public Object[] rockChoice()
	{
		String playString = "";
		Object[] options = { "Rock", "Paper", "Scissors", "Quit" };
		int choice = JOptionPane.showOptionDialog(null, "Rock, Paper, or Scissors?", "Choose", 
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[3]);

		if (choice == 0)
		{
			choseRock(playString);
		}
		else if (choice == 1)
		{
			chosePaper(playString);
		}

		else if (choice == 2)
		{
			choseScissors(playString);
		}
		else if (choice == 3)
		{
			
		}
		return options;
	}

	public String randomAttackString(String input)
	{
		String randomAttack = "";
		int enemyAttack = (int) (Math.random() * 3);

		if (enemyAttack == 0)
		{
			randomAttack = "Rock";
		}
		else if (enemyAttack == 1)
		{
			randomAttack = "Paper";
		}
		else if (enemyAttack == 2)
		{
			randomAttack = "Scissors";
		}
		return randomAttack;
	}

	public String choseRock(String userText)
	{
		String winLoseString = "";
		if (randomAttackString(winLoseString).equalsIgnoreCase("rock"))
		{
			JOptionPane.showMessageDialog(null, "Your nemesis chose rock, it is a tie.");
			tieCount++;
			JOptionPane.showMessageDialog(null, "There have been " + getWinCount() + " wins!" 
			+ getTieCount() + " ties." 
					+ " and " + getLoseCount() + " losses. :( ");
			rockChoice();
		}

		else if (randomAttackString(winLoseString).equalsIgnoreCase("paper"))
		{
			JOptionPane.showMessageDialog(null, "Your nemesis chose paper, you lost you sucker!.");
			loseCount++;
			JOptionPane.showMessageDialog(null, "There have been " + getWinCount() + " wins!" 
			+ getTieCount() + " ties." 
			+ " and " + getLoseCount() + " and losses. :(");
			rockChoice();
		}
		else if (randomAttackString(winLoseString).equalsIgnoreCase("scissors"))
		{
			JOptionPane.showMessageDialog(null, "Your nemesis chose scissors, you flipping won! Heck yeah!");
			winCount++;
			JOptionPane.showMessageDialog(null, "There have been " + getWinCount() + " wins!" 
			+ getTieCount() + " ties." 
			+ " and " + getLoseCount() + " and losses. :(");
			rockChoice();
		}

		return winLoseString;

	}

	public String chosePaper(String userText)
	{
		String winLoseString = "";
		if (randomAttackString(winLoseString).equalsIgnoreCase("rock"))
		{
			JOptionPane.showMessageDialog(null, "Your nemesis chose rock, you are such a stud you winner!");
			winCount++;
			JOptionPane.showMessageDialog(null, "There have been " + getWinCount() + " wins!"
					+ getTieCount() + " ties."
					+ " and " + getLoseCount() + " losses. :(");
			rockChoice();
		}

		else if (randomAttackString(winLoseString).equalsIgnoreCase("paper"))
		{
			JOptionPane.showMessageDialog(null, "Your nemesis chose paper, oooooo, how intense it's a tie!");
			tieCount++;
			JOptionPane.showMessageDialog(null, "There have been " + getWinCount() + " wins!" 
					+ getTieCount() + " ties."
					+ getLoseCount() + " losses. :(");
			rockChoice();
		}
		else if (randomAttackString(winLoseString).equalsIgnoreCase("scissors"))
		{
			JOptionPane.showMessageDialog(null, "Your nemesis chose scissors, oh snap, you got dadgum beat!");
			loseCount++;
			JOptionPane.showMessageDialog(null, "There have been " + getWinCount() + " wins!"
					+ getTieCount() + " ties."
					+ " and " + getLoseCount() + " losses. :(");
			rockChoice();
		}

		return winLoseString;

	}

	public String choseScissors(String userText)
	{
		String winLoseString = "";
		if (randomAttackString(winLoseString).equalsIgnoreCase("rock"))
		{
			JOptionPane.showMessageDialog(null, "Your nemesis chose rock, hahahahahahaha!..... Loser.");
			loseCount++;
			JOptionPane.showMessageDialog(null, "There have been " + getWinCount() + " wins!"
					+ getTieCount() + " ties."
					+ " and " + getLoseCount() + " losses. :(");
			rockChoice();
		}

		else if (randomAttackString(winLoseString).equalsIgnoreCase("paper"))
		{
			JOptionPane.showMessageDialog(null, "Your nemesis chose paper, noice! You won!!");
			winCount++;
			JOptionPane.showMessageDialog(null, "There have been " + getWinCount() + " wins!"
					+ getTieCount() + " ties."
					+ getLoseCount() + " losses. :(");
			rockChoice();
		}
		else if (randomAttackString(winLoseString).equalsIgnoreCase("scissors"))
		{
			JOptionPane.showMessageDialog(null, "Your nemesis chose scissors, it's a tie, man you almost lost there!");
			tieCount++;
			JOptionPane.showMessageDialog(null, "There have been " + getWinCount() + " wins!"
					+ getTieCount() + " ties."
					+ " and " + getLoseCount() + " losses. :(");
			rockChoice();
		}

		return winLoseString;

	}
	
	public boolean quit(String quitString)
	{
		String quitString1 = "quit";
		boolean okToQuit = false;

		if (quitString1 != null && quitString1.equals("quit")) {
			okToQuit = true;
		}

		return okToQuit;
	}

	public String getRockString()
	{
		return rockString;
	}

	public String getEnemyString()
	{
		return enemyString;
	}

	public int getEnemyAttack()
	{
		return enemyAttack;
	}

	public int getWinCount()
	{
		return winCount;
	}

	public int getLoseCount()
	{
		return loseCount;
	}

	public int getTieCount()
	{
		return tieCount;
	}

	public void setRockString(String rockString)
	{
		this.rockString = rockString;
	}

	public void setEnemyString(String enemyString)
	{
		this.enemyString = enemyString;
	}

	public void setEnemyAttack(int enemyAttack)
	{
		this.enemyAttack = enemyAttack;
	}

	public void setWinCount(int winCount)
	{
		this.winCount = winCount;
	}

	public void setLoseCount(int loseCount)
	{
		this.loseCount = loseCount;
	}

	public void setTieCount(int tieCount)
	{
		this.tieCount = tieCount;
	}
}
