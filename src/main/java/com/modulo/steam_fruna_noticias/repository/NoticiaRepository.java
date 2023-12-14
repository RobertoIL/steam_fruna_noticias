package com.modulo.steam_fruna_noticias.repository;

import com.modulo.steam_fruna_noticias.model.Noticia;
import com.modulo.steam_fruna_noticias.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoticiaRepository extends CrudRepository<Noticia, Integer> {
    List<Noticia> findAllByAutor(Usuario autor);
}
