package org.example.Dto;

public class ProfesorDTO {

    private Integer idProfesor;
    private String nomProfesor;

    public  ProfesorDTO(Integer idProfesor, String nomProfesor){

        this.idProfesor = idProfesor;
        this.nomProfesor = nomProfesor;

    }

    public Integer getIdProfesor() {
        return idProfesor;
    }

    public String getNomProfesor() {
        return nomProfesor;
    }
}
