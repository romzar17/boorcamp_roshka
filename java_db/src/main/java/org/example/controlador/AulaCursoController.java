package org.example.controlador;

import org.example.Dto.AulaCursoDTO;
import org.example.modelos.AulaCurso;
import org.example.modelos.AulaCursoId;
import org.example.servicios.AulaCursoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aula-cursos")
public class AulaCursoController {

    private final AulaCursoService service;

    public AulaCursoController(AulaCursoService service) {
        this.service = service;
    }

    @PostMapping
    public AulaCurso guardar(@RequestBody AulaCurso aulaCurso) {
        return service.guardar(aulaCurso);
    }

    @GetMapping
    public List<AulaCursoDTO> listar() {
        return service.listarDTO();
    }

    @DeleteMapping
    public void eliminar(@RequestBody AulaCursoId id) {
        service.eliminar(id);
    }
}
