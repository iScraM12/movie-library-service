package com.iscram.adapter.rest.movie;

import com.iscram.domain.model.movie.Movie;
import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface MovieMapper {
    MovieDto toDto(Movie movie);
    Movie toEntity(MovieDto movieDto);
}
