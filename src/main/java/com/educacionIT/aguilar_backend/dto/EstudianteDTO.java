package com.educacionIT.aguilar_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstudianteDTO {
    private long id;
    private String nombre;
    private String email;
}
