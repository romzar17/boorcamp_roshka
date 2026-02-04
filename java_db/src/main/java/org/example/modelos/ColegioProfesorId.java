package org.example.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ColegioProfesorId implements Serializable {

    @Column(name = "id_colegio")
    private Integer idColegio;

    @Column(name = "id_profesor")
    private Integer idProfesor;

    public ColegioProfesorId() {
    }

    public ColegioProfesorId(Integer idColegio, Integer idProfesor) {
        this.idColegio = idColegio;
        this.idProfesor = idProfesor;
    }

    public Integer getIdColegio() {
        return idColegio;
    }

    public void setIdColegio(Integer idColegio) {
        this.idColegio = idColegio;
    }

    public Integer getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(Integer idProfesor) {
        this.idProfesor = idProfesor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ColegioProfesorId)) return false;
        ColegioProfesorId that = (ColegioProfesorId) o;
        return Objects.equals(idColegio, that.idColegio) &&
                Objects.equals(idProfesor, that.idProfesor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idColegio, idProfesor);
    }
}
