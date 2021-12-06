package aula13.Ex2;

public class Student {
    private int nmec, notaFinal;
    private String name;
    private double atp, ac, ap;
    
    public Student(int nmec, String name, double atp, double ac, double ap) {
        this.nmec = nmec;
        this.name = name;
        this.atp = atp;
        this.ac = ac;
        this.ap = ap;
        calcNotaFinal();
    }

    private void calcNotaFinal() {
        this.notaFinal = (int) (0.3*this.getAtp() + 0.2*this.getAc() + 0.5*this.getAp());
    }

    public int getNmec() {return nmec;}
    public int getNotaFinal() {return notaFinal;}
    public String getName() {return name;}
    public double getAtp() {return atp;}
    public double getAc() {return ac;}
    public double getAp() {return ap;}
}
