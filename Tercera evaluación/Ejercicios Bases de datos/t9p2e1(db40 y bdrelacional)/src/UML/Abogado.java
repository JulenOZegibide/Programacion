/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.util.ArrayList;

/**
 *
 * @author 1gdaw02
 */
public class Abogado {
    private String dni;
    private String nombre;
    private String apellidos;
    private String direccion;
    private ArrayList<CasoJudicial>casos;

    public Abogado() {
    }

    public Abogado(String dni, String nombre, String apellidos, String direccion, ArrayList<CasoJudicial> casos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.casos = casos;
    }

    public Abogado(String dni, String nombre, String apellidos, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
    }

    public Abogado(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<CasoJudicial> getCasos() {
        return casos;
    }

    public void setCasos(ArrayList<CasoJudicial> casos) {
        this.casos = casos;
    }
}
