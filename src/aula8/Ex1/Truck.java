package aula8.Ex1;

public class Truck extends Vehicle {
    private int quadro, peso, maxCarga;

    public Truck(String matricula, String marca, String modelo, int cilindrada, int quadro, int peso, int maxCarga) {
        super(matricula, marca, modelo, cilindrada);
        this.quadro = quadro;
        this.peso = peso;
        this.maxCarga = maxCarga;
    }

    public int getQuadro() {
        return quadro;
    }

    public int getPeso() {
        return peso;
    }

    public int getMaxCarga() {
        return maxCarga;
    }

    public void setQuadro(int quadro) {
        this.quadro = quadro;
    }
    
    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setMaxCarga(int maxCarga) {
        this.maxCarga = maxCarga;
    }
}
