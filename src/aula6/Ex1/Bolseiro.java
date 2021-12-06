package aula6.Ex1;

public class Bolseiro extends Aluno{
    private int valor;

    public Bolseiro(String n, int c, Data dn, Data di, int v) {
        super(n, c, dn, di);
        valor = v;
    }

    public Bolseiro(String n, int c, Data dn) {
        super(n, c, dn);
        valor = 0;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return super.toString() + ", Valor Bolsa: " + valor + "€";
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void setValor(int v) {
        valor = v;
    }
}
