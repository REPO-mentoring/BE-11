package com.repo.library.domain.user.domain.repository;

import com.repo.library.domain.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
