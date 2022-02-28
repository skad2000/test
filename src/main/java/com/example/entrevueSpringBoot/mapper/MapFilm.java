package com.example.entrevueSpringBoot.mapper;

import com.example.entrevueSpringBoot.bean.FilmBean;
import com.example.entrevueSpringBoot.model.Film;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface MapFilm {
    FilmBean filmToFilmBean(Film entity);

    Film filmBeanToFilm(FilmBean filmBean);
}
