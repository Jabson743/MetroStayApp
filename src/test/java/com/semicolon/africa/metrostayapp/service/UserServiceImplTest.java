package com.semicolon.africa.metrostayapp.service;

import com.semicolon.africa.metrostayapp.data.repository.UserRepository;
import com.semicolon.africa.metrostayapp.dto.request.CreateUserRequest;
import com.semicolon.africa.metrostayapp.dto.response.CreateUserResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
public class UserServiceImplTest {
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;

    @Test
    public void testThatUserCanCreateAccount(){
        CreateUserRequest createUserRequest = new CreateUserRequest();
        createUserRequest.setEmail("Stan5@gmail.com");
        createUserRequest.setFullName("stanley ugochukwu");
        createUserRequest.setPhoneNumber("09045317890");
        createUserRequest.setPassword("password");
        CreateUserResponse createUserResponse = new CreateUserResponse();
        createUserResponse.getMessage();
        assertEquals(createUserResponse.getMessage(),"Account created successfully");
        assertEquals(userRepository.count(),1);

    }

}