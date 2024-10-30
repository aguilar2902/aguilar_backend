package com.educacionIT.aguilar_backend.service.imp;

import com.educacionIT.aguilar_backend.dto.NewProfesorDTO;
import com.educacionIT.aguilar_backend.dto.ProfesorDTO;
import com.educacionIT.aguilar_backend.dto.mapper.ProfesorMapper;
import com.educacionIT.aguilar_backend.entities.Profesor;
import com.educacionIT.aguilar_backend.repository.IProfesorRepository;
import com.educacionIT.aguilar_backend.service.IProfesorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProfesorServiceImp implements IProfesorService {
    private IProfesorRepository profesorRepository;
    private ProfesorMapper profesorMapper;

    @Override
    public List<ProfesorDTO> getAll() {
        List<Profesor> profesores = profesorRepository.findAll();
        List<ProfesorDTO> profesorDTOs = profesores.stream().map(g->{
            ProfesorDTO profesorDTO = profesorMapper.profesorToProfesorDTO(g);
            return profesorDTO;
        }).collect(Collectors.toList());
        return profesorDTOs;
    }

    @Override
    public ProfesorDTO save(NewProfesorDTO newProfesor) {
        Profesor profesor = profesorMapper.newProfesorDtoToProfesor(newProfesor);
        Profesor profesorGuardado = profesorRepository.save(profesor);
        ProfesorDTO profesorDTO = profesorMapper.profesorToProfesorDTO(profesorGuardado);
        return profesorDTO;
    }

    @Override
    public Boolean delete(Long id) {
        Boolean deleted = false;
        Optional<Profesor> profesor = profesorRepository.findById(id);
        if(profesor.isPresent()) {
            profesorRepository.deleteById(id);
        }
        return deleted;
    }

    @Override
    public ProfesorDTO FindById(Long id) {
        Optional<Profesor> profesor = profesorRepository.findById(id);
        ProfesorDTO profesorDTO = null;
        if(profesor.isPresent()) {
            profesorDTO = profesorMapper.profesorToProfesorDTO(profesor.get());
        }
        return profesorDTO;
    }
}
