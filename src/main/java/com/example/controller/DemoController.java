package com.example.controller;

import com.example.dao.HelloWorldBean;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping(path = "/hello-world")
    public String helloWord() {
        return "Hello World";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World Bean");
    }

    @GetMapping(path = "/hello-world/param/{name}")
    public HelloWorldBean helloWorldParam(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World %s", name));
        // return new HelloWorldBean("Hello");
    }

}