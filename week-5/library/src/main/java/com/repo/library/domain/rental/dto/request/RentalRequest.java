package com.repo.library.domain.rental.dto.request;

import lombok.Getter;

@Getter
public class RentalRequest {
    private Long userId;
    private Long bookId;
}
