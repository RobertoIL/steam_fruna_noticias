package com.modulo.steam_fruna_noticias.service;

import com.modulo.steam_fruna_noticias.model.Noticia;
import com.modulo.steam_fruna_noticias.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NoticiaService {
    public Noticia addNoticia(String titulo, String descripcion, String categoria, String username);
    public Noticia getNoticiaById(int id);
    public List<Noticia> getAllNoticias();
    public List<Noticia> getAllNoticiasByAutor(String username);
    public List<Noticia> getAllNoticiasByTitulo(String titulo);
    public Noticia updateNoticia(Noticia noticia);
    public void deleteNoticia(int id);
}
