package aula8.Ex1;

public class Vehicle implements KmPercorridosInterface {
    private String matricula, marca, modelo;
    private int cilindrada;

    private int distancia;
    private int ultimoTrajeto;

    public Vehicle(String matricula, String marca, String modelo, int cilindrada) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
    }

    public String getMatricula() {
        return matricula;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public int getCilindrada() {
        return cilindrada;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    public void trajeto(int quilometros) {
        distancia += quilometros;
        ultimoTrajeto = quilometros;
    }

    public int ultimoTrajeto() {
        return ultimoTrajeto;
    }

    public int distanciaTotal() {
        return distancia;
    }

    public String toString() {
        return "Matrícula " + matricula + ", marca e modelo: " + marca + " " + modelo + ", cilindrada: " + cilindrada;
    }
}
