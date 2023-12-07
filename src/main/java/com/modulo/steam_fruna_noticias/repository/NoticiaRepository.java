package com.modulo.steam_fruna_noticias.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticiaRepository extends JpaRepository<NoticiaRepository, Long> {
    NoticiaRepository findByTitulo(String titulo);
}
