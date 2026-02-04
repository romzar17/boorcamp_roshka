package org.example.repositorios;

import org.example.modelos.ProfesorAsignatura;
import org.example.modelos.ProfesorAsignaturaId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesorAsignaturaRepository
        extends JpaRepository<ProfesorAsignatura, ProfesorAsignaturaId> {
}
