package com.jeanlucasbs.api_rest.services;

import com.jeanlucasbs.api_rest.domain.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();
}
