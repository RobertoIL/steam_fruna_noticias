package com.modulo.steam_fruna_noticias.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name = "username", nullable = false, length = 30, unique = true)
    private String username;
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;
    @Column(name = "email", nullable = false, length = 120, unique = true)
    private String email;
    @Column(name = "password", nullable = false, length = 250)
    private String password;


    public static Usuario of(String username, String nombre, String email, String password) {
        var usuario = new Usuario();
        usuario.setUsername(username);
        usuario.setNombre(nombre);
        usuario.setEmail(email);
        usuario.setPassword(password);
        return usuario;
    }
}
