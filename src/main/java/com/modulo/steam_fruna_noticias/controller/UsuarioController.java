package com.modulo.steam_fruna_noticias.controller;

import com.modulo.steam_fruna_noticias.model.Usuario;
import com.modulo.steam_fruna_noticias.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/")
    public List<Usuario> getAllUsuarios() {
        return usuarioService.getAllUsuarios();
    }
    @PostMapping("/add")
    public String addUsuario(@RequestBody Usuario usuario) {
        usuarioService.addUsuario(usuario);
        return "Usuario agregado";
    }
    @GetMapping("/{id}")
    public Usuario getUsuarioById(@PathVariable int id) {
        return usuarioService.getUsuarioById(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteUsuario(@PathVariable int id) {
        usuarioService.deleteUsuario(id);
        return "Usuario eliminado";
    }

}
