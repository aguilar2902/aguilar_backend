package com.educacionIT.aguilar_backend.dto.mapper;

import com.educacionIT.aguilar_backend.dto.NewProfesorDTO;
import com.educacionIT.aguilar_backend.dto.ProfesorDTO;
import com.educacionIT.aguilar_backend.entities.Profesor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProfesorMapper {

    @Mapping(target = "cursos", ignore = true)
    Profesor profesorDtoToProfesor(ProfesorDTO profesorDTO);
    ProfesorDTO profesorToProfesorDTO(Profesor profesor);

    @Mapping(target = "cursos", ignore = true)
    @Mapping(target = "id", ignore = true)
    Profesor newProfesorDtoToProfesor(NewProfesorDTO profesorDTO);
    ProfesorDTO profesorToNewProfesorDTO(Profesor profesor);

}
