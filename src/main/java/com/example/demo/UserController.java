package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    // GET HTTP Method
    // http://localhost:8080/users
    @GetMapping("/users")
    @ResponseBody
    public Object getUsers() {
        Map<String, Object> object = new HashMap<>();
        User credentials = new User("myUsername", "myPassword");
        return credentials;
    }
}