//1. Test Deuce (if both >=3 and same) 4,4 and 2,2
//2. Test advantage (either fulfills test1 and one has 1 point more) 5,4
//3. Test Win (Two points more and atleast 4 points)
//4. Test Win Stops game
//5. game function (random score assignment to player)
//6. test that the score is incremented correctly
//7. test enum mapping
import org.junit.Test;
import static org.junit.Assert.*;
public class TennisTest {	
	
	@Test
	public void testDeucePass() throws Exception {
		Game game=new Game(4,4);
		assertEquals(true,game.deuce());
	}
	@Test
	public void testDeuceFail() throws Exception {
		Game game=new Game(2,2);
		assertEquals(false,game.deuce());
	}
	@Test
	public void testAdvantagePass() throws Exception {
		Game game=new Game(5,4);
		assertEquals(true,game.Advantage());
	}
	@Test
	public void testAdvantageFail() throws Exception {
		Game game=new Game(3,2);
		assertEquals(false,game.Advantage());
	}
	@Test
	public void testWinScenario() throws Exception {
		Game game=new Game(4,2);
		assertEquals(true,game.checkWin());
	}
	@Test
	public void testWinNotWorking() throws Exception {
		Game game=new Game(2,0);
		assertEquals(false,game.Advantage());
	}
	
	@Test
	public void testZero() throws Exception{
		Game game = new Game(0,0);
		assertEquals("LOVE",game.printScoreA());
	}
	@Test
	public void testOne() throws Exception{
		Game game = new Game(1,1);
		assertEquals("FIFTEEN",game.printScoreA());
		
	}
	@Test
	public void testTwo() throws Exception {
		Game game = new Game(2,2);
		assertEquals("THIRTY",game.printScoreA());
		
	}
	@Test
	public void testThree() throws Exception {
		Game game = new Game(3,3);
		assertEquals("FORTY",game.printScoreA());
	}
}
