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
    @RequestMapping("/saludo")
    public String hello_world() {
        return "Hello World";
    }

    // add noticia
    @PostMapping("/add")
    public String addNoticia(@RequestBody Noticia noticia) {
        noticiaService.addNoticia(noticia);
        return "Noticia agregada";
    }

    // get noticia by id
    @GetMapping("/noticia/{id}")
    public Noticia getNoticiaById(@PathVariable("id") int id) {
        return noticiaService.getNoticiaById(id);
    }

    // get all noticias
    @GetMapping("/")
    public List<Noticia> getAllNoticias() {
        return noticiaService.getAllNoticias();
    }

    // update noticia
    @PutMapping("/noticia")
    public Noticia updateNoticia(@RequestBody Noticia noticia) {
        return noticiaService.updateNoticia(noticia);
    }



    // delete noticia by id
    @DeleteMapping("/noticia/{id}")
    public String deleteNoticia(@PathVariable("id") int id) {
        noticiaService.deleteNoticia(id);
        return "Noticia eliminada";
    }
}
