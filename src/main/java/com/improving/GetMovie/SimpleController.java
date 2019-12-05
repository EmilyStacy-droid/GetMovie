package com.improving.GetMovie;

import com.improving.GetMovie.Intercepters.Movie;
import com.improving.GetMovie.Intercepters.MovieRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
public class SimpleController {
private MovieRepository movieRepository;

    public SimpleController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

//    @GetMapping("/")
//    public String redirect(){
//        return "redirect:/home";
//    }

    @RequestMapping(value="/movies", method= RequestMethod.GET)
    public List<Movie> home(ModelMap model, Principal principal) {
       return movieRepository.getMovies();

    }
}
