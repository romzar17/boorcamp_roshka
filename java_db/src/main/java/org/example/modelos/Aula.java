package org.example.modelos;

import  jakarta.persistence.*;
@Entity
@Table(name = "aula")

public class Aula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_aula")
    private Integer idAula;

    @ManyToOne
    @JoinColumn(name= "id_colegio", nullable = false)
    private Colegio colegio;

    public Aula(){}

    public Integer getIdAula() {
        return idAula;
    }

    public void setIdAula(Integer idAula) {
        this.idAula = idAula;
    }

   // public Colegio(){}

    public Colegio getColegio() {
        return colegio;
    }

    public void setColegio(Colegio colegio) {
        this.colegio = colegio;
    }
}
