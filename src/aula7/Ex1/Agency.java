package aula7.Ex1;

public class Agency {
    private String name;
    private String adress;
    private int numCars = 0, numHousing = 0;
    private Housing[] housing = new Housing[5];
    private Car[] cars = new Car[5];

    public Agency(String n, String a) {
        this.name = n;
        this.adress = a;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public void addCar(Car c) {
        cars[numCars] = c;
        numCars++;
    }

    public void addHousing(Housing h) {
        housing[numHousing] = h;
        numHousing++;
    }
}
