package aula6.Ex2;

public class Circle extends Shape {
    private Point center;
    private double radius;

    public Circle(String c, double x, double y, double radius) {
        super(c);
        this.center = new Point(x, y);
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Center = " + center + ", Radius = " + radius;
    }

    public boolean equals(Object obj) {
        if(!super.equals(obj))
            return false;
        
        if(this == obj) 
            return true;
        if(obj == null) 
            return false;
        if(getClass() != obj.getClass())
            return false;
        Circle other = (Circle) obj;
        if(!getCenter().equals(other.getCenter()) || getRadius() != other.getRadius())
            return false;
        return true;
    }

    public void setCenter(double x, double y) {
        center = new Point(x, y);
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public boolean intersect(Circle otherCircle) {
        double d = Math.sqrt(Math.pow(this.getCenter().getX() - otherCircle.getCenter().getX(), 2) + Math.pow(this.getCenter().getY() - otherCircle.getCenter().getY(), 2));
        double r = this.getRadius() + otherCircle.getRadius();
        return d < r;
    }
}
