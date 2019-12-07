package com.improving.GetMovie;

import com.improving.GetMovie.Intercepters.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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



}