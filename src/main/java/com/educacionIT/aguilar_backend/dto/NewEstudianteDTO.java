package com.educacionIT.aguilar_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewEstudianteDTO {
    private String nombre;
    private String email;
}
