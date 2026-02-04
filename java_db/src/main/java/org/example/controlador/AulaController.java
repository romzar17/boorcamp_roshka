package org.example.controlador;

import org.example.Dto.AulaDTO;
import org.example.modelos.Aula;
import org.example.servicios.AulaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aulas")
public class AulaController {

    private final AulaService aulaService;

    public AulaController(AulaService aulaService) {
        this.aulaService = aulaService;
    }


    @PostMapping
    public Aula guardar(@RequestBody Aula aula) {
        return aulaService.guardar(aula);
    }


    @GetMapping
    public List<Aula> listar() {
        return aulaService.listar();
    }

    @GetMapping("/{id}")
    public Aula buscarPorId(@PathVariable Integer id) {
        return aulaService.buscarPorId(id);
    }


    @GetMapping("/dto")
    public List<AulaDTO> listarDTO() {
        return aulaService.listarDTO();
    }


    @PutMapping("/{id}")
    public Aula actualizar(@PathVariable Integer id,
                           @RequestBody Aula aula) {
        return aulaService.actualizar(id, aula);
    }


    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        aulaService.eliminar(id);
    }
}
