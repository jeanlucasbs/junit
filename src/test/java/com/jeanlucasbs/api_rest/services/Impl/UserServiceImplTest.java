package com.jeanlucasbs.api_rest.services.Impl;

import com.jeanlucasbs.api_rest.domain.User;
import com.jeanlucasbs.api_rest.dto.UserDTO;
import com.jeanlucasbs.api_rest.repositories.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class UserServiceImplTest {

    public static final Integer ID      = 1;
    public static final String JEAN     = "Jean";
    public static final String MAIL     = "jean@gmail.com";
    public static final String NUMBER   = "123";
    @InjectMocks
    private UserServiceImpl service;
    @Mock
    private UserRepository repository;
    @Mock
    private ModelMapper mapper;
    private User user;
    private UserDTO userDTO;
    private Optional<User> optionalUser;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        startUser();
    }

    @Test
    void whenFindByIdThenReturnAnUserInstance() {
        Mockito.when(repository.findById(Mockito.anyInt())).thenReturn(optionalUser);

        User response = service.findById(ID);

        Assertions.assertNotNull(response);
        Assertions.assertEquals(User.class, response.getClass());
        Assertions.assertEquals(ID, response.getId());
    }

    @Test
    void findAll() {
    }

    @Test
    void createUser() {
    }

    @Test
    void updateUser() {
    }

    @Test
    void deleteUser() {
    }

    @Test
    void findByEmail() {
    }

    private void startUser(){

        user = new User(ID, JEAN, MAIL, NUMBER);
        userDTO = new UserDTO(ID, JEAN, MAIL, NUMBER);
        optionalUser = Optional.of(new User(ID, JEAN, MAIL, NUMBER));
    }
}