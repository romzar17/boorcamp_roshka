package org.example.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "aula_curso")
public class AulaCurso {

    @EmbeddedId
    private AulaCursoId id;

    @ManyToOne
    @MapsId("idAula")
    @JoinColumn(name = "id_aula")
    private Aula aula;

    @ManyToOne
    @MapsId("idCurso")
    @JoinColumn(name = "id_curso")
    private Curso curso;

    public AulaCurso() {
    }

    public AulaCurso(Aula aula, Curso curso) {
        this.aula = aula;
        this.curso = curso;
        this.id = new AulaCursoId(aula.getIdAula(), curso.getIdCurso());
    }

    public AulaCursoId getId() {
        return id;
    }

    public void setId(AulaCursoId id) {
        this.id = id;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
