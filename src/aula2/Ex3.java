package aula2;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Massa de água a aquecer: ");
        double M = sc.nextDouble();
        System.out.print("Temperatura inicial: ");
        double TI = sc.nextDouble();
        System.out.print("Temperatura final: ");
        double TF = sc.nextDouble();
        double Q = M * (TF - TI) * 4184;
        System.out.println("Quantidade de energia necessária: " + Q + " J.2");
        sc.close();
    }
}

