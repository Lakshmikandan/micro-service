package com.example.controller;

import java.util.List;

import javax.validation.Valid;

import com.example.dao.UserDaoServices;
import com.example.dao.Users;
import com.example.exception.UserNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

    @Autowired
    private UserDaoServices service;

    @GetMapping("/users")
    public List<Users> retriveAllUsers() {
        return service.findAll();
    }

    @GetMapping("/users/{id}")
    public Users retriveUser(@PathVariable int id) {
        Users user = service.findOne(id);

        if (user == null) {
            throw new UserNotFoundException("id-" + id);
        }
        return service.findOne(id);
    }

    @PostMapping("/users")
    public @ResponseBody String createUsers(@Valid @RequestBody Users user) {
        Users saveUser = service.save(user);
        return "New User Added Succssfully";
    }
}