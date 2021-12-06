package aula12.Ex2;

import java.util.*;

public class RunTimeCompare implements Comparator<Movie> {
    public int compare(Movie m1, Movie m2) {
        return (m1.getRunTime() - m2.getRunTime()); //ordem crescente
    }
}
