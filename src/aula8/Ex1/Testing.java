package aula8.Ex1;

public class Testing {
    public static void main(String[] args) {
        Company mc = new Company("Mankings Corporate", "3780-426", "general@mankingsco.com");
        Taxi t = new Taxi("11-AA-00", "Renault", "Clio", 2, 3, 4, 1000);
        Car c = new Car("22-BO-44", "Opel", "Corsa", 3, 4, 200);
        Truck v = new Truck("88-DD-99", "Ford", "Focus", 5, 1, 3000, 10000);
        Bus b = new Bus("66-FF-66", "Mini", "Clubman", 4, 2, 6000, 66);
        mc.addVehicle(t);
        mc.addVehicle(c);
        mc.addVehicle(v);
        mc.addVehicle(b);
    }
}