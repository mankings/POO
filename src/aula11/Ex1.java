package aula11;

import java.io.*;
import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        String Punct = "\\t\\n.,:'‘’;?!-*{}=+&/()[]”“\\\"\\'";
        Map<String, TreeMap<String, Integer>> pairs = new TreeMap<String, TreeMap<String, Integer>>();
        Scanner input = null;
        String line, text = "", filteredText = "";
        String[] allWords, words;
        
        //Start scanner
        try {
            input = new Scanner(new File("major.txt"), "UTF-8");
        } catch (FileNotFoundException e){
            System.out.println("Error, the file doesn't exist.");
            System.exit(0);
        }

        //Store all words in one single string
        while(input.hasNextLine()) {
            line = input.nextLine().replaceAll("\\p{Punct}", "");
            text += line + " ";
        }

        input.close();

        //Filter words less than 4 letters long
        allWords = text.toLowerCase().split(" ");
        for(String w : allWords) {
            if(w.length() >= 3) {
                filteredText += w + " ";
            }
        }

        words = filteredText.toLowerCase().split(" ");

        //Word pairs
        for(int i = 0; i < words.length - 1; i++) {
            TreeMap<String, Integer> value;
            if(!pairs.containsKey(words[i])) {
                value = new TreeMap<String, Integer>();
                value.put(words[i+1], 1);
            } else {
                value = pairs.get(words[i]);
                if(!value.containsKey(words[i+1])) {
                    value.put(words[i+1], 1);
                } else {
                    value.put(words[i+1], value.get(words[i+1])+1);
                }
            }
            pairs.put(words[i], value);
        }

        //Print word pairs
        Set<String> keys = pairs.keySet();
        for(String key : keys) {
            System.out.println(key+"="+pairs.get(key));
        }
    }
}
