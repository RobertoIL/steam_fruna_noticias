package com.modulo.steam_fruna_noticias.service;

import com.modulo.steam_fruna_noticias.model.Usuario;
import com.modulo.steam_fruna_noticias.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Objects;

@Service
public class AuthService {
    @Autowired
    UsuarioRepository usuarioRepository;
    @Autowired
    PasswordEncoder passwordEncoder;

    public Usuario register(String username, String nombre, String email, String password, String passwordConfirm){
        if (!Objects.equals(password, passwordConfirm)){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Las contraseñas no coinciden");
        }

        return usuarioRepository.save(Usuario.of(username, nombre, email, passwordEncoder.encode(password)));
    }

    public Usuario login(String username, String password){
        var usuario = usuarioRepository.findByUsername(username)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuario no encontrado"));

        if (!passwordEncoder.matches(password, usuario.getPassword())){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Contraseña incorrecta");
        }
        return usuario;
    }


}
