package com.repo.library.domain.user.dto.request;

import lombok.Builder;
import lombok.Getter;

@Getter
public class UserRequest {
    private String name;

    @Builder
    public void setName(String name) {
        this.name = name;
    }
}
