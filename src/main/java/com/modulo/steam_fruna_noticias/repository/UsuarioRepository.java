package com.modulo.steam_fruna_noticias.repository;

import com.modulo.steam_fruna_noticias.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByUsername(String username);

}
