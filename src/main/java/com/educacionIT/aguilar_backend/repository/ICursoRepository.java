package com.educacionIT.aguilar_backend.repository;

import com.educacionIT.aguilar_backend.entities.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICursoRepository extends JpaRepository<Curso, Long> {
    //List<Curso> findByNombre(String nombre);
}
