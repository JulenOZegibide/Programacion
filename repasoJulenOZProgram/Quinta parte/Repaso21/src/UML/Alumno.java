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
public class Alumno {
    private String dni;
    private String nombre;
    private ArrayList<Asignatura>listaasignaturas;

    public Alumno() {
    }

    public Alumno(String dni, String nombre, ArrayList<Asignatura> listaasignaturas) {
        this.dni = dni;
        this.nombre = nombre;
        this.listaasignaturas = listaasignaturas;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public ArrayList<Asignatura> getListaasignaturas() {
        return listaasignaturas;
    }

    public void setListaasignaturas(ArrayList<Asignatura> listaasignaturas) {
        this.listaasignaturas = listaasignaturas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
