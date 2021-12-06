package aula2;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("v1: ");
        double v1 = sc.nextDouble();
        System.out.print("d1: ");
        double d1 = sc.nextDouble();
        System.out.print("v2: ");
        double v2 = sc.nextDouble();
        System.out.print("d2: ");
        double d2 = sc.nextDouble();
        double d = d1 + d2;
        double v = v1 * (d1/d) + v2 * (d2/d);
        System.out.println("Velocidade média final: " + v + " m/s.");
        sc.close();
    }
}
