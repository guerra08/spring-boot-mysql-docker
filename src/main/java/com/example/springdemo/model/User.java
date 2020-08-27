package com.example.springdemo.model;

import com.example.springdemo.utils.Formatting;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
    private String slug;

    public User(String name, String email) {
        this.name   = name;
        this.email  = email;
    }

    public User(){

    }

    public String getSlug() { return slug; }

    public void setSlug(String slug) { this.slug = slug; }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @PostPersist
    protected void generateSlug() {
        this.slug = Formatting.toSlug(name) + "." + id;
    }

}