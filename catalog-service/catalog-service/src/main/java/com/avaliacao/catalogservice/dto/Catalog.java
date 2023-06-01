package com.avaliacao.catalogservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Catalog {

    private Integer id;
    private String name;
    private String genre;
    private String urlStream;


}
