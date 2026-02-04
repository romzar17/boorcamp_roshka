package org.example.servicios;

import org.example.Dto.ColegioDTO;
import org.example.modelos.Colegio;
import org.example.repositorios.ColegioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColegioService {

    private final ColegioRepository colegioRepository;

    public ColegioService(ColegioRepository colegioRepository) {
        this.colegioRepository = colegioRepository;
    }

    public Colegio guardar(Colegio colegio) {
        return colegioRepository.save(colegio);
    }

    // READ ALL
    public List<Colegio> listar() {
        return colegioRepository.findAll();
    }

    // READ ONE
    public Colegio buscarPorId(Integer id) {
        return colegioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Colegio no encontrado"));
    }

    public List<ColegioDTO> listarDTO() {
        return colegioRepository.findAll()
                .stream()
                .map(c -> new ColegioDTO(
                        c.getIdColegio(),
                        c.getNombreColegio()
                ))
                .toList();
    }

    public Colegio actualizar(Integer id, Colegio nuevo) {
        Colegio colegio = buscarPorId(id);
        colegio.setNombreColegio(nuevo.getNombreColegio());
        return colegioRepository.save(colegio);
    }


    public void eliminar(Integer id) {
        colegioRepository.deleteById(id);
    }
}
