package aula7.Ex1;

public class Car {
    private final char classe;
    private String fuel, id;
    private boolean available = true;

    public Car(char classe, String fuel, String id) {
        this.classe = classe;
        this.fuel = fuel;
        this.id = id;
    }

    public char getClasse() {
        return classe;
    }

    public String getFuel() {
        return fuel;
    }
    
    public String getId() {
        return id;
    }

    public boolean isAvailable() {
        return available;
    }
}
