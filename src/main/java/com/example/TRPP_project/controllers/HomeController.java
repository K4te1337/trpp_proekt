package com.example.TRPP_project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class HomeController {
    @GetMapping("/home")
    public String home(){
        return "home.html";
    }
    @GetMapping("/researches")
    public String researches(){
        return "Researches.html";
    }
    @GetMapping("/gallery")
    public String gallery(){
        return "Gallery.html";
    }
}
