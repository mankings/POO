package aula2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Temperatura em Celsius: ");
       double C = sc.nextDouble();
       double F = 1.8 * C + 32;
       System.out.println("Temperatura em Fahrenheit: " + F);
       sc.close();
    }
}
