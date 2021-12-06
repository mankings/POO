package aula13;

import java.util.*;
import java.io.*;

public class Ex1 {
    public static void main(String[] args) {
        //Iniciar Scanner do fichero
        Scanner input = null;
        try {
            input = new Scanner(new File("qdv.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro dqv.txt não encontrado.");
            System.exit(0);
        }
        
        //File to map
        Map<String, ArrayList<Double>> map = new HashMap<String, ArrayList<Double>>();
        while(input.hasNextLine()) {
            String line = input.nextLine();
            if(!line.startsWith("#")) {
                String[] data = line.split("\\t");
                ArrayList<Double> values = new ArrayList<Double>();
                if(!map.containsKey(data[0])) {
                    values.add(Double.parseDouble(data[1].replace(",", ".")));
                } else {
                    values = map.get(data[0]);
                    values.add(Double.parseDouble(data[1].replace(",", ".")));
                }
                map.put(data[0], values);
            }
        }

        //1 - Média dos valores da segunda coluna
        System.out.println();
        System.out.println("1. Média dos valores da segunda coluna");
        double sum = 0;
        int count = 0;
        for(String l : map.keySet()) {
            for(double v : map.get(l)) {
                sum += v;
                count++;
            }
        }
        double media = sum/count;
        System.out.printf("%-4.2f%n", media);

        //2 - Localidades presentes na primeira coluna
        System.out.println();
        System.out.println("2. Localidades presentes na primeira coluna");
        for(String l : map.keySet()) {
            System.out.println(l);
        }

        //3 - Quantidade e média dos valores associados a cada localidade
        System.out.println();
        System.out.println("3. Quantidade e média dos valores associados a cada localidade");
        System.out.printf("%-12s %-12s %-6s%n", "Localidade", "Quantidade", "Média");
        System.out.println("-------------------------------");
        for(String l : map.keySet()) {
            sum = 0;
            count = 0;
            for(double v : map.get(l)) {
                sum += v;
                count++;
            }
            System.out.printf("%-12s %-12d %-6.2f%n", l, count, sum/count);
        }
    }
    
}
