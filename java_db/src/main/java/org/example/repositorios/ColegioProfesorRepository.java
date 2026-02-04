package org.example.repositorios;

import org.example.modelos.ColegioProfesor;
import org.example.modelos.ColegioProfesorId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColegioProfesorRepository
        extends JpaRepository<ColegioProfesor, ColegioProfesorId> {
}
