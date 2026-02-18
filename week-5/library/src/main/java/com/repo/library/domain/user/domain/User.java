package com.repo.library.domain.user.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.repo.library.domain.rental.domain.Rental;
import jakarta.persistence.*;
import lombok.*;

import java.util.*;


@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Rental> rentals = new ArrayList<>();

    @Builder
    public void setName(String name) {
        this.name = name;
    }
}
