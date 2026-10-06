package com.repo.library.domain.rental.domain;

import com.repo.library.domain.book.domain.Book;
import com.repo.library.domain.user.domain.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "loan_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id")
    private Book book;

    private LocalDateTime rentalDate;

    private LocalDateTime returnDate;

    public void setUser(User user) {
        this.user = user;
        user.getRentals().add(this);
    }

    public void setBook(Book book) {
        this.book = book;
        user.getRentals().add(this);
    }

    public void setRentalDate(LocalDateTime RentalDate) {
        this.rentalDate = RentalDate;
        user.getRentals().add(this);
    }

    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
        user.getRentals().add(this);
    }
}
