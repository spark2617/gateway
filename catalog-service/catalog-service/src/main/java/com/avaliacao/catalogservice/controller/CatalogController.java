package com.avaliacao.catalogservice.controller;

import com.avaliacao.catalogservice.dto.Catalog;
import com.avaliacao.catalogservice.service.FilmesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/catalog")
@RestController
public class CatalogController {


    @Autowired
    private FilmesService service;

    @RequestMapping(method = RequestMethod.GET, path = "/{name}")
    public ResponseEntity<List<Catalog>> getSpecie(@PathVariable String name){

        return ResponseEntity.ok(service.getToGenre(name));
    }
}
