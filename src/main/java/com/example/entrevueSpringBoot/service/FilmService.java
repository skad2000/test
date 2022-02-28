package com.example.entrevueSpringBoot.service;

import com.example.entrevueSpringBoot.bean.FilmBean;
import org.springframework.stereotype.Service;

/**
 * Service pour la gestion des films.
 */
public interface FilmService {
    /**
     * Ajout d'un film.
     *
     * @param filmBean le film à ajouter
     * @return le film ajouté
     */
    FilmBean ajouterFilm(FilmBean filmBean);

    /**
     * Obtenir un film par son identifiant.
     *
     * @param id l'identifiant du film
     * @return le film obtenu
     */
    FilmBean obtenirFilm(long id);
}
