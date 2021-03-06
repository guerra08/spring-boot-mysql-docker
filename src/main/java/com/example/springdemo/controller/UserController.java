package com.example.springdemo.controller;

import com.example.springdemo.model.User;
import com.example.springdemo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class UserController {

    private final UserService service;

    @Autowired
    public UserController(UserService service){
        this.service = service;
    }
    
    @GetMapping("/new-user")
    public String getNewUserPage() {
        return "new-user";
    }

    @PostMapping("/new-user")
    public String postNewUser(@ModelAttribute User user) {
        service.save(user);
        return "redirect:/users";
    }

    @GetMapping("users")
    public String getAllUsers(Model model){
        model.addAttribute("users", service.findAll());
        return "users";
    }

    @GetMapping("/users/{slug}")
    public String getUserBySlug(@PathVariable String slug, Model model){
        model.addAttribute("user", service.findUserBySlug(slug));
        return "user";
    }

}