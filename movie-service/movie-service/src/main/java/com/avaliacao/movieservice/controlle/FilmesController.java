package com.avaliacao.movieservice.controlle;

import com.avaliacao.movieservice.dto.FilmesDto;
import com.avaliacao.movieservice.service.FilmesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/Filmes")
public class FilmesController {

    @Autowired
    private FilmesService service;

    @RequestMapping("/{name}")
    public ResponseEntity<List<FilmesDto>> getToGenre(@PathVariable String name){
        List<FilmesDto> list = service.getToGenre(name);
        return ResponseEntity.ok().body(list);
    }



}
