package com.portfolio.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("/hola/{nombre}")
    public String decirHola(@PathVariable String nombre){
        return "holaaaa"+ nombre;
    }
}
