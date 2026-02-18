package com.repo.library.domain.rental.domain.repository;

import com.repo.library.domain.rental.domain.Rental;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RentalRepository extends JpaRepository<Rental, Long> {
    List<Rental> findAllByUserIdOrderByRentalDateDesc(Long userId);
}
