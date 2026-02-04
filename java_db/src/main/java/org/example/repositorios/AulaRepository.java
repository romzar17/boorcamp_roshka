package org.example.repositorios;

import org.example.modelos.Aula;
import org.example.modelos.Aula.*;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AulaRepository extends  JpaRepository<Aula, Integer> {
}
