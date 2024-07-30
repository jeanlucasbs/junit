package com.jeanlucasbs.api_rest.services;

import com.jeanlucasbs.api_rest.domain.User;

public interface UserService {

    User findById(Integer id);
}
