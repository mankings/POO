package aula3;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double input, input1, max, min, total, med;
        int n = 1;

        System.out.print("Número real: ");
        input1 = sc.nextDouble();
        max = input1;
        min = input1;
        total = input1;
        do {
            System.out.print("Número real: ");
            input = sc.nextInt();

            if(input > max) {
                max = input;
            }
            if(input < min) {
                min = input;
            }
            total += input;
            n++;
        } while (input != input1);
        sc.close();

        med = total/n;

        System.out.println();
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
        System.out.println("Média: " + med);
        System.out.println("Total de números lidos: " + n);  
    }
}
