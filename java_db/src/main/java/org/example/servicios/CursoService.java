package org.example.servicios;

import org.example.Dto.CursoDTO;

import org.example.modelos.Curso;
import org.example.repositorios.CursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    private final CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public Curso guardar(Curso curso) {
        return cursoRepository.save(curso);
    }

    public List<Curso> listar() {
        return cursoRepository.findAll();
    }

    public Curso buscarporId(Integer id) {
        return cursoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Asignatura no encontrado"));
    }

    public List<CursoDTO> listarDTO() {
        return cursoRepository.findAll()
                .stream()
                .map(a -> new CursoDTO(
                        a.getIdCurso(),
                        a.getNombreCurso()
                ))
                .toList();


    }
    public Curso actualizar(Integer id, Curso nuevo) {
        Curso curso = buscarporId(id);
        curso.setNombreCurso(nuevo.getNombreCurso());
        return cursoRepository.save(curso);
    }
    public void eliminar(Integer id) {
        cursoRepository.deleteById(id);
    }

}