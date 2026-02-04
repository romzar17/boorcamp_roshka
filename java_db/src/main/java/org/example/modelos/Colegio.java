package org.example.modelos;

import jakarta.persistence.*;
@Entity
@Table(name = "colegio")

public class Colegio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_colegio")
    private Integer idColegio;

    @Column(name = "nombre_colegio", nullable = false)
    private String nombreColegio;

    public Colegio(){}

    public Integer getIdColegio() {
        return idColegio;
    }

    public void setIdColegio(Integer idColegio) {
        this.idColegio = idColegio;
    }

    public String getNombreColegio() {
        return nombreColegio;
    }

    public void setNombreColegio(String nombreColegio) {
        this.nombreColegio = nombreColegio;
    }
}
