package com.repo.library.domain.user.controller;

import com.repo.library.domain.user.dto.request.UserRequest;
import com.repo.library.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    @PostMapping
    public ResponseEntity<String> registerUser(@RequestBody UserRequest request) {
        Long userId = userService.registerUser(request);
        return ResponseEntity.ok("회원 가입 완료! ID: " + userId);
    }
}
