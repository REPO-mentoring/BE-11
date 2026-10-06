package com.repo.library.domain.rental.service;

import com.repo.library.domain.book.domain.Book;
import com.repo.library.domain.book.domain.repository.BookRepository;
import com.repo.library.domain.rental.domain.Rental;
import com.repo.library.domain.rental.domain.repository.RentalRepository;
import com.repo.library.domain.user.domain.User;
import com.repo.library.domain.user.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class RentalService {
    private final UserRepository userRepository;
    private final BookRepository bookRepository;
    private final RentalRepository rentalRepository;


    @Transactional
    public Long rentalBook(Long userId, Long bookId) {

        User user = userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 회원입니다."));
        Book book = bookRepository.findById(bookId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 책입니다."));

        Rental rental = new Rental();
        rental.setUser(user);
        rental.setBook(book);
        rental.setRentalDate(LocalDateTime.now());

        rentalRepository.save(rental);

        return rental.getId();
    }

    @Transactional
    public void returnBook(Long rentalId) {
        Rental rental = rentalRepository.findById(rentalId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 대출 기록입니다."));

        if (rental.getReturnDate() != null) {
            throw new IllegalStateException("이미 반납된 책입니다.");
        }

        rental.setReturnDate(LocalDateTime.now());
    }

    @Transactional(readOnly = true)
    public List<Rental> getMyRentalHistory(Long userId) {
        return rentalRepository.findAllByUserIdOrderByRentalDateDesc(userId);
    }
}
