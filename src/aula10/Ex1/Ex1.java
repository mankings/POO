package aula10.Ex1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dictionary d = new Dictionary();

        int op;

        do {
            System.out.println("\nDictionary\n");
			System.out.println ("1. Add word");
			System.out.println ("2. Modify word meaning");
			System.out.println ("3. Delete word");
			System.out.println ("4. Print dictionary");
			System.out.println ("5. Print words");
			System.out.println ("6. Print meanings");
			System.out.println ("7. Clear dictionary");
			System.out.println ("8- Sair");
			System.out.print("OP -> ");
            op = sc.nextInt();
            switch(op) {
                case 1:
                    d.add();
                    break;
                case 2:
                    d.modify();
                    break;
                case 3:
                    d.remove();
                    break;
                case 4:
                    System.out.print(d.toString());
                    break;
                case 5:
                    System.out.print(d.keysToString());
                    break;
                case 6:
                    System.out.print(d.valuesToString());
                    break;
                case 7:
                    d.clean();
                    break;
            }
        } while(op != 8);
        sc.close();
    }
}
