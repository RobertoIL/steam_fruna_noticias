package com.modulo.steam_fruna_noticias.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Getter
@Setter
@Table(name = "noticias")
public class Noticia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name = "titulo", nullable = false, length = 100)
    private String titulo;
    @Column(name = "descripcion", nullable = false, columnDefinition = "text")
    private String descripcion;
    @Enumerated(EnumType.STRING)
    @Column(name = "categoria", nullable = false)
    private Categorias categoria;
    @Column(name = "cantLikes", columnDefinition = "INTEGER default 0")
    private int cantLikes;
    @Column(name = "cantDislikes", columnDefinition = "INTEGER default 0")
    private int cantDislikes;

    @ManyToOne
    @JoinColumn(name = "autor", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Usuario autor;


}
