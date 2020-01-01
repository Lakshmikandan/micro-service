package com.example.Exception;

import java.util.Date;

import lombok.Data;

@Data
public class Exception {
    private Date date;
    private String message;
    private String details;

    public Exception(Date date, String message, String details) {
        this.date = date;
        this.message = message;
        this.details = details;
    }
}