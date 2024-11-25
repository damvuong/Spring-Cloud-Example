package com.spring.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@RequestMapping("/v1/todo-list-service")
public class TodoListController {
    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Todo list service, Hello World! with IP: " + getHostIp();
    }

    private String getHostIp() {
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            return inetAddress.getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return "Unable to fetch IP";
        }
    }
}
