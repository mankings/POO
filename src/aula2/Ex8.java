package aula2;

import java.util.Scanner;
import java.lang.Math;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
        double A = sc.nextDouble();
        System.out.print("B: ");
        double B = sc.nextDouble();
        double H = Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2));
        System.out.println("Hipotenusa: " + H);
        double alfa = Math.toDegrees(Math.asin(A / H));
        System.out.println("Ângulo entre A e H: " + alfa + "º.");
        sc.close();
    }
}