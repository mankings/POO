package aula8.Ex2;

public class Cereal extends Food {
    private String name;

    public Cereal(String n, double p, double c, double w) {
        super(p, c, w);
        this.name = n;
        super.setVeg(true);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Name: " + name + "; " + super.toString();
    }
}
