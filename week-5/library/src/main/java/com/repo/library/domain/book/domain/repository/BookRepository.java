package com.repo.library.domain.book.domain.repository;

import com.repo.library.domain.book.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
