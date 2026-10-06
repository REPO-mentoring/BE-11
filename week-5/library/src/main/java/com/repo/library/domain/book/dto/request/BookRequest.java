package com.repo.library.domain.book.dto.request;

import lombok.Getter;

@Getter
public class BookRequest {
    private String title;
    private String author;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
