import static org.junit.Assert.*;

import org.junit.Test;


public class BowlingScoreTest {

	@Test
	public void testZeroBowlingScore() 
	{
		BowlingScore score=new BowlingScore();
		assertEquals(0,score.getScore());	
	}
	
	@Test
	public void testSingleRollBowlingScore() 
	{
		BowlingScore score=new BowlingScore();
		score.roll(1);
		assertEquals(1,score.getScore());	
	}
	
	
}
