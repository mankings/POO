package aula7.Ex2;

public class Ball extends Moveable {
    private String color;

    public Ball(int x, int y, String c) {
        super(x, y);
        this.color = c;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
