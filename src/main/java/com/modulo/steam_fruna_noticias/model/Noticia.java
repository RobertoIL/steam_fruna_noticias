package com.modulo.steam_fruna_noticias.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "noticias")
public class Noticia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titulo;
    private String descripcion;
    private Categorias categorias;
    private int like;
    private int dislike;
    private int autor;

    public Noticia(String titulo, String descripcion, Categorias categoria, int autor) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.categorias = categoria;
        this.autor = autor;
    }



}
