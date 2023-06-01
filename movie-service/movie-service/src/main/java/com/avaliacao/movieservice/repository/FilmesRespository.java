package com.avaliacao.movieservice.repository;

import com.avaliacao.movieservice.entidade.Filmes;
import feign.Param;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilmesRespository extends JpaRepository<Filmes,Integer> {

//    @Query("select f from Filmes f where f.genre=:name")
    List<Filmes> findByGenre(@Param("name") String name);

}
