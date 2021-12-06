package aula3;

import java.util.Scanner;
import java.lang.Math;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double secret = Math.floor(Math.random() * 100 + 1);
        int guess;
        do {
            System.out.print("Guess a number (0 - 100): ");
            guess = sc.nextInt();
            if(guess > secret) {
                System.out.println(guess + " IS TOO HIGH!");
            } else if(guess < secret) {
                System.out.println(guess + " IS TOO LOW!");
            }
        } while (guess != secret);
        sc.close();
        System.out.printf("GOOD JOB! SECRET NUMBER = %.0f", secret);
    }
}
