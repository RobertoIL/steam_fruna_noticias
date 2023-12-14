package com.modulo.steam_fruna_noticias.repository;

import com.modulo.steam_fruna_noticias.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{
    Optional<Usuario> findByUsername(String username);
}
