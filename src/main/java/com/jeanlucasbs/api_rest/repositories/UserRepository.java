package com.jeanlucasbs.api_rest.repositories;

import com.jeanlucasbs.api_rest.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}
