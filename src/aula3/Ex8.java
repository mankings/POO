package aula3;

import java.util.Scanner;
import java.util.Random;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        float notaP, notaT, notaFinal;
        float[][] alunos;
        String[] grade;

        System.out.print("Número de alunos: ");
        int n = sc.nextInt();
        alunos = new float[n][3];
        grade = new String[n];

        for(int i = 0; i < alunos.length; i++) {
            do {
                notaP = random.nextFloat() * 20;
            } while (notaP >= 20 && notaP <= 0);
            do {
                notaT = random.nextFloat() * 20;
            } while (notaT >= 20 && notaT <= 0);

            if (notaP < 7 || notaT < 7) {
                notaFinal = 66;
                grade[i] = "Reprovado";
            } else {
                notaFinal = Math.round(0.4 * notaT + 0.6 * notaP);
            }

            if (notaFinal >= 10) {
                grade[i] = "Aprovado";
            } else {
                grade[i] = "Reprovado";
            }

            alunos[i][0] = notaP;
            alunos[i][1] = notaT;
            alunos[i][2] = notaFinal;
        }

        System.out.println("Aluno\tNotaT\tNotaP\tPauta");
        for (int i = 0; i < alunos.length; i++) {
            System.out.format("%5d\t%5.1f\t%5.1f\t%5d\t%s\n", i + 1, alunos[i][1], alunos[i][0], (int) alunos[i][2], grade[i]);
        }

        sc.close();
    }
}
