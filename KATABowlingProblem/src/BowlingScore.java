import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;


public class BowlingScore {
	
	List<Integer> rollScores=new ArrayList<Integer>();
	private int simpleScore;
	
    public int getScore()
   {
       int score=0;
       int roll=0;
       
       //to check single roll score in test cases
       if (rollScores.size()<2)
       return simpleScore;
       else
       {	   
       //as each game consists max 10 frames and maximum 2 rolls per frame
       for (int frame=0;frame<10;frame++)
       {
    	   if (isSpare(roll))	  //spare scenario  
    	  score+=10+rollScores.get(roll+2);
    	   else
    	  score+=rollScores.get(roll)+rollScores.get(roll+1);
    	
    	   roll+=2;
       }
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

}
