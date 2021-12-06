package aula6.Ex2;

public class Shape {
    private String cor;

    public Shape(String c) {
        cor = c;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Cor: " + cor;
    }

    public boolean equals(Object obj) {
        if(this == obj) 
            return true;
        if(obj == null) 
            return false;
        if(getClass() != obj.getClass())
            return false;
        Shape other = (Shape) obj;
        if(getCor() != other.getCor())
            return false;
        return true;
    }
}
