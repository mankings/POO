package aula2;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Seconds: ");
        int sec = sc.nextInt();
        int min = sec/60;
        sec = sec%60;
        int hou = min/60;
        min = min%60;
        System.out.println(hou + ":" + min + ":" + sec);
        sc.close();
    }
}