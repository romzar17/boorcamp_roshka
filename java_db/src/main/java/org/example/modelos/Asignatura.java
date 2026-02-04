package org.example.modelos;
import jakarta.persistence.*;
@Entity
@Table(name = "asignatura")

public class Asignatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_asignatura")
    private Integer idAsignatura;

    @Column(name = "nom_asignatura")
    private String nomAsignatura;

    public Asignatura(){

    }

    public Integer getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(Integer idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public String getNomAsignatura(){
        return nomAsignatura;
    }

    public void setNomAsignatura(String nomAsignatura) {
        this.nomAsignatura = nomAsignatura;
    }


}
