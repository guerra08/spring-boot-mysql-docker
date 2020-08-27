package com.example.springdemo;

import com.example.springdemo.model.User;
import com.example.springdemo.service.UserService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class UserServiceTest {

    @Autowired
    private UserService service;

    @Test
    void testInsertNewUser(){
        User u = new User("Bruno Juca", "gguerrabruno@outlook.com");
        assertNotNull(service.save(u));
    }

    @Test
    void testInsert_thenFindByStub(){
        User u = new User("Carlos Silva", "carloss@gmail.com");
        service.save(u);
        assertNotNull(service.findUserBySlug("carlos-silva"));
    }

}