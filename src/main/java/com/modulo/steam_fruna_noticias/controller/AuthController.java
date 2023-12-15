package com.modulo.steam_fruna_noticias.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.modulo.steam_fruna_noticias.model.Usuario;
import com.modulo.steam_fruna_noticias.repository.UsuarioRepository;
import com.modulo.steam_fruna_noticias.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/api")
public class AuthController {
    @Autowired
    AuthService authService;

    record RegisterRequest(String username, String nombre, String email, String password, @JsonProperty("password-confirm") String passwordConfirm) { }
    record RegisterResponse(String username, String nombre, String email) {}

    @PostMapping("/register")
    public RegisterResponse register(@RequestBody RegisterRequest usuario) {
        var usuarioRegistrado = authService.register(
                usuario.username(),
                usuario.nombre(),
                usuario.email(),
                usuario.password(),
                usuario.passwordConfirm());
        return new RegisterResponse(usuarioRegistrado.getUsername(), usuarioRegistrado.getNombre(), usuarioRegistrado.getEmail());
    }
    record LoginRequest(String username, String password) { }
    record LoginResponse(String username, String nombre, String email) { }
    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest usuario) {
        var usuarioRegistrado = authService.login(
                usuario.username(),
                usuario.password());
        return new LoginResponse(usuarioRegistrado.getUsername(), usuarioRegistrado.getNombre(), usuarioRegistrado.getEmail());
    }





}



