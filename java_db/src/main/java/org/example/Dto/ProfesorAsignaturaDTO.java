package org.example.Dto;

public class ProfesorAsignaturaDTO {

    private Integer idProfesor;
    private Integer idAsignatura;
    private String nombreProfesor;
    private String nombreAsignatura;

    public ProfesorAsignaturaDTO(Integer idProfesor,
                                 Integer idAsignatura,
                                 String nombreProfesor,
                                 String nombreAsignatura) {
        this.idProfesor = idProfesor;
        this.idAsignatura = idAsignatura;
        this.nombreProfesor = nombreProfesor;
        this.nombreAsignatura = nombreAsignatura;
    }

    public Integer getIdProfesor() {
        return idProfesor;
    }

    public Integer getIdAsignatura() {
        return idAsignatura;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }
}
