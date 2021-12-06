package aula8.Ex1;

public class Motorcicle extends Vehicle {
    enum type { DESPORTIVO, ESTRADA }
    private type tipo;

    public Motorcicle(String matricula, String marca, String modelo, int cilindrada, String tipo) {
        super(matricula, marca, modelo, cilindrada);
        switch(tipo.toLowerCase()) {
            case "desportivo":
                this.tipo = type.DESPORTIVO;
            case "estrada":
                this.tipo = type.ESTRADA;
        }
    }

    public type getTipo() {
        return tipo;
    }

    public void setTipo(type tipo) {
        this.tipo = tipo;
    }
}
