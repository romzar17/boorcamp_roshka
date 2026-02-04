package org.example.controlador;

import org.example.Dto.AsignaturaDTO;
import org.example.modelos.Asignatura;
import org.example.servicios.AsignaturaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/asignaturas")
public class AsignaturaController {

    private final AsignaturaService asignaturaService;

    public AsignaturaController(AsignaturaService asignaturaService) {
        this.asignaturaService = asignaturaService;
    }

    @PostMapping
    public Asignatura guardar(@RequestBody Asignatura asignatura) {
        return asignaturaService.guardar(asignatura);
    }

    @GetMapping
    public List<Asignatura> listar() {
        return asignaturaService.listar();
    }
    @GetMapping("/{id}")
    public Asignatura buscarPorId(@PathVariable Integer id) {
        return asignaturaService.buscarPorId(id);
    }

    @GetMapping("/dto")
    public List<AsignaturaDTO> listarDTO() {
        return asignaturaService.listarDTO();
    }


    @PutMapping("/{id}")
    public Asignatura actualizar(@PathVariable Integer id,
                                 @RequestBody Asignatura asignatura) {
        return asignaturaService.actualizar(id, asignatura);
    }


    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        asignaturaService.eliminar(id);
    }
}
