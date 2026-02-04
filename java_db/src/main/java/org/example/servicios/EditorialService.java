package org.example.servicios;

import org.example.Dto.EditorialDTO;
import org.example.modelos.Editorial;
import org.example.repositorios.EditorialRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EditorialService {

    private final EditorialRepository editorialRepository;

    public EditorialService(EditorialRepository editorialRepository) {
        this.editorialRepository = editorialRepository;
    }

    // CREATE
    public Editorial guardar(Editorial editorial) {
        return editorialRepository.save(editorial);
    }

    // READ ALL
    public List<Editorial> listar() {
        return editorialRepository.findAll();
    }

    // READ ONE
    public Editorial buscarPorId(Integer id) {
        return editorialRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Editorial no encontrada"));
    }

    // READ DTO
    public List<EditorialDTO> listarDTO() {
        return editorialRepository.findAll()
                .stream()
                .map(e -> new EditorialDTO(
                        e.getIdEditorial(),
                        e.getNombreEditorial()
                ))
                .toList();
    }

    // UPDATE
    public Editorial actualizar(Integer id, Editorial nuevo) {
        Editorial editorial = buscarPorId(id);
        editorial.setNombreEditorial(nuevo.getNombreEditorial());
        return editorialRepository.save(editorial);
    }

    // DELETE
    public void eliminar(Integer id) {
        editorialRepository.deleteById(id);
    }
}
