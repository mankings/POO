package aula4;

import java.lang.Integer;
import java.util.Scanner;
import java.lang.StringBuilder;

public class Ex4 {
    public static void main(String[] args) {
        String [] monthToPrint = readDate();
        int days = calcDays(monthToPrint[0]);
        printMonth(monthToPrint, days);
    }

    public static String[] readDate() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert date (mm-yyyy): ");
        String date = sc.nextLine();
        System.out.println("MON - 1; TUE - 2; WED - 3; THU - 4; FRI - 5; SAT - 6; SUN - 7");
        System.out.print("Week starts on: ");
        String start = sc.nextLine();
        sc.close();

        String[] result = {date, start};
        return result;
    }

    public static int calcDays(String d) {
        String[] data = d.split("-");
        int mes = Integer.parseInt(data[0]), ano = Integer.parseInt(data[1]);

        int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if(mes == 2 && (ano % 4) == 0) {
            return 29;
        } else {
            return dias[mes - 1];
        }
    }

    public static void printMonth(String[] date, int n) {
        String[] data = date[0].split("-");
        int mes = Integer.parseInt(data[0]), ano = Integer.parseInt(data[1]);

        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        System.out.println();
        System.out.printf("%20s", meses[mes-1] + " de " + ano);
        System.out.println();
        System.out.println("SU MO TU WE TH FR SA");

        StringBuilder sb = new StringBuilder();
        int w = 0;

        switch(date[1]) {
            case "1":
                sb.append("   ");
                w = 1;
                break;
            case "2":
                sb.append("      ");
                w = 2;
                break;
            case "3":
                sb.append("         ");
                w = 3;
                break;
            case "4":
                sb.append("            ");
                w = 4;
                break;
            case "5":
                sb.append("               ");
                w = 5;
                break;
            case "6":
                sb.append("                  ");
                w = 6;
                break;
            case "7":
                break;
        }   
    
        for(int i = 1; i <= n; i++) {
            if(i < 10) {
                sb.append("0");
                sb.append(i);
                sb.append(" ");
            } else {
                sb.append(i);
                sb.append(" ");
            }

            w++;
            if(w == 7 || i == n) {
                String days = sb.toString();
                sb.setLength(0);
                System.out.println(days);
                w = 0;
            }
        }
        System.out.println();
    }
}
