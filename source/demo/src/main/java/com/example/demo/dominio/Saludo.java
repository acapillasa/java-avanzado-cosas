package com.example.demo.dominio;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Saludo {
    
    private String nombre;


    public String getSaludo() {
        return "hola soy "+ nombre;
    }

}
