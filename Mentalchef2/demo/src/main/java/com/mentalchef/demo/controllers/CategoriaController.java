package com.mentalchef.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mentalchef.demo.aplicacion.IAplicacionCategorias;
import com.mentalchef.demo.modelos.Categoria;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@AllArgsConstructor
@RequestMapping("/categorias")
public class CategoriaController {
    
    IAplicacionCategorias aplicacionCategorias;

    @GetMapping("")
    public List<Categoria> getCategorias() {
        return aplicacionCategorias.getCategorias();
    }

    @GetMapping("/insertar")
    public String insertarCategoria(Categoria categoria) {
        return aplicacionCategorias.insertCategoria(categoria);
    }
    
}
