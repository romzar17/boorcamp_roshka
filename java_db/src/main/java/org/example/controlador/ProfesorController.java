package org.example.controlador;

import org.example.Dto.ProfesorDTO;
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

    // ENTITY

    @GetMapping
    public List<Profesor> listar() {
        return profesorService.listar();
    }

    @PostMapping
    public Profesor guardar(@RequestBody Profesor profesor) {
        return profesorService.guardar(profesor);
    }

    @GetMapping("/{id}")
    public Profesor buscarPorId(@PathVariable Integer id) {
        return profesorService.buscarPorId(id);
    }
    @PutMapping("/{id}")
    public Profesor actualizar(@PathVariable Integer id,
                               @RequestBody Profesor profesor) {
        return profesorService.actualizar(id, profesor);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        profesorService.eliminar(id);
    }




    //dto
    @GetMapping("/dto")
    public List<ProfesorDTO> listarDTO() {
        return profesorService.listarDTO();
    }
}
