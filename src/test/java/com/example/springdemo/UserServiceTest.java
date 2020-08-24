package com.example.springdemo;


import static org.junit.jupiter.api.Assertions.*;

import com.example.springdemo.service.UserService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTest {
    
    @Autowired
    UserService service;

    @Test
    void testFindAll(){
        assertTrue(service.findAll().isEmpty());
    }

}