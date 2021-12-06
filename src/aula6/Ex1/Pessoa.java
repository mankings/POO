package aula6.Ex1;

public class Pessoa {
    private String nome;
    private int cc;
    private Data dataNasc;

    public Pessoa(String n, int c, Data d) {
        nome = n;
        cc = c;
        dataNasc = d;
    }

    public String getNome() {
        return nome;
    }

    public int getCc() {
        return cc;
    }

    public Data getDataNasc() {
        return dataNasc;
    }

    @Override
    public String toString() {
        return nome + ", CC: " + cc + ", Data Nascimento: " + dataNasc;
    }

    public boolean equals(Object obj) {
        if(this == obj) 
            return true;
        if(obj == null) 
            return false;
        if(getClass() != obj.getClass())
            return false;
        Pessoa other = (Pessoa) obj;
        if(getNome() != other.getNome() || getCc() != other.getCc() || getDataNasc() != other.getDataNasc())
            return false;
        return true;
    }
}
