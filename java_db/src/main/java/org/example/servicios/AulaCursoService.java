package org.example.servicios;

import org.example.Dto.AulaCursoDTO;
import org.example.modelos.AulaCurso;
import org.example.modelos.AulaCursoId;
import org.example.repositorios.AulaCursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AulaCursoService {

    private final AulaCursoRepository repository;

    public AulaCursoService(AulaCursoRepository repository) {
        this.repository = repository;
    }

    public AulaCurso guardar(AulaCurso aulaCurso) {
        return repository.save(aulaCurso);
    }

    public List<AulaCursoDTO> listarDTO() {
        return repository.findAll()
                .stream()
                .map(ac -> new AulaCursoDTO(
                        ac.getAula().getIdAula(),
                        ac.getCurso().getIdCurso(),
                        ac.getAula().getColegio().getNombreColegio(),
                        ac.getCurso().getNombreCurso()
                ))
                .toList();
    }

    public void eliminar(AulaCursoId id) {
        repository.deleteById(id);
    }
}
