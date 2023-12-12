package com.modulo.steam_fruna_noticias.service;

import com.modulo.steam_fruna_noticias.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsuarioService {
    public Usuario getUsuarioById(int id);
    public Usuario getUsuarioByNombre(String nombre);
    public List<Usuario> getAllUsuarios();
    public Usuario addUsuario(Usuario usuario);
    public void deleteUsuario(int id);




}
