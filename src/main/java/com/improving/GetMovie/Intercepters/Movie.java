package com.improving.GetMovie.Intercepters;

public class Movie {

    private final String movieTitle;
    private final int year;
    private final String genre;
    private final String country;
    private final String actors;

    public Movie(String movieTitle, int year, String genre, String country, String actors) {
        this.movieTitle = movieTitle;
        this.year = year;
        this.genre = genre;
        this.country = country;
        this.actors = actors;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public String getCountry() {
        return country;
    }

    public String getActors() {
        return actors;
    }
}
