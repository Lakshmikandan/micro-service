package com.example.dao;

import java.util.Date;

import lombok.Data;

@Data
public class Users {
    private Integer id;
    private String name;
    private Date date;

    public Users(int id, String name, Date date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

}
