package org.example.Dto;

public class EditorialDTO {

    private Integer idEditorial;
    private String nombreEditorial;

    public EditorialDTO(Integer idEditorial, String nombreEditorial){
        this.idEditorial= idEditorial;
        this.nombreEditorial = nombreEditorial;
    }

    public Integer getIdEditorial() {
        return idEditorial;
    }

    public String getNombreEditorial() {
        return nombreEditorial;
    }
}
