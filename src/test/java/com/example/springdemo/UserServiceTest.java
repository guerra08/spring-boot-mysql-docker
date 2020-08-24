package com.example.springdemo;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import static java.util.Arrays.asList;

import com.example.springdemo.model.User;
import com.example.springdemo.repository.UserRepository;
import com.example.springdemo.service.UserService;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTest {

    @Mock
    private UserRepository repo;
    
    @InjectMocks
    private UserService service = new UserService();

    @Test
    void testFindAll(){
        User test = new User("Bruno", "umaemailqualquer@outlook.com");
        when(service.findAll()).thenReturn(asList(test));
        assertEquals("Bruno", service.findAll().get(0).getName());
    }

}