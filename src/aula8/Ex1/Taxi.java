package aula8.Ex1;

public class Taxi extends Car {
    private int license;

    public Taxi(String matricula, String marca, String modelo, int cilindrada, int quadro, int capacidade, int license) {
        super(matricula, marca, modelo, cilindrada, quadro, capacidade);
        this.license = license;
    }

    public int getLicense() {
        return license;
    }

    public void setLicense(int license) {
        this.license = license;
    }
}
