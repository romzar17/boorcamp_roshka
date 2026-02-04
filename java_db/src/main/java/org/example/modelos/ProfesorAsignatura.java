package org.example.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "profesor_asignatura")
public class ProfesorAsignatura {

    @EmbeddedId
    private ProfesorAsignaturaId id;

    @ManyToOne
    @MapsId("idProfesor")
    @JoinColumn(name = "id_profesor")
    private Profesor profesor;

    @ManyToOne
    @MapsId("idAsignatura")
    @JoinColumn(name = "id_asignatura")
    private Asignatura asignatura;

    public ProfesorAsignatura() {
    }

    public ProfesorAsignatura(Profesor profesor, Asignatura asignatura) {
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.id = new ProfesorAsignaturaId(
                profesor.getIdProfesor(),
                asignatura.getIdAsignatura()
        );
    }

    public ProfesorAsignaturaId getId() {
        return id;
    }

    public void setId(ProfesorAsignaturaId id) {
        this.id = id;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
}
