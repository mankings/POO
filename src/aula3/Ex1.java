package aula3;

import java.util.Scanner;
import java.lang.Math;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double notaP, notaT, notaF;
        
        do {
            System.out.print("Nota prática (0-20): ");
            notaP = sc.nextDouble();
        } while ((notaP > 20) || (notaP < 0));
        do {
            System.out.print("Nota teórica (0-20): ");
            notaT = sc.nextDouble();
        } while ((notaT > 20) || (notaT < 0));

        if (notaP < 7 || notaT < 7) {
            System.out.println("Nota Final: 66 (reprovado por nota mínima)");
        } else {
            notaF = Math.floor(0.4*notaT + 0.6*notaP);
            System.out.println("Nota Final: " + notaF + ".");
        }

        sc.close();
    }
}
