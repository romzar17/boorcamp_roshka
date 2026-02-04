package org.example.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ProfesorAsignaturaId implements Serializable {

    @Column(name = "id_profesor")
    private Integer idProfesor;

    @Column(name = "id_asignatura")
    private Integer idAsignatura;

    public ProfesorAsignaturaId() {
    }

    public ProfesorAsignaturaId(Integer idProfesor, Integer idAsignatura) {
        this.idProfesor = idProfesor;
        this.idAsignatura = idAsignatura;
    }

    public Integer getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(Integer idProfesor) {
        this.idProfesor = idProfesor;
    }

    public Integer getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(Integer idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProfesorAsignaturaId)) return false;
        ProfesorAsignaturaId that = (ProfesorAsignaturaId) o;
        return Objects.equals(idProfesor, that.idProfesor) &&
                Objects.equals(idAsignatura, that.idAsignatura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProfesor, idAsignatura);
    }
}
