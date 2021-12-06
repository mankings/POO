package aula9.Ex1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;
import java.util.Collections;

public class ALDemo {
    public static void main(String[] args) {
        ArrayList<Integer> c1 = new ArrayList<>();
        for (int i = 10; i <= 100; i += 10)
            c1.add(i);
        System.out.println("Size: " + c1.size());
        for (int i = 0; i < c1.size(); i++)
            System.out.println("Elemento: " + c1.get(i));

        
        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Vento");
        c2.add("Calor");
        c2.add("Frio");
        c2.add("Chuva");
        System.out.println(c2);
        Collections.sort(c2);
        System.out.println(c2);
        c2.remove("Frio");
        c2.remove(0);
        System.out.println(c2);

        
        Data dm = new Data(19, 3, 2002);
        Data dd = new Data(31, 1, 2002);
        Data dj = new Data(8, 8, 2003);
        Data dg = new Data(25, 1, 2002);
        Data dp = new Data(21, 4, 2001);
        Pessoa m = new Pessoa("Miguel", 10011001 , dm);
        Pessoa d = new Pessoa("Daniëlle", 10000001 , dd);
        Pessoa j = new Pessoa("Joana", 11111001 , dj);
        Pessoa g = new Pessoa("Gabriel", 10011111 , dg);
        Pessoa p = new Pessoa("Piti", 10111101 , dp);

        Set<Pessoa> c3 = new HashSet<>();
        c3.add(m);
        c3.add(d);
        c3.add(j);
        c3.add(g);
        c3.add(p);
        for(Pessoa a : c3) System.out.println(a);
        c3.add(p);
        for(Pessoa a : c3) System.out.println(a);

        Set<Data> c4 = new TreeSet<>();
        c4.add(dm);
        c4.add(dd);
        c4.add(dj);
        c4.add(dg);
        c4.add(dp);
        System.out.println(c4);
    }
}