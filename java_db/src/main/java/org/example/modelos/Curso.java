package org.example.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "curso")

public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_curso")
    private Integer idCurso;

    @Column(name = "curso")
    private String nombreCurso;

    public Curso(){}

    public Integer getIdCurso(){
        return idCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
}
