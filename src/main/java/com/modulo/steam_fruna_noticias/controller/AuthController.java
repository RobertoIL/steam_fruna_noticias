package com.modulo.steam_fruna_noticias.controller;

import com.modulo.steam_fruna_noticias.model.Usuario;
import com.modulo.steam_fruna_noticias.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/api")
public class AuthController {
    @Autowired
    UsuarioRepository usuarioRepository;

    @PostMapping("/register")
    public Usuario register(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }




}



