package com.avaliacao.catalogservice.service;

import com.avaliacao.catalogservice.dto.Catalog;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "MOVIE-SERVICE")
@LoadBalancerClient(name = "MOVIE-SERVICE")
public interface FilmesService {

    @RequestMapping(method = RequestMethod.GET, value = "Filmes/{name}")
    List<Catalog> getToGenre(@PathVariable String name);

}
