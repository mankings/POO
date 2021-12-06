package aula12.Ex2;

import java.util.*;

public class ScoreCompare implements Comparator<Movie> {
    public int compare(Movie m1, Movie m2) {
        return (int) (m2.getScore() - m1.getScore()); //ordem decrescente
    }
}
