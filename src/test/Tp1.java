package test;

import java.util.Scanner;
import java.io.*;

public class Tp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do ficheiro (com extensão): ");
        String name = sc.nextLine();
        sc.close();
        PrintWriter printer = null;
        try {
            printer = new PrintWriter(name);
            for(int i = 2; i < 1000; i++) {
                boolean isPrime = true;
                for(int j = 2; j < i; j++) {
                    if(i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if(isPrime) {
                    printer.println(i);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não encontrado");
        } finally {
            if(printer != null) printer.close();
        }
    }
}
