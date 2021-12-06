package aula4;

import java.util.Scanner;
import java.lang.Character;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String input = sc.nextLine();
        sc.close();

        System.out.println("Number of numbers: " + countDigits(input));
        System.out.println("Number of spaces: " + countSpaces(input));
        System.out.println("Is it lower case only? " + isLower(input));
        System.out.println("Spaces fixed: " + fixSpaces(input));
        System.out.println("Is it a palindrome? " + isPalindrome(input));
    }   
    
    public static int countDigits(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static int countSpaces(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(Character.isWhitespace(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static String isLower(String s) {
        //por motivos estéticos no display do resultado decidi meter o return como String, embora tivesse sido mais funcional como boolean
        //o mesmo acontece na função isPalindrome
        if(s == s.toLowerCase()) {
            return "Yes.";
        } else {
            return "No.";
        }
    }

    public static String fixSpaces(String s) {
        String fixed = s.trim().replaceAll(" +", " ");
        return fixed;
    }

    public static String isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return "No.";
            }
            
            i++;
            j--;
        }
        return "Yes.";
    }
}
