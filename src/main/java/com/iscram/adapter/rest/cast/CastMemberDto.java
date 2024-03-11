package com.iscram.adapter.rest.cast;

import com.iscram.domain.model.cast.Postition;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CastMemberDto {
    String id;
    String name;
    String surname;
    Postition postition;
}
