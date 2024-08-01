package com.jeanlucasbs.api_rest.services;

import com.jeanlucasbs.api_rest.domain.User;
import com.jeanlucasbs.api_rest.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();

    User createUser(UserDTO userDTO);

    User updateUser(UserDTO userDTO);

    void deleteUser(Integer id);

}
