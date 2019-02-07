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
public class Sociofamiliar extends Socio{
    public ArrayList<Hijos>listahijos;

    public ArrayList<Hijos> getListahijos() {
        return listahijos;
    }

    public void setListahijos(ArrayList<Hijos> listahijos) {
        this.listahijos = listahijos;
    }

    public Sociofamiliar() {
    }

    public Sociofamiliar(String nombre, String apellidos, String telefono, String correo) {
        super(nombre, apellidos, telefono, correo);
    }
}
