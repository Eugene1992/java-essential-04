package hw_1;

public class Match {
    private String firstTeam;
    private String secondTeam;
    private int goalFirstTeam;
    private int goalSecondTeam;

    public Match() {
    }

    public Match(String firstTeam, String secondTeam, int goalFirstTeam, int goalSecondTeam) {
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
        this.goalFirstTeam = goalFirstTeam;
        this.goalSecondTeam = goalSecondTeam;
    }

    public String getFirstTeam() {
        return firstTeam;
    }

    public void setFirstTeam(String firstTeam) {
        this.firstTeam = firstTeam;

    }

    public String getSecondTeam() {
        return secondTeam;
    }

    public void setSecondTeam(String secondTeam) {
        this.secondTeam = secondTeam;

    }

    public int getGoalFirstTeam() {
        return goalFirstTeam;
    }

    public void setGoalFirstTeam(int goalFirstTeam) {
        this.goalFirstTeam = goalFirstTeam;

    }

    public int getGoalSecondTeam() {
        return goalSecondTeam;
    }

    public void setGoalSecondTeam(int goalSecondTeam) {
        this.goalSecondTeam = goalSecondTeam;

    }

    public String toString() {
        return "Score: " + firstTeam + " " + goalFirstTeam + " - " + goalSecondTeam + " " + secondTeam;

    }
}
