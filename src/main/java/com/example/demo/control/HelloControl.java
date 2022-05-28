package com.example.demo.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloControl {
    @GetMapping("")
    public String get(){
        System.out.println("hello word");
        return "hello";
    }

}
