package com.iscram.domain.model.movie;

import com.iscram.domain.model.AgeRestriction;
import com.iscram.domain.model.cast.CastMember;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Data
@Entity
public class Movie {
    @Id
    UUID id;

    String name;

    @ManyToMany
    @JoinTable(name = "movie_cast",
        joinColumns = {@JoinColumn(name = "fk_movie")},
        inverseJoinColumns = {@JoinColumn(name = "fk_cast_member")})
    List<CastMember> cast = new ArrayList<CastMember>();

    AgeRestriction ageRestriction;
    LocalDate releaseDate;
}
