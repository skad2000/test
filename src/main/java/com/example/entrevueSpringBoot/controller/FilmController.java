package com.example.entrevueSpringBoot.controller;

import com.example.entrevueSpringBoot.bean.FilmBean;
import com.example.entrevueSpringBoot.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Rest APi la gestion de film.
 */
@RestController()
@RequestMapping("/film")
public class FilmController {

    @Autowired
    private FilmService filmService;

    /**
     * AJout d'un film.
     *
     * @param film le Film
     * @return le film
     */
    @PostMapping()
    public FilmBean ajouterFilm(@RequestBody FilmBean film) {
        return filmService.ajouterFilm(film);
    }

    /**
     * Obtenir un film à partir de son identifiant.
     *
     * @param id l'identifiant du film
     * @return le film
     */
    @GetMapping("/{id}")
    public FilmBean obtenirFilmParId(@PathVariable Long id) {
        return filmService.obtenirFilm(id);
    }
}
