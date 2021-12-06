package aula4;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");
        String input = sc.nextLine();
        sc.close();

        String lower = input.toLowerCase();
        char lastChar = input.charAt(input.length() - 1);
        String first3Char = input.substring(0, 3);

        if(input.contains("a")) {
            System.out.println("Contains an A!");
            String noA = input.replaceAll("a", "u").replaceAll("A", "U");
            System.out.println(noA);
        }

        System.out.println(lower);
        System.out.println(lastChar);
        System.out.println(first3Char);
    }
}
