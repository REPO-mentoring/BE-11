package com.repo.library.domain.user.service;

import com.repo.library.domain.user.domain.User;
import com.repo.library.domain.user.dto.request.UserRequest;
import com.repo.library.domain.user.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public Long registerUser(UserRequest userRequest) {
         User user = new User();
         user.builder()
                 .name(userRequest.getName())
                 .build();
         userRepository.save(user);

         return user.getId();
    }
}
