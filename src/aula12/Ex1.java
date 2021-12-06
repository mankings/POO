package aula12;

import java.util.*;
import java.io.*;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do ficheiro: ");
        String file = sc.nextLine();
        sc.close();

        Scanner input = null;
        try {
            input = new Scanner(new File(file));
        } catch(FileNotFoundException e) {
            System.out.println("Ficheiro não encontrado.");
        }
        
        String line;
        String[] words;
        Set<String> allWords = new HashSet<String>();
        int wordCount = 0;
        while(input.hasNextLine()) {
            line = input.nextLine().replaceAll("/[^A-Za-z0-9]", "");
            words = line.split(" ");
            for(String w : words) {
                wordCount++;
                allWords.add(w);
            }
        }

        System.out.println("Número de palavras: " + wordCount);
        System.out.println("Número de palavras diferentes: " + allWords.size());
    }
}
