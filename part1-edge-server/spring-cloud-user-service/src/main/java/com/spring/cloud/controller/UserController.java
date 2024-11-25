package com.spring.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/user-service")
public class UserController {
    @GetMapping("/hello-world")
    public String helloWorld() {
        return "User service, Hello World!";
    }
}
