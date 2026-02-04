package org.example.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AulaCursoId implements Serializable {

    @Column(name = "id_aula")
    private Integer idAula;

    @Column(name = "id_curso")
    private Integer idCurso;

    public AulaCursoId() {
    }

    public AulaCursoId(Integer idAula, Integer idCurso) {
        this.idAula = idAula;
        this.idCurso = idCurso;
    }

    public Integer getIdAula() {
        return idAula;
    }

    public void setIdAula(Integer idAula) {
        this.idAula = idAula;
    }

    public Integer getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AulaCursoId)) return false;
        AulaCursoId that = (AulaCursoId) o;
        return Objects.equals(idAula, that.idAula) &&
                Objects.equals(idCurso, that.idCurso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAula, idCurso);
    }
}
