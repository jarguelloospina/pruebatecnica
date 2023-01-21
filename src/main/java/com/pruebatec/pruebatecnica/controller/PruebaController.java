package com.pruebatec.pruebatecnica.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PruebaController {

    @RequestMapping("/pruebaRest")
    public String pruebaRest() {

        System.out.println("funciona");

        return "Configuration";
    }
    
}
