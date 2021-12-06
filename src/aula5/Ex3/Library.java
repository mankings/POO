package aula5.Ex3;

import aula5.Ex2.Livro;
import aula5.Ex2.Utilizador;
import java.util.Scanner;

public class Library {
    private Livro[] livros = new Livro[100];
    private Utilizador[] alunos = new Utilizador[100];
    private Scanner sc = new Scanner(System.in);
    private int activeOp = 0, nextAluno = 0, nextLivro = 0;

    public void run() {
        while(activeOp != 8) {
            showInterface();
            activeOp = chooseOp();
            switch(activeOp) {
                case 1:
                    newUser();
                case 2:
                    removeUser();
                case 3:
                    printUsers();
                case 4:
                    addBook();
                case 5:
                    printBooks();
                case 6:

                case 7:

            }

            System.out.println("Programa encerrado");
        }
    }

    public void showInterface() {
        System.out.println();
        System.out.println("1 - Inscrever Utilizador");
        System.out.println("2 - Remover Utilizador");
        System.out.println("3 - Imprimir Lista de Utilizadores");
        System.out.println("4 - Registar Novo Livro");
        System.out.println("5 - Imprimir Lista de Livros");
        System.out.println("6 - Emprestar");
        System.out.println("7 - Devolver");
        System.out.println("8 - Sair");
        System.out.println();
    }

    public int chooseOp() {
        int op;
        do {
            System.out.print("Operação pretendida (1 - 8)? ");
            op = sc.nextInt();
        } while (op < 1 && op > 8);
        System.out.println();
        return op;
    }

    public void newUser() {
        System.out.println("Inscrever novo utiliador. Introduzir dados.");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Número Mecanográfico: ");
        int nMec = sc.nextInt();
        System.out.print("Curso: ");
        String curso = sc.nextLine();
        alunos[nextAluno] = (new Utilizador(nome, nMec, curso));
        nextAluno++;
    }

    public void removeUser() {
        System.out.println("Remover utilizador. ");
    }

    public void printUsers() {
        System.out.println("Imprimindo a lista de todos os utilizadores...");
        for (Utilizador u : alunos) {
            System.out.println(u);
        }
    }

    public void addBook() {
        System.out.println("Adicionar novo livro. Introduzir dados.");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Tipo de Empréstimo (NORMAL/CONDICIONAL): ");
        String tipo = sc.nextLine();
        livros[nextLivro] = (new Livro(nome, tipo));
        nextLivro++;
    }

    public void printBooks() {
        System.out.println("Imprimindo a lista de todos os livros...");
        for (Livro l : livros) {
            System.out.println(l);
        }
    }

    public void lendBook() {

    }

    public void retrieveBook() {

    }
}
