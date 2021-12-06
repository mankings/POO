package aula8.Ex2;

public class Menu {
    private String name, place;
    private Plate[] plates = new Plate[5];
    private int slot = 0;

    public Menu(String n, String p) {
        this.name = n;
        this.place = p;
    }

    public String getName() {
        return name;
    }

    public String getPlace() {
        return place;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void addPlate(Plate p) {
        if(slot < plates.length) {
            plates[slot++] = p;
        }
    }
}
