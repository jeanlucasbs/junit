package com.jeanlucasbs.api_rest.repositories;

import com.jeanlucasbs.api_rest.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
