package com.iscram.adapter.repository;

import com.iscram.domain.model.cast.CastMember;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CastRepository implements PanacheRepository<CastMember> {

}
