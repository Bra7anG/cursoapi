package com.duoc.cursosapi.controller;

import com.duoc.cursosapi.model.Curso;
import com.duoc.cursosapi.service.CursoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {

    //instancia del servicio
    private final CursoService cursoService;


    //inyectar mediante el constructor
    public CursoController(CursoService cursoService){
        this.cursoService = cursoService;
    }
    //obtener todos los cursos
    @GetMapping
    public List<Curso> listarCursos(){
        return cursoService.obtenerCursos();
    }

    //obtener las modalidades
    @GetMapping("/modalidades")
    public String[] listarModalidades(){
        return cursoService.obtenerModalidades();
    }

    //guardar
    //debo colocar @Valid para que haga la validacion
    @PostMapping
    public Curso agregarCurso(@Valid @RequestBody Curso curso){
        return cursoService.guardarCurso(curso);

    }

}
