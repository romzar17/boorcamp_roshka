package org.example.repositorios;

import org.example.modelos.Libros;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibrosRepository extends JpaRepository<Libros, Integer> {
}
