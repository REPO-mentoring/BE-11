package com.repo.library.domain.rental.controller;




import com.repo.library.domain.rental.domain.Rental;
import com.repo.library.domain.rental.dto.request.RentalRequest;
import com.repo.library.domain.rental.dto.response.RentalResponse;
import com.repo.library.domain.rental.service.RentalService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/rentals")
public class RentalController {

    private final RentalService rentalService;

    @PostMapping
    public ResponseEntity<String> rentBook(@RequestBody RentalRequest request) {
        Long rentalId = rentalService.rentalBook(request.getUserId(), request.getBookId());

        return ResponseEntity.ok("대출 성공! 대출 번호: " + rentalId);
    }


    @PostMapping("/{rentalId}/return")
    public ResponseEntity<String> returnBook(@PathVariable Long rentalId) {
        rentalService.returnBook(rentalId);
        return ResponseEntity.ok("반납이 완료되었습니다.");
    }

    @GetMapping("/history/{userId}")
    public ResponseEntity<List<RentalResponse>> getMyHistory(@PathVariable Long userId) {
        List<Rental> rentals = rentalService.getMyRentalHistory(userId);

        List<RentalResponse> responseList = rentals.stream()
                .map(rental -> new RentalResponse(rental))
                .collect(Collectors.toList());

        return ResponseEntity.ok(responseList);
    }
}