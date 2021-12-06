package test;

import java.util.Scanner;
import java.io.*;

public class Tp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner file = null;
        while(true) {
            try {
                System.out.print("Nome do ficheiro (com extensão): ");
                String name = sc.nextLine();
                file = new Scanner(new File(name));
                sc.close();
                break;
            } catch(FileNotFoundException e) {
                System.out.println("Ficheiro não encontrado.");
            }
        }
        while(file.hasNextLine()) {
            System.out.println(file.nextLine().toUpperCase());
        }
    }
}
