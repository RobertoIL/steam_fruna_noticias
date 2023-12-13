package com.modulo.steam_fruna_noticias.service;

import com.modulo.steam_fruna_noticias.model.Noticia;
import com.modulo.steam_fruna_noticias.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NoticiaService {
    public Noticia addNoticia(Noticia noticia);
    public Noticia getNoticiaById(int id);
    public List<Noticia> getAllNoticias();
    public Noticia updateNoticia(Noticia noticia);
    public void deleteNoticia(int id);
}
