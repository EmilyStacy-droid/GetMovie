package com.improving.GetMovie;

import com.improving.GetMovie.Intercepters.Movie;
import com.improving.GetMovie.Intercepters.MovieRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
public class AnotherAPIController {
private MovieRepository movieRepository;

    public AnotherAPIController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

//    @GetMapping("/")
//    public String redirect(){
//        return "redirect:/home";
//    }

    @RequestMapping(value="/api", method= RequestMethod.GET)
    public List<Movie> home(ModelMap model, Principal principal) {
       return movieRepository.getMovies();

    }

    @GetMapping("/api/{id}")
    public Movie movie (@PathVariable int id){
        if(id > 0) {
        return movieRepository.getMovie(id-1);
        }
        return movieRepository.getMovie(0);
    }
}
