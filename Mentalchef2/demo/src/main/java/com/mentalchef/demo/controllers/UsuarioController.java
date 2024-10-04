package com.mentalchef.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mentalchef.demo.aplicacion.AplicacionUsuarios;
import com.mentalchef.demo.modelos.Chef;
import com.mentalchef.demo.modelos.Pinche;
import com.mentalchef.demo.modelos.Usuario;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestParam;



@AllArgsConstructor
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    
    AplicacionUsuarios aplicacionUsuarios;

    @GetMapping("")
    public List<Usuario> getUsuarios() {
        return aplicacionUsuarios.getUsuarios();
    }

    @GetMapping("/insertar")
    public String insertarUsuario(Usuario usuario) {
        return aplicacionUsuarios.insertUsuario(usuario);
    }
    
    @GetMapping("/insertarPrueba")
    public String insertarUsuarioPrueba() {

        Usuario usuario = new Usuario("Álvaro", "soy yo", "acapillasa22dw@ikzubirimanteo.com", "1234", 0);
        Pinche pinche = new Pinche("pepe", "nide", "111", "12345", 0, 0);
        Chef chef = new Chef("lara", "nadiee", "rampo", "12345566", 0, 0);
        aplicacionUsuarios.insertUsuario(pinche);
        aplicacionUsuarios.insertUsuario(chef);
        return aplicacionUsuarios.insertUsuario(usuario);
    }

}
