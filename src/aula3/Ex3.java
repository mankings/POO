package aula3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Número inteiro positivo: ");
            n = sc.nextInt();
        } while (n <= 0);
        sc.close();

        boolean isPrime = true;
        for(int i = n-1; i > 1; i--) {
            if ((n % i) == 0) {
                isPrime = false;
            }
        }

        if(isPrime) {
            System.out.println(n + " é primo.");
        } else {
            System.out.println(n + " não é primo.");
        }
    }
}
