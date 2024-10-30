package com.educacionIT.aguilar_backend.service;

import com.educacionIT.aguilar_backend.dto.NewProfesorDTO;
import com.educacionIT.aguilar_backend.dto.ProfesorDTO;

import java.util.List;

public interface IProfesorService {
    List<ProfesorDTO> getAll();
    ProfesorDTO save(NewProfesorDTO newProfesor);
    Boolean delete(Long id);
    ProfesorDTO FindById(Long id);
}
