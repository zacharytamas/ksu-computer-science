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

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void printScores() {
        for (int i = 0; i < this.maxGameCount(); i++) {
            System.out.printf("Game %d\t", i+1);
        }


        for (int i = 0; i < this.numberOfTournaments(); i++) {
            System.out.println();
            for (int j = 0; j < this.numberOfGamesInTournament(i); j++) {
                int[] scores = this.scores[i][j];
                System.out.printf("%s\t\t", this.formatScore(scores));
            }
        }

        System.out.println();
    }

    public void printNumWinnings() {
        for (int i = 0; i < this.numberOfTournaments(); i++) {
            int winnings = 0;
            for (int j = 0; j < this.numberOfGamesInTournament(i); j++) {
                if (didWin(this.scores[i][j])) {
                    winnings += 1;
                }
            }
            System.out.printf("Total winnings for Tournament %d: %d out of %d games\n",
                    i+1, winnings, this.scores[i].length);
        }
    }

    public void printTotalNumGoals() {
        int totalGoals = 0;
        for (int i = 0; i < this.numberOfTournaments(); i++) {
            int goals = 0;
            for (int j = 0; j < this.numberOfGamesInTournament(i); j++) {
                goals += this.scores[i][j][0];
            }
            totalGoals += goals;
            System.out.printf("Team scored %d goals at Tournament %d\n", goals, i + 1);
        }

        System.out.printf("Total goals this season: %d", totalGoals);
    }


    private boolean didWin(int[] scores) {
        return scores[0] > scores[1];
    }

    private int numberOfTournaments() {
        return this.scores.length;
    }

    private int numberOfGamesInTournament(int i) {
        return this.scores[i].length;
    }

    private int maxGameCount() {
        int count = this.scores[0].length;
        for (int i = 0; i < this.scores.length; i++) {
            if (this.scores[i].length > count)
                count = this.scores[i].length;
        }
        return count;
    }

    private String formatScore(int[] scores) {
        return scores[0] + "-" + scores[1];
    }
}
