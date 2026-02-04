package org.example.servicios;

import org.example.Dto.AsignaturaDTO;
import org.example.modelos.Asignatura;
import org.example.repositorios.AsignaturaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsignaturaService {

    private final AsignaturaRepository asignaturaRepository;

    public AsignaturaService(AsignaturaRepository asignaturaRepository) {
        this.asignaturaRepository = asignaturaRepository;
    }


    public Asignatura guardar(Asignatura asignatura) {

        return asignaturaRepository.save(asignatura);
    }
    public List<Asignatura> listar() {
        return asignaturaRepository.findAll();
    }
    public Asignatura buscarPorId(Integer id){
        return asignaturaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Asignaura no encontrado"));
    }

    public List<AsignaturaDTO> listarDTO() {
        return asignaturaRepository.findAll()
                .stream()
                .map(a -> new AsignaturaDTO(
                        a.getIdAsignatura(),
                        a.getNomAsignatura()
                ))
                .toList();
    }
    public Asignatura actualizar(Integer id, Asignatura nuevo) {

        Asignatura asignatura = buscarPorId(id);

        asignatura.setNomAsignatura(nuevo.getNomAsignatura());

        return asignaturaRepository.save(asignatura);
    }
    public void eliminar(Integer id) {
        asignaturaRepository.deleteById(id);
    }


}
