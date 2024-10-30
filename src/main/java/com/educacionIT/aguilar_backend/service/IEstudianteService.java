package com.educacionIT.aguilar_backend.service;

import com.educacionIT.aguilar_backend.dto.EstudianteDTO;
import com.educacionIT.aguilar_backend.dto.NewEstudianteDTO;

import java.util.List;

public interface IEstudianteService {
    List<EstudianteDTO> getAll();
    EstudianteDTO save(NewEstudianteDTO newEstudiante);
    Boolean delete(Long id);
    EstudianteDTO FindById(Long id);
}
