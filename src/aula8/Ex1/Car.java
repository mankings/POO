package aula8.Ex1;

public class Car extends Vehicle {
    private int quadro, capacidade;

    public Car(String matricula, String marca, String modelo, int cilindrada, int quadro, int capacidade) {
        super(matricula, marca, modelo, cilindrada);
        this.quadro = quadro;
        this.capacidade = capacidade;
    }

    public int getQuadro() {
        return quadro;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setQuadro(int quadro) {
        this.quadro = quadro;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String toString() {
        return super.toString() + ", quadro: " + quadro + ", capacidade de bagagem: " + capacidade;
    }
}
