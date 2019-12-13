package com.improving.GetMovie;

import com.improving.GetMovie.Intercepters.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import javax.validation.Valid;
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


@GetMapping(path = "/movie/{id}")
public @ResponseBody
Optional<Movie> getAllById(@PathVariable Integer id){
        if(id!=null) {
        return moviesRepository.findById(id);
        }
        return null;
}

@RequestMapping(path="/movie/add", method = RequestMethod.POST)
@ResponseBody
    public void addMovie(@RequestParam(required=true, name = "movieTitle") String movieTitle, @RequestParam(name = "genre") String genre, @RequestParam(name = "country") String country, @RequestParam(required = true, name = "movieYear") String movieYear, @RequestParam(required = false, name = "actors") String actors) {
        Movie movie = new Movie();
        movie.setMovieTitle(movieTitle);
        movie.setGenre(genre);
        Integer movieYearint = Integer.parseInt(movieYear);
        movie.setMovieYear(movieYearint);
        movie.setCountry(country);
        moviesRepository.save(movie);
}

@PutMapping(path="/movie/{id}")
 public ResponseEntity<Movie> updateMovie(@PathVariable(value = "id") Integer id, @Valid @RequestBody Movie movieDetails) throws Exception{
        Movie movie = moviesRepository.findById(id).orElseThrow(()-> new Exception("Movie id not found :" + id));
        movie.setMovieTitle(movieDetails.getMovieTitle());
        movie.setMovieYear(movieDetails.getMovieYear());
        movie.setGenre(movieDetails.getGenre());
        movie.setCountry(movieDetails.getCountry());
        movie.setActors(movieDetails.getActors());

    final Movie updatedMovie = moviesRepository.save(movie);
        return ResponseEntity.ok(updatedMovie);

}

}