package com.iscram.domain.usecase;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.UUID;

@ApplicationScoped
public class AddMemberUseCase {
    public String addMember(){
        UUID uuid = UUID.randomUUID();

        return uuid.toString();
    }
}
