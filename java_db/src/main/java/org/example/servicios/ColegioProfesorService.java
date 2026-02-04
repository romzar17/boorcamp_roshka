package org.example.servicios;

import org.example.Dto.ColegioProfesorDTO;
import org.example.modelos.ColegioProfesor;
import org.example.modelos.ColegioProfesorId;
import org.example.repositorios.ColegioProfesorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColegioProfesorService {

    private final ColegioProfesorRepository repository;

    public ColegioProfesorService(ColegioProfesorRepository repository) {
        this.repository = repository;
    }

    // CREATE
    public ColegioProfesor guardar(ColegioProfesor colegioProfesor) {
        return repository.save(colegioProfesor);
    }

    // READ DTO
    public List<ColegioProfesorDTO> listarDTO() {
        return repository.findAll()
                .stream()
                .map(cp -> new ColegioProfesorDTO(
                        cp.getColegio().getIdColegio(),
                        cp.getProfesor().getIdProfesor(),
                        cp.getColegio().getNombreColegio(),
                        cp.getProfesor().getNomProfesor()
                ))
                .toList();
    }

    // DELETE
    public void eliminar(ColegioProfesorId id) {
        repository.deleteById(id);
    }
}
