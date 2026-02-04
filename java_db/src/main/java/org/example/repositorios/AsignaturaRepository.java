package org.example.repositorios;

import org.example.modelos.Asignatura;
import org.example.modelos.Asignatura.*;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AsignaturaRepository extends  JpaRepository<Asignatura, Integer> {
}
