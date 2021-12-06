package aula7.Ex2;

public class Moveable {
    private int x;
    private int y;

    public Moveable(int a, int b) {
        this.x = a;
        this.y = b;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double move(int newX, int newY) {
        double dist = Math.sqrt(Math.pow(x - newX, 2) + Math.pow(y - newY, 2));
        x = newX;
        y = newY;
        return dist;
    }
}
