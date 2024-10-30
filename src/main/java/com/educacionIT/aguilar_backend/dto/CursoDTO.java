package com.educacionIT.aguilar_backend.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CursoDTO {
    private Long id;
    private String nombre;
    private int duracion;
}
