/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.util.ArrayList;

/**
 *
 * @author 1gdaw01
 */
public class Asignatura {
    private String nombre;
    private Profesor profesor;
    private ArrayList<Alumno>listalumnos;

    public Asignatura() {
    }

    public Asignatura(String nombre, Profesor profesor, ArrayList<Alumno> listalumnos) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.listalumnos = listalumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public ArrayList<Alumno> getListalumnos() {
        return listalumnos;
    }

    public void setListalumnos(ArrayList<Alumno> listalumnos) {
        this.listalumnos = listalumnos;
    }
}
