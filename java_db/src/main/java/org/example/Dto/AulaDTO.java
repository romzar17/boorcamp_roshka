package org.example.Dto;

public class AulaDTO {

    private Integer idAula;
    private String colegio;

    public AulaDTO(Integer idAula, String colegio) {
        this.idAula = idAula;
        this.colegio = colegio;
    }

    public Integer getIdAula() {
        return idAula;
    }

    public String getColegio() {
        return colegio;
    }
}
