package net.lowerytech.springbootrestapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StupidController {

    @GetMapping("/stupid")
    public String stupid() {
        return "stupid";
    }
}
