package com.modulo.steam_fruna_noticias.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Noticia extends JpaRepository<Noticia, Long> {
    Noticia findByTitulo(String titulo);
}
