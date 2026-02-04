package org.example.Dto;

import org.example.modelos.Colegio;

public class ColegioDTO {

    private Integer idColegio;
    private String nombreColegio;

    public ColegioDTO(Integer idColegio, String nombreColegio){

        this.idColegio = idColegio;
        this.nombreColegio = nombreColegio;

    }

    public Integer getIdColegio() {
        return idColegio;
    }

    public String getNombreColegio() {
        return nombreColegio;
    }
}
