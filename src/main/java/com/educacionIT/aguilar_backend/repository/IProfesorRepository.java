package com.educacionIT.aguilar_backend.repository;

import com.educacionIT.aguilar_backend.entities.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProfesorRepository extends JpaRepository<Profesor, Long> {

}
