package com.avaliacao.movieservice.service;

import com.avaliacao.movieservice.entidade.Filmes;
import com.avaliacao.movieservice.dto.FilmesDto;
import com.avaliacao.movieservice.repository.FilmesRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FilmesService {
    @Autowired
    private FilmesRespository repository;

    public List<FilmesDto> getToGenre(String name) {
        List<Filmes> list = repository.findByGenre(name);
        return list.stream().map(FilmesDto::new).collect(Collectors.toList());
    }


}
