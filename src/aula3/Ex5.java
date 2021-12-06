package aula3;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double montante;
        double taxa;

        do {
            System.out.print("Montante investdo (positivo e múltiplo de 1000): ");
            montante = sc.nextDouble();
        } while (montante < 0 || (montante  % 1000) != 0);

        do {
            System.out.print("Taxa de juro mensal (0%-5%): ");
            taxa = sc.nextDouble();
        } while (taxa < 0 || taxa > 5);
        sc.close();
        System.out.println();

        for(int i = 1; i <= 12; i++) {
            montante = montante + montante * (taxa/100);
            System.out.printf("Valor mês " + i + ": %.2f %n", (montante));
        }
    }
}
