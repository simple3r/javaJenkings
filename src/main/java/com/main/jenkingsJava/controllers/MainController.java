package com.main.jenkingsJava.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/test")
public class MainController {

    @GetMapping("/hola")
    public String holaMundo(){
        String saludo = "HOLA MUNDO";
        return saludo;
    }
}
