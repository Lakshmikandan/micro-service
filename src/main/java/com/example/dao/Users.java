package com.example.dao;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Users {
    private Integer id;
    @Size(min = 3)
    private String name;
    @Past
    private Date date;

    public Users(int id, String name, Date date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

}
