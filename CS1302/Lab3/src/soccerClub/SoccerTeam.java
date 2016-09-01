package soccerClub;

/**
 * Created by zacharytamas on 9/1/16.
 */
public class SoccerTeam {
    String teamName;
    int[][][] scores;

    public SoccerTeam(String teamName, int[][][] scores) {
        this.teamName = teamName;
        this.scores = scores;
    }
}
