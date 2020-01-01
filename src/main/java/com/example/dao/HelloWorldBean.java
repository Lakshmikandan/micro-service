package com.example.dao;

import lombok.Data;

@Data
public class HelloWorldBean {
    public String message;

    public HelloWorldBean(String msg) {
        this.message = msg;
    }

}