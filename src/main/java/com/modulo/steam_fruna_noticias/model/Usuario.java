package com.modulo.steam_fruna_noticias.model;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Transactional
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;
    @Column(name = "username", nullable = false, unique = true, length = 30)
    private String username;
    @Column(name = "nombre", nullable = false, length = 120)
    private String nombre;
    @Column(name = "apellido", nullable = false, length = 120)
    private String apellido;
    @Column(name = "correo", nullable = false, unique = true, length = 180)
    private String correo;
}
