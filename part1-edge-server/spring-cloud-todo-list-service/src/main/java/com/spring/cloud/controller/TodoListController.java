package com.spring.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/todo-list-service")
public class TodoListController {
    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Todo list service, Hello World!";
    }
}
