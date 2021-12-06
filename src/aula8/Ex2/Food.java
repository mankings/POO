package aula8.Ex2;

public class Food {
    private double protein, calories, weight;
    private boolean veg = false;

    public Food(double p, double c, double w) {
        this.protein = p;
        this.calories = c;
        this.weight = w;
    }

    public double getProtein() {
        return protein;
    }

    public double getCalories() {
        return calories;
    }

    public double getWeight() {
        return weight;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isVeg() {
        return veg;
    }

    public void setVeg(boolean veg) {
        this.veg = veg;
    }

    public String toString() {
        return "Protein: " + protein + "; Calories: " + calories + "; Weight: " + weight;
    }
}