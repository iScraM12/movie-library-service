package com.iscram.adapter.rest.cast;

import com.iscram.domain.model.cast.CastMember;
import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface CastMemberMapper {
    CastMemberDto toDto(CastMember castMember);
    CastMember toEntity(CastMemberDto castMemberDto);
}
