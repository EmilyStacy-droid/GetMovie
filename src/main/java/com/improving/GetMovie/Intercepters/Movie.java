package com.improving.GetMovie.Intercepters;

import javax.persistence.*;

@Entity(name = "movie")

public class Movie {

@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private Integer id;

//@Column(name="movieTitle")
private String movieTitle;

//@Column(name="genre")
private  String genre;
//@Column(name="movieYear")
private Integer movieYear;

//@Column(name="country")
private String country;

//@Column(name="actors")
private String actors;


//    public Movie(String movieTitle, String genre, Integer movieYear, String country, String actors) {
//        this.movieTitle = movieTitle;
//        this.genre = genre;
//        this.movieYear = movieYear;
//        this.country = country;
//        this.actors = actors;
//    }

    public Movie() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getGenre() {
        return genre;
    }

    public int getMovieYear() {
        return movieYear;
    }

    public String getCountry() {
        return country;
    }

    public String getActors() {
        return actors;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setMovieYear(Integer movieYear) {
        this.movieYear = movieYear;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }
}
