package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dominio.Saludo;

import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@AllArgsConstructor
@RestController
@RequestMapping("/saludo")
public class DemoController {
    
    @Autowired
    @Qualifier("antonio")
    public Saludo getAntonio;

    @Autowired
    @Qualifier("juan")
    public Saludo getJuan;
    
    @GetMapping("/antonio")
    public String saludar1() {

        return getAntonio.getSaludo();
    }

    @GetMapping("/juan")
    public String saludar2() {

        return getJuan.getSaludo();
    }

}
