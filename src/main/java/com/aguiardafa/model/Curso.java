package com.aguiardafa.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="cursos")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 200, nullable = false)
    private String nome;

    @Column(length = 20, nullable = false)
    private String categoria;
}
