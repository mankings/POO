package aula8.Ex2;

public class DietPlate extends Plate {
    private int maxCalories;

    public DietPlate(String n, int m) {
        super(n);
        this.maxCalories = m;
    }

    public int getMaxCalories() {
        return maxCalories;
    }

    public void setMaxCalories(int maxCalories) {
        this.maxCalories = maxCalories;
    }
    
    @Override
    public void addFood(Food f) {
        int c = 0;
        for(Food food : comp) {
            c += food.getCalories();
        }
        c += f.getCalories();

        if(slot < comp.length && c <= maxCalories) {
            comp[slot++] = f;
        }
    }
}
