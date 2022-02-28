package com.example.entrevueSpringBoot.bean;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ActeurBean {
    private Long id;
    private String nom;
    private String prenom;
}
