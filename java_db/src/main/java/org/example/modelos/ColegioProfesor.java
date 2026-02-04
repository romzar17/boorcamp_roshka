package org.example.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "colegio_profesor")
public class ColegioProfesor {

    @EmbeddedId
    private ColegioProfesorId id;

    @ManyToOne
    @MapsId("idColegio")
    @JoinColumn(name = "id_colegio")
    private Colegio colegio;

    @ManyToOne
    @MapsId("idProfesor")
    @JoinColumn(name = "id_profesor")
    private Profesor profesor;

    public ColegioProfesor() {
    }

    public ColegioProfesor(Colegio colegio, Profesor profesor) {
        this.colegio = colegio;
        this.profesor = profesor;
        this.id = new ColegioProfesorId(
                colegio.getIdColegio(),
                profesor.getIdProfesor()
        );
    }

    public ColegioProfesorId getId() {
        return id;
    }

    public void setId(ColegioProfesorId id) {
        this.id = id;
    }

    public Colegio getColegio() {
        return colegio;
    }

    public void setColegio(Colegio colegio) {
        this.colegio = colegio;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}
