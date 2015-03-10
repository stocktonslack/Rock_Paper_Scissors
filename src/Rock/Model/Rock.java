package Rock.Model;

import java.lang.reflect.Array;
import java.util.ArrayList;

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
		rockString = "";
		enemyAttack = 0;
		winCount = 0;
		loseCount = 0;
		tieCount = 0;
		
	}


	public String rockString(String userText)
	{
		String playString = "";
		if (userText != null && userText.length() > 0)
		{
			if (userText.equalsIgnoreCase("rock"))
			{
				choseRock(playString);
			}
			else if (userText.equalsIgnoreCase("paper"))
			{
				chosePaper(playString);
			}
			
			else if (userText.equalsIgnoreCase("scissors"))
			{
				choseScissors(playString);
			}
			
			else
			{
				System.out.println("I know you understand english, this isn't that complex. "
						+ "Your choices are, Rock, Paper, or Scissors!");
			}
		}
		return playString;
	}
	
	public String randomAttackString(String input)
	{
		String randomAttack = "";
		int enemyAttack = (int) (Math.random()* 3);
		
		if(enemyAttack == 0)
		{
			randomAttack = "Rock";
		}
		else if(enemyAttack == 1)
		{
			randomAttack = "Paper";
		}
		else if(enemyAttack == 2)
		{
			randomAttack = "Scissors";
		}
		return randomAttack;
	}
	
	public String choseRock(String userText)
	{
		 String winLoseString= "";
		 if(randomAttackString(winLoseString).equalsIgnoreCase("rock"))
			{
				System.out.println("Your nemesis chose rock, it is a tie.");
				tieCount ++;
				System.out.println("There have been " + getWinCount() + " wins!");
				System.out.println("There have been " + getTieCount() + " ties.");
				System.out.println("There have been " + getLoseCount() + " losses. :(");
			}
			
			else if(randomAttackString(winLoseString).equalsIgnoreCase("paper"))
			{
				System.out.println("Your nemesis chose paper, you lost you sucker!.");
				loseCount ++;
				System.out.println("There have been " + getWinCount() + " wins!");
				System.out.println("There have been " + getTieCount() + " ties.");
				System.out.println("There have been " + getLoseCount() + " losses. :(");
			}
			else if(randomAttackString(winLoseString).equalsIgnoreCase("scissors"))
			{
				System.out.println("Your nemesis chose scissors, you flipping won! Heck yeah!");
				winCount ++;
				System.out.println("There have been " + getWinCount() + " wins!");
				System.out.println("There have been " + getTieCount() + " ties.");
				System.out.println("There have been " + getLoseCount() + " losses. :(");
			}
		
		return winLoseString;
		
	}
	
	public String chosePaper(String userText)
	{
		 String winLoseString= "";
		 if(randomAttackString(winLoseString).equalsIgnoreCase("rock"))
			{
				System.out.println("Your nemesis chose rock, you are such a stud you winner!");
				winCount ++;
				System.out.println("There have been " + getWinCount() + " wins!");
				System.out.println("There have been " + getTieCount() + " ties.");
				System.out.println("There have been " + getLoseCount() + " losses. :(");
			}
			
			else if(randomAttackString(winLoseString).equalsIgnoreCase("paper"))
			{
				System.out.println("Your nemesis chose paper, oooooo, how intense it's a tie!");
				tieCount ++;
				System.out.println("There have been " + getWinCount() + " wins!");
				System.out.println("There have been " + getTieCount() + " ties.");
				System.out.println("There have been " + getLoseCount() + " losses. :(");
			}
			else if(randomAttackString(winLoseString).equalsIgnoreCase("scissors"))
			{
				System.out.println("Your nemesis chose scissors, oh snap, you got dadgum beat!");
				loseCount ++;
				System.out.println("There have been " + getWinCount() + " wins!");
				System.out.println("There have been " + getTieCount() + " ties.");
				System.out.println("There have been " + getLoseCount() + " losses. :(");
			}
		
		return winLoseString;
		
	}
	
	public String choseScissors(String userText)
	{
		 String winLoseString= "";
		 if(randomAttackString(winLoseString).equalsIgnoreCase("rock"))
			{
				System.out.println("Your nemesis chose rock, hahahahahahaha!..... Loser.");
				loseCount ++;
				System.out.println("There have been " + getWinCount() + " wins!");
				System.out.println("There have been " + getTieCount() + " ties.");
				System.out.println("There have been " + getLoseCount() + " losses. :(");
			}
			
			else if(randomAttackString(winLoseString).equalsIgnoreCase("paper"))
			{
				System.out.println("Your nemesis chose paper, noice! You won!!");
				winCount ++;
				System.out.println("There have been " + getWinCount() + " wins!");
				System.out.println("There have been " + getTieCount() + " ties.");
				System.out.println("There have been " + getLoseCount() + " losses. :(");
			}
			else if(randomAttackString(winLoseString).equalsIgnoreCase("scissors"))
			{
				System.out.println("Your nemesis chose scissors, it's a tie, man you almost lost there!");
				tieCount ++;
				System.out.println("There have been " + getWinCount() + " wins!");
				System.out.println("There have been " + getTieCount() + " ties.");
				System.out.println("There have been " + getLoseCount() + " losses. :(");
			}
		
		return winLoseString;
		
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
