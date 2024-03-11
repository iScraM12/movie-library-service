package com.iscram.domain.model.cast;

import com.iscram.domain.model.movie.Movie;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Entity
public class CastMember {
    @Id
    UUID id;
    String name;
    String surname;
    Postition postition;

    @ManyToMany(mappedBy = "cast")
    private List<Movie> cast = new ArrayList<Movie>();
}
