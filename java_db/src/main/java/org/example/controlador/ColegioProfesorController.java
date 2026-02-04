package org.example.controlador;

import org.example.Dto.ColegioProfesorDTO;
import org.example.modelos.ColegioProfesor;
import org.example.modelos.ColegioProfesorId;
import org.example.servicios.ColegioProfesorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/colegio-profesores")
public class ColegioProfesorController {

    private final ColegioProfesorService service;

    public ColegioProfesorController(ColegioProfesorService service) {
        this.service = service;
    }


    @PostMapping
    public ColegioProfesor guardar(@RequestBody ColegioProfesor colegioProfesor) {
        return service.guardar(colegioProfesor);
    }


    @GetMapping
    public List<ColegioProfesorDTO> listar() {
        return service.listarDTO();
    }


    @DeleteMapping
    public void eliminar(@RequestBody ColegioProfesorId id) {
        service.eliminar(id);
    }
}
