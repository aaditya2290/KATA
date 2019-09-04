package test;
import static org.junit.Assert.*;
import main.BowlingScore;
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
	public void testBowlingScoreWithSpare() 
	{
		score.roll(3);
		score.roll(7);
		completeGame(18,2);
		assertEquals(48,score.getScore());

	}
	@Test
	public void testBowlingScoreWithStrike() 
	{
		completeGame(18,2);
		score.roll(10);
		score.roll(1);
		score.roll(9);
		assertEquals(56,score.getScore());

	}
	@Test
	public void testBowlingScoreAllStrikes() 
	{
		completeGame(10,10);
		score.roll(10);
		score.roll(10);
		assertEquals(300,score.getScore());

	}
	@Test
	public void testBowlingScoreAllSpares() 
	{
		completeGame(20,5);
		score.roll(10);
		assertEquals(155,score.getScore());

		for (int i=0;i<10;i++)
		{
			score.roll(9);
			score.roll(1);	
		}
		score.roll(9);
		assertEquals(190,score.getScore());

	}
	@Test
	public void testBowlingScoreMissSpare() 
	{
		for (int i=0;i<10;i++)
		{
			score.roll(0);
			score.roll(10);	
		}
		score.roll(10);
		assertEquals(110,score.getScore());	

	}
	//automate in case of same score for multiple consecutive rolls
	public void completeGame(int rollCount, int pinsDown)
	{
		for (int i=0; i<rollCount;i++)
			score.roll(pinsDown);	
	}


}
