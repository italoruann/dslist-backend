package com.italoruann.dslist.dto;

import com.italoruann.dslist.entities.Game;

/**
 * DTO usado para transportar dados entre camadas da aplicação
 * (Controller -> Service -> Cliente).
 *
 * Nesta classe, definimos apenas os campos da entidade que queremos expor ou transferir.
 * Isso evita expor a entidade completa diretamente e permite formatar os dados para a API.
 */
public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO() {
    }

    /**
     * Construtor que recebe uma entidade Game e copia seus dados
     * para este DTO. Isso permite criar um DTO a partir de uma
     * entidade existente de forma prática.
     */
    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
