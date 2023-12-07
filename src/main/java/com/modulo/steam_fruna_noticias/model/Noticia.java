package com.modulo.steam_fruna_noticias.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Table(name = "noticias")
public class Noticia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titulo;
    private String descripcion;
    private Categorias categoria;
    @Column(name = "like", columnDefinition = "int default 0")
    private int like;
    @Column(name = "dislike", columnDefinition = "int default 0")
    private int dislike;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Usuario autor;


}
