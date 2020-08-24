package com.example.springdemo.service;

import java.util.List;

import com.example.springdemo.model.User;
import com.example.springdemo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    private UserRepository uRepo;

    public UserService(){}

    public List<User> findAll(){
        return (List<User>) uRepo.findAll();
    }

    public void save(User u){
        uRepo.save(u);
    }

}