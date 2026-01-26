package org.example.controlador;

import org.example.modelos.Profesor;
import org.example.servicios.ProfesorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profesores")
public class ProfesorController {

    private final ProfesorService profesorService;

    public ProfesorController(ProfesorService profesorService) {
        this.profesorService = profesorService;
    }

    @GetMapping
    public List<Profesor> listar() {
        return profesorService.listar();
    }

    @PostMapping
    public Profesor guardar(@RequestBody Profesor profesor) {
        return profesorService.guardar(profesor);
    }
}
