package main;

import java.util.ArrayList;
import java.util.List;


public class BowlingScore {

	List<Integer> rollScores=new ArrayList<Integer>();
	private int simpleScore;

	public int getScore()
	{
		int score=0;
		int roll=0;


		if (rollScores.size()<2)
			return simpleScore;
		else
		{	   

			for (int frame=0;frame<10;frame++)
			{
				if (isStrike(roll)) 
				{
					score+=10+rollScores.get(roll+1)+rollScores.get(roll+2);
					roll++;  
				}
				else
				{   
					if (isSpare(roll))	    
						score+=10+rollScores.get(roll+2);
					else
						score+=rollScores.get(roll)+rollScores.get(roll+1);

					roll+=2;
				}
			}

			rollScores.clear();
			return score;
		}

	}
	public void roll(int pinsDown)
	{
		simpleScore+=pinsDown;
		rollScores.add(pinsDown);
	}

	public boolean isSpare(int roll)
	{
		return rollScores.get(roll)+rollScores.get(roll+1)==10;
	}
	public boolean isStrike(int roll)
	{
		return rollScores.get(roll)==10;
	}

}
