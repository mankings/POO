package aula6.Ex2;

public class Rectangle extends Shape {
    private double length;
    private double height;

    public Rectangle(String c, double length, double height) {
        super(c);
        this.length = length;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Length = " + length + ", Height = " + height;
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
        Rectangle other = (Rectangle) obj;
        if(getHeight() != other.getHeight() || getLength() != other.getLength())
            return false;
        return true;
    }

    public void setLength(double newLength) {
        this.length = newLength;
    }

    public void setHeight(double newHeight) {
        this.height = newHeight;
    }

    public double perimeter() {
        return 2*length + 2*height;
    }

    public double area() {
        return height*length;
    }
}
