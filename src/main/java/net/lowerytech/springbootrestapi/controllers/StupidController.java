package net.lowerytech.springbootrestapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@RestController
public class StupidController {

    @GetMapping("/stupid")
    public String stupid() throws IOException {
        URL url = new URL("http://localhost:8080/another");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        System.out.println(con.getContent().toString());
        return "stupid";
    }
}
