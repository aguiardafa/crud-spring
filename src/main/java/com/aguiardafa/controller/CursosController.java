package com.aguiardafa.controller;

import com.aguiardafa.model.Curso;
import com.aguiardafa.repository.CursoRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
@AllArgsConstructor
public class CursosController {

    //@Autowired
    // injeção foi feita via construtor, pois requer o Repository desde sua criação
    private final CursoRepository cursoRepository;

    @GetMapping
    public List<Curso> findAll(){
        return cursoRepository.findAll();
    }

}
