package com.example.springdemo.service;

import java.util.List;

import com.example.springdemo.model.User;
import com.example.springdemo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository repo;

    @Autowired
    public UserService(UserRepository r){
        repo = r;
    }

    public List<User> findAll(){
        return (List<User>) repo.findAll();
    }

    public User findUserBySlug(String slug){
        return repo.findBySlug(slug);
    }

    public User save(User u){
        return repo.save(u);
    }

}