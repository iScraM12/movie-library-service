package com.iscram.domain.usecase;

import com.iscram.adapter.rest.movie.MovieDto;
import com.iscram.adapter.rest.movie.MovieMapper;
import com.iscram.domain.service.movie.MovieService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class ReadMovieUsecase {
    @Inject
    MovieService movieService;

    @Inject
    MovieMapper movieMapper;

    public List<MovieDto> listAll(){
        return movieService.findAllMovies()
                .stream()
                .map(movie -> movieMapper.toDto(movie))
                .collect(Collectors.toList());
    }

    public MovieDto getMovie(String name){
        return movieMapper.toDto(movieService.findByName(name));
    }
}
