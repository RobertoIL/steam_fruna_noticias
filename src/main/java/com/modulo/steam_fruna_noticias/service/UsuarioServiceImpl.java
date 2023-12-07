package com.modulo.steam_fruna_noticias.service;

import com.modulo.steam_fruna_noticias.model.Usuario;
import com.modulo.steam_fruna_noticias.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UsuarioServiceImpl implements UsuarioService{
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario getUsuarioById(int id) {
        return usuarioRepository.findById(id).get();
    }

}
