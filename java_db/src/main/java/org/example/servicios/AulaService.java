package org.example.servicios;

import org.example.Dto.AulaDTO;
import org.example.modelos.Aula;
import org.example.repositorios.AulaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AulaService {

    private final AulaRepository aulaRepository;

    public AulaService(AulaRepository aulaRepository) {
        this.aulaRepository = aulaRepository;
    }


    public Aula guardar(Aula aula) {
        return aulaRepository.save(aula);
    }


    public List<Aula> listar() {
        return aulaRepository.findAll();
    }


    public Aula buscarPorId(Integer id) {
        return aulaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Aula no encontrada"));
    }


    public List<AulaDTO> listarDTO() {
        return aulaRepository.findAll()
                .stream()
                .map(a -> new AulaDTO(
                        a.getIdAula(),
                        a.getColegio() != null
                                ? a.getColegio().getNombreColegio()
                                : null
                ))
                .toList();
    }

    // UPDATE
    public Aula actualizar(Integer id, Aula nuevo) {
        Aula aula = buscarPorId(id);
        aula.setColegio(nuevo.getColegio());
        return aulaRepository.save(aula);
    }

    // DELETE
    public void eliminar(Integer id) {
        aulaRepository.deleteById(id);
    }
}
