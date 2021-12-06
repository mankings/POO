package aula8.Ex2;

public class VegPlate extends Plate {
    public VegPlate(String n) {
        super(n);
    }

    @Override
    public void addFood(Food f) {
        if(slot < comp.length && f.isVeg()) {
            comp[slot++] = f;
        }
    }
}