package com.itemis.scorekeeper

import org.junit.Test
import kotlin.test.assertEquals

class ScoreKeeperTest{

    @Test fun testInitialScoreIsZero(){
        assertEquals(0, ScoreKeeper().getScoreTeamA());
    }

    @Test
    fun testInitialScoreForTeamB() {
        assertEquals(0, ScoreKeeper().getScoreTeamB());
    }

    @Test
    fun testTeamAScoresInitialOne(){
        val scoreKeeper=ScoreKeeper()
        scoreKeeper.scoreTeamA1();
        assertEquals(1,scoreKeeper.getScoreTeamA())

    }

    @Test
    fun testTeamBScoresInitialOne(){
        val scoreKeeper=ScoreKeeper()
        scoreKeeper.scoreTeamB1();
        assertEquals(1,scoreKeeper.getScoreTeamB())
    }

    @Test
    fun testTeamAScoresInitialTwo(){
        val scoreKeeper=ScoreKeeper()
        scoreKeeper.scoreTeamA2();
        assertEquals(2,scoreKeeper.getScoreTeamA())
    }

    @Test
    fun printCurrentScore(){
        val scoreKeeper=ScoreKeeper()
        scoreKeeper.scoreTeamA2();
        scoreKeeper.scoreTeamB2();
        scoreKeeper.scoreTeamB3();
        scoreKeeper.scoreTeamA1();
        scoreKeeper.scoreTeamB1();
        scoreKeeper.scoreTeamA3();
        assertEquals("006:006",scoreKeeper.getScore())
    }

}

