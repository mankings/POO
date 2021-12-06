package test;

import java.util.Scanner;
import java.io.*;

public class Tp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do ficheiro (com extensão): ");
        String name = sc.nextLine();
        sc.close();

        try (Scanner input = new Scanner(new File(name))) {
            int sum = 0, i = 0;
            while(input.hasNextLine()) {
                int line = Integer.parseInt(input.nextLine());
                sum += line;
                i++;
            }
            double avg = sum/i;
            System.out.printf("Sum: %d, average: %.4f", sum, avg);
        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não encontrado");
        }
    }
}
