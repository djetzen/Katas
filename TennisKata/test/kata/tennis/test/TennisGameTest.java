package kata.tennis.test;


import kata.tennis.TennisGame;
import kata.tennis.TennisPlayer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * You can read more about Tennis scores here which is summarized below:
 *
 * A tennisGame is won by the first player to have won at least four points in total and at least two points more than the opponent.
 * The running score of each tennisGame is described in a manner peculiar to tennis: scores from zero to three points are described as "Love", "Fifteen",
 * "Thirty", and "Forty" respectively.
 * If at least three points have been scored by each player, and the scores are equal, the score is "Deuce".
 * If at least three points have been scored by each side and a player has one more point than his opponent, the score of the tennisGame is
 * "Advantage" for the player in the lead.
 * You need only report the score for the current tennisGame. Sets and Matches are out of scope.
 */
 class TennisGameTest {

    private TennisGame tennisGame;
    private TennisPlayer tennisPlayerOne;
    private TennisPlayer tennisPlayerTwo;

    @BeforeEach
     void setUp(){
        tennisGame =new TennisGame();
        tennisPlayerOne=new TennisPlayer();
        tennisPlayerTwo=new TennisPlayer();
        tennisGame.setPlayerOne(tennisPlayerOne);
        tennisGame.setPlayerTwo(tennisPlayerTwo);
    }

     void scorePointsForPlayer(int numberOfPoints, TennisPlayer player){
        for(int i=0;i<numberOfPoints;i++){
            player.scorePoint();
        }
    }

    @Test
     void scoreAtBeginningIsLoveAll(){
        assertEquals("Love all", tennisGame.getScore());
    }

    @Test
     void checkThatGameHasNoWinnerInBeginning () {
        assertEquals(false, tennisGame.hasWinner());
    }

    @Test
     void playerOneWinsMatch(){
        scorePointsForPlayer(4,tennisPlayerOne);
        assertTrue(tennisGame.hasWinner());
    }
    @Test
     void playerOneDoesNotWinMatch() {
        scorePointsForPlayer(4,tennisPlayerOne);
        scorePointsForPlayer(3,tennisPlayerTwo);

        assertFalse(tennisGame.hasWinner());
    }


    @Test
    void loveThirtyIsReported(){
        scorePointsForPlayer(2,tennisPlayerTwo);
        assertEquals("Love - Thirty",tennisGame.getScore());
    }

    @Test
    void loveThirtyForSecondPlayerReported(){
        scorePointsForPlayer(2, tennisPlayerOne);
        assertEquals("Thirty - Love", tennisGame.getScore());
    }

    @Test
    void fifteenThirtyIsReported(){
        scorePointsForPlayer(1,tennisPlayerOne);
        scorePointsForPlayer(2,tennisPlayerTwo);
        assertEquals("Fifteen - Thirty",tennisGame.getScore());
    }
    @Test
    void deuceIsReported () {
        scorePointsForPlayer(3, tennisPlayerOne);
        scorePointsForPlayer(3, tennisPlayerTwo);
        assertEquals("Deuce", tennisGame.getScore());
    }

    @Test
    void advantageIsGiven(){
        scorePointsForPlayer(6,tennisPlayerTwo);
        scorePointsForPlayer(7,tennisPlayerOne);
        assertEquals("Advantage Player One",tennisGame.getScore());
    }

    @Test
    void gameHasWinner () {
        scorePointsForPlayer(9, tennisPlayerOne);
        scorePointsForPlayer(5, tennisPlayerTwo);
        assertTrue(tennisGame.hasWinner());
    }

}
