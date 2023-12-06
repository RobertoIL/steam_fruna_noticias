package com.modulo.steam_fruna_noticias.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.transaction.annotation.Transactional;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Transactional
@Getter
@Setter
@Table(name = "usuario_reacciona_noticia")
public class UsuarioReaccionaNoticia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_noticia")
    private Noticia noticia;

    @Enumerated(EnumType.STRING)
    private Reacciones reacciones;



}
