package aula7.Ex1;

public class Housing {
    private int codeGen = 1000;
    private int code;
    private String name;
    private double price; //per night
    private boolean available;
    private double rating;
    
    public Housing(String n, double p, double r) {
        this.name = n;
        this.price = p;
        this.rating = r;
        this.available = true;
        this.code = codeGen;
        codeGen++;
    }

    public boolean isAvailable() {
        return available;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    
}
