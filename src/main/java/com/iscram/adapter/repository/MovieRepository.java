package com.iscram.adapter.repository;

import com.iscram.domain.model.AgeRestriction;
import com.iscram.domain.model.movie.Movie;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.time.LocalDate;
import java.util.List;

@ApplicationScoped
public class MovieRepository implements PanacheRepository<Movie> {
    public List<Movie> findAllMovies() {return listAll(); }
    public Movie findByName(String name){
        return find("name", name).firstResult();
    }

    public List<Movie> findUnrestricted(){
        return list("ageRestriction", AgeRestriction.PG0);
    }

    public List<Movie> findReleased(){
        return list("releaseDate < ?1", LocalDate.now());
    }
}
