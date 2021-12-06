package aula7.Ex1;

public class HotelRoom extends Housing {
    private String type;

    public HotelRoom(String n, double p, double r, String t) {
        super(n, p, r);
        this.type = t;
    }

    public String getType() {
        return type;
    }
}
