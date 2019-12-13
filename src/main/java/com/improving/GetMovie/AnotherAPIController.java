package com.improving.GetMovie;

import com.improving.GetMovie.Intercepters.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.Optional;

@Controller
@RequestMapping(path="/api")
public class AnotherAPIController {

    @Autowired
    private MoviesRepository moviesRepository;

    @GetMapping(path = "/movies")
    public @ResponseBody
    Iterable<Movie> getAllMovies() {

        return moviesRepository.findAll();
    }


@GetMapping(path = "/movies/{id}")
public @ResponseBody
Optional<Movie> getAllById(@PathVariable Integer id){
        if(id!=null) {
        return moviesRepository.findById(id);
        }
        return null;
}

@RequestMapping(path="/movies/add", method = RequestMethod.POST)
@ResponseBody
    public void addMovie(@RequestParam(required=false, name = "movieTitle") String movieTitle, @RequestParam(name = "genre") String genre, @RequestParam(name = "country") String country, @RequestParam(required = true, name = "movieYear") String movieYear, @RequestParam(required = false, name = "actors") String actors) {
       Movie movie = new Movie();
        movie.setMovieTitle(movieTitle);
        movie.setGenre(genre);
        Integer movieYearint = Integer.parseInt(movieYear);
        movie.setMovieYear(movieYearint);
        movie.setCountry(country);
        moviesRepository.save(movie);




}


}