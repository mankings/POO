package aula12.Ex2;

public class Movie implements Comparable<Movie> {
    private String name, rating;
    private Type genre;
    private double score;
    private int runTime;
    public Movie(String n, double s, String r, Type g, int t) {
        this.name = n;
        this.score = s;
        this.rating = r;
        this.genre = g;
        this.runTime = t;
    }

    @Override
    public int compareTo(Movie m) {
        return this.getName().toLowerCase().compareTo(m.getName().toLowerCase());
    }

    public String toString() {
        return String.format("%-40s %-10.1f %-10s %-10s %-15d", this.getName(), this.getScore(), this.getRating(), this.getGenre(), this.getRunTime());
    }

    public String getName() {return name;}
    public double getScore() {return score;}  
    public String getRating() {return rating;}
    public Type getGenre() {return genre;}
    public int getRunTime() {return runTime;}
}
