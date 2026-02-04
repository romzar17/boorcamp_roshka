package org.example.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "libro")
public class Libros {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_libro")
    private Integer idLibro;

    @Column(name = "nombre_libro")
    private String nomLibro;
    @ManyToOne
    @JoinColumn(name= "id_editorial", nullable = false)
    private Editorial editorial;

    public Libros() {}

    public Integer getIdLibro() {

        return idLibro;
    }

    public void setIdLibro(Integer idLibro) {
        this.idLibro = idLibro;
    }

    public String getNomLibro() {
        return nomLibro;
    }

    public void setNomLibro(String nomLibro) {
        this.nomLibro = nomLibro;
    }

    public Editorial getEditorial(){
        return editorial; }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
}