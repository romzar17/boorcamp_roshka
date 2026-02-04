package org.example.Dto;

public class LibroDTO {
    private Integer idLibro;
    private  String nomLibro;
    private  String editorial;


    public LibroDTO(Integer idLibro, String nomLibro, String editorial){

        this.idLibro = idLibro;
        this.nomLibro = nomLibro;
        this.editorial = editorial;
    }

    public Integer getIdLibro() {
        return idLibro;
    }

    public String getNomLibro() {
        return nomLibro;
    }

    public String getEditorial() {
        return editorial;
    }
}
