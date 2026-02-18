package com.repo.library.domain.book.service;

import com.repo.library.domain.book.domain.Book;
import com.repo.library.domain.book.dto.request.BookRequest;
import com.repo.library.domain.book.domain.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    @Transactional
    public Long registerBook(BookRequest request) {
        Book book = new Book();
        book.setTitle(request.getTitle());
        book.setAuthor(request.getAuthor());

        bookRepository.save(book);

        return book.getId();
    }
}
