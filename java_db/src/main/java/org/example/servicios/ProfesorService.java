package org.example.servicios;

import org.example.Dto.ProfesorDTO;
import org.example.modelos.Profesor;
import org.example.repositorios.ProfesorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorService {

    private final ProfesorRepository profesorRepository;

    public ProfesorService(ProfesorRepository profesorRepository) {
        this.profesorRepository = profesorRepository;
    }

    public List<Profesor> listar() {
        return profesorRepository.findAll();
    }

    public Profesor guardar(Profesor profesor) {
        return profesorRepository.save(profesor);
    }


    public Profesor buscarPorId(Integer id) {
        return profesorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Profesor no encontrado"));
    }

    public Profesor actualizar(Integer id, Profesor nuevo) {

        Profesor profesor = profesorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Profesor no encontrado"));

        profesor.setNomProfesor(nuevo.getNomProfesor());

        return profesorRepository.save(profesor);
    }

    public void eliminar(Integer id) {
        profesorRepository.deleteById(id);
    }







    public  List<ProfesorDTO> listarDTO(){
        return profesorRepository.findAll()
                .stream()
                .map( p -> new ProfesorDTO(
                        p.getIdProfesor(),
                        p.getNomProfesor()
                ) )
                .toList();
    }
}
