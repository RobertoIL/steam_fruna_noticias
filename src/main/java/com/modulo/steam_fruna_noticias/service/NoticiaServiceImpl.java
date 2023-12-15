package com.modulo.steam_fruna_noticias.service;
import com.modulo.steam_fruna_noticias.model.Categorias;
import com.modulo.steam_fruna_noticias.model.Usuario;
import com.modulo.steam_fruna_noticias.repository.NoticiaRepository;

import com.modulo.steam_fruna_noticias.model.Noticia;
import com.modulo.steam_fruna_noticias.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NoticiaServiceImpl implements NoticiaService{
    @Autowired
    private NoticiaRepository noticiaRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Noticia addNoticia(String titulo, String descripcion, String categoria, String username) {
        var autor = usuarioRepository.findByUsername(username).get();
        Noticia noticia = new Noticia();
        noticia.setTitulo(titulo);
        noticia.setDescripcion(descripcion);
        noticia.setCategoria(Categorias.valueOf(categoria));
        noticia.setAutor(Optional.of(autor));
        return noticiaRepository.save(noticia);
    }
    @Override
    public Noticia getNoticiaById(int id) {
        return noticiaRepository.findById(id).get();
    }
    @Override
    public List<Noticia> getAllNoticias() {
        return (List<Noticia>) noticiaRepository.findAll();
    }
    @Override
    public Noticia updateNoticia(String titulo, String descripcion, String categoria, String username) {
        return this.addNoticia(titulo, descripcion, categoria, username);
    }
    @Override
    public void deleteNoticia(int id) {
        noticiaRepository.deleteById(id);
    }
    @Override
    public List<Noticia> getAllNoticiasByAutor(String username) {
        var autor = usuarioRepository.findByUsername(username).get();
        return noticiaRepository.findAllByAutor(autor);
    }
    @Override
    public List<Noticia> getAllNoticiasByTitulo(String titulo) {
        return noticiaRepository.findAllByTituloContainingIgnoreCase(titulo);
    }

}
