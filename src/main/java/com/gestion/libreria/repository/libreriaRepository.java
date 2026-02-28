package com.gestion.libreria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gestion.libreria.entity.libro;

public interface libreriaRepository extends JpaRepository<libro,Integer> {
}
