package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // GET HTTP Method
    // http://localhost:8080/hello
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World!";
    }

    // GET HTTP Method
    // http://localhost:8080/helloYou
    @GetMapping("/helloYou")
    public String helloYou() {
        return "Hello, User!";
    }
}