package com.modulo.steam_fruna_noticias.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/api")
public class AuthController {

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest request) {
        if (validadorCredenciales(request.getUsername(), request.getPassword())) {
            return ResponseEntity.ok("Login exitoso");
        }
        else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciales incorrectas");
        }


    }

    private boolean validadorCredenciales(String username, String password) {
        return username.equals("username") && password.equals("password");
    }
}
