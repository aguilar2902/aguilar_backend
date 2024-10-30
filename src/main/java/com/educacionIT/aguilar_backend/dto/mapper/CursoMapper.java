package com.educacionIT.aguilar_backend.dto.mapper;

import com.educacionIT.aguilar_backend.dto.CursoDTO;
import com.educacionIT.aguilar_backend.dto.NewCursoDTO;
import com.educacionIT.aguilar_backend.entities.Curso;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CursoMapper {

    @Mapping(target = "estudiantes", ignore = true)
    @Mapping(target = "profesor", ignore = true)
    Curso cursoDtoToCurso(CursoDTO cursoDTO);
    CursoDTO cursoToCursoDTO(Curso curso);

    @Mapping(target = "estudiantes", ignore = true)
    @Mapping(target = "profesor", ignore = true)
    @Mapping(target = "id", ignore = true)
    Curso newCursoDTOToCurso(NewCursoDTO newCurso);
    NewCursoDTO newCursoToNewCursoDTO(Curso curso);
}
