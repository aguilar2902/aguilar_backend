package com.educacionIT.aguilar_backend.service.imp;

import com.educacionIT.aguilar_backend.dto.EstudianteDTO;
import com.educacionIT.aguilar_backend.dto.NewEstudianteDTO;
import com.educacionIT.aguilar_backend.dto.mapper.EstudianteMapper;
import com.educacionIT.aguilar_backend.entities.Estudiante;
import com.educacionIT.aguilar_backend.repository.IEstudianteRepository;
import com.educacionIT.aguilar_backend.service.IEstudianteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EstudianteServiceImp implements IEstudianteService {
    private IEstudianteRepository estudianteRepository;
    private EstudianteMapper estudianteMapper;

    @Override
    public List<EstudianteDTO> getAll() {
        List<Estudiante> estudiantes = estudianteRepository.findAll();
        List<EstudianteDTO> estudiantesDTO = estudiantes.stream().map(g->{
            EstudianteDTO dto = estudianteMapper.estudianteToEstudianteDTO(g);
            return dto;
        }).collect(Collectors.toList());
        return estudiantesDTO;
    }

    @Override
    public EstudianteDTO save(NewEstudianteDTO newEstudiante) {
        Estudiante estudiante = estudianteMapper.newEstudianteDTOToEstudiante(newEstudiante);
        Estudiante estudianteGuardado = estudianteRepository.save(estudiante);
        EstudianteDTO estudianteDTO = estudianteMapper.estudianteToEstudianteDTO(estudianteGuardado);
        return estudianteDTO;
    }

    @Override
    public Boolean delete(Long id) {
        Boolean isDelete = false;
        Optional<Estudiante> estudiante = estudianteRepository.findById(id);
        if(estudiante.isPresent()) {
            estudianteRepository.deleteById(id);
            isDelete = true;
        }
        return isDelete;
    }

    @Override
    public EstudianteDTO FindById(Long id) {
        Optional<Estudiante> estudiante = estudianteRepository.findById(id);
        EstudianteDTO estudianteDTO = null;
        if(estudiante.isPresent()) {
           estudianteDTO = estudianteMapper.estudianteToEstudianteDTO(estudiante.get());
        }
        return estudianteDTO;
    }
}
