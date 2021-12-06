package aula7.Ex2;

public class Robot extends Moveable {
    private String id;
    private String type;
    private int goals;

    public Robot(int x, int y, String i, String t) {
        super(x, y);
        this.id = i;
        this.type = t;
        this.goals = 0;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public int getGoals() {
        return goals;
    }
}
