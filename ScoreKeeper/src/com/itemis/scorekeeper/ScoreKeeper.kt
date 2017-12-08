package com.itemis.scorekeeper

class ScoreKeeper{

    private var scoreTeamA1 = 0
    private var scoreTeamB1 = 0

    private var scoreTest=0

    fun setScoreTest(t:Int){
        scoreTest=t
    }

    fun getScoreTeamA(): Int {
       return scoreTeamA1
    }

    fun getScoreTeamB(): Int {
        return scoreTeamB1
    }

    fun scoreTeamA1() {
        score('A',1)
    }

    fun scoreTeamA2() {
        score('A',2)
    }
    
    fun scoreTeamA3() {
        score('A',3)
    }

    fun scoreTeamB1() {
        score('B',1)
    }


    fun scoreTeamB2() {
        score('B',2)
    }

    fun scoreTeamB3() {
        score('B',3)
    }


    private fun score(Team: Char, points: Int){
        if (Team == 'A'){
            scoreTeamA1 += points
        } else {
            scoreTeamB1 += points
        }
    }

    fun getScore(): String  {
        return String.format("%03d",getScoreTeamA())+":"+String.format("%03d",getScoreTeamB())
    }

    fun getTest(list: ArrayList<Int>){
        list.forEach{println(it)}
    }
    fun printScoreKeeper(scoreKeeper: ScoreKeeper?){
        println("called")
    }

    fun test(){
        printScoreKeeper(null)
    }

}

