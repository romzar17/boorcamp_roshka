package org.example.controlador;

import org.example.Dto.ProfesorAsignaturaDTO;
import org.example.modelos.ProfesorAsignatura;
import org.example.modelos.ProfesorAsignaturaId;
import org.example.servicios.ProfesorAsignaturaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profesor-asignaturas")
public class ProfesorAsignaturaController {

    private final ProfesorAsignaturaService service;

    public ProfesorAsignaturaController(ProfesorAsignaturaService service) {
        this.service = service;
    }

    // CREATE
    @PostMapping
    public ProfesorAsignatura guardar(@RequestBody ProfesorAsignatura profesorAsignatura) {
        return service.guardar(profesorAsignatura);
    }

    // READ
    @GetMapping
    public List<ProfesorAsignaturaDTO> listar() {
        return service.listarDTO();
    }

    // DELETE
    @DeleteMapping
    public void eliminar(@RequestBody ProfesorAsignaturaId id) {
        service.eliminar(id);
    }
}
