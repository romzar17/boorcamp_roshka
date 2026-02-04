package org.example.controlador;

import org.example.Dto.PrestamoDTO;
import org.example.modelos.Prestamo;
import org.example.servicios.PrestamoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prestamos")
public class PrestamoController {

    private final PrestamoService prestamoService;

    public PrestamoController(PrestamoService prestamoService) {
        this.prestamoService = prestamoService;
    }

   //creamos el post
    @PostMapping
    public Prestamo guardar(@RequestBody Prestamo prestamo) {
        return prestamoService.guardar(prestamo);
    }


    @GetMapping
    public List<Prestamo> listar() {
        return prestamoService.listar();
    }

    @GetMapping("/dto")
    public List<PrestamoDTO> listarDTO() {
        return prestamoService.listarDTO();
    }

    @PutMapping("/{id}")
    public Prestamo actualizar(@PathVariable Integer id,
                               @RequestBody Prestamo prestamo) {
        return prestamoService.actualizar(id, prestamo);
    }

    // eliminar
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        prestamoService.eliminar(id);
    }
}
