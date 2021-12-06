package aula8.Ex2;

public class Meat extends Food {
    private String type;

    public Meat(String t, double p, double c, double w) {
        super(p, c, w);
        this.type = t;
        super.setVeg(false);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return "Type: " + type + "; " + super.toString();
    }
}
