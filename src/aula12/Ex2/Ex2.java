package aula12.Ex2;

import java.util.*;
import java.io.*;

public class Ex2 {
    public static void main(String[] args) {
        List<Movie> moviesList = new ArrayList<Movie>();
        
        //Movies.txt to ArrayList
        Scanner input = null;
        try {
            input = new Scanner(new File("movies.txt"));
        } catch(FileNotFoundException e) {
            System.out.println("Ficheiro movies.txt não encontrado!");
        }
        input.nextLine();
        while(input.hasNextLine()) {
            String[] d = input.nextLine().split("\\t");
            moviesList.add(new Movie(d[0], Double.parseDouble(d[1]), d[2], Type.valueOf(d[3]), Integer.parseInt(d[4])));
        }

        //Sort moviesList by movie name
        Collections.sort(moviesList);

        //Print sorted moviesList
        System.out.printf("%-40s %-10s %-10s %-10s %-15s%n", "Name", "Score", "Rating", "Genre", "Running Time");
        System.out.println("--------------------------------------------------------------------------------------");
        for(Movie m : moviesList) {
            System.out.printf("%-40s %-10.1f %-10s %-10s %-15d%n", m.getName(), m.getScore(), m.getRating(), m.getGenre(), m.getRunTime());
        }
        System.out.println();

        //Sort by score
        ScoreCompare scoreCompare = new ScoreCompare();
        Collections.sort(moviesList, scoreCompare);
        System.out.printf("%-40s %-10s %-10s %-10s %-15s%n", "Name", "Score", "Rating", "Genre", "Running Time");
        System.out.println("--------------------------------------------------------------------------------------");
        for(Movie m : moviesList) {
            System.out.printf("%-40s %-10.1f %-10s %-10s %-15d%n", m.getName(), m.getScore(), m.getRating(), m.getGenre(), m.getRunTime());
        }
        System.out.println();

        //Sort by runTime
        RunTimeCompare runTimeCompare = new RunTimeCompare();
        Collections.sort(moviesList, runTimeCompare);
        System.out.printf("%-40s %-10s %-10s %-10s %-15s%n", "Name", "Score", "Rating", "Genre", "Running Time");
        System.out.println("--------------------------------------------------------------------------------------");
        for(Movie m : moviesList) {
            System.out.println(m);
        }
        System.out.println();

        //Imprimir géneros distintos
        Set<Type> genres = new HashSet<Type>();
        for(Movie m : moviesList) {
            genres.add(m.getGenre());
        }
        System.out.println("List of genres:");
        for(Type g : genres) {
            output.println(g);
        }
        System.out.println();

        //Write in file all movies score > 60 and comedy genre
        List<Movie> filtered = new ArrayList<Movie>();
        for(Movie m : moviesList) {
            if(m.getGenre() == Type.comedy && m.getScore() > 60.0) {
                filtered.add(m);
            }
        }

        PrintWriter output = null;
        try {
            output = new PrintWriter(new File("myselection.txt"));
        } catch(IOException e) {
            System.out.println("Error - File could not be written.");
            System.exit(0);
        }

        for(Movie m : filtered) {
            output.println(m);
        }
        output.close();
    }
}
