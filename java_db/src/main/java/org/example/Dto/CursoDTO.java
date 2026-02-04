package org.example.Dto;

public class CursoDTO {

    public Integer idCurso;
    public String nombreCurso;

    public CursoDTO(Integer idCurso, String nombreCurso){
        this.idCurso= idCurso;
        this.nombreCurso = nombreCurso;
    }

    public Integer getIdCurso() {
        return idCurso;
    }

    public String getNombreCurso(){
        return nombreCurso;
    }
}
