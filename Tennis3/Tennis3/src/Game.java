import java.util.HashMap;
import java.util.Map;
import java.util.Random;

//1. Test Deuce (if both >=3 and same) 4,4 and 2,2
//2. Test advantage (either fulfills test1 and one has 1 point more) 5,4
//3. Test Win (Two points more and atleast 4 points)
//4. Test Win Stops game
//5. game function (random score assignment to player)
//6. test that the score is incremented correctly
//7. test enum mapping

public class Game {
	private Map<String, Integer> valueMap=new HashMap<>();
	private int scoreA;
	private int scoreB;

	public Game(int i, int j) {
		scoreA=i;
		scoreB=j;
	}

	public boolean deuce() {
		return scoreA==scoreB && scoreA>=3;
	}

	public boolean Advantage() {
		return Math.abs(scoreA-scoreB)==1 && scoreA>=3 && scoreB>=3 ;
	}

	public boolean checkWin() {
		return !deuce() && !Advantage() && Math.abs(scoreA-scoreB)>=2;
	}

	public String printScoreA() {
		return ScoreEnum.values()[scoreA].toString();
	}
	public static void main() {
		Random score = new Random();
	}
}

 enum ScoreEnum{
    LOVE(0),
    FIFTEEN(1),
    THIRTY(2),
    FORTY(3);

    private final int value;

    ScoreEnum(final int newValue) {
        value = newValue;
    }

    public int getValue() { return value; }
}