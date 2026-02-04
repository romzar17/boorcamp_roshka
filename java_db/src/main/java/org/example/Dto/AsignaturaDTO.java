package org.example.Dto;

public class AsignaturaDTO {

    private Integer idAsignatura;
    private String nomAsignatura;

    public AsignaturaDTO(Integer idAsignatura, String nomAsignatura){
        this.idAsignatura = idAsignatura;
        this.nomAsignatura = nomAsignatura;

    }

    public Integer getIdAsignatura() {
        return idAsignatura;
    }

    public void getNomAsignatura() {
        this.nomAsignatura = nomAsignatura;
    }
}
