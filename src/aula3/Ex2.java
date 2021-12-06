package aula3;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número inteiro positivo: ");
        int n = sc.nextInt();
        sc.close();

        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
