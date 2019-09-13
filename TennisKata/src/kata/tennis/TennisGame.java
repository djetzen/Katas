package kata.tennis;

public class TennisGame {

    private TennisPlayer playerOne = new TennisPlayer();
    private TennisPlayer playerTwo = new TennisPlayer();

    public String getScore() {
        if(playerOne.hasAdvantage(playerTwo)) {
            return "Advantage Player One";
        }
        else if (playerTwo.hasAdvantage(playerOne)) {
            return "Advantage Player Two";
        }
        if(getMessage(playerOne).equals(getMessage(playerTwo))){
            return handleGameTied(playerOne);
        }
        return getMessage(playerOne) + " - " + getMessage(playerTwo);
    }

    private String handleGameTied(TennisPlayer player) {
        if(player.getScore()>=3){
            return "Deuce";
        }
        if(player.getScore()==0) {
            return "Love all";
        }
        return getMessage(playerOne) + " - " + getMessage(playerTwo);}

    public boolean hasWinner() {
        if (this.playerTwo.getScore() == 3 && this.playerOne.getScore() == 4) {
            return false;
        }
        int difference=playerOne.getScore()-playerTwo.getScore();
        int absoluteDifference=Math.abs(difference);
        return absoluteDifference>=2;
    }

    public void setPlayerOne(TennisPlayer tennisPlayerOne) {
        this.playerOne = tennisPlayerOne;
    }

    public void setPlayerTwo(TennisPlayer tennisPlayerTwo) {
        this.playerTwo = tennisPlayerTwo;
    }

    private String getMessage(TennisPlayer player) {
        switch (player.getScore()) {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            case 3:
                return "Forty";
            default: return Integer.toString(player.getScore());
        }
    }

}
