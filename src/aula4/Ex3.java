package aula4;

import java.util.Scanner;
import java.lang.StringBuilder;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String input = sc.nextLine();
        sc.close();

        String[] words = input.trim().split("\\s+");

        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < words.length; i++) {
            if(words[i].length() > 3) {
                sb.append(words[i].charAt(0));
            }
        }

        String acronym = sb.toString().toUpperCase();
        System.out.println("Acrónimo: " + acronym);
    }
}
