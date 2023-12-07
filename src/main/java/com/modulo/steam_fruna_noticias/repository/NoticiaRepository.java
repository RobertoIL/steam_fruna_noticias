package com.modulo.steam_fruna_noticias.repository;

import com.modulo.steam_fruna_noticias.model.Noticia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticiaRepository extends CrudRepository<Noticia, Integer> {

}
