package aula8.Ex1;

public class Bus extends Vehicle {
    private int quadro, peso, passageiros;

    public Bus(String matricula, String marca, String modelo, int cilindrada, int quadro, int peso, int passageiros) {
        super(matricula, marca, modelo, cilindrada);
        this.quadro = quadro;
        this.peso = peso;
        this.passageiros = passageiros;
    }

    public int getQuadro() {
        return quadro;
    }
    
    public int getPeso() {
        return peso;
    }
    
    public int getPassageiros() {
        return passageiros;
    }

    public void setQuadro(int quadro) {
        this.quadro = quadro;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }
}
