package com.improving.GetMovie;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.data.repository.CrudRepository;
import com.improving.GetMovie.Intercepters.Movie;

import java.util.List;

public interface MoviesRepository extends CrudRepository<Movie, Integer> {

//    List<Movie> findAll();


}
