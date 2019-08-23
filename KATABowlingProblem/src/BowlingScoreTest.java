import static org.junit.Assert.*;

import org.junit.Test;


public class BowlingScoreTest {
	
	BowlingScore score;
	
	public BowlingScoreTest()
	{
	 score=new BowlingScore();
	}

	@Test
	public void testZeroBowlingScore() 
	{
		
		assertEquals(0,score.getScore());	
	}
	
	@Test
	public void testSingleRollBowlingScore() 
	{
		score.roll(1);
		assertEquals(1,score.getScore());	
	}
	@Test
	public void test20RollBowlingScore() 
	{
		completeGame(20,1);
		assertEquals(20,score.getScore());	
	}
	
	//automate in case of same score for multiple consecutive rolls
	public void completeGame(int rollCount, int pinsDown)
	{
		for (int i=0; i<rollCount;i++)
		score.roll(pinsDown);	
	}
	
	
}
