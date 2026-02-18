package com.repo.library.domain.book.controller;


import com.repo.library.domain.book.dto.request.BookRequest;
import com.repo.library.domain.book.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/books")
public class BookController {
    private final BookService bookService;

    @PostMapping
    public ResponseEntity<String> registerBook(@RequestBody BookRequest request) {
        Long bookId = bookService.registerBook(request);
        return ResponseEntity.ok("책 등록 완료! ID: " + bookId);
    }
}
