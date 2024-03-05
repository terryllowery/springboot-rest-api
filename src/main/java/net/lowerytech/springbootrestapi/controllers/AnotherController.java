package net.lowerytech.springbootrestapi.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@RestController
public class AnotherController {

    @GetMapping("/another")
    public String another() throws IOException {
        URL url = new URL("http://localhost:8080/another2");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        System.out.println(con.getContent().toString());
        return "another";
    }
}
