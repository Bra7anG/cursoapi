package com.duoc.cursosapi.model;
//Arreglo: almacenar varios elementos, tamano fijo inmutable
//string [] nombre_arreglo = {"cadena1", "cadena2"};
// coleccion permite guardar elementos y crecer de forma dinamica
//list = son recomendables para endpoints
//list = <Tipodedato String> nombre_lista = new Arraylist<>();// lista vacia

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Curso {
    //id curso
    //integer...
    @NotNull(message = "El id no puede venir nulo")
    private Integer id;

    //validacion
    //valida que no sea null, "" o " "
    @NotBlank(message = "El nombre del curo no puede estar vasio")
    private String nombre;

    //
    @NotBlank(message = "no puede estar vacio el docente")
    private String docente;

    //Cantidad de horas de curso
    @NotNull
    private Integer horas;

    //constructor vacio
    public Curso(){

    }
    public Curso(Integer id, String nombre, String docente, Integer horas){
        this.id = id;
        this.nombre = nombre;
        this.docente = docente;
        this.horas = horas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }
}
