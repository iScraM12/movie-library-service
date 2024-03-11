package com.iscram.adapter.rest.movie;

import com.iscram.adapter.rest.cast.CastMemberDto;
import com.iscram.domain.model.AgeRestriction;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class MovieDto {
    @NotNull
    String id;
    @NotNull
    String name;
    @NotNull
    List<CastMemberDto> cast;
    @NotNull
    AgeRestriction ageRestriction;
    @NotNull
    LocalDate releaseDate;
}
