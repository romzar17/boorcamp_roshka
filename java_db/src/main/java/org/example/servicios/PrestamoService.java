package org.example.servicios;

import org.example.Dto.PrestamoDTO;
import org.example.modelos.Prestamo;
import org.example.repositorios.PrestamoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrestamoService {

    private final PrestamoRepository prestamoRepository;

    public PrestamoService(PrestamoRepository prestamoRepository) {
        this.prestamoRepository = prestamoRepository;
    }

    // CREATE
    public Prestamo guardar(Prestamo prestamo) {
        return prestamoRepository.save(prestamo);
    }

    // READ ENTITY
    public List<Prestamo> listar() {
        return prestamoRepository.findAll();
    }

    // READ DTO
    public List<PrestamoDTO> listarDTO() {
        return prestamoRepository.findAll()
                .stream()
                .map(p -> new PrestamoDTO(
                        p.getIdPrestamo(),
                        p.getFechaPrestamo(),
                        p.getFechaVenc(),
                        p.getProfesor().getNomProfesor(),
                        p.getLibros().getNomLibro()
                ))
                .toList();
    }

    // UPDATE
    public Prestamo actualizar(Integer id, Prestamo nuevo) {
        Prestamo prestamo = prestamoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Prestamo no encontrado"));

        prestamo.setFechaPrestamo(nuevo.getFechaPrestamo());
        prestamo.setFechaVenc(nuevo.getFechaVenc());
        prestamo.setProfesor(nuevo.getProfesor());
        prestamo.setLibro(nuevo.getLibros());

        return prestamoRepository.save(prestamo);
    }

    // DELETE
    public void eliminar(Integer id) {
        prestamoRepository.deleteById(id);
    }
}
