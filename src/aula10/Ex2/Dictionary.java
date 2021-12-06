package aula10.Ex2;

import java.util.*;

public class Dictionary {
    private Scanner sc = new Scanner(System.in);
    public Map<String, Set<String>> dict = new HashMap<>();

    public Dictionary() {

    }

    public void addWord() {
        System.out.print("Word to add: ");
        String word = sc.next();
        sc.nextLine();
        if(!dict.containsKey(word)) {
            Set<String> meanings = new HashSet<String>();
            System.out.print("Word meaning: ");
            String meaning = sc.nextLine();
            meanings.add(meaning);
            dict.put(word, meanings);
            System.out.println("Word added sucessfully.");
        } else {
            System.out.println("Word already exists in the dictionary.");
        }
    }

    public void addMeaning() {
        System.out.print("Word to add a meaning to: ");
        String word = sc.next();
        sc.nextLine();
        if(dict.containsKey(word)) {
            Set<String> meanings = dict.get(word);
            System.out.print("Meaning to add: ");
            String meaning = sc.nextLine();
            if(!meanings.contains(meaning)) {
                meanings.add(meaning);
                dict.remove(word);
                dict.put(word, meanings);
            } else {
                System.out.println("That meaning already exists.");
            }
        }
    }

    public void removeWord() {
        System.out.print("Word to remove: ");
        String word = sc.next();
        if(dict.containsKey(word)) {
            System.out.printf("Are you sure you want to delete the word \"%s\" (Y/N)? ", word);
            if(sc.next().equals("Y")) {
                dict.remove(word);
                System.out.println("Word removed sucessfully.");
            }
        } else {
            System.out.println("That word is not in the dictionary.");
        }
    }

    public void modifyMeaning() {
        System.out.print("Word to modify: ");
        String word = sc.next();
        sc.nextLine();
        if(dict.containsKey(word)) {
            System.out.println("List of meanings:");
            System.out.println(listMeanings(word));
            System.out.print("Meaning to modify: ");
            String meaningToChange = sc.nextLine();
            Set<String> meanings = dict.get(word);
            if(meanings.contains(meaningToChange)) {
                System.out.print("Insert new meaning: ");
                String newMeaning = sc.nextLine();
                meanings.remove(meaningToChange);
                meanings.add(newMeaning);
                dict.remove(word);
                dict.put(word, meanings);
            } else {
                System.out.println("That meaning doesn't exist.");
            }
        } else {
            System.out.println("That word doesn't exist in the dictionary.");
        }
    }

    public void randomMeaning() {
        System.out.print("Word: ");
        String word = sc.next();
        if(dict.containsKey(word)) {
            int i = 0;
            Set<String> meanings = dict.get(word);
            int random = (int)(Math.random() * meanings.size() + 1);
            for(String m : meanings) {
                i++;
                if(i == random) {
                    System.out.println(m);
                    break;
                }
            }
        }
    }

    public void clean() {
        dict.clear();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Set<String> words = dict.keySet();

        words.forEach(w -> {
            Set<String> meanings = dict.get(w);
            sb.append("*" + w + "*\n");
            meanings.forEach(m -> {
                sb.append("->" + m + "\n");
            });
        });

        return "*Dictionary*\n" + sb.toString();
    }

    public String listMeanings(String word) {
        StringBuilder sb = new StringBuilder();
        Set<String> meanings = dict.get(word);
        sb.append("*" + word + "*\n");
        for(String meaning : meanings)
            sb.append("->" + meaning + "\n");
        return sb.toString();
    }

    public String listWords() {
        StringBuilder sb = new StringBuilder ();	
		sb.append("--- All Words ---\n");
		for (String word : dict.keySet()) 	
			sb.append(word + "\n");
		sb.append("-----------------\n");
		return sb.toString();
    }
}
