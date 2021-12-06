package aula8.Ex2;

public class Plate {
    private String name;
    Food[] comp = new Food[5];
    int slot;

    public Plate(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void addFood(Food f) {
        if(slot < comp.length) {
            comp[slot++] = f;
        }
    }
}
