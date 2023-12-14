package com.modulo.steam_fruna_noticias.controller;

import com.modulo.steam_fruna_noticias.model.Noticia;
import com.modulo.steam_fruna_noticias.service.NoticiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping(path = "/noticias")
public class NoticiaController {
    @Autowired
    private NoticiaService noticiaService;

    // add noticia
    record NoticiaRequest(String titulo, String descripcion, String categoria, String autor) { }
    record NoticiaResponse(String titulo, String descripcion, String categoria, String autor) { }
    @PostMapping("/add")
    public NoticiaResponse addNoticia(@RequestBody NoticiaRequest noticia) {
        var noticiaRegistrada = noticiaService.addNoticia(
                noticia.titulo(),
                noticia.descripcion(),
                noticia.categoria(),
                noticia.autor());
        return new NoticiaResponse(noticiaRegistrada.getTitulo(), noticiaRegistrada.getDescripcion(), noticiaRegistrada.getCategoria().toString(), noticiaRegistrada.getAutor().getNombre());
    }

    // get noticia by id
    @GetMapping("/{id}")
    public Noticia getNoticiaById(@PathVariable("id") int id) {
        return noticiaService.getNoticiaById(id);
    }

    // get all noticias

    @GetMapping("/")
    public List<Noticia> getAllNoticias() {
        return noticiaService.getAllNoticias();
    }

    // get all noticias by autor
    @GetMapping("/autor")
    public List<Noticia> getAllNoticiasByAutor(@RequestParam("username") String username) {
        return noticiaService.getAllNoticiasByAutor(username);
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
