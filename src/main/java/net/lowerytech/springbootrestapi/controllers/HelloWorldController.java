package net.lowerytech.springbootrestapi.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


    @GetMapping("/")
    public String hello() {
        return "hello";
    }
}
