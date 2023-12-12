package com.modulo.steam_fruna_noticias.service;

import com.modulo.steam_fruna_noticias.model.Usuario;
import com.modulo.steam_fruna_noticias.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService{
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario getUsuarioById(int id) {
        return usuarioRepository.findById(id).get();
    }
    @Override
    public Usuario addUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    @Override
    public List<Usuario> getAllUsuarios() {
        return (List<Usuario>) usuarioRepository.findAll();
    }
    @Override
    public void deleteUsuario(int id) {
        usuarioRepository.deleteById(id);
    }
    @Override
    public Usuario getUsuarioByNombre(String nombre) {
        return usuarioRepository.findByNombre(nombre);
    }

}
