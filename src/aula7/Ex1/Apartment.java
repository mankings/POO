package aula7.Ex1;

public class Apartment extends Housing {
    private int rooms;

    public Apartment(String n, double p, double r, int rooms) {
        super(n, p, r);
        this.rooms = rooms;
    }

    public int getRooms() {
        return rooms;
    }
}
