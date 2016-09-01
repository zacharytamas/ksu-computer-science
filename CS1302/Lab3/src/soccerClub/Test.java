package soccerClub;

/**
 * Created by zacharytamas on 9/1/16.
 */
public class Test {

    public static void main(String[] args) {

        int[][][] scores = {
            {{3,2},{4,1},{2,2},{5,0}},
            {{4,2},{0,3},{3,1},{1,1}},
            {{4,1},{3,3},{4,3},{6,2}},
            {{1,2},{2,3},{0,2},{4,0}},
            {{2,3},{3,1},{1,0},{0,0}}
        };

        SoccerTeam soccerTeam = new SoccerTeam("Team", scores);

        System.out.println();
        soccerTeam.printScores();

        System.out.println();
        soccerTeam.printNumWinnings();

        System.out.println();
        soccerTeam.printTotalNumGoals();

    }

}
