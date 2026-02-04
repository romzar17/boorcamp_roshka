package org.example.controlador;

import org.example.Dto.ColegioDTO;
import org.example.modelos.Colegio;
import org.example.servicios.ColegioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/colegios")
public class ColegioController {

    private final ColegioService colegioService;

    public ColegioController(ColegioService colegioService) {
        this.colegioService = colegioService;
    }

    @PostMapping
    public Colegio guardar(@RequestBody Colegio colegio) {
        return colegioService.guardar(colegio);
    }


    @GetMapping
    public List<Colegio> listar() {
        return colegioService.listar();
    }

    @GetMapping("/{id}")
    public Colegio buscarPorId(@PathVariable Integer id) {
        return colegioService.buscarPorId(id);
    }

    @GetMapping("/dto")
    public List<ColegioDTO> listarDTO() {
        return colegioService.listarDTO();
    }

    @PutMapping("/{id}")
    public Colegio actualizar(@PathVariable Integer id,
                              @RequestBody Colegio colegio) {
        return colegioService.actualizar(id, colegio);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        colegioService.eliminar(id);
    }
}
