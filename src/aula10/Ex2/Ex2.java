package aula10.Ex2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dictionary d = new Dictionary();

        int op;

        do {
            System.out.println("\nDictionary\n");
			System.out.println("1. Add word");
			System.out.println("2. Add meaning to word");
			System.out.println("3. Change a word meaning");
			System.out.println("4. Delete word");
			System.out.println("5. Print dictionary");
			System.out.println("6. Print words");
            System.out.println("7. Random meaning of a word");
            System.out.println("8. Clear dictionary");
			System.out.println("9. Sair");
			System.out.print("OP -> ");
            op = sc.nextInt();
            System.out.println();
            switch(op) {
                case 1:
                    d.addWord();
                    break;
                case 2:
                    d.addMeaning();
                    break;
                case 3:
                    d.modifyMeaning();
                    break;
                case 4:
                    d.removeWord();;
                    break;
                case 5:
                    System.out.print(d);
                    break;
                case 6:
                    System.out.print(d.listWords());
                    break;
                case 7:
                    d.randomMeaning();
                    break;
                case 8:
                    d.clean();
                    break;
            }
        } while(op != 9);
        sc.close();
    }
}
