package com.repo.library.domain.book.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Getter
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Long id;

    private String title;
    private String author;

    @Builder
    public void setTitle(String title) {
        this.title = title;
    }
    @Builder
    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String title) {
        this.title = title;
    }


}
