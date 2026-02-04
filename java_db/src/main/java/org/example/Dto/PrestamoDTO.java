package org.example.Dto;
import java.time.LocalDate;

public class PrestamoDTO {

    private Integer idPrestamo;
    private LocalDate fechaPrestamo;
    private LocalDate fechaVenc;
    private String libro;
    private String profesor;

    public PrestamoDTO(){}

    public PrestamoDTO(Integer idPrestamo, LocalDate fechaPrestamo, LocalDate fechaVenc, String profesor, String libro){

        this.idPrestamo = idPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaVenc = fechaVenc;
        this.libro = libro;
            this.profesor = profesor;
        }

        public Integer getIdPrestamo(){
            return idPrestamo;
    }
        public LocalDate getFechaPrestamo(){
            return fechaPrestamo;
        }

    public LocalDate getFechaVenc() {
        return fechaVenc;
    }
    public String getProfesor(){
        return profesor;
    }

    public String getLibro() {
        return libro;
    }

}
