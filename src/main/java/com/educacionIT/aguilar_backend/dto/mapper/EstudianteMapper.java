package com.educacionIT.aguilar_backend.dto.mapper;

import com.educacionIT.aguilar_backend.dto.EstudianteDTO;
import com.educacionIT.aguilar_backend.dto.NewEstudianteDTO;
import com.educacionIT.aguilar_backend.entities.Estudiante;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EstudianteMapper {
    @Mapping(target = "cursos", ignore = true)
    Estudiante estudianteDTOToEstudiante(EstudianteDTO estudianteDTO);
    EstudianteDTO estudianteToEstudianteDTO(Estudiante estudiante);

    @Mapping(target = "cursos", ignore = true)
    @Mapping(target = "id", ignore = true)
    Estudiante newEstudianteDTOToEstudiante(NewEstudianteDTO newEstudianteDTO);
    NewEstudianteDTO estudianteToNewEstudianteDTO(Estudiante estudiante);
}
