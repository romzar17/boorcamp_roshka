package org.example.repositorios;

import org.example.modelos.AulaCurso;
import org.example.modelos.AulaCursoId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AulaCursoRepository
        extends JpaRepository<AulaCurso, AulaCursoId> {
}
