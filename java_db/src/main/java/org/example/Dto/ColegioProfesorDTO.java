package org.example.Dto;

public class ColegioProfesorDTO {

    private Integer idColegio;
    private Integer idProfesor;
    private String nombreColegio;
    private String nombreProfesor;

    public ColegioProfesorDTO(Integer idColegio,
                              Integer idProfesor,
                              String nombreColegio,
                              String nombreProfesor) {
        this.idColegio = idColegio;
        this.idProfesor = idProfesor;
        this.nombreColegio = nombreColegio;
        this.nombreProfesor = nombreProfesor;
    }

    public Integer getIdColegio() {
        return idColegio;
    }

    public Integer getIdProfesor() {
        return idProfesor;
    }

    public String getNombreColegio() {
        return nombreColegio;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }
}
