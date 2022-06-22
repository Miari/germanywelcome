package com.example.germanywelcomes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class HelloController {

    @Autowired
    HelloRepository repository;

    @GetMapping("/hello")
    public List<Hello> sayHello() {
        return repository.findAll();
    }
}
