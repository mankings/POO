package aula6.Ex1;

import java.util.Calendar;

public class Aluno extends Pessoa {
    private static int nMecGen = 100;
    private int nMec;
    private Data dataInsc;
    
    public Aluno(String n, int c, Data dn, Data di) {
        super(n, c, dn);
        dataInsc = di;
        nMec = nMecGen;
        nMecGen++;
    }

    public Aluno(String n, int c, Data dn) {
        super(n, c, dn);
        Calendar di = Calendar.getInstance();
        dataInsc = new Data(di.get(Calendar.DAY_OF_MONTH), di.get(Calendar.MONTH) + 1, di.get(Calendar.YEAR));
        nMec = nMecGen;
        nMecGen++;
    }

    public Data getDataInsc() {
        return dataInsc;
    }

    public int getNMec() {
        return nMec;
    }

    @Override
    public String toString() {
        return super.toString() + ", NMec: " + nMec + ", Data Inscrição: " + dataInsc;
    }

    public boolean equals(Object obj) {
        if(!super.equals(obj))
            return false;
        
        if(this == obj) 
            return true;
        if(obj == null) 
            return false;
        if(getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if(getNMec() != other.getNMec())
            return false;
        return true;
    }
}
