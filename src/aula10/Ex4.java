package aula10;

import java.util.*;
import java.io.*;

public class Ex4 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new FileReader("words.txt"));
        ArrayList<String> moreThan2 = new ArrayList<String>();
        while (input.hasNext()) {
            String word = input.next();
            if(word.length() > 2)
                moreThan2.add(word);
            if(word.charAt(word.length() - 1) == 's')
                System.out.println(word);
        }

        Iterator<String> i = moreThan2.iterator();

        while(i.hasNext()) {
            String s = (String) i.next();
            if(!isAlpha(s)) {
                i.remove();
            }
        }

        for (String string : moreThan2) {
			System.out.println(string);
		}

		input.close();
    }

    public static boolean isAlpha(String w) {
		char[] chars = w.toCharArray();
		for (char c : chars) {
			if (!Character.isLetter(c)) {
				return false;
			}
		}
		return true;
	}
}
