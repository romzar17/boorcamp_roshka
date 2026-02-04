package org.example.controlador;

import org.example.Dto.EditorialDTO;
import org.example.modelos.Editorial;
import org.example.servicios.EditorialService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/editoriales")
public class EditorialController {

    private final EditorialService editorialService;

    public EditorialController(EditorialService editorialService) {
        this.editorialService = editorialService;
    }

    // CREATE
    @PostMapping
    public Editorial guardar(@RequestBody Editorial editorial) {
        return editorialService.guardar(editorial);
    }

    // READ ALL
    @GetMapping
    public List<Editorial> listar() {
        return editorialService.listar();
    }

    // READ ONE
    @GetMapping("/{id}")
    public Editorial buscarPorId(@PathVariable Integer id) {
        return editorialService.buscarPorId(id);
    }

    // READ DTO
    @GetMapping("/dto")
    public List<EditorialDTO> listarDTO() {
        return editorialService.listarDTO();
    }

    // UPDATE
    @PutMapping("/{id}")
    public Editorial actualizar(@PathVariable Integer id,
                                @RequestBody Editorial editorial) {
        return editorialService.actualizar(id, editorial);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        editorialService.eliminar(id);
    }
}
