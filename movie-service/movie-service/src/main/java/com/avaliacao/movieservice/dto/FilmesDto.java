package com.avaliacao.movieservice.dto;

import com.avaliacao.movieservice.entidade.Filmes;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FilmesDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private String genre;
    private String urlStream;

    public FilmesDto(Filmes model){
        this.id=model.getId();
        this.name= model.getName();
        this.genre=model.getGenre();
        this.urlStream=model.getUrlStream();
    }

}
