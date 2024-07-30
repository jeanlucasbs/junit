package com.jeanlucasbs.api_rest.services.Impl;

import com.jeanlucasbs.api_rest.exceptions.ObjectNotFoundException;
import com.jeanlucasbs.api_rest.domain.User;
import com.jeanlucasbs.api_rest.repositories.UserRepository;
import com.jeanlucasbs.api_rest.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow( () -> new ObjectNotFoundException("Usuário não encontrado."));
    }
}
