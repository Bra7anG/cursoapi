package com.duoc.cursosapi.service;

import com.duoc.cursosapi.model.Curso;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CursoService {
    //lista que va a ser bd
    private List<Curso>  listarCursos = new ArrayList<>();

    //crear arreglo
    private String[] modalidades = {"presencial", "online", "hibrido"};

    public CursoService(){
        listarCursos.add(new Curso(1, "Fullstack I", "Marcelo Crisotomo", 100));
        listarCursos.add(new Curso(2, "bases de datos II", "German", 100));
        listarCursos.add(new Curso(3, "ingles II", "???", 100));

    }
    //Get
    public List<Curso> obtenerCursos(){
        return listarCursos;
    }
    //modalidades
    public String[] obtenerModalidades(){
        return modalidades;
    }
    //post guardar
    public Curso guardarCurso(Curso curso){
        listarCursos.add(curso);
        return curso;
    }
}
