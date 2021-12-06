package aula8.Ex1;

public class Company {
    private String nome, codePostal, email;
    private Vehicle[] vehicles = new Vehicle[10];
    private int numVehicle = 0;

    public Company(String nome, String codePostal, String email) {
        this.nome = nome;
        this.codePostal = codePostal;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addVehicle(Vehicle v) {
        if(numVehicle < vehicles.length) {
            vehicles[numVehicle] = v;
            numVehicle++;
        }
    }
}
