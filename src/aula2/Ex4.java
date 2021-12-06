package aula2;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Montante investido: ");
        double M = sc.nextDouble();
        System.out.print("Taxa de juro mensal: ");
        double T = sc.nextDouble();
        for(int i = 0; i < 3; i++) {
            M = M + (M * T);
        }
        System.out.println("Valor total final ao fim de 3 meses: " + M + " €.");
        sc.close();
    }
}

