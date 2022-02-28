package com.example.entrevueSpringBoot.service;

import com.example.entrevueSpringBoot.bean.FilmBean;
import com.example.entrevueSpringBoot.exception.FilmIntrouvableException;
import com.example.entrevueSpringBoot.mapper.MapFilm;
import com.example.entrevueSpringBoot.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmServiceImpl implements FilmService {
    @Autowired
    private MapFilm mapFilm;
    @Autowired
    private FilmRepository filmRepository;

    @Override
    public FilmBean ajouterFilm(FilmBean filmBean) {
        return mapFilm.filmToFilmBean(filmRepository.save(mapFilm.filmBeanToFilm(filmBean)));
    }

    @Override
    public FilmBean obtenirFilm(long id) {
        return mapFilm.filmToFilmBean(filmRepository.findById(id).orElseThrow(() ->
                new FilmIntrouvableException(String.format("Film avec l'identifiant [%s] est introuvable", id))));
    }
}
