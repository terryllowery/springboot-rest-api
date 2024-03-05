package net.lowerytech.springbootrestapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@RestController
public class CallGoogleController {

    @GetMapping("/callgoogle")
    public String callGoogle() throws IOException  {
       URL url = new URL("https://www.google.com");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        System.out.println("Inside callGoogle");
        System.out.println(con.getContent().toString());
        return "callGoogle";
    }
}
