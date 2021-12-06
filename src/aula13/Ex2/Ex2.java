package aula13.Ex2;

import java.io.*;
import java.util.*;

public class Ex2 {
    public static void main(String[] args) {
        // Scanner de entrada
        Scanner input = null;
        try {
            input = new Scanner(new File("notas.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro notas.txt não encontrado.");
            System.exit(0);
        }

        // File to student objects in list
        List<Student> students = new ArrayList<Student>();
        while (input.hasNextLine()) {
            String line = input.nextLine();
            if (!line.startsWith("*")) {
                String[] data = line.split("\\t");
                Student s = null;
                if (data.length == 5) {
                    s = new Student(Integer.parseInt(data[0]), data[1], Double.parseDouble(data[2]),
                            Double.parseDouble(data[3]), Double.parseDouble(data[4]));
                }
                if (s != null)
                    students.add(s);
            }
        }

        // 3. Gravar no ficheiro Results.txt
        Map<Integer, Integer> info = new TreeMap<Integer, Integer>();
        for (Student s : students) {
            int i;
            if (!info.containsKey(s.getNotaFinal())) {
                i = 1;
            } else {
                i = info.get(s.getNotaFinal());
                i++;
            }
            info.put(s.getNotaFinal(), i);
        }

        PrintWriter output = null;
        try {
            output = new PrintWriter("Results.txt");
        } catch (IOException e) {
            System.out.println("Erro. Ficheiro não escrito.");
            System.exit(0);
        }
        for (int i = 0; i <= 20; i++) {
            if (info.keySet().contains(i)) {
                output.printf("%2d : %2d%n", i, info.get(i));
            } else {
                output.printf("%2d : %2s%n", i, "0");
            }
        }
        output.close();
    }
}
