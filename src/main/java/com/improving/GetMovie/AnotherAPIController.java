package com.improving.GetMovie;

import com.improving.GetMovie.Intercepters.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static org.graalvm.compiler.nodeinfo.Verbosity.Id;

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


//    @GetMapping(path="/api/movies/${id}")
//        public @ResponseBody
//        Iterable<Movie> getMovieById(@PathVariable String id){
//        return moviesRepository.findAllById(id);
//
//    }


}