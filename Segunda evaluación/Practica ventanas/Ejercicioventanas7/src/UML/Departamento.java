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
public class Departamento {
    private String nombre;
    private ArrayList<Empleado>listaempleados;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getListaempleados() {
        return listaempleados;
    }

    public void setListaempleados(ArrayList<Empleado> listaempleados) {
        this.listaempleados = listaempleados;
    }

    public Departamento() {
    }

    public Departamento(String nombre, ArrayList<Empleado> listaempleados) {
        this.nombre = nombre;
        this.listaempleados = listaempleados;
    }
}
