package net.lowerytech.springbootrestapi.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@RestController
public class AnotherController2 {

    @GetMapping("/another2")
    public String another() throws IOException {
        URL url = new URL("http://localhost:8080/callgoogle");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        System.out.println(con.getContent().toString());
        return "another2";
    }
}
