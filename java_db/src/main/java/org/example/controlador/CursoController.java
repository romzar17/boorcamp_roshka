package org.example.controlador;

import org.example.Dto.CursoDTO;
import org.example.modelos.Curso;
import org.example.servicios.CursoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @PostMapping
    public Curso guardar(@RequestBody Curso curso) {
        return cursoService.guardar(curso); //implementar eliminay a actualizar
    }
    @GetMapping
    public List<Curso> listar() {
        return cursoService.listar();
    }

    @GetMapping("/{id}")
    public Curso buscarporId(@PathVariable Integer id) {
        return cursoService.buscarporId(id);
    }

    @GetMapping("/dto")
    public List<CursoDTO> listarDTO() {
        return cursoService.listarDTO();
    }

    @PutMapping("/{id}")
    public Curso actualizar(@PathVariable Integer id,
                                 @RequestBody Curso curso) {
        return cursoService.actualizar(id, curso);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        cursoService.eliminar(id);
    }


}
