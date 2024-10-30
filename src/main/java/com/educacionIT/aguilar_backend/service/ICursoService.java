package com.educacionIT.aguilar_backend.service;

import com.educacionIT.aguilar_backend.dto.CursoDTO;
import com.educacionIT.aguilar_backend.dto.NewCursoDTO;

import java.util.List;

public interface ICursoService {
    List<CursoDTO> getAll();
    CursoDTO save(NewCursoDTO newCurso);
    Boolean delete(Long id);
    CursoDTO findById(Long id);
}
