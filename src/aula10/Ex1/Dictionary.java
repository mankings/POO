package aula10.Ex1;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Scanner;
import java.lang.StringBuilder;

public class Dictionary {
    private Scanner sc = new Scanner(System.in);
    public Map<String, String> dict = new HashMap<>();

    public Dictionary() {

    }

    public void add() {
        System.out.print("Word to add: ");
        String word = sc.nextLine();
        sc.nextLine();
        if(!dict.containsKey(word)) {
            System.out.print("Word meaning: ");
            String meaning = sc.nextLine();
            dict.put(word, meaning);
            System.out.println("Word added sucessfully.");
        } else {
            System.out.println("Word already exists in the dictionary.");
        }
    }

    public void remove() {
        System.out.print("Word to remove: ");
        String word = sc.next();
        if(dict.containsKey(word)) {
            System.out.printf("Are you sure you want to delete the word \"%s\"? (Y/N)", word);
            if(sc.next().equals("Y")) {
                dict.remove(word);
                System.out.println("Word removed sucessfully.");
            }
        } else {
            System.out.println("That word is not in the dictionary.");
        }
    }

    public void modify() {
        System.out.print("Word to modify: ");
        String word = sc.next();
        sc.nextLine();
        if(dict.containsKey(word)) {
            System.out.print("Insert new meaning: ");
            String meaning = sc.nextLine();
            dict.put(word, meaning);
        } else {
            System.out.println("That word doesn't exist in the dictionary.");
        }
    }

    public void clean() {
        dict.clear();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Set<String> words = dict.keySet();

        words.forEach(p -> {
            sb.append(p);
            sb.append(" -> ");
            sb.append(dict.get(p));
            sb.append("\n");
        });

        return "*Dictionary*\n" + sb.toString();
    }

    public String keysToString() {
        StringBuilder sb = new StringBuilder();
        Set<String> words = dict.keySet();

        words.forEach(p -> {
            sb.append(p);
            sb.append("\n");
        });

        return "*Keys*\n" + sb.toString();
    }

    public String valuesToString() {
        StringBuilder sb = new StringBuilder();
        Set<String> words = dict.keySet();

        words.forEach(p -> {
            sb.append(dict.get(p));
            sb.append("\n");
        });

        return "*Values*\n" + sb.toString();
    }
}
