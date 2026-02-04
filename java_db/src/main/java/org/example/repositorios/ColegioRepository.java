package org.example.repositorios;

import org.example.modelos.Colegio;
import org.example.modelos.Colegio.*;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ColegioRepository extends  JpaRepository<Colegio, Integer> {
}
