package com.example.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoServices {
    public static List<Users> users = new ArrayList<>();
    private static int count = 2;

    static {
        users.add(new Users(1, "Lakshmi", new Date()));
        users.add(new Users(2, "Aswathi", new Date()));
    }

    public List<Users> findAll() {
        return users;
    }

    public Users save(Users user) {
        // System.out.println(user.getId());
        if (user.getId() == null) {
            user.setId(count++);
        }
        users.add(user);
        return user;
    }

    public Users findOne(int id) {
        for (Users user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

}