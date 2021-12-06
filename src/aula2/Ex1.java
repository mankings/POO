package aula2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Distância em quilómetros: ");
        double km = sc.nextDouble();
        double ml = km / 1.609;
        System.out.println(ml + " milhas.");
        sc.close();
    }
}