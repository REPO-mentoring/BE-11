package com.repo.library.domain.rental.dto.response;

import com.repo.library.domain.rental.domain.Rental;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class RentalResponse {
    private Long id;
    private String userName;
    private String bookTitle;
    private String bookAuthor;
    private LocalDateTime rentalDate;
    private LocalDateTime returnDate;

    public RentalResponse(Rental rental) {
        this.id = rental.getId();
        this.userName = rental.getUser().getName();
        this.bookTitle = rental.getBook().getTitle();
        this.bookAuthor = rental.getBook().getAuthor();
        this.rentalDate = rental.getRentalDate();
        this.returnDate = rental.getReturnDate();
    }
}
