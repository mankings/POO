package aula7.Ex2;

public class Team {
    private String name;
    private String captain;
    private int goals = 0;
    private Robot[] members = new Robot[3];
    private int slot = 0;

    public Team(String n, String c) {
        this.name = n;
        this.captain = c;
    }

    public String getName() {
        return name;
    }

    public String getCaptain() {
        return captain;
    }

    public int getGoals() {
        return goals;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setCaptain(String captain) {
        this.captain = captain;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public void addRobot(Robot robot) {
        if(slot < members.length) {
            members[slot++] = robot;
        }
    }

    public void score(int index) {
        goals++;
    }
}
