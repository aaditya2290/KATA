import java.util.ArrayList;
import java.util.List;


public class BowlingScore {
	
	public int score;
	//List<Integer> rollScores=new ArrayList<Integer>();
    public int getScore()
   {
    	
    	return score;
     /*  int score=0;
       for (Integer r:rollScores)
       score+=r;
       rollScores.clear();
       return score;*/
    	 
   }
   public void roll(int pinsDown)
   {
	   score+=pinsDown;
	 //  rollScores.add(pinsDown);
   }
    

}
