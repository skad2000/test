package com.example.entrevueSpringBoot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Eertor excepetion quand le film est introuvable.
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class FilmIntrouvableException extends RuntimeException {
    public FilmIntrouvableException(String message) {
        super(message);
    }
}
