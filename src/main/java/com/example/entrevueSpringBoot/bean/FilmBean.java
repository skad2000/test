package com.example.entrevueSpringBoot.bean;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Builder
@Data
public class FilmBean {
    private Long id;
    private String titre;
    private String description;
    private Set<ActeurBean> acteurs;
}
