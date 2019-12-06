package com.improving.GetMovie.Intercepters;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {
@Id
@GeneratedValue(strategy= GenerationType.AUTO)
private Integer id;


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
