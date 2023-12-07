package com.modulo.steam_fruna_noticias.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.parser.Entity;

@Controller
@RestController
@RequestMapping("/noticia")
public class NoticiaController {

    @GetMapping("/noticias-populares")
    public Entity getNoticiasPopulares() {
        return null;
    }

    @GetMapping("/todas-las-noticias")
    public Entity getTodasLasNoticias() {
        return null;
    }

    @GetMapping("/noticias-por-categoria")
    public Entity getNoticiasPorCategoria() {
        return null;
    }

    @GetMapping("/noticias-por-usuario")
    public Entity getNoticiasPorUsuario() {
        return null;
    }
}
