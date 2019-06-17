package com.wildcodeschool.myProjectWithSecurity.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


    @GetMapping("/")
    public String welcome(){
        return "Welcome to the shield";
    }

    @GetMapping("/avengers/assemble")
    public String assemble(){
        return "Avengers...assemble !";
    }

    @GetMapping("/secret-bases")
    public String schools(){
        return "<ul>" +
                "<li>" +
                "La Loupe" +
                "</li>" +
                "<li>" +
                "Bordeaux" +
                "</li>" +
                "<li>" +
                "Paris" +
                "</li>" +
                "<li>" +
                "ect..." +
                "</li>" +
                "</ul>";
    }
}
