package com.iscram.domain.service.movie;

import com.iscram.adapter.repository.MovieRepository;
import com.iscram.domain.model.movie.Movie;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class MovieService {
    @Inject
    MovieRepository movieRepository;

    public List<Movie> findAllMovies(){return movieRepository.listAll(); }
    public Movie findByName(String name){
        return movieRepository.findByName(name);
    }

    public List<Movie> findUnrestricted(){
        return movieRepository.findUnrestricted();
    }

    public List<Movie> findReleased(){
        return movieRepository.findReleased();
    }
}
