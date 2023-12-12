package com.modulo.steam_fruna_noticias.controller;

import com.modulo.steam_fruna_noticias.model.Noticia;
import com.modulo.steam_fruna_noticias.service.NoticiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/noticias")
public class NoticiaController {
    @Autowired
    private NoticiaService noticiaService;

    // add noticia
    @PostMapping("/add")
    public String addNoticia(@RequestBody Noticia noticia) {
        noticiaService.addNoticia(noticia);
        return "Noticia agregada";
    }

    // get noticia by id
    @GetMapping("/{id}")
    public Noticia getNoticiaById(@PathVariable("id") int id) {
        return noticiaService.getNoticiaById(id);
    }

    // get all noticias
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/")
    public List<Noticia> getAllNoticias() {
        return noticiaService.getAllNoticias();
    }

    // update noticia
    @PutMapping("/update")
    public Noticia updateNoticia(@RequestBody Noticia noticia) {
        return noticiaService.updateNoticia(noticia);
    }

    // delete noticia by id
    @DeleteMapping("/delete/{id}")
    public String deleteNoticia(@PathVariable("id") int id) {
        noticiaService.deleteNoticia(id);
        return "Noticia eliminada";
    }
}
