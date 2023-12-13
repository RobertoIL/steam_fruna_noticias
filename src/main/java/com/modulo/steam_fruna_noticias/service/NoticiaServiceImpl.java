package com.modulo.steam_fruna_noticias.service;
import com.modulo.steam_fruna_noticias.model.Usuario;
import com.modulo.steam_fruna_noticias.repository.NoticiaRepository;

import com.modulo.steam_fruna_noticias.model.Noticia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticiaServiceImpl implements NoticiaService{
    @Autowired
    private NoticiaRepository noticiaRepository;

    @Override
    public Noticia addNoticia(Noticia noticia) {
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
    public Noticia updateNoticia(Noticia noticia) {
        return noticiaRepository.save(noticia);
    }
    @Override
    public void deleteNoticia(int id) {
        noticiaRepository.deleteById(id);
    }

}
