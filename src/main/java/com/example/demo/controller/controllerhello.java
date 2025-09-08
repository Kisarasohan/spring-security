package com.example.demo.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllerhello {

    @GetMapping("/")
    public String publicHello(HttpServletRequest request) {
        return "Hello, this is a public endpoint!" + request.getSession().getId();
    }

    @PostMapping("/")
    public String postHello(HttpServletRequest request) {
        return " ";
    }
}
