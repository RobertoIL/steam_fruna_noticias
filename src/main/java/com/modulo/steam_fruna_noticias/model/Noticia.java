package com.modulo.steam_fruna_noticias.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "noticia")
public class Noticia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;
    @Column(name = "titulo", nullable = false, length = 70)
    private String titulo;
    @Column(name = "descripcion", nullable = false, length = 250)
    private String descripcion;
    @Column(name = "fecha", nullable = false, length = 20)
    private Categorias categoria;
    @Column(name = "like", columnDefinition = "INT default 0")
    private int like;
    @Column(name = "dislike", columnDefinition = "INT default 0")
    private int dislike;
    @Column(name = "autor", nullable = false, length = 50)
    private String autor;


    public Noticia(String titulo, String descripcion, String autor){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.autor = autor;
    }


}
