package org.example.controlador;

import org.example.Dto.LibroDTO;
import org.example.modelos.Libros;
import org.example.servicios.LibrosService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibrosController {

    private final LibrosService librosService;

    public LibrosController(LibrosService librosService) {
        this.librosService = librosService;
    }

    // CREATE
    @PostMapping
    public Libros guardar(@RequestBody Libros libros) {
        return librosService.guardar(libros);
    }


    @GetMapping
    public List<Libros> listar() {
        return librosService.listar();
    }

    // READ ONE
    @GetMapping("/{id}")
    public Libros buscarPorId(@PathVariable Integer id) {
        return librosService.buscarPorId(id);
    }


    @GetMapping("/dto")
    public List<LibroDTO> listarDTO() {
        return librosService.listarDTO();
    }

    // UPDATE
    @PutMapping("/{id}")
    public Libros actualizar(@PathVariable Integer id,
                            @RequestBody Libros libros) {
        return librosService.actualizar(id, libros);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        librosService.eliminar(id);
    }
}
