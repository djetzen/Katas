package kata.tennis;

public class TennisPlayer {


    private int point=0;

    public boolean hasAdvantage (TennisPlayer otherPlayer) {
        if (this.getScore()==otherPlayer.getScore()+1){
            return this.getScore() >= 3 && otherPlayer.getScore() >= 3;
        }
    return false;}

    public void scorePoint() {
        this.point++;
    }

    public int getScore() {
        return point;
    }
}
