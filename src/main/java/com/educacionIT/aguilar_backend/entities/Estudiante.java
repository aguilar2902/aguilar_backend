package com.educacionIT.aguilar_backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "estudiantes")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="est_id")
    private long id;
    @Column(name="est_nombre")
    private String nombre;
    @Column(name="est_email")
    private String email;
    @ManyToMany(mappedBy = "estudiantes")
    private List<Curso> cursos;
}
