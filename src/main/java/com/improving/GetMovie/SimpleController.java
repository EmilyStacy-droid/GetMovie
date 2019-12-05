package com.improving.GetMovie;

import com.improving.GetMovie.Intercepters.MovieRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;

@Controller
public class SimpleController {
private MovieRepository movieRepository;

    public SimpleController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

@RequestMapping(value="/movies",  method= RequestMethod.GET)
    public String home(ModelMap model) {
    model.put("movies", movieRepository.getMovies());
    return "movies";
}


//private void setCommonModelAttribute(ModelMap model, Principal principal) {
//    model.put("movies", movieRepository.getMovies());
//}


}
