package org.example.servicios;

import org.example.Dto.ProfesorAsignaturaDTO;
import org.example.modelos.ProfesorAsignatura;
import org.example.modelos.ProfesorAsignaturaId;
import org.example.repositorios.ProfesorAsignaturaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorAsignaturaService {

    private final ProfesorAsignaturaRepository repository;

    public ProfesorAsignaturaService(ProfesorAsignaturaRepository repository) {
        this.repository = repository;
    }

    // CREATE
    public ProfesorAsignatura guardar(ProfesorAsignatura profesorAsignatura) {
        return repository.save(profesorAsignatura);
    }

    // READ DTO
    public List<ProfesorAsignaturaDTO> listarDTO() {
        return repository.findAll()
                .stream()
                .map(pa -> new ProfesorAsignaturaDTO(
                        pa.getProfesor().getIdProfesor(),
                        pa.getAsignatura().getIdAsignatura(),
                        pa.getProfesor().getNomProfesor(),
                        pa.getAsignatura().getNomAsignatura()
                ))
                .toList();
    }

    // DELETE
    public void eliminar(ProfesorAsignaturaId id) {
        repository.deleteById(id);
    }
}
