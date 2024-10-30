package com.educacionIT.aguilar_backend.service.imp;

import com.educacionIT.aguilar_backend.dto.CursoDTO;
import com.educacionIT.aguilar_backend.dto.NewCursoDTO;
import com.educacionIT.aguilar_backend.dto.mapper.CursoMapper;
import com.educacionIT.aguilar_backend.entities.Curso;
import com.educacionIT.aguilar_backend.repository.ICursoRepository;
import com.educacionIT.aguilar_backend.service.ICursoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CursoServiceImp implements ICursoService {
    private ICursoRepository cursoRepository;
    private CursoMapper cursoMapper;

    @Override
    public List<CursoDTO> getAll() {
        List<Curso> cursos = cursoRepository.findAll();
        List<CursoDTO> cursoDTOs = cursos.stream().map(g->{
            CursoDTO cursoDTO = cursoMapper.cursoToCursoDTO(g);
            return cursoDTO;
        }).collect(Collectors.toList());

        return cursoDTOs;
    }

    @Override
    public CursoDTO save(NewCursoDTO newCurso) {
        Curso curso = cursoMapper.newCursoDTOToCurso(newCurso);
        Curso cursoGuardado = cursoRepository.save(curso);
        CursoDTO cursoDTO = cursoMapper.cursoToCursoDTO(cursoGuardado);
        return cursoDTO;
    }

    @Override
    public Boolean delete(Long id) {
        Boolean isDeleted = false;
        Optional<Curso> curso = cursoRepository.findById(id);
        if(curso.isPresent()){
            cursoRepository.deleteById(id);
        }
        return isDeleted;
    }

    @Override
    public CursoDTO findById(Long id) {
        Optional<Curso> curso = cursoRepository.findById(id);
        CursoDTO cursoDTO = null;
        if(curso.isPresent()){
            cursoDTO = cursoMapper.cursoToCursoDTO(curso.get());
        }
        return cursoDTO;
    }
}
