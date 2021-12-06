package aula3;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes, ano;
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        do {
            System.out.print("Mês (0-12): ");
            mes = sc.nextInt();
        } while (mes < 0 || mes > 12);
        System.out.print("Ano: ");
        ano = sc.nextInt();
        sc.close();

        if(mes == 2 && (ano % 4) == 0) {
            System.out.println("Fevereiro de " + ano + " tem 29 dias.");
        } else {
            System.out.println(meses[mes - 1] + " de " + ano + " tem " + dias[mes - 1] + " dias.");
        }
    }
}
