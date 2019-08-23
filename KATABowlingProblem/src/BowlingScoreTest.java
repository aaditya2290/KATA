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
		score.roll(7);
		assertEquals(7,score.getScore());	
	}
	@Test
	public void test20RollBowlingScore() 
	{
		completeGame(20,3);
		assertEquals(60,score.getScore());	
	
	}
	@Test
	public void test20RollBowlingScoreWithSpare() 
	{
		score.roll(3);
		score.roll(7);
		completeGame(18,2);
		assertEquals(48,score.getScore());
			
	}
	@Test
	public void test20RollBowlingScoreWithStrike() 
	{
		completeGame(18,2);
		score.roll(10);
		score.roll(1);
		score.roll(9);
		assertEquals(56,score.getScore());
			
	}
	
	//automate in case of same score for multiple consecutive rolls
	public void completeGame(int rollCount, int pinsDown)
	{
		for (int i=0; i<rollCount;i++)
		score.roll(pinsDown);	
	}
	
	
}
