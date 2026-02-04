package org.example.servicios;

import org.example.Dto.LibroDTO;
import org.example.modelos.Libros;
import org.example.repositorios.LibrosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibrosService {

    private final LibrosRepository librosRepository;

    public LibrosService(LibrosRepository librosRepository) {
        this.librosRepository = librosRepository;
    }

    // CREATE
    public Libros guardar(Libros libro) {
        return librosRepository.save(libro);
    }


    public List<Libros> listar() {
        return librosRepository.findAll();
    }


    public Libros buscarPorId(Integer id) {
        return librosRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Libro no encontrado"));
    }

    public List<LibroDTO> listarDTO() {
        return librosRepository.findAll()
                .stream()
                .map(l -> new LibroDTO(
                        l.getIdLibro(),
                        l.getNomLibro(),
                        l.getEditorial() != null ? l.getEditorial().getNombreEditorial() : null //mostrar si el libro tiene o no el editorial
                ))
                .toList();
    }


    public Libros actualizar(Integer id, Libros nuevo) {
        Libros libro = buscarPorId(id);
        libro.setNomLibro(nuevo.getNomLibro());
        libro.setEditorial(nuevo.getEditorial());
        return librosRepository.save(libro);
    }


    public void eliminar(Integer id) {
        librosRepository.deleteById(id);
    }
}
