package aula11.Ex2;

import java.util.*;
import java.io.*;

public class Ex2 {
    public static void main(String[] args) {
        //Iniciar o scanner para o ficheiro das companhias
        Scanner inputC = null;
        try {
            inputC = new Scanner(new File("companhias.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro companhias.txt não encontrado.");
            System.exit(0);
        }

        //Companhias para HashMap (key = sigla, value = nome)
        Map<String, String> companhias = new HashMap<String, String>();
        String[] c;
        inputC.nextLine();
        while(inputC.hasNextLine()) {
            c = inputC.nextLine().split("\\t");
            companhias.put(c[0], c[1]);
        }
        inputC.close();
        Voo.companhias = companhias.keySet();

        //Iniciar o scanner para o ficheiro dos voos
        Scanner inputV = null;
        try {
            inputV = new Scanner(new File("voos.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Ficheiros voos.txt não encontrado.");
            System.exit(0);
        }

        //Converter voos para objetos Voo
        List<Voo> voos = new ArrayList<Voo>();
        String[] v;
        inputV.nextLine();
        while(inputV.hasNextLine()) {
            v = inputV.nextLine().split("\\t");
            if(v.length == 3) {
                voos.add(new Voo(v[0], v[1], v[2]));
            } else {
                voos.add(new Voo(v[0], v[1], v[2], v[3]));
            }
        }

        //Print tabela
        PrintWriter tabela = null;
        try {
            tabela = new PrintWriter(new File("Infopublico.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro Infopublico.txt não encontrado.");
        }
        tabela.printf("%-6s %-10s %-20s %-20s %-10s %-20s%n", "Hora", "Voo", "Companhia", "Origem", "Atraso", "Obs");
        for(Voo i : voos) {
            tabela.printf("%-6s %-10s %-20s %-20s %-10s %-20s%n", i.getHora(), i.getCodigo(), companhias.get(i.getCompanhia()), i.getOrigem(), i.getAtraso(), i.horaPrevista());
        }
        tabela.close();

        //Média dos atrasos
        Map<String, int[]> atrasos = new HashMap<String, int[]>();
        for(Voo i : voos) {
            if(i.getAtraso() != "") {
                int[] atr = i.atrasoToInt();
                int[] tmp;
                int atrMinutes = 60*atr[0] + atr[1];
                if(!atrasos.containsKey(companhias.get(i.getCompanhia()))) {
                    tmp = new int[2];
                } else {
                    tmp = atrasos.get(companhias.get(i.getCompanhia()));
                }
                tmp[0]++;
                tmp[1] = atrMinutes;
                atrasos.put(companhias.get(i.getCompanhia()), tmp);
            }
        }
        Map<String, Integer> mediaAtrasos = new HashMap<String, Integer>();
        for(String i : atrasos.keySet()) {
            int[] a = atrasos.get(i);
            mediaAtrasos.put(i, (int) a[1]/a[0]);
        }
        mediaAtrasos = sortByValue(mediaAtrasos, 1);

        //Print tabela atrasos
        for(String i : mediaAtrasos.keySet()) {
                int hours = mediaAtrasos.get(i)/60; 
                int minutes = mediaAtrasos.get(i)%60;
                String atraso = hours+":"+minutes;
                System.out.printf("%-20s %-10s %n", i, atraso);
        }
    }
    
    // Ordenar pelo valor por ordem descrescente
	public static Map<String, Integer> sortByValue(Map<String, Integer> hm, int o) {
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return (o1.getValue()).compareTo(o2.getValue()) * o;
			}
		});

		Map<String, Integer> temp = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}
		return temp;
	}
}
